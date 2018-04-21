package com.turbomaquinas.POJO.general;

import java.util.Date;

public class CronologiaOT {
	private int ordenes_id;
	private Date fecha;
	private String tipo;
	private int id;
	private String creado;
	private String creado_por;
	
	
	public CronologiaOT() {
		super();
	}

	public CronologiaOT(int ordenes_id, Date fecha, String tipo, int id) {
		super();
		this.ordenes_id = ordenes_id;
		this.fecha = fecha;
		this.tipo = tipo;
		this.id = id;
	}

	public int getOrdenes_id() {
		return ordenes_id;
	}

	public void setOrdenes_id(int ordenes_id) {
		this.ordenes_id = ordenes_id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreado() {
		return creado;
	}

	public void setCreado(String creado) {
		this.creado = creado;
	}

	public String getCreado_por() {
		return creado_por;
	}

	public void setCreado_por(String creado_por) {
		this.creado_por = creado_por;
	}
	
}
