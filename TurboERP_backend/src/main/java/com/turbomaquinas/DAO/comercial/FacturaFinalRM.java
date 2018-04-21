package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.FacturaFinal;

public class FacturaFinalRM implements RowMapper<FacturaFinal> {
	
	@Override
	public FacturaFinal mapRow(ResultSet rs, int i) throws SQLException {
		FacturaFinal ff = new FacturaFinal();
		ff.setId(rs.getInt("id"));
		ff.setTipo(rs.getString("tipo"));
		ff.setNumero(rs.getInt("numero"));
		ff.setFecha_factura(rs.getDate("fecha_factura"));
		ff.setFecha_vencimiento(rs.getDate("fecha_vencimiento"));
		ff.setSubtotal(rs.getFloat("subtotal"));
		ff.setDescuento(rs.getFloat("descuento"));
		ff.setIva(rs.getFloat("iva"));
		ff.setImporte_anticipo(rs.getFloat("importe_anticipo"));
		ff.setIva_retenido(rs.getFloat("iva_retenido"));
		ff.setTotal(rs.getFloat("total"));
		ff.setImporte_pagado(rs.getFloat("importe_pagado"));
		ff.setSaldo(rs.getFloat("saldo"));
		ff.setMoneda(rs.getString("moneda"));
		ff.setTipo_cambio(rs.getFloat("tipo_cambio"));
		ff.setCondiciones_pago(rs.getString("condiciones_pago"));
		ff.setFecha_baja(rs.getDate("fecha_baja"));
		ff.setMes_baja(rs.getInt("mes_baja"));
		ff.setAnio_baja(rs.getInt("anio_baja"));
		ff.setActivo(rs.getInt("activo"));
		ff.setCreado_por(rs.getInt("creado_por"));
		ff.setCreado(rs.getDate("creado"));
		ff.setModificado_por(rs.getInt("modificado_por"));
		ff.setModificado(rs.getDate("modificado"));
		ff.setFactura_final_id_sust(rs.getInt("factura_final_id_sust"));
		ff.setDatos_timbrado_id(rs.getInt("datos_timbrado_id"));
		ff.setFormas_pago_id(rs.getInt("formas_pago_id"));
		ff.setMetodos_pago_id(rs.getInt("datos_timbrado_id"));
		ff.setUso_cfdi_id(rs.getInt("uso_cfdi_id"));
		ff.setClientes_id(rs.getInt("CLIENTES_id"));
		return ff;
	}
	

}
