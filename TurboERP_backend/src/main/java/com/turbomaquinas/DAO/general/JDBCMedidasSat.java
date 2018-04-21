package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.MedidasSat;

@Repository
public class JDBCMedidasSat implements MedidasSatDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public MedidasSat buscar(String clave) throws DataAccessException{
		MedidasSat ms = jdbcTemplate.queryForObject("SELECT * FROM MEDIDAS_SAT WHERE clave = ? and activo = 1", 
				new MedidasSatRM(), clave );
		return ms;
	}

	@Override
	public List<MedidasSat> consultar() throws DataAccessException{
		List<MedidasSat> lms = jdbcTemplate.query("SELECT * FROM MEDIDAS_SAT where activo = 1", 
				new MedidasSatRM());
		return lms;
	}

}
