package com.turbomaquinas.DAO.diagnostico;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.diagnostico.Diagnostico;

public class DiagnosticoRM implements RowMapper<Diagnostico>{

	@Override
	public Diagnostico mapRow(ResultSet rs, int i) throws SQLException {
		
		Diagnostico d = new Diagnostico();
		d.setId(rs.getInt("id"));
		d.setConsecutivo(rs.getInt("consecutivo"));
		d.setFecha_diags(rs.getDate("fecha_diags"));
		d.setHora_diags(rs.getTime("hora_diags"));
		d.setActivo(rs.getInt("activo"));
		d.setCreado_por(rs.getInt("creado_por"));
		d.setCreado(rs.getDate("creado"));
		d.setModificado_por(rs.getInt("modificado"));
		d.setModificado(rs.getDate("modificado"));
		d.setAreas_id(rs.getInt("AREAS_id"));
		d.setOrdenes_id(rs.getInt("ORDENES_id"));
		d.setPersonal_id(rs.getInt("PERSONAL_id"));
		return d;
	}

}
