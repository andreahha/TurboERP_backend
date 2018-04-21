package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.DiasPrecotizacion;

public class DiasPrecotizacionRM implements RowMapper<DiasPrecotizacion> {

	@Override
	public DiasPrecotizacion mapRow(ResultSet rs, int i) throws SQLException {
		
		DiasPrecotizacion dp = new DiasPrecotizacion();
		dp.setId(rs.getInt("id"));
		dp.setDias(rs.getInt("dias"));
		dp.setFecha_registro(rs.getDate("fecha_registro"));
		dp.setTipo(rs.getString("tipo"));
		dp.setActivo(rs.getInt("activo"));
		dp.setCreado_por(rs.getInt("creado_por"));
		dp.setCreado(rs.getDate("creado"));
		dp.setModificado_por(rs.getInt("modificado_por"));
		dp.setModificado(rs.getDate("modificado"));
		dp.setPrecotizaciones_id(rs.getInt("precotizaciones_id"));
		return dp;
	}
}
