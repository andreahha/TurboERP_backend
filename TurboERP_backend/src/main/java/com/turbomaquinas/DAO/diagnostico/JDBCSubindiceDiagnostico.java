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

import com.turbomaquinas.POJO.diagnostico.SubindiceDiagnostico;
import com.turbomaquinas.POJO.diagnostico.SubindiceDiagnosticoVista;

@Repository
public class JDBCSubindiceDiagnostico implements SubindiceDiagnosticoDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(SubindiceDiagnostico sd) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas= new ArrayList<>();
		columnas.add("descripcion");
		columnas.add("lugar");
		columnas.add("creado_por");
		columnas.add("DETALLE_DIAGNOSTICO_id");
		
		insert.setTableName("SUBINDICES_DIAGNOSTICO");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("descripcion", sd.getDescripcion());
		datos.put("lugar", sd.getLugar());
		datos.put("creado_por", sd.getCreado_por());
		datos.put("detalle_diagnostico_id", sd.getDetalle_diagnostico_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);

		return id.intValue();
	}

	@Override
	public void actualizar(SubindiceDiagnostico sd) throws DataAccessException{
		jdbcTemplate.update("UPDATE SUBINDICES_DIAGNOSTICO SET descripcion=?, lugar=?, DETALLE_DIAGNOSTICO_id=?, activo = ? WHERE id=?", 
				sd.getDescripcion(), sd.getLugar(), sd.getDetalle_diagnostico_id(), sd.getActivo(), sd.getId());
	}

	@Override
	public SubindiceDiagnosticoVista buscar(int id) throws DataAccessException{
		SubindiceDiagnosticoVista sv = jdbcTemplate.queryForObject("SELECT * FROM SUBINDICES_DIAGNOSTICO_V WHERE id=?", 
				new SubindiceDiagnosticoVistaRM(), id);
		return sv;
	}

	@Override
	public List<SubindiceDiagnosticoVista> consultar() throws DataAccessException{
		List<SubindiceDiagnosticoVista> sv = jdbcTemplate.query("SELECT * FROM SUBINDICES_DIAGNOSTICO_V", 
				new SubindiceDiagnosticoVistaRM());
		return sv;
	}

	@Override
	public int recuperarUltimoLugar(int detalleID) throws DataAccessException {
		int maximo = jdbcTemplate.queryForObject("SELECT COALESCE(MAX(lugar), 0) FROM SUBINDICES_DIAGNOSTICO "
				+ "WHERE DETALLE_DIAGNOSTICO_id = ?", Integer.class, detalleID);
		return maximo;
	}

	@Override
	public List<SubindiceDiagnosticoVista> consultarPorDetalle(int id) throws DataAccessException {
		List<SubindiceDiagnosticoVista> sd = jdbcTemplate.query("SELECT * FROM SUBINDICES_DIAGNOSTICO_V "
				+ "WHERE DETALLE_DIAGNOSTICO_id = ? ORDER BY lugar", new SubindiceDiagnosticoVistaRM(), id);
		return sd;
	}

	@Override
	public List<SubindiceDiagnosticoVista> consultarPorDiagnostico(int id) throws DataAccessException {
		List<SubindiceDiagnosticoVista> sv = jdbcTemplate.query("SELECT * "				
				+ "FROM SUBINDICES_DIAGNOSTICO_V "
				+ "WHERE diagnostico_id = ? " 
				+ "ORDER BY lugar_encabezado, detalle_lugar, lugar", 
				new SubindiceDiagnosticoVistaRM(), id);
		return sv;
	}

	@Override
	public int consultarCantidadPorDetalle(int id) throws DataAccessException {
		int cantidad = jdbcTemplate.queryForObject("SELECT COALESCE(COUNT(*), 0) FROM SUBINDICES_DIAGNOSTICO "+
				"WHERE DETALLE_DIAGNOSTICO_id = ? AND activo = 1", Integer.class, id);
		return cantidad;
	}

	@Override
	public void reordenar_actualiza(int detalle_diagnostico_id, int lugarDestino, int lugarOrigen) throws DataAccessException {
		jdbcTemplate.update("CALL REORDENA_SD_LUGAR_ACTUALIZA(?, ?, ?)", 
				detalle_diagnostico_id, lugarDestino, lugarOrigen);
	}

	@Override
	public void reordenar_elimina(int detalle_diagnostico_id, int lugarOrigen) throws DataAccessException {
		jdbcTemplate.update("CALL REORDENA_SD_LUGAR_ELIMINA(?, ?)", detalle_diagnostico_id, lugarOrigen);
	}
}
