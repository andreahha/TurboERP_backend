package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.MetodoPago;

public class MetodoPagoRM implements RowMapper<MetodoPago>{

	@Override
	public MetodoPago mapRow(ResultSet rs, int i) throws SQLException {
		MetodoPago m = new MetodoPago();
		m.setId(rs.getInt("id"));
		m.setDescripcion(rs.getString("descripcion"));
		m.setClave(rs.getString("clave"));
		m.setActivo(rs.getInt("activo"));
		m.setCreado_por(rs.getInt("creado_por"));
		m.setCreado(rs.getDate("creado"));
		m.setModificado_por(rs.getInt("modificado_por"));
		m.setModificado(rs.getDate("modificado"));
		return m;
	}

}
