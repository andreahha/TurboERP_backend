package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.Ciudad;

public class CiudadRM implements RowMapper<Ciudad>{

	@Override
	public Ciudad mapRow(ResultSet rs, int i) throws SQLException {
		Ciudad cv = new Ciudad();
		cv.setId(rs.getInt("id"));
		cv.setNombre(rs.getString("nombre"));
		cv.setClave(rs.getString("clave"));
		cv.setActivo(rs.getInt("activo"));
		cv.setEstados_id(rs.getInt("ESTADOS_id"));
		return cv;
	}

}
