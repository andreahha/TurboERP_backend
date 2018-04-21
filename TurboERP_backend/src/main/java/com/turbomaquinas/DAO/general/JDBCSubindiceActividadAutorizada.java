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

import com.turbomaquinas.POJO.general.SubindiceActividadAutorizada;
import com.turbomaquinas.POJO.general.SubindiceActividadAutorizadaVista;

@Repository
public class JDBCSubindiceActividadAutorizada implements SubindiceActividadAutorizadaDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(SubindiceActividadAutorizada s) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("descripcion");
		columnas.add("lugar");
		columnas.add("importe");
		columnas.add("tipo_actividad");
		columnas.add("creado_por");
		columnas.add("actividades_autorizadas_id");
		
		insert.setTableName("SUBINDICES_ACTIVIDADES_AUTORIZADAS");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("descripcion", s.getDescripcion());
		datos.put("lugar", s.getLugar());
		datos.put("importe", s.getImporte());
		datos.put("tipo_actividad", s.getTipo_actividad());
		datos.put("creado_por", s.getCreado_por());
		datos.put("actividades_autorizadas_id", s.getActividades_autorizadas_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public void actualizar(SubindiceActividadAutorizada s) throws DataAccessException{
		jdbcTemplate.update("UPDATE SUBINDICES_ACTIVIDADES_AUTORIZADAS SET descripcion=?, lugar=?, actividades_autorizadas_id=? WHERE id=?", 
				s.getDescripcion(), s.getLugar(), s.getActividades_autorizadas_id(), s.getId());
	}

	@Override
	public SubindiceActividadAutorizadaVista buscar(int id) throws DataAccessException{
		SubindiceActividadAutorizadaVista sv = jdbcTemplate.queryForObject("SELECT * FROM SUBINDICES_ACTIVIDADES_AUTORIZADAS_V WHERE id=?", 
				new SubindiceActividadAutorizadaVistaRM(), id);
		return sv;
	}

	@Override
	public List<SubindiceActividadAutorizadaVista> consultar() throws DataAccessException{
		List<SubindiceActividadAutorizadaVista> sv = jdbcTemplate.query("SELECT * FROM SUBINDICES_ACTIVIDADES_AUTORIZADAS_V", 
				new SubindiceActividadAutorizadaVistaRM());
		return sv;
	}

	@Override
	public int recuperarUltimoLugar(int actividadID) {
		int maximo = jdbcTemplate.queryForObject("SELECT COALESCE(MAX(lugar), 0) FROM SUBINDICES_ACTIVIDADES_AUTORIZADAS "+
				"WHERE ACTIVIDADES_AUTORIZADAS_id=?", Integer.class, actividadID);
		return maximo;
	}

	@Override
	public void reordenar(int actividadID, int lugar, int id) {
		jdbcTemplate.update("CALL SUBINDICES_ACTIVIDADES_AUTORIZADAS_LUGAR(?, ?, ?)", 
				actividadID, lugar, id);
	}

}
