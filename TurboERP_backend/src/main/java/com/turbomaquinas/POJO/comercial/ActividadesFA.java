package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class ActividadesFA {
	
	public int id;
	public float importe;
	public int activo;
	public int creado_por;
	public Date creado;
	public int modificado_por;
	public Date modificado;
	public int actividades_autorizadas_id;
	public int facturas_anticipo_id;
	
	public ActividadesFA() {
		super();
	}

	public ActividadesFA(int id, float importe, int activo, int creado_por, Date creado, int modificado_por,
			Date modificado, int actividades_autorizadas_id, int facturas_anticipo_id) {
		this.id = id;
		this.importe = importe;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.actividades_autorizadas_id = actividades_autorizadas_id;
		this.facturas_anticipo_id = facturas_anticipo_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
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

	public int getActividades_autorizadas_id() {
		return actividades_autorizadas_id;
	}

	public void setActividades_autorizadas_id(int actividades_autorizadas_id) {
		this.actividades_autorizadas_id = actividades_autorizadas_id;
	}

	public int getFacturas_anticipo_id() {
		return facturas_anticipo_id;
	}

	public void setFacturas_anticipo_id(int facturas_anticipo_id) {
		this.facturas_anticipo_id = facturas_anticipo_id;
	}

}
