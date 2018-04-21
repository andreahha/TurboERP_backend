package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.Bancos;

public class BancosRM implements RowMapper<Bancos>{

	@Override
	public Bancos mapRow(ResultSet rs, int i) throws SQLException {
		
		Bancos b = new Bancos();
		b.setId(rs.getInt("id"));
		b.setClave(rs.getString("clave"));
		b.setDescripcion(rs.getString("descripcion"));
		b.setRfc(rs.getString("rfc"));
		b.setActivo(rs.getInt("activo"));
		b.setCreado_por(rs.getInt("creado_por"));
		b.setCreado(rs.getDate("creado"));
		b.setModificado_por(rs.getInt("modificado"));
		b.setModificado(rs.getDate("modificado"));
		return b;
	}

}
