package com.turbomaquinas.POJO.produccion;

import java.sql.Time;
import java.util.Date;

public class Area {
	private int id;
	private int numero;
	private String subindice;
	private Date fecha_ingreso;
	private Time hora_ingreso;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int ordenes_id;
	
	public Area() {
		super();
	}

	public Area(int id, int numero, String subindice, Date fecha_ingreso, Time hora_ingreso, int activo, int creado_por,
			Date creado, int modificado_por, Date modificado, int ordenes_id) {
		super();
		this.id = id;
		this.numero = numero;
		this.subindice = subindice;
		this.fecha_ingreso = fecha_ingreso;
		this.hora_ingreso = hora_ingreso;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.ordenes_id = ordenes_id;
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
}
