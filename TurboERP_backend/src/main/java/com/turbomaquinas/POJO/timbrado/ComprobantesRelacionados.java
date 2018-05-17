package com.turbomaquinas.POJO.timbrado;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComprobantesRelacionados{
	private String tipoRelacion;
	private List<String> Comprobantes;
	
	public ComprobantesRelacionados() {
		super();
	}

	public ComprobantesRelacionados(String tipoRelacion, List<String> Comprobantes) {
		super();
		this.tipoRelacion = tipoRelacion;
		this.Comprobantes = Comprobantes;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public String getTipoRelacion() {
		return tipoRelacion;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setTipoRelacion(String tipoRelacion) {
		this.tipoRelacion = tipoRelacion;
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonProperty("Comprobantes")
	public List<String> getComprobantes() {
		return Comprobantes;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setComprobantes(List<String> Comprobantes) {
		this.Comprobantes = Comprobantes;
	}			
	
}