package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.Catctas;

@Repository
public class JDBCCatctas implements CatctasDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Catctas buscar(String cuenta) throws DataAccessException {
		Catctas cc = jdbcTemplate.queryForObject("SELECT * FROM CATALOGO_CUENTAS WHERE cuenta = ?", 
				new CatctasRM(), cuenta);
		return cc;
	}

	@Override
	public List<Catctas> consultar() throws DataAccessException {
		List<Catctas> ccl = jdbcTemplate.query("SELECT * FROM CATALOGO_CUENTAS", new CatctasRM());
		return ccl;
	}

}
