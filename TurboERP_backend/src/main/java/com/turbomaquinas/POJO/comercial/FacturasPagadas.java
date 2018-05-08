package com.turbomaquinas.POJO.comercial;

import java.math.BigDecimal;
import java.util.List;

public class FacturasPagadas {
	
	private BigDecimal importe;
	private int factura_id;
	private BigDecimal tipo_cambio;
	private String tipo_factura;
	private List<OrdenesporFactura> ordenes;
	
	public BigDecimal getImporte() {
		return importe;
	}
	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}
	public int getFactura_id() {
		return factura_id;
	}
	public void setFactura_id(int factura_id) {
		this.factura_id = factura_id;
	}
	public BigDecimal getTipo_cambio() {
		return tipo_cambio;
	}
	public void setTipo_cambio(BigDecimal tipo_cambio) {
		this.tipo_cambio = tipo_cambio;
	}
	public String getTipo_factura() {
		return tipo_factura;
	}
	public void setTipo_factura(String tipo_factura) {
		this.tipo_factura = tipo_factura;
	}
	public List<OrdenesporFactura> getOrdenes() {
		return ordenes;
	}
	public void setOrdenes(List<OrdenesporFactura> ordenes) {
		this.ordenes = ordenes;
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
