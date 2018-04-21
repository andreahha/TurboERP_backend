package com.turbomaquinas.POJO.general;

import java.util.Date;

public class Ctasban {
	
	private int id;
	private String numero;
	private int dolares;
	private String descripcion;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int catalogo_cuentas_id;
	private int bancos_id;
	
	public Ctasban() {
		super();
	}

	public Ctasban(int id, String numero, int dolares, String descripcion, int activo, int creado_por, Date creado,
			int modificado_por, Date modificado, int catalogo_cuentas_id, int bancos_id) {
		this.id = id;
		this.numero = numero;
		this.dolares = dolares;
		this.descripcion = descripcion;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.catalogo_cuentas_id = catalogo_cuentas_id;
		this.bancos_id = bancos_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getDolares() {
		return dolares;
	}

	public void setDolares(int dolares) {
		this.dolares = dolares;
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

	public int getCatalogo_cuentas_id() {
		return catalogo_cuentas_id;
	}

	public void setCatalogo_cuentas_id(int catalogo_cuentas_id) {
		this.catalogo_cuentas_id = catalogo_cuentas_id;
	}

	public int getBancos_id() {
		return bancos_id;
	}

	public void setBancos_id(int bancos_id) {
		this.bancos_id = bancos_id;
	}
	
}
