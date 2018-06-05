package com.turbomaquinas.POJO.timbrado;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EnviarCFDI{
	private List<String> Correos;
	private String mensajeCorreo;
	
	public EnviarCFDI() {
		super();
	}

	public EnviarCFDI(List<String> correos, String mensajeCorreo) {
		super();
		Correos = correos;
		this.mensajeCorreo = mensajeCorreo;
	}

	@JsonProperty("Correos")
	public List<String> getCorreos() {
		return Correos;
	}

	public void setCorreos(List<String> correos) {
		Correos = correos;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public String getMensajeCorreo() {
		return mensajeCorreo;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setMensajeCorreo(String mensajeCorreo) {
		this.mensajeCorreo = mensajeCorreo;
	}
	
}