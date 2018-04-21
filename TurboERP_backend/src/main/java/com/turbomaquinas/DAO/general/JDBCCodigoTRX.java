package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.CodigoTRX;

@Repository
public class JDBCCodigoTRX implements CodigoTRXDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<CodigoTRX> consultar(String clave) throws DataAccessException {
		List<CodigoTRX> codigos = jdbcTemplate.query("SELECT * FROM CODIGOS_TRX WHERE codigo LIKE ?", new CodigoTRXRM(), clave+"%");
		return codigos;
	}

	@Override
	public CodigoTRX buscarClave(String clave) throws DataAccessException {
		CodigoTRX codigo = jdbcTemplate.queryForObject("SELECT * FROM CODIGOS_TRX WHERE codigo = ?", new CodigoTRXRM(), clave);
		return codigo;
	}

	@Override
	public List<CodigoTRX> consultar() {
		List<CodigoTRX> codigos = jdbcTemplate.query("SELECT * FROM CODIGOS_TRX", new CodigoTRXRM());
		return codigos;
	}
	

}
