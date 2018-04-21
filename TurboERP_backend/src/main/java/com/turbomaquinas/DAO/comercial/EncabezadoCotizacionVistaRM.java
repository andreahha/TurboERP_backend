package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.EncabezadoCotizacionVista;

public class EncabezadoCotizacionVistaRM implements RowMapper<EncabezadoCotizacionVista>{

	@Override
	public EncabezadoCotizacionVista mapRow(ResultSet rs, int i) throws SQLException {
		EncabezadoCotizacionVista ev = new EncabezadoCotizacionVista();
		ev.setId(rs.getInt("id"));
		ev.setDescripcion(rs.getString("descripcion"));
		ev.setLugar(rs.getInt("lugar"));
		ev.setActivo(rs.getInt("activo"));
		ev.setCreado_por(rs.getInt("creado_por"));
		ev.setCreado(rs.getDate("creado"));
		ev.setModificado_por(rs.getInt("modificado_por"));
		ev.setModificado(rs.getDate("modificado"));
		ev.setCotizaciones_id(rs.getInt("cotizaciones_id"));
		ev.setCotizaciones_no(rs.getInt("cotizaciones_no"));
		ev.setEncabezados_diagnostico_id(rs.getInt("encabezados_diagnostico_id"));
		ev.setEncabezados_precotizaciones_id(rs.getInt("encabezados_precotizaciones_id"));
		ev.setCant_detalles(rs.getInt("cant_detalles"));
		return ev;
	}

}
