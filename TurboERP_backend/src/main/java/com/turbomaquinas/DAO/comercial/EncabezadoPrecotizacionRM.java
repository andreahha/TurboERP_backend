package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.EncabezadoPrecotizacion;


public class EncabezadoPrecotizacionRM implements RowMapper<EncabezadoPrecotizacion>{

	@Override
	public EncabezadoPrecotizacion mapRow(ResultSet rs, int i) throws SQLException {
		EncabezadoPrecotizacion ep = new EncabezadoPrecotizacion();
		ep.setId(rs.getInt("id"));
		ep.setDescripcion(rs.getString("descripcion"));
		ep.setLugar(rs.getInt("lugar"));
		ep.setActivo(rs.getInt("activo"));
		ep.setCreado_por(rs.getInt("creado_por"));
		ep.setCreado(rs.getDate("creado"));
		ep.setModificado_por(rs.getInt("modificado_por"));
		ep.setModificado(rs.getDate("modificado"));
		ep.setPrecotizaciones_id(rs.getInt("precotizaciones_id"));
		return ep;
	}

}
