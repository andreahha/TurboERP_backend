package com.turbomaquinas.POJO.general;

import java.util.List;

public class DocumentoActividadesAutorizadas {
	private int creado_por;
	private String moneda_autorizada;
	private List<DetalleCotizacionAutorizado> actividades;

	public int getCreado_por() {
		return creado_por;
	}
	public void setCreado_por(int creado_por) {
		this.creado_por = creado_por;
	}
	public String getMoneda_autorizada() {
		return moneda_autorizada;
	}
	public void setMoneda_autorizada(String moneda_autorizada) {
		this.moneda_autorizada = moneda_autorizada;
	}
	public List<DetalleCotizacionAutorizado> getActividades() {
		return actividades;
	}
	public void setActividades(List<DetalleCotizacionAutorizado> actividades) {
		this.actividades = actividades;
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
