package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.Giro;

public class GiroRM implements RowMapper<Giro>{
	
	@Override
	public Giro mapRow(ResultSet rs, int i) throws SQLException {
		Giro g = new Giro();
		g.setId(rs.getInt("id"));
		g.setNumero(rs.getInt("numero"));
		g.setDescripcion(rs.getString("descripcion"));
		g.setExtranjero(rs.getInt("extranjero"));
		g.setActivo(rs.getInt("activo"));
		g.setCreado_por(rs.getInt("creado_por"));
		g.setCreado(rs.getTimestamp("creado"));
		g.setModificado_por(rs.getInt("modificado_por"));
		g.setModificado(rs.getTimestamp("modificado"));
		return g;
	}

}
