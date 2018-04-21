package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.Departamento;


public final class DepartamentoRM implements RowMapper<Departamento> {

	@Override
	public Departamento mapRow(ResultSet rs, int i) throws SQLException {
		Departamento d = new Departamento();
		d.setId(rs.getInt("id"));
		d.setClave(rs.getString("clave"));
		d.setDescripcion(rs.getString("descripcion"));
		d.setActivo(rs.getInt("activo"));
		d.setCreadoPor(rs.getInt("creado_por"));
		d.setCreado(rs.getTimestamp("creado"));
		d.setModificadoPor(rs.getInt("modificado_por"));
		d.setModificado(rs.getTimestamp("modificado"));
		return d;
	}

}
