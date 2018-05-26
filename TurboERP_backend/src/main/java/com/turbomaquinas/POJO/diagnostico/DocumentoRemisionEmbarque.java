package com.turbomaquinas.POJO.diagnostico;

import java.util.List;

public class DocumentoRemisionEmbarque {
	
	private int orden_id;
	private int departamento_id;
	private int creado_por;
	private String fecha;
	private String vehiculo;
	private String marca;
	private String placas;
	private String chofer;
	private String atencion;
	private String flete;
	private int porcentaje_remision;
	private int activo;
	private List<EquipoEmbarcado> equipo_embarcado;
	
	public int getOrden_id() {
		return orden_id;
	}
	public void setOrden_id(int orden_id) {
		this.orden_id = orden_id;
	}
	public int getDepartamento_id() {
		return departamento_id;
	}
	public void setDepartamento_id(int departamento_id) {
		this.departamento_id = departamento_id;
	}
	public int getCreado_por() {
		return creado_por;
	}
	public void setCreado_por(int creado_por) {
		this.creado_por = creado_por;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlacas() {
		return placas;
	}
	public void setPlacas(String placas) {
		this.placas = placas;
	}
	public String getChofer() {
		return chofer;
	}
	public void setChofer(String chofer) {
		this.chofer = chofer;
	}
	public String getAtencion() {
		return atencion;
	}
	public void setAtencion(String atencion) {
		this.atencion = atencion;
	}
	public String getFlete() {
		return flete;
	}
	public void setFlete(String flete) {
		this.flete = flete;
	}
	public int getPorcentaje_remision() {
		return porcentaje_remision;
	}
	public void setPorcentaje_remision(int porcentaje_remision) {
		this.porcentaje_remision = porcentaje_remision;
	}
	public int getActivo() {
		return activo;
	}
	public void setActivo(int activo) {
		this.activo = activo;
	}
	public List<EquipoEmbarcado> getEquipo_embarcado() {
		return equipo_embarcado;
	}
	public void setEquipo_embarcado(List<EquipoEmbarcado> equipo_embarcado) {
		this.equipo_embarcado = equipo_embarcado;
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
