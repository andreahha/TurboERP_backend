package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.DeptoCotizacion;

public class DeptoCotizacionRM implements RowMapper<DeptoCotizacion> {

	@Override
	public DeptoCotizacion mapRow(ResultSet rs, int i) throws SQLException {
		
		DeptoCotizacion dc = new DeptoCotizacion();
		dc.setId(rs.getInt("id"));
		dc.setFecha_registro(rs.getDate("fecha_registro"));
		dc.setActivo(rs.getInt("activo"));
		dc.setCreado_por(rs.getInt("creado_por"));
		dc.setCreado(rs.getDate("creado"));
		dc.setModificado_por(rs.getInt("modificado_por"));
		dc.setModificado(rs.getDate("modificado"));
		dc.setDetalle_cotizaciones_id(rs.getInt("detalle_cotizaciones_id"));
		dc.setDepartamentos_id(rs.getInt("departamentos_id"));
		return dc;
	}

}
