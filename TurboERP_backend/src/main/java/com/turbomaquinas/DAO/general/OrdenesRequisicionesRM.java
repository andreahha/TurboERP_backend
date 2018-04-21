package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.OrdenesRequisiciones;

public class OrdenesRequisicionesRM implements RowMapper<OrdenesRequisiciones>{
	
	@Override
	public OrdenesRequisiciones mapRow(ResultSet rs, int i) throws SQLException {
		OrdenesRequisiciones or = new OrdenesRequisiciones();
		or.setId(rs.getInt("id"));
		or.setNumero_orden(rs.getString("numero_orden"));
		or.setFecha_autorizacion(rs.getDate("fecha_autorizacion"));
		or.setFecha_compromiso(rs.getDate("fecha_compromiso"));
		
		return or;
	}

}
