package com.turbomaquinas.POJO.general;

import java.util.Date;


public class Ciudad {
	
	private int id;
	private String clave;
	private String nombre;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int estados_id;
	
	public Ciudad() {
		super();
	}

	public Ciudad(int id, String clave, String nombre, int activo, int creado_por, Date creado, int modificado_por,
			Date modificado, int estados_id) {
		this.id = id;
		this.clave = clave;
		this.nombre = nombre;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.estados_id = estados_id;
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

	public int getEstados_id() {
		return estados_id;
	}

	public void setEstados_id(int estados_id) {
		this.estados_id = estados_id;
	}

	
}
