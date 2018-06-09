package com.turbomaquinas.DAO.timbrado;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCTimbrado implements TimbradoDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Override
	public String obtenerJSONFacturaFinal(int idFactura,String modo) throws DataAccessException {
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("JSON_TIMBRADO_FACTURA_FINAL");

		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("p_idFactura", idFactura);
		inParamMap.put("p_modo", modo);
		SqlParameterSource in = new MapSqlParameterSource(inParamMap);
	
		Map<String, Object> simpleJdbcCallResult = simpleJdbcCall.execute(in);
		
		String json=null;
		try{
			for (Entry<String, Object> entry : simpleJdbcCallResult.entrySet()) {
				if (entry.getKey().compareTo("jsonFactura") == 0) {
		            json=(String)entry.getValue();
		        }
		    }
			return json;
		}catch(Exception e){return null;}
	}
}
