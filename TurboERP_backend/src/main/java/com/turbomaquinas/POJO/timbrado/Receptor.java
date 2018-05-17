package com.turbomaquinas.POJO.timbrado;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Receptor{
	private String rfc;
	private String nombre;
	private String residenciaFiscal;
	private String numeroRegistroIdTributario;
	private String usoCfdi;
	private IdentificadorCliente IdentificadorCliente;
	private DomicilioFiscal DomicilioFiscal;
	
	public Receptor() {
		super();
	}

	public Receptor(String rfc, String nombre, String residenciaFiscal, String numeroRegistroIdTributario,
			String usoCfdi, IdentificadorCliente identificadorCliente,DomicilioFiscal domicilioFiscal) {
		super();
		this.rfc = rfc;
		this.nombre = nombre;
		this.residenciaFiscal = residenciaFiscal;
		this.numeroRegistroIdTributario = numeroRegistroIdTributario;
		this.usoCfdi = usoCfdi;
		IdentificadorCliente = identificadorCliente;
		DomicilioFiscal = domicilioFiscal;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public String getResidenciaFiscal() {
		return residenciaFiscal;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setResidenciaFiscal(String residenciaFiscal) {
		this.residenciaFiscal = residenciaFiscal;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public String getNumeroRegistroIdTributario() {
		return numeroRegistroIdTributario;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setNumeroRegistroIdTributario(String numeroRegistroIdTributario) {
		this.numeroRegistroIdTributario = numeroRegistroIdTributario;
	}

	public String getUsoCfdi() {
		return usoCfdi;
	}

	public void setUsoCfdi(String usoCfdi) {
		this.usoCfdi = usoCfdi;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonProperty("IdentificadorCliente")
	public IdentificadorCliente getIdentificadorCliente() {
		return IdentificadorCliente;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setIdentificadorCliente(IdentificadorCliente identificadorCliente) {
		IdentificadorCliente = identificadorCliente;
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("DomicilioFiscal")
	public DomicilioFiscal getDomicilioFiscal() {
		return DomicilioFiscal;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public void setDomicilioFiscal(DomicilioFiscal domicilioFiscal) {
		DomicilioFiscal = domicilioFiscal;
	}
	
	
}