package com.turbomaquinas.POJO.timbrado;

import com.fasterxml.jackson.annotation.JsonInclude;

public class DatosDePago{
	private String metodoDePago;
	private String formaDePago;
	private String referenciaBancaria;
	
	public DatosDePago() {
		super();
	}

	public DatosDePago(String metodoDePago, String formaDePago, String referenciaBancaria) {
		super();
		this.metodoDePago = metodoDePago;
		this.formaDePago = formaDePago;
		this.referenciaBancaria = referenciaBancaria;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public String getMetodoDePago() {
		return metodoDePago;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setMetodoDePago(String metodoDePago) {
		this.metodoDePago = metodoDePago;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public String getFormaDePago() {
		return formaDePago;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public String getReferenciaBancaria() {
		return referenciaBancaria;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setReferenciaBancaria(String referenciaBancaria) {
		this.referenciaBancaria = referenciaBancaria;
	}		
}



