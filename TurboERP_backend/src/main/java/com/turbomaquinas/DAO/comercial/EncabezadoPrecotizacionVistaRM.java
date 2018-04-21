package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.EncabezadoPrecotizacionVista;

public class EncabezadoPrecotizacionVistaRM implements RowMapper<EncabezadoPrecotizacionVista>{
	
	@Override
	public EncabezadoPrecotizacionVista mapRow(ResultSet rs, int i) throws SQLException {
		EncabezadoPrecotizacionVista epv = new EncabezadoPrecotizacionVista();
		epv.setId(rs.getInt("id"));
		epv.setDescripcion(rs.getString("descripcion"));
		epv.setLugar(rs.getInt("lugar"));
		epv.setActivo(rs.getInt("activo"));
		epv.setCreado_por(rs.getInt("creado_por"));
		epv.setCreado(rs.getDate("creado"));
		epv.setModificado_por(rs.getInt("modificado_por"));
		epv.setModificado(rs.getDate("modificado"));
		epv.setPrecotizaciones_id(rs.getInt("precotizaciones_id"));
		epv.setPrecotizacion_no(rs.getInt("precotizacion_no"));
		epv.setCant_detalles(rs.getInt("cant_detalles"));
		return epv;
	}
}
