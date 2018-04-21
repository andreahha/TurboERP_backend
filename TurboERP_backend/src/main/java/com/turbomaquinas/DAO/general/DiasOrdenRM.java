package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.DiasOrden;

public class DiasOrdenRM implements RowMapper<DiasOrden>{

	@Override
	public DiasOrden mapRow(ResultSet rs, int i) throws SQLException {
		DiasOrden di = new DiasOrden();
		di.setId(rs.getInt("id"));
		di.setDias(rs.getInt("dias"));
		di.setFecha_registro(rs.getDate("fecha_registro"));
		di.setTipo(rs.getString("tipo"));
		di.setActivo(rs.getInt("activo"));
		di.setCreado_por(rs.getInt("creado_por"));
		di.setCreado(rs.getDate("creado"));
		di.setModificado_por(rs.getInt("modificado_por"));
		di.setModificado(rs.getDate("modificado"));
		di.setOrdenes_id(rs.getInt("ordenes_id"));
		di.setAreas_id(rs.getInt("areas_id"));
		return di;
	}

}
