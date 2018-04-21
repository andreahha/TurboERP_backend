package com.turbomaquinas.DAO.comercial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.SubindiceCotizacion;
import com.turbomaquinas.POJO.comercial.SubindiceCotizacionVista;

@Repository
public class JDBCSubindiceCotizacion implements SubindiceCotizacionDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(SubindiceCotizacion sc) throws DataAccessException{
			SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
			List<String> columnas= new ArrayList<>();
			columnas.add("descripcion");
			columnas.add("importe");
			columnas.add("tipo_actividad");
			columnas.add("lugar");
			columnas.add("creado_por");
			columnas.add("DETALLE_COTIZACIONES_id");
			
			insert.setTableName("SUBINDICES_COTIZACIONES");
			insert.setColumnNames(columnas);
			
			Map<String, Object> datos = new HashMap<>();
			datos.put("descripcion", sc.getDescripcion());
			datos.put("importe", sc.getImporte());
			datos.put("tipo_actividad", sc.getTipo_actividad());
			datos.put("lugar", sc.getLugar());
			datos.put("creado_por", sc.getCreado_por());
			datos.put("detalle_cotizaciones_id", sc.getDetalle_cotizaciones_id());
			
			insert.setGeneratedKeyName("id");
			Number id = insert.executeAndReturnKey(datos);

			return id.intValue();
	}

	@Override
	public void actualizar(SubindiceCotizacion sc) throws DataAccessException{
		jdbcTemplate.update("UPDATE SUBINDICES_COTIZACIONES SET descripcion=?, importe=?, tipo_actividad=?, lugar=?, activo=?, modificado_por=? WHERE id=?", 
				sc.getDescripcion(), sc.getImporte(), sc.getTipo_actividad(), sc.getLugar(), sc.getActivo(), sc.getModificado_por(), sc.getId());
	}

	@Override
	public SubindiceCotizacionVista buscar(int id) throws DataAccessException{
		SubindiceCotizacionVista sv = jdbcTemplate.queryForObject("SELECT * FROM SUBINDICES_COTIZACIONES_V WHERE id=?", 
				new SubindiceCotizacionVistaRM(), id);
		return sv;
	}

	@Override
	public List<SubindiceCotizacionVista> consultar() throws DataAccessException{
		List<SubindiceCotizacionVista> sv = jdbcTemplate.query("SELECT * FROM SUBINDICES_COTIZACIONES_V", 
				new SubindiceCotizacionVistaRM());
		return sv;
	}

	@Override
	public int recuperarUltimoLugar(int detalleID) throws DataAccessException {
		int maximo = jdbcTemplate.queryForObject("SELECT COALESCE(MAX(lugar), 0) FROM SUBINDICES_COTIZACIONES "+
				"WHERE DETALLE_COTIZACIONES_id = ? AND activo = 1", Integer.class, detalleID);
		return maximo;
	}

	@Override
	public List<SubindiceCotizacionVista> consultarPorCotizacion(int id) throws DataAccessException {
		List<SubindiceCotizacionVista> sv = jdbcTemplate.query("SELECT "
				+ "`s`.`id`             AS `id`,"
				+ "`s`.`descripcion`    AS `descripcion`,"
				+ "`s`.`importe`        AS `importe`,"
				+ "`s`.`tipo_actividad` AS `tipo_actividad`,"
				+ "`s`.`lugar`          AS `lugar`,"
				+ "`s`.`activo`         AS `activo`,"
				+ "`s`.`creado_por`     AS `creado_por`,"
				+ "`s`.`creado`         AS `creado`,"
				+ "`s`.`modificado_por` AS `modificado_por`,"
				+ "`s`.`modificado`     AS `modificado`,"
				+ "`d`.`id`             AS `detalle_cotizaciones_id`,"
				+ "`d`.`descripcion`    AS `detalle_descripcion`,"
				+ "`d`.`tipo_actividad` AS `detalle_tipo_actividad`,"
				+ "`d`.`lugar`          AS `detalle_lugar`,"
				+ "`e`.`id`             AS `encabezados_cotizaciones_id`,"
				+ "`e`.`descripcion`    AS `descripcion_encabezado`,"
				+ "`e`.`lugar`          AS `lugar_encabezado`,"
				+ "`c`.`id`             AS `cotizaciones_id`,"
				+ "`c`.`numero`         AS `numero_cotizacion` "
				+ "FROM (((`SUBINDICES_COTIZACIONES` `s` "
				+ "JOIN `DETALLE_COTIZACIONES` `d` "
				+ "ON ((`d`.`id` = `s`.`DETALLE_COTIZACIONES_id`))) "
				+ "JOIN `ENCABEZADOS_COTIZACIONES` `e` "
				+ "ON ((`e`.`id` = `d`.`ENCABEZADOS_COTIZACIONES_id`))) "
				+ "JOIN `COTIZACIONES` `c` "
				+ "ON ((`c`.`id` = `e`.`COTIZACIONES_id`))) "
				+ "WHERE (`s`.`activo` = 1) AND c.id=? ORDER BY lugar_encabezado, detalle_lugar, lugar", 
				new SubindiceCotizacionVistaRM(), id);
		return sv;
	}
	
	@Override
	public int consultarCantidadPorDetalle(int id) {
		int cantidad = jdbcTemplate.queryForObject("SELECT COALESCE(COUNT(*), 0) FROM SUBINDICES_COTIZACIONES "+
				"WHERE DETALLE_COTIZACIONES_id = ? AND activo = 1", Integer.class, id);
		return cantidad;
	}

	@Override
	public void reordenar_actualiza(int detalle_cotizaciones_id, int lugarDestino, int lugarOrigen) {
		jdbcTemplate.update("CALL REORDENA_SC_LUGAR_ACTUALIZA(?, ?, ?)", 
				detalle_cotizaciones_id, lugarDestino, lugarOrigen);
	}

	@Override
	public void reordenar_elimina(int detalle_cotizaciones_id, int lugarOrigen) {
		jdbcTemplate.update("CALL REORDENA_SC_LUGAR_ELIMINA(?, ?)", detalle_cotizaciones_id, lugarOrigen);
	}

	@Override
	public List<SubindiceCotizacionVista> consultarPorDetalle(int id) {
		List<SubindiceCotizacionVista> sc = jdbcTemplate.query("SELECT * FROM SUBINDICES_COTIZACIONES_V "
				+ "WHERE DETALLE_COTIZACIONES_id = ? ORDER BY lugar", new SubindiceCotizacionVistaRM(), id);
		return sc;
	}

}
