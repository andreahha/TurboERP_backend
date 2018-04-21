package com.turbomaquinas.DAO.produccion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCActividades implements ActividadesDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Boolean estaVacio(int id) {
		Integer cantidad = null;
		String sql = "SELECT JSON_LENGTH(dd.departamentos,'$.ids') cant "
				+ "FROM DETALLE_DIAGNOSTICO dd "
				+ "WHERE dd.id = (SELECT DETALLE_DIAGNOSTICO_id FROM ACTIVIDADES_PRODUCCION WHERE id = ?)";
		try {
			cantidad = jdbcTemplate.queryForObject(sql, Integer.class, id);
			if(cantidad == null){
				cantidad = 0;
			}
		} catch (DataAccessException e) {
			return true;
		}
		
		return (cantidad == 0);
	}
	

}
