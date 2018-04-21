package com.turbomaquinas.POJO.comercial;

import java.util.List;

public class DocumentoFacturaFinal {
	private FacturaFinal factura;
	private List<ActividadesFF> actividades;
	private int creado_por;
	
	public DocumentoFacturaFinal() {
		super();
	}

	public DocumentoFacturaFinal(FacturaFinal factura, List<ActividadesFF> actividades, int creado_por) {
		super();
		this.factura = factura;
		this.actividades = actividades;
		this.creado_por = creado_por;
	}

	public FacturaFinal getFactura() {
		return factura;
	}

	public void setFactura(FacturaFinal factura) {
		this.factura = factura;
	}

	public List<ActividadesFF> getActividades() {
		return actividades;
	}

	public void setActividades(List<ActividadesFF> actividades) {
		this.actividades = actividades;
	}
	

	public int getCreado_por() {
		return creado_por;
	}

	public void setCreado_por(int creado_por) {
		this.creado_por = creado_por;
	}

	@Override
	public String toString() {
		return "DocumentoFacturaFinal [factura=" + factura + ", actividades=" + actividades + ", creado_por="
				+ creado_por + "]";
	}

	
}
