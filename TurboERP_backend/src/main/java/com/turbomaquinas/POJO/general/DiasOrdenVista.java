package com.turbomaquinas.POJO.general;

import java.util.Date;

public class DiasOrdenVista {
	private int id;
	private int dias;
	private Date fecha_registro;
	private String tipo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int ordenes_id;
	private String numero_orden;
	private String descripcion;
	private int areas_id;
	private int numero_area;
	
	public DiasOrdenVista() {
		super();
	}

	public DiasOrdenVista(int id, int dias, Date fecha_registro, String tipo, int creado_por, Date creado,
			int modificado_por, Date modificado, int ordenes_id, String numero_orden, String descripcion, int areas_id,
			int numero_area) {
		this.id = id;
		this.dias = dias;
		this.fecha_registro = fecha_registro;
		this.tipo = tipo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.ordenes_id = ordenes_id;
		this.numero_orden = numero_orden;
		this.descripcion = descripcion;
		this.areas_id = areas_id;
		this.numero_area = numero_area;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getAreas_id() {
		return areas_id;
	}

	public void setAreas_id(int areas_id) {
		this.areas_id = areas_id;
	}

	public int getNumero_area() {
		return numero_area;
	}

	public void setNumero_area(int numero_area) {
		this.numero_area = numero_area;
	}

}
