package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class Giro {

	private int id;
	private int numero;
	private String descripcion;
	private int extranjero;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	
	public Giro() {
		super();
	}

	public Giro(int id, int numero, String descripcion, int extranjero, int activo, int creado_por, Date creado,
			int modificado_por, Date modificado) {
		super();
		this.id = id;
		this.numero = numero;
		this.descripcion = descripcion;
		this.extranjero = extranjero;
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getExtranjero() {
		return extranjero;
	}

	public void setExtranjero(int extranjero) {
		this.extranjero = extranjero;
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
	
}
