package com.turbomaquinas.DAO.diagnostico;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCRemisionEmbarque implements RemisionEmbarqueDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void RemisionEmbarque(String doc) throws DataAccessException{
		
		
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("CREAR_REMISION_EMBARQUE");
		
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		
		inParamMap.put("doc", doc);
		SqlParameterSource in = new MapSqlParameterSource(inParamMap);
		simpleJdbcCall.execute(in);
		
	}

}
