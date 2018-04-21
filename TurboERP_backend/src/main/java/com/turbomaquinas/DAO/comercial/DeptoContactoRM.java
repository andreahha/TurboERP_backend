package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.DeptoContacto;

public class DeptoContactoRM implements RowMapper<DeptoContacto>{

	@Override
	public DeptoContacto mapRow(ResultSet rs, int i) throws SQLException {
		DeptoContacto dc = new DeptoContacto();
		dc.setId(rs.getInt("id"));
		dc.setDescripcion(rs.getString("descripcion"));
		dc.setActivo(rs.getInt("activo"));
		dc.setCreado_por(rs.getInt("creado_por"));
		dc.setCreado(rs.getTimestamp("creado"));
		dc.setModificado_por(rs.getInt("modificado_por"));
		dc.setModificado(rs.getTimestamp("modificado"));
		return dc;
	}
	
}
