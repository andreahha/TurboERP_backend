package com.turbomaquinas.POJO.timbrado;

import com.fasterxml.jackson.annotation.JsonInclude;

public class DomicilioFiscal{
	private String calle;
	private String noExterior;
	private String noInterior;
	private String colonia;
	private String localidad;
	private String municipio;
	private String estado;
	private String pais;
	private String cp;
	
	public DomicilioFiscal() {
		super();
	}

	public DomicilioFiscal(String calle, String noExterior, String noInterior, String colonia, String localidad,
			String municipio, String estado, String pais, String cp) {
		super();
		this.calle = calle;
		this.noExterior = noExterior;
		this.noInterior = noInterior;
		this.colonia = colonia;
		this.localidad = localidad;
		this.municipio = municipio;
		this.estado = estado;
		this.pais = pais;
		this.cp = cp;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNoExterior() {
		return noExterior;
	}

	public void setNoExterior(String noExterior) {
		this.noExterior = noExterior;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public String getNoInterior() {
		return noInterior;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setNoInterior(String noInterior) {
		this.noInterior = noInterior;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public String getColonia() {
		return colonia;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public String getLocalidad() {
		return localidad;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public String getMunicipio() {
		return municipio;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public String getCp() {
		return cp;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setCp(String cp) {
		this.cp = cp;
	}	
}
