package com.turbomaquinas.POJO.general;

import java.util.List;

public class DocumentoSolicitudBajaAA {
	private String motivo;
	private String tipo;
	private int creado_por;
	private List<Integer> actividades_ids;
	
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCreado_por() {
		return creado_por;
	}
	public void setCreado_por(int creado_por) {
		this.creado_por = creado_por;
	}
	public List<Integer> getActividades_ids() {
		return actividades_ids;
	}
	public void setActividades_ids(List<Integer> actividades_ids) {
		this.actividades_ids = actividades_ids;
	}
	@Override
	public String toString() {
		return "DocumentoSolicitudBajaAA [motivo=" + motivo + ", tipo=" + tipo + ", creado_por=" + creado_por
				+ ", actividades_ids=" + actividades_ids + "]";
	}
}
