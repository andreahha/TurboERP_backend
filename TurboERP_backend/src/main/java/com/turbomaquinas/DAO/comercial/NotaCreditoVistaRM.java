package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.NotaCreditoVista;

public class NotaCreditoVistaRM implements RowMapper<NotaCreditoVista> {

	@Override
	public NotaCreditoVista mapRow(ResultSet rs, int i) throws SQLException {
		
		NotaCreditoVista nc = new NotaCreditoVista();
		nc.setId(rs.getInt("id"));
		nc.setTipo(rs.getString("tipo"));
		nc.setNumero(rs.getInt("numero"));
		nc.setFecha(rs.getDate("fecha"));
		nc.setSubtotal(rs.getBigDecimal("subtotal"));
		nc.setIva(rs.getBigDecimal("iva"));
		nc.setTipo_cambio(rs.getBigDecimal("tipo_cambio"));
		nc.setFecha_baja(rs.getDate("fecha_baja"));
		nc.setMes_baja(rs.getInt("mes_baja"));
		nc.setAnio_baja(rs.getInt("anio_baja"));
		nc.setDescripcion(rs.getString("descripcion"));
		nc.setActivo(rs.getInt("activo"));
		nc.setFactura_varios_id(rs.getInt("factura_varios_id"));
		nc.setNum_factura_varios(rs.getString("num_factura_varios"));
		nc.setDatos_timbrado_id(rs.getInt("datos_timbrado_id"));
		nc.setUuid(rs.getString("uuid"));
		nc.setFactura_final_id(rs.getInt("factura_final_id"));
		nc.setNum_factura_final(rs.getString("num_factura_final"));
		nc.setFacturas_anticipo_id(rs.getInt("facturas_anticipo_id"));
		nc.setNum_factura_anticipo(rs.getString("num_factura_anticipo"));
		nc.setConceptos_facturacion_contable_id(rs.getInt("conceptos_facturacion_contable_id"));
		nc.setConcepto(rs.getString("concepto"));
		nc.setNotas_credito_id_sust(rs.getInt("notas_credito_id_sust"));
		
		return nc;
	}

}
