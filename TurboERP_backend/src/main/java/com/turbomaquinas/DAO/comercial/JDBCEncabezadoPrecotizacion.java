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

import com.turbomaquinas.POJO.comercial.EncabezadoPrecotizacion;
import com.turbomaquinas.POJO.comercial.EncabezadoPrecotizacionVista;

@Repository
public class JDBCEncabezadoPrecotizacion implements EncabezadoPrecotizacionDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(EncabezadoPrecotizacion ep) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("descripcion");
		columnas.add("lugar");
		columnas.add("creado_por");
		columnas.add("PRECOTIZACIONES_id");
		
		insert.setTableName("ENCABEZADOS_PRECOTIZACIONES");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("descripcion", ep.getDescripcion());
		datos.put("lugar", ep.getLugar());
		datos.put("creado_por", ep.getCreado_por());
		datos.put("precotizaciones_id", ep.getPrecotizaciones_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);

		return id.intValue();
	}

	@Override
	public void actualizar(EncabezadoPrecotizacion ep) throws DataAccessException{
		jdbcTemplate.update("UPDATE ENCABEZADOS_PRECOTIZACIONES SET descripcion=?, lugar=?, activo=?, modificado_por=? WHERE id=?", 
				ep.getDescripcion(), ep.getLugar(), ep.getActivo(), ep.getModificado_por(), ep.getId());
	}

	@Override
	public EncabezadoPrecotizacionVista buscar(int id) throws DataAccessException{
		EncabezadoPrecotizacionVista ep = jdbcTemplate.queryForObject("SELECT * FROM ENCABEZADOS_PRECOTIZACIONES_V WHERE id=?", new EncabezadoPrecotizacionVistaRM(), id);
		return ep;
	}

	@Override
	public List<EncabezadoPrecotizacionVista> consultar() throws DataAccessException{
		List<EncabezadoPrecotizacionVista> ep = jdbcTemplate.query("SELECT * FROM ENCABEZADOS_PRECOTIZACIONES_V", new EncabezadoPrecotizacionVistaRM());
		return ep;
	}

	@Override
	public int recuperarUltimoLugar(int precotizacionesID) {
			int maximo = jdbcTemplate.queryForObject("SELECT COALESCE(MAX(lugar), 0) FROM ENCABEZADOS_PRECOTIZACIONES "+
					"WHERE PRECOTIZACIONES_ID = ? AND activo = 1", Integer.class, precotizacionesID);
			return maximo;
	}

	@Override
	public List<EncabezadoPrecotizacionVista> consultarPorPrecotizacion(int id) {
		List<EncabezadoPrecotizacionVista> ep = jdbcTemplate.query("SELECT * FROM ENCABEZADOS_PRECOTIZACIONES_V WHERE precotizaciones_id = ? ORDER BY lugar", new EncabezadoPrecotizacionVistaRM(), id);
		return ep;
	}

	@Override
	public int consultarCantidadporPrecotizacion(int id) {
		int cantidad = jdbcTemplate.queryForObject("SELECT COALESCE(COUNT(*), 0) FROM ENCABEZADOS_PRECOTIZACIONES "+
				"WHERE PRECOTIZACIONES_ID = ? AND activo = 1", Integer.class, id);
		return cantidad;
	}

	@Override
	public void reordenar_actualiza(int precotizaciones_id, int lugarDestino, int lugarOrigen) {
		jdbcTemplate.update("CALL REORDENA_EP_LUGAR_ACTUALIZA(?, ?, ?)", 
				precotizaciones_id, lugarDestino, lugarOrigen);		
	}

	@Override
	public void reordenar_elimina(int precotizaciones_id, int lugarOrigen) {
		jdbcTemplate.update("CALL REORDENA_EP_LUGAR_ELIMINA(?, ?)", 
				precotizaciones_id, lugarOrigen);
	}

}
