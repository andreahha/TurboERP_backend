package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.UsoCfdi;

public class UsoCfdiRM implements RowMapper<UsoCfdi>{

	@Override
	public UsoCfdi mapRow(ResultSet rs, int i) throws SQLException {
		UsoCfdi uc = new UsoCfdi();
		uc.setId(rs.getInt("id"));
		uc.setClave(rs.getString("clave"));
		uc.setDescripcion(rs.getString("descripcion"));
		uc.setActivo(rs.getInt("activo"));
		uc.setCreado_por(rs.getInt("creado_por"));
		uc.setCreado(rs.getDate("creado"));
		uc.setModificado_por(rs.getInt("modificado_por"));
		uc.setModificado(rs.getDate("modificado"));
		return uc;
	}

}
