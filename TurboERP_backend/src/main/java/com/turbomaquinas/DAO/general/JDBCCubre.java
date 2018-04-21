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

import com.turbomaquinas.POJO.general.Cubre;

@Repository
public class JDBCCubre implements CubreDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(Cubre cubre) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("personal_id");
		columnas.add("puestos_id");
		
		insert.setTableName("CUBRE");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("personal_id", cubre.getPersonal_id());
		datos.put("puestos_id", cubre.getPuestos_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public void actualizar(Cubre cubre) throws DataAccessException{
		jdbcTemplate.update("UPDATE CUBRE SET activo=?, PERSONAL_id=?, PUESTOS_id=? WHERE id=?", 
				cubre.getActivo(), cubre.getPersonal_id(), cubre.getPuestos_id(), cubre.getId());		
	}

	@Override
	public Cubre buscar(int id) throws DataAccessException{
		Cubre cubre = jdbcTemplate.queryForObject("SELECT * FROM CUBRE WHERE id=?", new CubreRM(), id);
		return cubre;
	}

	@Override
	public List<Cubre> consultar() throws DataAccessException{
		List<Cubre> cubre = jdbcTemplate.query("SELECT * FROM CUBRE", new CubreRM());
		return cubre;
	}

	@Override
	public boolean estaDisponible(int puestos_id) throws DataAccessException {
		boolean disponible = jdbcTemplate.queryForObject("SELECT IF(activo = 1, FALSE, TRUE) FROM CUBRE WHERE PUESTOS_id = ? ", Boolean.class, puestos_id);
		return disponible;
	}

	@Override
	public Cubre buscarporPersonal(int id) throws DataAccessException {
		Cubre cubre = jdbcTemplate.queryForObject("SELECT * FROM CUBRE WHERE PERSONAL_id=? and activo = 1", new CubreRM(), id);
		return cubre;
	}
}
