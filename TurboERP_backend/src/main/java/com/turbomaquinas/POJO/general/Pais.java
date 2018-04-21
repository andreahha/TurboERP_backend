package com.turbomaquinas.POJO.general;

import java.util.Date;

public class Pais {
	
	private int id;
	private String clave;
	private String descripcion;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	
	public Pais() {
		super();
	}

	public Pais(int id, String clave, String descripcion, int activo, int creado_por, Date creado, int modificado_por,
			Date modificado) {
		super();
		this.id = id;
		this.clave = clave;
		this.descripcion = descripcion;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
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

	public int getCreado_por() {
		return creado_por;
	}

	public void setCreado_por(int creado_por) {
		this.creado_por = creado_por;
	}

	public Date getCreado() {
		return creado;
	}

	public void setCreado(Date creado) {
		this.creado = creado;
	}

	public int getModificado_por() {
		return modificado_por;
	}

	public void setModificado_por(int modificado_por) {
		this.modificado_por = modificado_por;
	}

	public Date getModificado() {
		return modificado;
	}

	public void setModificado(Date modificado) {
		this.modificado = modificado;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", clave=" + clave + ", descripcion=" + descripcion + ", activo=" + activo
				+ ", creado_por=" + creado_por + ", creado=" + creado + ", modificado_por=" + modificado_por
				+ ", modificado=" + modificado + "]";
	}
	
}
