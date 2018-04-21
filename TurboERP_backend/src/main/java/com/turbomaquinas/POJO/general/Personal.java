package com.turbomaquinas.POJO.general;

import java.util.Date;

public class Personal {

	private int id;
	private int numero;
	private String nombre;
	private String paterno;
	private String materno;
	private String keycloak_id;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int departamentos_id;
	private String iniciales;
	private String tipo;
	
	public Personal() {
		super();
	}

	public Personal(int id, int numero, String nombre, String paterno, String materno, String keycloak_id, int activo,
			int creado_por, Date creado, int modificado_por, Date modificado, int departamentos_id, String iniciales,
			String tipo) {
		this.id = id;
		this.numero = numero;
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.keycloak_id = keycloak_id;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.departamentos_id = departamentos_id;
		this.iniciales = iniciales;
		this.tipo = tipo;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getKeycloak_id() {
		return keycloak_id;
	}

	public void setKeycloak_id(String keycloak_id) {
		this.keycloak_id = keycloak_id;
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

	public int getDepartamentos_id() {
		return departamentos_id;
	}

	public void setDepartamentos_id(int departamentos_id) {
		this.departamentos_id = departamentos_id;
	}

	public String getIniciales() {
		return iniciales;
	}

	public void setIniciales(String iniciales) {
		this.iniciales = iniciales;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
