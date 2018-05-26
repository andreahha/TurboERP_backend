package com.turbomaquinas.POJO.diagnostico;

public class EquipoEmbarcado {
	
	private int equipo_id;
	private String comentarios;
	private String status_reparacion;
	
	public int getEquipo_id() {
		return equipo_id;
	}
	public void setEquipo_id(int equipo_id) {
		this.equipo_id = equipo_id;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public String getStatus_reparacion() {
		return status_reparacion;
	}
	public void setStatus_reparacion(String status_reparacion) {
		this.status_reparacion = status_reparacion;
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
