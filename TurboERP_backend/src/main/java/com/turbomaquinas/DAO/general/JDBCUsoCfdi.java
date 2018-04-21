package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.UsoCfdi;

@Repository
public class JDBCUsoCfdi implements UsoCfdiDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public UsoCfdi buscar(String clave) throws DataAccessException {
		UsoCfdi uc = jdbcTemplate.queryForObject("SELECT * FROM USO_CFDI WHERE clave = ?",
				new UsoCfdiRM(), clave);
		return uc;
	}

	@Override
	public List<UsoCfdi> consultar() throws DataAccessException {
		List<UsoCfdi> ucl = jdbcTemplate.query("SELECT * FROM USO_CFDI", new UsoCfdiRM());
		return ucl;
	}

}
