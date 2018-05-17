package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class CatalogoCuentas {
	
	public int id;
    public String cuenta;
	public String nombre_cuenta;
	public String id_sat;
	public int activo;
	public int creado_por;
	public Date creado;
	public int modificado_por;
	public Date modificado;
	
	
	public CatalogoCuentas() {
			super();
	}


	public CatalogoCuentas(int id, String cuenta, String nombre_cuenta, String id_sat, int activo, int creado_por,
			Date creado, int modificado_por, Date modificado) {
		super();
		this.id = id;
		this.cuenta = cuenta;
		this.nombre_cuenta = nombre_cuenta;
		this.id_sat = id_sat;
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


	public String getCuenta() {
		return cuenta;
	}


	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}


	public String getNombre_cuenta() {
		return nombre_cuenta;
	}


	public void setNombre_cuenta(String nombre_cuenta) {
		this.nombre_cuenta = nombre_cuenta;
	}


	public String getId_sat() {
		return id_sat;
	}


	public void setId_sat(String id_sat) {
		this.id_sat = id_sat;
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
