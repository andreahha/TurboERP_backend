package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.Cubre;

public class CubreRM implements RowMapper<Cubre>{

	@Override
	public Cubre mapRow(ResultSet rs, int i) throws SQLException {
		Cubre c = new Cubre();
		c.setId(rs.getInt("id"));
		c.setActivo(rs.getInt("activo"));
		c.setPersonal_id(rs.getInt("personal_id"));
		c.setPuestos_id(rs.getInt("puestos_id"));
		return c;
	}

}
