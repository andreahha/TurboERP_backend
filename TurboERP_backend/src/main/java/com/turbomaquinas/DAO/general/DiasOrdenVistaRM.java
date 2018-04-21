package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.DiasOrdenVista;

public class DiasOrdenVistaRM implements RowMapper<DiasOrdenVista>{

	@Override
	public DiasOrdenVista mapRow(ResultSet rs, int i) throws SQLException {
		DiasOrdenVista dv = new DiasOrdenVista();
		dv.setId(rs.getInt("id"));
		dv.setDias(rs.getInt("dias"));
		dv.setFecha_registro(rs.getDate("fecha_registro"));
		dv.setTipo(rs.getString("tipo"));
		dv.setCreado_por(rs.getInt("creado_por"));
		dv.setCreado(rs.getDate("creado"));
		dv.setModificado_por(rs.getInt("modificado_por"));
		dv.setModificado(rs.getDate("modificado"));
		dv.setOrdenes_id(rs.getInt("ordenes_id"));
		dv.setNumero_orden(rs.getString("numero_orden"));
		dv.setDescripcion(rs.getString("descripcion"));
		dv.setAreas_id(rs.getInt("areas_id"));
		dv.setNumero_area(rs.getInt("numero_area"));
		return dv;
	}

}
