package com.turbomaquinas.POJO.comercial;

import java.math.BigDecimal;
import java.util.List;

public class DocumentoAplicarPago {
	
	private int depositos_recibidos_id;
	private String fecha_pago;
	private BigDecimal importe_total;
	private int creado_por;
	private BigDecimal tipo_cambio_pago;
	private List<FacturasPagadas> facturas;
	
	public int getDepositos_recibidos_id() {
		return depositos_recibidos_id;
	}
	public void setDepositos_recibidos_id(int depositos_recibidos_id) {
		this.depositos_recibidos_id = depositos_recibidos_id;
	}
	public String getFecha_pago() {
		return fecha_pago;
	}
	public void setFecha_pago(String fecha_pago) {
		this.fecha_pago = fecha_pago;
	}
	public BigDecimal getImporte_total() {
		return importe_total;
	}
	public void setImporte_total(BigDecimal importe_total) {
		this.importe_total = importe_total;
	}
	public int getCreado_por() {
		return creado_por;
	}
	public void setCreado_por(int creado_por) {
		this.creado_por = creado_por;
	}
	public BigDecimal getTipo_cambio_pago() {
		return tipo_cambio_pago;
	}
	public void setTipo_cambio_pago(BigDecimal tipo_cambio_pago) {
		this.tipo_cambio_pago = tipo_cambio_pago;
	}
	public List<FacturasPagadas> getFacturas() {
		return facturas;
	}
	public void setFacturas(List<FacturasPagadas> facturas) {
		this.facturas = facturas;
	}
	
	@Override
	public String toString() {
		try {
	        return new com.fasterxml.jackson.databind.ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(this);
	    } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
	        e.printStackTrace();
	    }
	    return null;
	}

}
