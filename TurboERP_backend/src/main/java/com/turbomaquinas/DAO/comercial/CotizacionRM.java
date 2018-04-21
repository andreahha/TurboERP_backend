package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.Cotizacion;

public class CotizacionRM implements RowMapper<Cotizacion>{

	@Override
	public Cotizacion mapRow(ResultSet rs, int i) throws SQLException {

		Cotizacion c = new Cotizacion();
		c.setId(rs.getInt("id"));
		c.setNumero(rs.getInt("numero"));
		c.setAnio(rs.getInt("anio"));
		c.setEncabezado(rs.getString("encabezado"));
		c.setDescripcion_general(rs.getString("descripcion_general"));
		c.setPie_pagina(rs.getString("pie_pagina"));
		c.setPie_pagina_usuario(rs.getString("pie_pagina_usuario"));
		c.setFecha_cot(rs.getDate("fecha_cot"));
		c.setHora_cot(rs.getTime("hora_cot"));
		c.setSubtotal(rs.getBigDecimal("subtotal"));
		c.setDescuento(rs.getBigDecimal("descuento"));
		c.setDescripcion_descto(rs.getString("descripcion_descto"));
		c.setIva(rs.getBigDecimal("iva"));
		c.setIva_retenido(rs.getBigDecimal("iva_retenido"));
		c.setTotal(rs.getBigDecimal("total"));
		c.setMoneda(rs.getString("moneda"));
		c.setActivo(rs.getInt("activo"));
		c.setCreado_por(rs.getInt("creado_por"));
		c.setCreado(rs.getDate("creado"));
		c.setModificado_por(rs.getInt("modificado_por"));
		c.setModificado(rs.getDate("modificado"));
		c.setAreas_id(rs.getInt("AREAS_id"));
		c.setPersonal_id(rs.getInt("PERSONAL_id"));
		c.setOrdenes_id(rs.getInt("ORDENES_id"));
		c.setPrecotizaciones_id(rs.getInt("PRECOTIZACIONES_id"));
		c.setContactos_id(rs.getInt("contactos_id"));
		return c;
	}
}
