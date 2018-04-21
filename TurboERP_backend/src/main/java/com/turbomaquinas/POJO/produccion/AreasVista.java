package com.turbomaquinas.POJO.produccion;

import java.sql.Time;
import java.util.Date;

public class AreasVista {
	
	private int id;
	private int numero;
	private String subindice;
	private Date fecha_ingreso;
	private Time hora_ingreso;
	private int activo;
	private int ordenes_id;
	private String numero_orden;
	private String Descripcion;
	private String estado;
	
	public AreasVista() {
		super();
	}

	public AreasVista(int id, int numero, String subindice, Date fecha_ingreso, Time hora_ingreso, int activo,
			int ordenes_id, String numero_orden, String descripcion, String estado) {
		super();
		this.id = id;
		this.numero = numero;
		this.subindice = subindice;
		this.fecha_ingreso = fecha_ingreso;
		this.hora_ingreso = hora_ingreso;
		this.activo = activo;
		this.ordenes_id = ordenes_id;
		this.numero_orden = numero_orden;
		Descripcion = descripcion;
		this.estado = estado;
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

	public String getSubindice() {
		return subindice;
	}

	public void setSubindice(String subindice) {
		this.subindice = subindice;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public Time getHora_ingreso() {
		return hora_ingreso;
	}

	public void setHora_ingreso(Time hora_ingreso) {
		this.hora_ingreso = hora_ingreso;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public int getOrdenes_id() {
		return ordenes_id;
	}

	public void setOrdenes_id(int ordenes_id) {
		this.ordenes_id = ordenes_id;
	}

	public String getNumero_orden() {
		return numero_orden;
	}

	public void setNumero_orden(String numero_orden) {
		this.numero_orden = numero_orden;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
