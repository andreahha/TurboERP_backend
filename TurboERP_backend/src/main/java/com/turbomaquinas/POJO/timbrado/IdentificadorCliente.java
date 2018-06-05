package com.turbomaquinas.POJO.timbrado;

public class IdentificadorCliente{
	private String nombreCampo;
	private String valorCampo;
	
	public IdentificadorCliente() {
		super();
	}

	public IdentificadorCliente(String nombreCampo, String valorCampo) {
		super();
		this.nombreCampo = nombreCampo;
		this.valorCampo = valorCampo;
	}

	public String getNombreCampo() {
		return nombreCampo;
	}

	public void setNombreCampo(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}

	public String getValorCampo() {
		return valorCampo;
	}

	public void setValorCampo(String valorCampo) {
		this.valorCampo = valorCampo;
	}		
	
}