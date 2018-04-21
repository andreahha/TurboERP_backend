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

import com.turbomaquinas.POJO.comercial.EncabezadoCotizacion;
import com.turbomaquinas.POJO.comercial.EncabezadoCotizacionVista;

@Repository
public class JDBCEncabezadoCotizacion implements EncabezadoCotizacionDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(EncabezadoCotizacion ec) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("descripcion");
		columnas.add("lugar");
		columnas.add("creado_por");
		columnas.add("COTIZACIONES_id");
		columnas.add("ENCABEZADOS_DIAGNOSTICO_id");
		columnas.add("ENCABEZADOS_PRECOTIZACIONES_id");
	
		insert.setTableName("ENCABEZADOS_COTIZACIONES");
		insert.setColumnNames(columnas);
	
		Map<String, Object> datos = new HashMap<>();
		datos.put("descripcion", ec.getDescripcion());
		datos.put("lugar", ec.getLugar());
		datos.put("creado_por", ec.getCreado_por());
		datos.put("cotizaciones_id", ec.getCotizaciones_id());
		datos.put("encabezados_diagnostico_id", ec.getEncabezados_diagnostico_id());
		datos.put("encabezados_precotizaciones_id", ec.getEncabezados_precotizaciones_id());
	
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);

		return id.intValue();
	}

	@Override
	public void actualizar(EncabezadoCotizacion ec) throws DataAccessException{
		jdbcTemplate.update("UPDATE ENCABEZADOS_COTIZACIONES SET descripcion=?, lugar=?, activo=?, modificado_por=?, COTIZACIONES_id=?  WHERE id=?", 
				ec.getDescripcion(), ec.getLugar(), ec.getActivo(), ec.getModificado_por(), ec.getCotizaciones_id(), ec.getId());
	}

	@Override
	public EncabezadoCotizacionVista buscar(int id) throws DataAccessException{
		EncabezadoCotizacionVista ec = jdbcTemplate.queryForObject("SELECT * FROM ENCABEZADOS_COTIZACIONES_V WHERE id=?", 
				new EncabezadoCotizacionVistaRM(), id);
		return ec;
	}

	@Override
	public List<EncabezadoCotizacionVista> consultar() throws DataAccessException{
		List<EncabezadoCotizacionVista> ec = jdbcTemplate.query("SELECT * FROM ENCABEZADOS_COTIZACIONES_V", 
				new EncabezadoCotizacionVistaRM());
		return ec;
	}

	@Override
	public int recuperarUltimoLugar(int cotizacionesID) {
		int maximo = jdbcTemplate.queryForObject("SELECT COALESCE(MAX(lugar), 0) FROM ENCABEZADOS_COTIZACIONES "+
				"WHERE COTIZACIONES_ID = ? AND activo = 1", Integer.class, cotizacionesID);
		return maximo;
	}

	@Override
	public List<EncabezadoCotizacionVista> consultarPorCotizacion(int id) {
		List<EncabezadoCotizacionVista> ec = jdbcTemplate.query("SELECT "
				+ "`e`.`id`                             AS `id`, "
				+ "`e`.`descripcion`                    AS `descripcion`, "
				+ "`e`.`lugar`                          AS `lugar`,"
				+ "`e`.`activo`                         AS `activo`,"
				+ "`e`.`creado_por`                     AS `creado_por`,"
				+ "`e`.`creado`                         AS `creado`,"
				+ "`e`.`modificado_por`                 AS `modificado_por`,"
				+ "`e`.`modificado`                     AS `modificado`,"
				+ "`c`.`id`                             AS `cotizaciones_id`,"
				+ "`c`.`numero`                         AS `cotizaciones_no`,"
				+ "`e`.`ENCABEZADOS_DIAGNOSTICO_id`     AS `encabezados_diagnostico_id`,"
				+ "`e`.`ENCABEZADOS_PRECOTIZACIONES_id` AS `encabezados_precotizaciones_id`,"
				+ "(SELECT COALESCE(COUNT(0),0) FROM `DETALLE_COTIZACIONES`"
				+ " WHERE ((`DETALLE_COTIZACIONES`.`ENCABEZADOS_COTIZACIONES_id` = `e`.`id`)"
				+ " AND (`DETALLE_COTIZACIONES`.`activo` = 1))) AS `cant_detalles` FROM (`ENCABEZADOS_COTIZACIONES` `e`"
				+ " JOIN `COTIZACIONES` `c` ON ((`c`.`id` = `e`.`COTIZACIONES_id`)))"
				+ " WHERE (`e`.`activo` = 1) AND c.id = ? ORDER BY lugar", new EncabezadoCotizacionVistaRM(), id);
		return ec;
	}

	@Override
	public int consultarCantidadporCotizacion(int id) {
		int cantidad = jdbcTemplate.queryForObject("SELECT COALESCE(COUNT(*), 0) FROM ENCABEZADOS_COTIZACIONES "+
				"WHERE COTIZACIONES_id = ? AND activo = 1", Integer.class, id);
		return cantidad;
	}
	
	@Override
	public void reordenar_actualiza(int cotizaciones_id, int LugarDestino, int LugarOrigen){
		jdbcTemplate.update("CALL REORDENA_EC_LUGAR_ACTUALIZA(?, ?, ?)",
				cotizaciones_id, LugarDestino, LugarOrigen);
	}
	
	@Override
	public void reordenar_elimina(int cotizaciones_id, int LugarOrigen){
		jdbcTemplate.update("CALL REORDENA_EC_LUGAR_ELIMINA(?, ?)",
				cotizaciones_id, LugarOrigen);
	}

}
