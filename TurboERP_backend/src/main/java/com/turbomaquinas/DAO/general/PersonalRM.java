package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.Personal;

public class PersonalRM implements RowMapper<Personal> {

	@Override
	public Personal mapRow(ResultSet rs, int i) throws SQLException {
		Personal p = new Personal();
		p.setId(rs.getInt("id"));
		p.setNumero(rs.getInt("numero"));
		p.setNombre(rs.getString("nombre"));
		p.setPaterno(rs.getString("paterno"));
		p.setMaterno(rs.getString("materno"));
		p.setKeycloak_id(rs.getString("keycloak_id"));
		p.setActivo(rs.getInt("activo"));
		p.setCreado_por(rs.getInt("creado_por"));
		p.setCreado(rs.getDate("creado"));
		p.setModificado_por(rs.getInt("modificado_por"));
		p.setModificado(rs.getDate("modificado"));
		p.setDepartamentos_id(rs.getInt("DEPARTAMENTOS_id"));
		p.setIniciales(rs.getString("iniciales"));
		p.setTipo(rs.getString("tipo"));
		return p;
	}

}
