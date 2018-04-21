package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.Pais;

@Repository
public class JDBCPais implements PaisDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Pais buscar(String clave) throws DataAccessException {
		Pais pb = jdbcTemplate.queryForObject("SELECT * FROM PAISES WHERE clave = ?",
				new PaisRM(), clave);
		return pb;
	}

	@Override
	public List<Pais> consultar() throws DataAccessException {
		List<Pais> pa = jdbcTemplate.query("SELECT * FROM PAISES",
				new PaisRM());
		return pa;	
	}

}
