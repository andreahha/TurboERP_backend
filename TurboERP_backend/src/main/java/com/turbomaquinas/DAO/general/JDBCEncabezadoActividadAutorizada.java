package com.turbomaquinas.DAO.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.EncabezadoActividadAutorizada;
import com.turbomaquinas.POJO.general.EncabezadoActividadAutorizadaVista;

@Repository
public class JDBCEncabezadoActividadAutorizada implements EncabezadoActividadAutorizadaDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(EncabezadoActividadAutorizada e) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("descripcion");
		columnas.add("lugar");
		columnas.add("creado_por");
		columnas.add("ordenes_id");
		columnas.add("encabezados_diagnostico_id");
		
		insert.setTableName("ENCABEZADOS_ACTIVIDADES_AUTORIZADAS");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("descripcion", e.getDescripcion());
		datos.put("lugar", e.getLugar());
		datos.put("creado_por", e.getCreado_por());
		datos.put("ordenes_id", e.getOrdenes_id());
		datos.put("encabezados_diagnostico_id", e.getEncabezados_diagnostico_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);

		return id.intValue();
	}

	@Override
	public void actualizar(EncabezadoActividadAutorizada e) throws DataAccessException{
		jdbcTemplate.update("UPDATE ENCABEZADOS_ACTIVIDADES_AUTORIZADAS SET descripcion=?, lugar=?, ORDENES_id=? WHERE id=?", 
				e.getDescripcion(), e.getLugar(), e.getOrdenes_id(), e.getId());
	}

	@Override
	public EncabezadoActividadAutorizadaVista buscar(int id) throws DataAccessException{
		EncabezadoActividadAutorizadaVista ev = jdbcTemplate.queryForObject("SELECT * FROM ENCABEZADOS_ACTIVIDADES_AUTORIZADAS_V WHERE id=?", 
				new EncabezadoActividadAutorizadaVistaRM(), id);
		return ev;
	}

	@Override
	public List<EncabezadoActividadAutorizadaVista> consultar() throws DataAccessException{
		List<EncabezadoActividadAutorizadaVista> ev = jdbcTemplate.query("SELECT * FROM ENCABEZADOS_ACTIVIDADES_AUTORIZADAS_V", 
				new EncabezadoActividadAutorizadaVistaRM());
		return ev;
	}

	@Override
	public int recuperarUltimoLugar(int ordenesID) {
		int maximo = jdbcTemplate.queryForObject("SELECT COALESCE(MAX(lugar), 0) FROM ENCABEZADOS_ACTIVIDADES_AUTORIZADAS "+
				"WHERE ORDENES_id = ?", Integer.class, ordenesID);
		return maximo;
	}

	@Override
	public void reordenar(int ordenesID, int lugar, int id) {
		jdbcTemplate.update("CALL ENCABEZADOS_ACTIVIDADES_AUTORIZADAS_LUGAR(?, ?, ?)", 
				ordenesID, lugar, id);
	}

	@Override
	public int buscarPorEncabezadoDiagnostico(int id_encabezado_diagnostico) {		
		return jdbcTemplate.queryForObject("SELECT id FROM ENCABEZADOS_ACTIVIDADES_AUTORIZADAS "+
				"WHERE ENCABEZADOS_DIAGNOSTICO_id = ?", Integer.class, id_encabezado_diagnostico);
	}

}
