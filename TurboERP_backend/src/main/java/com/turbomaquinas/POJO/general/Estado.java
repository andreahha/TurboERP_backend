package com.turbomaquinas.POJO.general;

import java.util.Date;

public class Estado {
	
	private int id;
	private String nombre;
	private String clave;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	
	public Estado() {
		super();
	}

	public Estado(int id, String nombre, String clave, int activo, int creadoPor, Date creado, int modificadoPor,
			Date modificado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.clave = clave;
		this.activo = activo;
		this.creado_por = creadoPor;
		this.creado = creado;
		this.modificado_por = modificadoPor;
		this.modificado = modificado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public int getCreadoPor() {
		return creado_por;
	}

	public void setCreadoPor(int creadoPor) {
		this.creado_por = creadoPor;
	}

	public Date getCreado() {
		return creado;
	}

	public void setCreado(Date creado) {
		this.creado = creado;
	}

	public int getModificadoPor() {
		return modificado_por;
	}

	public void setModificadoPor(int modificadoPor) {
		this.modificado_por = modificadoPor;
	}

	public Date getModificado() {
		return modificado;
	}

	public void setModificado(Date modificado) {
		this.modificado = modificado;
	}

}
