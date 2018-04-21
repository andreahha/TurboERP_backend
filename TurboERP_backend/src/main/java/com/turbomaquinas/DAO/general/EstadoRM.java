package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.Estado;

public class EstadoRM implements RowMapper<Estado>{
	
	@Override
	public Estado mapRow(ResultSet rs, int i) throws SQLException {
		Estado e = new Estado();
		e.setId(rs.getInt("id"));
		e.setNombre(rs.getString("nombre"));
		e.setClave(rs.getString("clave"));
		e.setActivo(rs.getInt("activo"));
		e.setCreadoPor(rs.getInt("creado_por"));
		e.setCreado(rs.getTimestamp("creado"));
		e.setModificadoPor(rs.getInt("modificado_por"));
		e.setModificado(rs.getTimestamp("modificado"));
		return e;
	}
	

}
