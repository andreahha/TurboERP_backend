package com.turbomaquinas.POJO.general;

public class CiudadVista {
	
	private int id;
	private String clave;
	private String nombre;
	private int activo;
	private String estado;

	public CiudadVista() {
		super();
	}

	public CiudadVista(int id, String clave, String nombre, int activo, String estado) {
		this.id = id;
		this.clave = clave;
		this.nombre = nombre;
		this.activo = activo;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
