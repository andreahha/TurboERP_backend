package com.turbomaquinas.DAO.diagnostico;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.diagnostico.RemisionesEmbarqueVista;

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

	@Override
	public RemisionesEmbarqueVista buscar(int id) {
		RemisionesEmbarqueVista rev = jdbcTemplate.queryForObject("SELECT * FROM turbomaquinas.REMISIONES_EMBARQUE_V WHERE id = ?", 
				new RemisionesEmbarqueVistaRM(), id);
		return rev;
	}

	@Override
	public List<RemisionesEmbarqueVista> buscarRemisionOrden(int idOrden) {
		List<RemisionesEmbarqueVista> rev = jdbcTemplate.query("SELECT * FROM REMISIONES_EMBARQUE_V WHERE ORDENES_id=?", 
				new RemisionesEmbarqueVistaRM(), idOrden);
		return rev;
	}

	@Override
	public List<RemisionesEmbarqueVista> remisionEmbarqueRangoFecha(String fecha_remisionInicio,String fecha_remisionFin) {
		
		String sql = "select *"
				+ " from REMISIONES_EMBARQUE_V r"
				+ " where fecha between ? and ? and activo=1 ";
		
		List<RemisionesEmbarqueVista> dv = jdbcTemplate.query(sql, new RemisionesEmbarqueVistaRM(),fecha_remisionInicio,fecha_remisionFin);			
		
		return dv;
	}

}
