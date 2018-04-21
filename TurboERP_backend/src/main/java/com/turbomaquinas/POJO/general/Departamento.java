package com.turbomaquinas.POJO.general;

import java.util.Date;

public class Departamento {
	private int id;
	private String clave;
	private String descripcion;
	private int activo;
	private int creadoPor;
	private Date creado;
	private int modificadoPor;
	private Date modificado;
	
	public Departamento() {
		super();
	}

	public Departamento(int id, String clave, String descripcion, int activo) {
		super();
		this.id = id;
		this.clave = clave;
		this.descripcion = descripcion;
		this.activo = activo;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public int getCreadoPor() {
		return creadoPor;
	}

	public void setCreadoPor(int creadoPor) {
		this.creadoPor = creadoPor;
	}

	public Date getCreado() {
		return creado;
	}

	public void setCreado(Date creado) {
		this.creado = creado;
	}

	public int getModificadoPor() {
		return modificadoPor;
	}

	public void setModificadoPor(int modificadoPor) {
		this.modificadoPor = modificadoPor;
	}

	public Date getModificado() {
		return modificado;
	}

	public void setModificado(Date modificado) {
		this.modificado = modificado;
	}
	
}
