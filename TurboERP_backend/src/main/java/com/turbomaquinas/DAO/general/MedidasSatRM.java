package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.MedidasSat;

public class MedidasSatRM implements RowMapper<MedidasSat>{

	@Override
	public MedidasSat mapRow(ResultSet rs, int i) throws SQLException {
		MedidasSat ms = new MedidasSat();
		ms.setId(rs.getInt("id"));
		ms.setClave(rs.getString("clave"));
		ms.setDescripcion(rs.getString("descripcion"));
		ms.setActivo(rs.getInt("activo"));
		ms.setCreado_por(rs.getInt("creado_por"));
		ms.setCreado(rs.getDate("creado"));
		ms.setModificado_por(rs.getInt("modificado_por"));
		ms.setModificado(rs.getDate("modificado"));
		return ms;
	}

}
