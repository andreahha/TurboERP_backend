package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.CiudadVista;

public class CiudadVistaRM implements RowMapper<CiudadVista>{
	
	@Override
	public CiudadVista mapRow(ResultSet rs, int i) throws SQLException {
		CiudadVista cv = new CiudadVista();
		cv.setId(rs.getInt("id"));
		cv.setNombre(rs.getString("nombre"));
		cv.setClave(rs.getString("clave"));
		cv.setActivo(rs.getInt("activo"));
		cv.setEstado(rs.getString("estado"));
		return cv;
	}
	

}
