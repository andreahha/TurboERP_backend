package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.ActividadAutorizadaFactura;

public class ActividadAutorizadaFacturaRM implements RowMapper<ActividadAutorizadaFactura>{
	@Override
	public ActividadAutorizadaFactura mapRow(ResultSet rs, int i) throws SQLException {
		ActividadAutorizadaFactura ac = new ActividadAutorizadaFactura();
		ac.setId(rs.getInt("id"));
		ac.setDescripcion(rs.getString("descripcion"));
		ac.setTipo_actividad(rs.getString("tipo_actividad"));
		ac.setImporte_pendiente_facturar(rs.getBigDecimal("importe_pendiente_facturar"));
		ac.setDescuento_facturar(rs.getBigDecimal("descuento_facturar"));
		ac.setEncabezados_cotizaciones_id(rs.getInt("encabezados_cotizaciones_id"));
		ac.setEncabezados_cotizaciones_descripcion(rs.getString("encabezados_cotizaciones_descripcion"));
		return ac;
	}

}
