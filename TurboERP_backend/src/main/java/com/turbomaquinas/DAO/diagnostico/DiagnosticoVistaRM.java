package com.turbomaquinas.DAO.diagnostico;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.diagnostico.DiagnosticoVista;

public class DiagnosticoVistaRM implements RowMapper<DiagnosticoVista> {

	@Override
	public DiagnosticoVista mapRow(ResultSet rs, int i) throws SQLException {
		
		DiagnosticoVista dv = new DiagnosticoVista();
		dv.setId(rs.getInt("id"));
		dv.setConsecutivo(rs.getInt("consecutivo"));
		dv.setFecha_diags(rs.getDate("fecha_diags"));
		dv.setHora_diags(rs.getTime("hora_diags"));
		dv.setActivo(rs.getInt("activo"));
		dv.setAreas_id(rs.getInt("areas_id"));
		dv.setNumarea(rs.getInt("numarea"));
		dv.setSubindice_area(rs.getString("subindice_area"));
		dv.setOrdenes_id(rs.getInt("ordenes_id"));
		dv.setNumorden(rs.getInt("numorden"));
		dv.setAnioorden(rs.getInt("anioorden"));
		dv.setNumero_orden(rs.getString("numero_orden"));
		dv.setPersonal_id(rs.getInt("personal_id"));
		dv.setPersonal(rs.getString("personal"));
		return dv;
	}

}
