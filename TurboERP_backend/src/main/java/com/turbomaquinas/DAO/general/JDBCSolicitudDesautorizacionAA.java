package com.turbomaquinas.DAO.general;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.ActividadAutorizadaVista;
import com.turbomaquinas.POJO.general.SolicitudDesautorizacionAA;
@Repository
public class JDBCSolicitudDesautorizacionAA implements SolicitudDesautorizacionAADAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int crear(int ordenId, String motivo, String tipo, int creadoPor) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("motivo");
		columnas.add("tipo");
		columnas.add("creado_por");
		columnas.add("ordenes_id");
		
		insert.setTableName("SOLICITUD_BAJAS_ACTIVIDADES");
		insert.setColumnNames(columnas);
	
		Map<String, Object> datos = new HashMap<>();
		datos.put("motivo", motivo);
		datos.put("tipo", tipo);
		datos.put("creado_por", creadoPor);
		datos.put("ordenes_id", ordenId);
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public SolicitudDesautorizacionAA buscar(int id) throws DataAccessException{
		SolicitudDesautorizacionAA sol = jdbcTemplate.queryForObject("SELECT * FROM SOLICITUD_BAJAS_ACTIVIDADES WHERE id=?", 
				new SolicitudDesautorizacionAARM(), id);
		return sol;
	}

	@Override
	public void actualizarAlfrescoID(int id, String alfresco_id) throws DataAccessException{
		jdbcTemplate.update("UPDATE SOLICITUD_BAJAS_ACTIVIDADES SET alfresco_id=? WHERE id=?", alfresco_id, id);
	}

	@Override
	public SolicitudDesautorizacionAA buscarPorFolio(int numero) throws DataAccessException{
		SolicitudDesautorizacionAA sol = jdbcTemplate.queryForObject("SELECT * FROM SOLICITUD_BAJAS_ACTIVIDADES WHERE folio = ?", 
				new SolicitudDesautorizacionAARM(), numero);
		return sol;
	}

	@Override
	public List<ActividadAutorizadaVista> consultarActividades(int id) throws DataAccessException{
		List<ActividadAutorizadaVista> actividades = jdbcTemplate.query("SELECT * FROM ACTIVIDADES_AUTORIZADAS_V WHERE solicitud_bajas_actividades_id = ?",
				new ActividadAutorizadaVistaRM(), id);
		return actividades;
	}

	@Override
	public void actualizarEstado(int id, String estado) throws DataAccessException{
		jdbcTemplate.update("UPDATE SOLICITUD_BAJAS_ACTIVIDADES SET estado = ? WHERE id = ?", estado, id);
	}

	@Override
	public List<SolicitudDesautorizacionAA> consultarPorOrden(int id) throws DataAccessException{
		List<SolicitudDesautorizacionAA> sol = jdbcTemplate.query("SELECT * FROM SOLICITUD_BAJAS_ACTIVIDADES WHERE ORDENES_id = ?", 
				new SolicitudDesautorizacionAARM(), id);
		return sol;
	}

	@Override
	public List<SolicitudDesautorizacionAA> consultarPorOrdenEstado(int id, String estado) throws DataAccessException{
		List<SolicitudDesautorizacionAA> sol = jdbcTemplate.query("SELECT * FROM SOLICITUD_BAJAS_ACTIVIDADES WHERE ORDENES_id = ? AND estado = ?", 
				new SolicitudDesautorizacionAARM(), id, estado);
		return sol;
	}

	@Override
	public BigDecimal consultarImporteAutorizado(int idSolicitud) {
		String sql="SELECT SUM(importe_autorizado) FROM ACTIVIDADES_AUTORIZADAS WHERE solicitud_bajas_actividades_id = ?";
		return jdbcTemplate.queryForObject(sql, BigDecimal.class, idSolicitud);
	}
}
