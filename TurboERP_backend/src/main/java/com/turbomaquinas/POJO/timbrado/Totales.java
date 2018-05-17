package com.turbomaquinas.POJO.timbrado;

import java.math.BigDecimal;

public class Totales{
	public BigDecimal retenciones;
	public BigDecimal traslados;
	
	public Totales() {
		super();
	}

	public Totales(BigDecimal retenciones, BigDecimal traslados) {
		super();
		this.retenciones = retenciones;
		this.traslados = traslados;
	}

	public BigDecimal getRetenciones() {
		return retenciones;
	}

	public void setRetenciones(BigDecimal retenciones) {
		this.retenciones = retenciones;
	}

	public BigDecimal getTraslados() {
		return traslados;
	}

	public void setTraslados(BigDecimal traslados) {
		this.traslados = traslados;
	}
}