package com.turbomaquinas.POJO.general;

import java.util.Date;

public class OrdenesRequisiciones {

	private int id;
	private String numero_orden;
	private Date fecha_autorizacion;
	private Date fecha_compromiso;

	public OrdenesRequisiciones() {
		super();
	}

	public OrdenesRequisiciones(int id, String numero_orden, Date fecha_autorizacion, Date fecha_compromiso) {
		super();
		this.id = id;
		this.numero_orden = numero_orden;
		this.fecha_autorizacion = fecha_autorizacion;
		this.fecha_compromiso = fecha_compromiso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero_orden() {
		return numero_orden;
	}

	public void setNumero_orden(String numero_orden) {
		this.numero_orden = numero_orden;
	}

	public Date getFecha_autorizacion() {
		return fecha_autorizacion;
	}

	public void setFecha_autorizacion(Date fecha_autorizacion) {
		this.fecha_autorizacion = fecha_autorizacion;
	}

	public Date getFecha_compromiso() {
		return fecha_compromiso;
	}

	public void setFecha_compromiso(Date fecha_compromiso) {
		this.fecha_compromiso = fecha_compromiso;
	}

}
