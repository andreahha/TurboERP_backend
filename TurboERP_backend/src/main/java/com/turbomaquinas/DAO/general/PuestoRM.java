package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.Puesto;

public class PuestoRM implements RowMapper<Puesto>{

	@Override
	public Puesto mapRow(ResultSet rs, int i) throws SQLException {
		Puesto p = new Puesto();
		p.setId(rs.getInt("id"));
		p.setClave(rs.getString("clave"));
		p.setDescripcion(rs.getString("descripcion"));
		p.setNivel(rs.getString("nivel"));
		p.setActivo(rs.getInt("activo"));
		p.setCreado_por(rs.getInt("creado_por"));
		p.setCreado(rs.getDate("creado"));
		p.setModificado_por(rs.getInt("modificado_por"));
		p.setModificado(rs.getDate("modificado"));
		return p;
	}
}
