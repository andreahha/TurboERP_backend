package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.Bancos;

@Repository
public class JDBCBancos implements BancosDAO  {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Bancos buscar(String clave) throws DataAccessException {
		Bancos b = jdbcTemplate.queryForObject("SELECT * FROM BANCOS WHERE clave = ?", 
				new BancosRM(), clave);
		return b;
	}

	@Override
	public List<Bancos> consultar() throws DataAccessException {
		List<Bancos> bl = jdbcTemplate.query("SELECT * FROM BANCOS", new BancosRM());
		return bl;
	}

}
