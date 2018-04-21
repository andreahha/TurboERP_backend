package com.turbomaquinas.DAO.diagnostico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.diagnostico.EncabezadoDiagnostico;
import com.turbomaquinas.POJO.diagnostico.EncabezadoDiagnosticoVista;

@Repository
public class JDBCEncabezadoDiagnostico implements EncabezadoDiagnosticoDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int crear(EncabezadoDiagnostico ed) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("descripcion");
		columnas.add("lugar");
		columnas.add("creado_por");
		columnas.add("DIAGNOSTICO_id");
		
		insert.setTableName("ENCABEZADOS_DIAGNOSTICO");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("descripcion", ed.getDescripcion());
		datos.put("lugar", ed.getLugar());
		datos.put("creado_por", ed.getCreado_por());
		datos.put("diagnostico_id", ed.getDiagnostico_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
				
		return id.intValue();
	}

	@Override
	public void actualizar(EncabezadoDiagnostico ed) throws DataAccessException{
		jdbcTemplate.update("UPDATE ENCABEZADOS_DIAGNOSTICO SET descripcion=?, lugar=?, DIAGNOSTICO_id=?, activo = ? WHERE id=?", 
				ed.getDescripcion(), ed.getLugar(), ed.getDiagnostico_id(), ed.getActivo(), ed.getId());
	}

	@Override
	public EncabezadoDiagnosticoVista buscar(int id) throws DataAccessException{
		EncabezadoDiagnosticoVista ed = jdbcTemplate.queryForObject("SELECT * FROM ENCABEZADOS_DIAGNOSTICO_V WHERE id=?", 
				new EncabezadoDiagnosticoVistaRM(), id);
		return ed;
	}
	
	@Override
	public EncabezadoDiagnostico obtener(int id) throws DataAccessException{
		EncabezadoDiagnostico ed = jdbcTemplate.queryForObject("SELECT * FROM ENCABEZADOS_DIAGNOSTICO WHERE id=?", 
				new EncabezadoDiagnosticoRM(), id);
		return ed;
	}

	@Override
	public List<EncabezadoDiagnosticoVista> consultar() throws DataAccessException{
		List<EncabezadoDiagnosticoVista> ed = jdbcTemplate.query("SELECT * FROM ENCABEZADOS_DIAGNOSTICO_V", 
				new EncabezadoDiagnosticoVistaRM());
		return ed;
	}

	@Override
	public int recuperarUltimoLugar(int diagnosticoID) throws DataAccessException {
		int maximo = jdbcTemplate.queryForObject("SELECT COALESCE(MAX(lugar), 0) FROM ENCABEZADOS_DIAGNOSTICO "+
				"WHERE DIAGNOSTICO_id = ? AND activo = 1", Integer.class, diagnosticoID);
		return maximo;
	}

	@Override
	public List<EncabezadoDiagnosticoVista> consultarPorDiagnostico(int id) throws DataAccessException {
		List<EncabezadoDiagnosticoVista> ev = jdbcTemplate.query("SELECT * FROM ENCABEZADOS_DIAGNOSTICO_V "
				+ "WHERE diagnostico_id = ? "
				+ "ORDER BY lugar", new EncabezadoDiagnosticoVistaRM(), id);
		return ev;
	}

	@Override
	public int consultarCantidadporDiagnostico(int id) throws DataAccessException {
		int cantidad = jdbcTemplate.queryForObject("SELECT COALESCE(COUNT(*), 0) FROM ENCABEZADOS_DIAGNOSTICO "+
				"WHERE DIAGNOSTICO_id = ? AND activo = 1", Integer.class, id);
		return cantidad;
	}

	@Override
	public void reordenar_actualiza(int diagnostico_id, int lugarOrigen, int lugarDestino) throws DataAccessException {
		jdbcTemplate.update("CALL REORDENA_ED_LUGAR_ACTUALIZA(?, ?, ?)", 
				diagnostico_id, lugarDestino, lugarOrigen);
	}

	@Override
	public void reordenar_elimina(int diagnostico_id, int lugarOrigen) throws DataAccessException {
		jdbcTemplate.update("CALL REORDENA_ED_LUGAR_ELIMINA(?, ?)", 
				diagnostico_id, lugarOrigen);
	}
	
}
