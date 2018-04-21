package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.Estado;

@Repository
public class JDBCEstado implements EstadoDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Estado buscar(String clave) throws DataAccessException {
		Estado ev = jdbcTemplate.queryForObject("SELECT * FROM ESTADOS WHERE clave = ?",
				new EstadoRM(), clave);
		return ev;
	}

	@Override
	public List<Estado> consultar() throws DataAccessException {
		List<Estado> edos = jdbcTemplate.query("SELECT * FROM ESTADOS", new EstadoRM());
		return edos;
	}

	@Override
	public List<Estado> consultarPorPais(int id) throws DataAccessException  {
		List<Estado> edos = jdbcTemplate.query("SELECT * FROM ESTADOS WHERE PAISES_ID = ?", new EstadoRM(), id);
		return edos;
	}
	
	

}
