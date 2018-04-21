package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.CotizacionVista;

public class CotizacionVistaRM implements RowMapper<CotizacionVista>{

	@Override
	public CotizacionVista mapRow(ResultSet rs, int i) throws SQLException {
		
		CotizacionVista cv = new CotizacionVista();
		cv.setId(rs.getInt("id"));
		cv.setNumero(rs.getInt("numero"));
		cv.setAnio(rs.getInt("anio"));
		cv.setNumero_cotizacion(rs.getString("numero_cotizacion"));
		cv.setEncabezado(rs.getString("encabezado"));
		cv.setDescripcion_general(rs.getString("descripcion_general"));
		cv.setPie_pagina(rs.getString("pie_pagina"));
		cv.setPie_pagina_usuario(rs.getString("pie_pagina_usuario"));
		cv.setFecha_cot(rs.getDate("fecha_cot"));
		cv.setHora_cot(rs.getTime("hora_cot"));
		cv.setSubtotal(rs.getBigDecimal("subtotal"));
		cv.setDescuento(rs.getBigDecimal("descuento"));
		cv.setDescripcion_descto(rs.getString("descripcion_descto"));
		cv.setIva(rs.getBigDecimal("iva"));
		cv.setIva_retenido(rs.getBigDecimal("iva_retenido"));
		cv.setTotal(rs.getBigDecimal("total"));
		cv.setMoneda(rs.getString("moneda"));
		cv.setActivo(rs.getInt("activo"));
		cv.setAreas_id(rs.getInt("areas_id"));
		cv.setNarea(rs.getInt("narea"));
		cv.setPersonal_id(rs.getInt("personal_id"));
		cv.setPersonal(rs.getString("personal"));
		cv.setOrdenes_id(rs.getInt("ordenes_id"));
		cv.setOrden(rs.getInt("orden"));
		cv.setPrecotizaciones_id(rs.getInt("precotizaciones_id"));
		cv.setPrecotizacion(rs.getInt("precotizacion"));
		cv.setContactos_id(rs.getInt("contactos_id"));
		cv.setContactos(rs.getString("contactos"));
		cv.setRevision(rs.getInt("revision"));
		cv.setCotizaciones_id_original(rs.getInt("cotizaciones_id_original"));
		return cv;
	}
}
