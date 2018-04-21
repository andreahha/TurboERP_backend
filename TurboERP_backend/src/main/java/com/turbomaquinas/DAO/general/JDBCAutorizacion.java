package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.Autorizacion;

@Repository
public class JDBCAutorizacion implements AutorizacionDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Autorizacion buscar(int id) throws DataAccessException{
		Autorizacion au = jdbcTemplate.queryForObject("SELECT * FROM AUTORIZACIONES WHERE id=?", new AutorizacionRM(), id);
		return au;
	}

	@Override
	public List<Autorizacion> consultarPorOrdenid(int id) throws DataAccessException{
		List<Autorizacion> au = jdbcTemplate.query("SELECT * FROM AUTORIZACIONES WHERE ORDENES_id=?", new AutorizacionRM(), id);
		return au;
	}

}
