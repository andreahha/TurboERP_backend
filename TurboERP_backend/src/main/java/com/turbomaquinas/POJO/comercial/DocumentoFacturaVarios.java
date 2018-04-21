package com.turbomaquinas.POJO.comercial;

import java.util.List;

public class DocumentoFacturaVarios {
	
	FacturaVarios factura;
	List<FacturaVariosDetalle> detalles;
	
	public DocumentoFacturaVarios() {
		super();
	}

	public DocumentoFacturaVarios(FacturaVarios factura, List<FacturaVariosDetalle> detalles) {
		this.factura = factura;
		this.detalles = detalles;
	}

	public FacturaVarios getFactura() {
		return factura;
	}

	public void setFactura(FacturaVarios factura) {
		this.factura = factura;
	}

	public List<FacturaVariosDetalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<FacturaVariosDetalle> detalles) {
		this.detalles = detalles;
	}
}
