package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.EncabezadoActividadAutorizada;

public class EncabezadoActividadAutorizadaRM implements RowMapper<EncabezadoActividadAutorizada>{

	@Override
	public EncabezadoActividadAutorizada mapRow(ResultSet rs, int i) throws SQLException {
		EncabezadoActividadAutorizada e = new EncabezadoActividadAutorizada();
		e.setId(rs.getInt("id"));
		e.setDescripcion(rs.getString("descripcion"));
		e.setLugar(rs.getInt("lugar"));
		e.setActivo(rs.getInt("activo"));
		e.setCreado_por(rs.getInt("creado_por"));
		e.setCreado(rs.getDate("creado"));
		e.setModificado_por(rs.getInt("modificado_por"));
		e.setModificado(rs.getDate("modificado"));
		e.setOrdenes_id(rs.getInt("ordenes_id"));
		return e;
	}

}
