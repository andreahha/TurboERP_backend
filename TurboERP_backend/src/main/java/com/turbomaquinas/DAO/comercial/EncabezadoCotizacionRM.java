package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.EncabezadoCotizacion;

public class EncabezadoCotizacionRM implements RowMapper<EncabezadoCotizacion>{

	@Override
	public EncabezadoCotizacion mapRow(ResultSet rs, int i) throws SQLException {
		EncabezadoCotizacion e = new EncabezadoCotizacion();
		e.setId(rs.getInt("id"));
		e.setDescripcion(rs.getString("descripcion"));
		e.setLugar(rs.getInt("lugar"));
		e.setActivo(rs.getInt("activo"));
		e.setCreado_por(rs.getInt("creado_por"));
		e.setCreado(rs.getDate("creado"));
		e.setModificado_por(rs.getInt("modificado_por"));
		e.setModificado(rs.getDate("modificado"));
		e.setCotizaciones_id(rs.getInt("cotizaciones_id"));
		e.setEncabezados_diagnostico_id(rs.getInt("encabezados_diagnostico_id"));
		e.setEncabezados_precotizaciones_id(rs.getInt("encabezados_precotizaciones_id"));
		return e;
	}

}
