package com.turbomaquinas.POJO.general;

public class ClienteFacturar {
	
	private int id;
	private int numgiro;
	private int numcliente;
	private String nombreCliente;
	
	public ClienteFacturar() {
		super();
	}
	
	public ClienteFacturar(int id, int numgiro, int numcliente, String nombreCliente) {
		super();
		this.id = id;
		this.numgiro = numgiro;
		this.numcliente = numcliente;
		this.nombreCliente = nombreCliente;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumgiro() {
		return numgiro;
	}
	public void setNumgiro(int numgiro) {
		this.numgiro = numgiro;
	}
	public int getNumcliente() {
		return numcliente;
	}
	public void setNumcliente(int numcliente) {
		this.numcliente = numcliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
}
