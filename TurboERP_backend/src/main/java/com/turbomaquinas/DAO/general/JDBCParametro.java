package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.Parametro;

@Repository
public class JDBCParametro implements ParametroDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Parametro> consultar() {
		String sql = "select * from PARAMETROS";
		List<Parametro> pa = jdbcTemplate.query(sql,
				new ParametroRM());
		return pa;
	}

	

}
