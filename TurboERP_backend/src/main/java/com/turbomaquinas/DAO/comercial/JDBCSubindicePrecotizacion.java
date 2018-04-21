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

import com.turbomaquinas.POJO.comercial.SubindicePrecotizacion;
import com.turbomaquinas.POJO.comercial.SubindicePrecotizacionVista;

@Repository
public class JDBCSubindicePrecotizacion implements SubindicePrecotizacionDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(SubindicePrecotizacion sp) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas= new ArrayList<>();
		columnas.add("descripcion");
		columnas.add("lugar");
		columnas.add("creado_por");
		columnas.add("DETALLE_PRECOTIZACIONES_id");
		
		insert.setTableName("SUBINDICES_PRECOTIZACIONES");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("descripcion", sp.getDescripcion());
		datos.put("lugar", sp.getLugar());
		datos.put("creado_por", sp.getCreado_por());
		datos.put("DETALLE_PRECOTIZACIONES_id", sp.getDetalle_precotizaciones_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);

		return id.intValue();
	}

	@Override
	public void actualizar(SubindicePrecotizacion sp) throws DataAccessException{
		jdbcTemplate.update("UPDATE SUBINDICES_PRECOTIZACIONES SET descripcion=?, lugar=?, activo=?, modificado_por=? WHERE id=?", 
				sp.getDescripcion(), sp.getLugar(), sp.getActivo(), sp.getModificado_por(), sp.getId());		
	}

	@Override
	public SubindicePrecotizacionVista buscar(int id) throws DataAccessException{
		SubindicePrecotizacionVista sv = jdbcTemplate.queryForObject("SELECT * "				
				+ "FROM SUBINDICES_PRECOTIZACIONES_V "
				+ "WHERE id=?", 
				new SubindicePrecotizacionVistaRM(), id);
		return sv;
	}

	@Override
	public List<SubindicePrecotizacionVista> consultar() throws DataAccessException{
		List<SubindicePrecotizacionVista> sv = jdbcTemplate.query("SELECT * FROM SUBINDICES_PRECOTIZACIONES_V",
				new SubindicePrecotizacionVistaRM());
		return sv;
	}

	@Override
	public int recuperarUltimoLugar(int detalleID) {
		int maximo = jdbcTemplate.queryForObject("SELECT COALESCE(MAX(lugar), 0) FROM SUBINDICES_PRECOTIZACIONES "+
				"WHERE DETALLE_PRECOTIZACIONES_id = ? AND activo = 1", Integer.class, detalleID);
		return maximo;
	}

	@Override
	public List<SubindicePrecotizacionVista> consultarPorPrecotizacion(int id) {
		List<SubindicePrecotizacionVista> sv = jdbcTemplate.query("SELECT * "				
				+ "FROM SUBINDICES_PRECOTIZACIONES_V "
				+ "WHERE precotizaciones_id = ? " 
				+ "ORDER BY lugar_encabezado, detalle_lugar, lugar", 
				new SubindicePrecotizacionVistaRM(), id);
		return sv;
	}

	@Override
	public int consultarCantidadPorDetalle(int id) {
		int cantidad = jdbcTemplate.queryForObject("SELECT COALESCE(COUNT(*), 0) FROM SUBINDICES_PRECOTIZACIONES "+
				"WHERE DETALLE_PRECOTIZACIONES_id = ? AND activo = 1", Integer.class, id);
		return cantidad;
	}

	@Override
	public void reordenar_actualiza(int detalle_precotizaciones_id, int lugarDestino, int lugarOrigen) {
		jdbcTemplate.update("CALL REORDENA_SP_LUGAR_ACTUALIZA(?, ?, ?)", 
				detalle_precotizaciones_id, lugarDestino, lugarOrigen);
	}

	@Override
	public void reordenar_elimina(int detalle_precotizaciones_id, int lugarOrigen) {
		jdbcTemplate.update("CALL REORDENA_SP_LUGAR_ELIMINA(?, ?)", detalle_precotizaciones_id, lugarOrigen);
	}

	@Override
	public List<SubindicePrecotizacionVista> consultarPorDetalle(int id) {
		List<SubindicePrecotizacionVista> spc = jdbcTemplate.query("SELECT * FROM SUBINDICES_PRECOTIZACIONES_V "
				+ "WHERE DETALLE_PRECOTIZACIONES_id = ? ORDER BY lugar", new SubindicePrecotizacionVistaRM(), id);
		return spc;
	}

}
