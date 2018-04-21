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

import com.turbomaquinas.POJO.comercial.DetallePrecotizacion;
import com.turbomaquinas.POJO.comercial.DetallePrecotizacionVista;

@Repository
public class JDBCDetallePrecotizacion implements DetallePrecotizacionDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(DetallePrecotizacion dp) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas= new ArrayList<>();
		columnas.add("descripcion");
		columnas.add("tipo_actividad");
		columnas.add("lugar");
		columnas.add("suministro");
		columnas.add("planta");
		columnas.add("creado_por");
		columnas.add("ENCABEZADOS_PRECOTIZACIONES_id");
		
		insert.setTableName("DETALLE_PRECOTIZACIONES");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("descripcion", dp.getDescripcion());
		datos.put("tipo_actividad", dp.getTipo_actividad());
		datos.put("lugar", dp.getLugar());
		datos.put("suministro", dp.getSuministro());
		datos.put("planta", dp.getPlanta());
		datos.put("creado_por", dp.getCreado_por());
		datos.put("ENCABEZADOS_PRECOTIZACIONES_id", dp.getEncabezados_precotizaciones_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
		
	}

	@Override
	public void actualizar(DetallePrecotizacion dp) throws DataAccessException{		
		jdbcTemplate.update("UPDATE DETALLE_PRECOTIZACIONES SET "
				+ "descripcion=?, "
				+ "tipo_actividad=?, "
				+ "lugar=?, "
				+ "suministro=?, "
				+ "planta=?, "
				+ "activo=?, "
				+ "modificado_por=? "
				+ "WHERE id=?", 
				dp.getDescripcion(), 
				dp.getTipo_actividad(), 
				dp.getLugar(), 
				dp.getSuministro(), 
				dp.getPlanta(),
				dp.getActivo(),
				dp.getModificado_por(),
				dp.getId());
	}
	
	@Override
	public DetallePrecotizacionVista buscar(int id) throws DataAccessException{
		DetallePrecotizacionVista dv = jdbcTemplate.queryForObject("SELECT "
				+ "id, "
				+ "descripcion, "
				+ "tipoActividad, "
				+ "lugar, "
				+ "suministro, "
				+ "planta, "
				+ "activo, "
				+ "encabezados_precotizaciones_id, "
				+ "descripcion_encabezado, "
				+ "lugar_encabezado, "
				+ "precotizaciones_id, "
				+ "numero_precotizacion, "
				+ "cant_subindices "
				+ "FROM DETALLE_PRECOTIZACIONES_V WHERE id=?", 
				new DetallePrecotizacionVistaRM(), id);
		return dv;
	}

	@Override
	public List<DetallePrecotizacionVista> consultar() throws DataAccessException{
		List<DetallePrecotizacionVista> dv = jdbcTemplate.query("SELECT "
				+ "id, "
				+ "descripcion, "
				+ "tipoActividad, "
				+ "lugar, "
				+ "suministro, "
				+ "planta, "
				+ "activo, "
				+ "encabezados_precotizaciones_id, "
				+ "descripcion_encabezado, "
				+ "lugar_encabezado, "
				+ "precotizaciones_id, "
				+ "numero_precotizacion, "
				+ "cant_subindices "
				+ "FROM DETALLE_PRECOTIZACIONES_V", 
				new DetallePrecotizacionVistaRM());
		return dv;
	}

	@Override
	public int recuperarUltimoLugar(int encabezadoID) {
		int maximo = jdbcTemplate.queryForObject("SELECT COALESCE(MAX(lugar), 0) FROM DETALLE_PRECOTIZACIONES "+
				"WHERE ENCABEZADOS_PRECOTIZACIONES_id = ? AND activo = 1", Integer.class, encabezadoID);
		return maximo;
	}

	@Override
	public void reordenar_actualiza(int encabezadoID, int lugarDestino, int lugarOrigen) {
		jdbcTemplate.update("CALL REORDENA_DP_LUGAR_ACTUALIZA(?, ?, ?)", 
							encabezadoID, lugarDestino, lugarOrigen);	
	}

	@Override
	public List<DetallePrecotizacionVista> consultarPorPrecotizacion(int id) {
		List<DetallePrecotizacionVista> dv = jdbcTemplate.query("SELECT "
				+ "id, "
				+ "descripcion, "
				+ "tipoActividad, "
				+ "lugar, "
				+ "suministro, "
				+ "planta, "
				+ "activo, "
				+ "encabezados_precotizaciones_id, "
				+ "descripcion_encabezado, "
				+ "lugar_encabezado, "
				+ "precotizaciones_id, "
				+ "numero_precotizacion, "
				+ "cant_subindices "
				+ "FROM DETALLE_PRECOTIZACIONES_V "
				+ "WHERE precotizaciones_id = ? "
				+ "ORDER BY lugar_encabezado, lugar", 
				new DetallePrecotizacionVistaRM(), id);
		return dv;
	}

	@Override
	public int consultarCantidadPorEncabezado(int id) {
		int cantidad = jdbcTemplate.queryForObject("SELECT COALESCE(COUNT(*), 0) FROM DETALLE_PRECOTIZACIONES "+
				"WHERE ENCABEZADOS_PRECOTIZACIONES_id = ? AND activo = 1", Integer.class, id);
		return cantidad;
	}

	@Override
	public void reordenar_elimina(int encabezados_precotizaciones_id, int lugarOrigen) {
		jdbcTemplate.update("CALL REORDENA_DP_LUGAR_ELIMINA(?, ?)", 
				encabezados_precotizaciones_id, lugarOrigen);
	}

	@Override
	public List<DetallePrecotizacionVista> consultarPorEncabezado(int id) {
		List<DetallePrecotizacionVista> dpc = jdbcTemplate.query("SELECT * FROM DETALLE_PRECOTIZACIONES_V "
				+ "WHERE ENCABEZADOS_PRECOTIZACIONES_id = ? ORDER BY lugar", new DetallePrecotizacionVistaRM(), id);
		return dpc;
	}
	
	

}
