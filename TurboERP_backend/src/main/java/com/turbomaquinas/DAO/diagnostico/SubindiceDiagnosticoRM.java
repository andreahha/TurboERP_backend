package com.turbomaquinas.DAO.diagnostico;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.diagnostico.SubindiceDiagnostico;

public class SubindiceDiagnosticoRM implements RowMapper<SubindiceDiagnostico>{

	@Override
	public SubindiceDiagnostico mapRow(ResultSet rs, int i) throws SQLException {
		SubindiceDiagnostico s = new SubindiceDiagnostico();
		s.setId(rs.getInt("id"));
		s.setDescripcion(rs.getString("descripcion"));
		s.setLugar(rs.getInt("lugar"));
		s.setActivo(rs.getInt("activo"));
		s.setCreado_por(rs.getInt("creado_por"));
		s.setCreado(rs.getDate("creado"));
		s.setModificado_por(rs.getInt("modificado_por"));
		s.setModificado(rs.getDate("modificado"));
		s.setDetalle_diagnostico_id(rs.getInt("detalle_diagnostico_id"));
		return s;
	}

}
