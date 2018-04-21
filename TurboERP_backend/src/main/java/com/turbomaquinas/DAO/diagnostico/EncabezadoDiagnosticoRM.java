package com.turbomaquinas.DAO.diagnostico;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.diagnostico.EncabezadoDiagnostico;

public class EncabezadoDiagnosticoRM implements RowMapper<EncabezadoDiagnostico>{

	@Override
	public EncabezadoDiagnostico mapRow(ResultSet rs, int i) throws SQLException {
		EncabezadoDiagnostico e = new EncabezadoDiagnostico();
		e.setId(rs.getInt("id"));
		e.setDescripcion(rs.getString("descripcion"));
		e.setLugar(rs.getInt("lugar"));
		e.setActivo(rs.getInt("activo"));
		e.setCreado_por(rs.getInt("creado_por"));
		e.setCreado(rs.getDate("creado"));
		e.setModificado_por(rs.getInt("modificado_por"));
		e.setModificado(rs.getDate("modificado"));
		e.setDiagnostico_id(rs.getInt("diagnostico_id"));
		return e;
	}
	
}
