package com.turbomaquinas.DAO.general;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCServidor implements ServidorDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public String obtenerfecha() {
		String fecha = jdbcTemplate.queryForObject("SELECT DATE_FORMAT(CURDATE(),'%Y-%m-%d')", String.class);
		return fecha;
	}
}
