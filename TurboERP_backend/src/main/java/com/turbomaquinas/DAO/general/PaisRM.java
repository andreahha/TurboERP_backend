package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.Pais;

public class PaisRM implements RowMapper<Pais>{

	@Override
	public Pais mapRow(ResultSet rs, int i) throws SQLException {
		Pais p = new Pais();
		p.setId(rs.getInt("id"));
		p.setClave(rs.getString("clave"));
		p.setDescripcion(rs.getString("descripcion"));
		p.setActivo(rs.getInt("activo"));
		p.setCreado_por(rs.getInt("creado_por"));
		p.setCreado(rs.getTimestamp("creado"));
		p.setModificado_por(rs.getInt("modificado_por"));
		p.setModificado(rs.getTimestamp("modificado"));
		return p;
	}
	
	
	
	

}
