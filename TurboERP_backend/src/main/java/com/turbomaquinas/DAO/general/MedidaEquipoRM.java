package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.MedidaEquipo;

public class MedidaEquipoRM implements RowMapper<MedidaEquipo>{

	@Override
	public MedidaEquipo mapRow(ResultSet rs, int i) throws SQLException {
		
		MedidaEquipo med = new MedidaEquipo();
		med.setId(rs.getInt("id"));
		med.setDescripcion(rs.getString("descripcion"));
		med.setCreado_por(rs.getInt("creado_por"));
		med.setCreado(rs.getDate("creado"));
		med.setModificado_por(rs.getInt("modificado_por"));
		med.setModificado(rs.getDate("modificado"));
		return med;
	}
}
