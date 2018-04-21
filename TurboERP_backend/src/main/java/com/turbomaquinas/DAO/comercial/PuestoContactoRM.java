package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.PuestoContacto;

public class PuestoContactoRM implements RowMapper<PuestoContacto> {

	@Override
	public PuestoContacto mapRow(ResultSet rs, int i) throws SQLException {
		PuestoContacto pc = new PuestoContacto();
		pc.setId(rs.getInt("id"));
		pc.setDescripcion(rs.getString("descripcion"));
		pc.setActivo(rs.getInt("activo"));
		pc.setCreado_por(rs.getInt("creado_por"));
		pc.setCreado(rs.getTimestamp("creado"));
		pc.setModificado_por(rs.getInt("modificado_por"));
		pc.setModificado(rs.getTimestamp("modificado"));
		return pc;
	}

}
