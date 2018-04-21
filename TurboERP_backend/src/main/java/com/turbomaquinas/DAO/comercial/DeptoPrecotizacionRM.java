package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.DeptoPrecotizacion;

public class DeptoPrecotizacionRM implements RowMapper<DeptoPrecotizacion>{
	
	@Override
	public DeptoPrecotizacion mapRow(ResultSet rs, int i) throws SQLException {
		DeptoPrecotizacion dp = new DeptoPrecotizacion();
		dp.setId(rs.getInt("id"));
		dp.setFecha_registro(rs.getDate("fecha_registro"));
		dp.setActivo(rs.getInt("activo"));
		dp.setCreado_por(rs.getInt("creado_por"));
		dp.setCreado(rs.getDate("creado"));
		dp.setModificado_por(rs.getInt("modificado_por"));
		dp.setModificado(rs.getDate("modificado"));
		dp.setDetalle_precotizaciones_id(rs.getInt("detalle_precotizaciones_id"));
		dp.setDepartamentos_id(rs.getInt("departamentos_id"));
		return dp;
	}
}
