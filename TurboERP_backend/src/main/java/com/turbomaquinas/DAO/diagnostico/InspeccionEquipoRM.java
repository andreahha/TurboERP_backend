package com.turbomaquinas.DAO.diagnostico;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.diagnostico.InspeccionEquipo;

public class InspeccionEquipoRM implements RowMapper<InspeccionEquipo>{

	@Override
	public InspeccionEquipo mapRow(ResultSet rs, int i) throws SQLException {
		InspeccionEquipo ie = new InspeccionEquipo();
		ie.setId(rs.getInt("id"));
		ie.setComentarios(rs.getString("comentarios"));
		ie.setConsecutivo(rs.getInt("consecutivo"));
		ie.setSustituye_id(rs.getInt("sustituye_id"));
		ie.setActivo(rs.getInt("activo"));
		ie.setCreado_por(rs.getInt("creado_por"));
		ie.setCreado(rs.getDate("creado"));
		ie.setModificado_por(rs.getInt("modificado_por"));
		ie.setModificado(rs.getDate("modificado"));
		ie.setAlfresco_id(rs.getString("alfresco_id"));
		ie.setOrdenes_id(rs.getInt("ordenes_id"));
		ie.setPersonal_id(rs.getInt("personal_id"));
		return ie;
	}
}
