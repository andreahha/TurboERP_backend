package com.turbomaquinas.DAO.general;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.Departamento;
import com.turbomaquinas.POJO.general.DepartamentoVista;
import com.turbomaquinas.POJO.general.Personal;

@Repository
public class JDBCDepartamento implements DepartamentoDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void crear(Departamento d) throws DataAccessException{
		jdbcTemplate.update("INSERT INTO DEPARTAMENTOS(clave, descripcion, creado_por) VALUES(?, ?, ?)", 
				d.getClave(), d.getDescripcion(), d.getCreadoPor());	
	}

	@Override
	public void actualizar(Departamento d) throws DataAccessException{
		jdbcTemplate.update("UPDATE DEPARTAMENTOS SET clave=?, descripcion=? WHERE id=?", 
				d.getClave(), d.getDescripcion(), d.getId());
		
	}

	@Override
	public DepartamentoVista buscar(String clave) throws DataAccessException {
		DepartamentoVista dv = jdbcTemplate.queryForObject("SELECT id, clave, descripcion, jefe_id, nombre, paterno, materno FROM DEPARTAMENTOS_V WHERE clave = ?", new DepartamentoVistaRM(), clave);
		return dv;
	}

	@Override
	public List<DepartamentoVista> consultar() {
		List<DepartamentoVista> deptos = jdbcTemplate.query("SELECT id, clave, descripcion, jefe_id, nombre, paterno, materno FROM DEPARTAMENTOS_V", new DepartamentoVistaRM());
		return deptos;
	}

	@Override
	public List<Personal> consultarEvaluadores(String clave) {
		List<Personal> evaluadores = jdbcTemplate.query("SELECT * FROM PERSONAL WHERE id IN (SELECT `PERSONAL_id` FROM EVALUA WHERE `DEPARTAMENTOS_id` =  (SELECT id FROM `departamentos` WHERE clave = ?))", new PersonalRM(), clave);
		return evaluadores;
	}
		
}


