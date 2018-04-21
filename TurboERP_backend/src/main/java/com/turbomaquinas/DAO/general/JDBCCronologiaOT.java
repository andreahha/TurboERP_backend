package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.CronologiaOT;

@Repository
public class JDBCCronologiaOT implements CronologiaOTDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<CronologiaOT> consultarPorOrden(int id) throws DataAccessException{
		List<CronologiaOT> cron = jdbcTemplate.query("SELECT * FROM CRONOLOGIA_OT_V WHERE ORDENES_id = ? ORDER BY fecha, creado", 
				new CronologiaOTRM(), id);
		return cron;
	}
}
