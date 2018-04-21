package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.FormaPago;

public class FormaPagoRM implements RowMapper<FormaPago>{

	@Override
	public FormaPago mapRow(ResultSet rs, int i) throws SQLException {
		FormaPago f = new FormaPago();
		f.setId(rs.getInt("id"));
		f.setDescripcion(rs.getString("descripcion"));
		f.setClave(rs.getString("clave"));
		f.setActivo(rs.getInt("activo"));
		f.setCreado_por(rs.getInt("creado_por"));
		f.setCreado(rs.getDate("creado"));
		f.setModificado_por(rs.getInt("modificado_por"));
		f.setModificado(rs.getDate("modificado"));
		return f;
	}

}
