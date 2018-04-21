package com.turbomaquinas.DAO.diagnostico;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.diagnostico.EncabezadoDiagnosticoVista;

public class EncabezadoDiagnosticoVistaRM implements RowMapper<EncabezadoDiagnosticoVista>{

	@Override
	public EncabezadoDiagnosticoVista mapRow(ResultSet rs, int i) throws SQLException {
		EncabezadoDiagnosticoVista e = new EncabezadoDiagnosticoVista();
		e.setId(rs.getInt("id"));
		e.setDescripcion(rs.getString("descripcion"));
		e.setLugar(rs.getInt("lugar"));
		e.setActivo(rs.getInt("activo"));
		e.setCreado_por(rs.getInt("creado_por"));
		e.setCreado(rs.getDate("creado"));
		e.setModificado_por(rs.getInt("modificado_por"));
		e.setModificado(rs.getDate("modificado"));
		e.setDiagnostico_id(rs.getInt("diagnostico_id"));
		e.setConsecutivo(rs.getInt("consecutivo"));
		e.setFecha_diags(rs.getDate("fecha_diags"));
		e.setHora_diags(rs.getTime("hora_diags"));
		e.setCant_detalles(rs.getInt("cant_detalles"));
		return e;
	}

}
