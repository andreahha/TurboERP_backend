package com.turbomaquinas.POJO.timbrado;

public class Personalizados{
	private String nombreCampo;
	private String valor;
	
	public Personalizados() {
		super();
	}

	public Personalizados(String nombreCampo, String valor) {
		super();
		this.nombreCampo = nombreCampo;
		this.valor = valor;
	}

	public String getNombreCampo() {
		return nombreCampo;
	}

	public void setNombreCampo(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}