package com.turbomaquinas.POJO.general;

import java.util.Date;

public class EncabezadoActividadAutorizada {
	private int id;
	private String descripcion;
	private int lugar;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int ordenes_id;
	private int encabezados_diagnostico_id;
	
	public EncabezadoActividadAutorizada() {
		super();
	}

	public EncabezadoActividadAutorizada(int id, String descripcion, int lugar, int activo, int creado_por, Date creado,
			int modificado_por, Date modificado, int ordenes_id, int encabezados_diagnostico_id) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.lugar = lugar;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.ordenes_id = ordenes_id;
		this.encabezados_diagnostico_id=encabezados_diagnostico_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getLugar() {
		return lugar;
	}

	public void setLugar(int lugar) {
		this.lugar = lugar;
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
	
	public int getEncabezados_diagnostico_id() {
		return encabezados_diagnostico_id;
	}

	public void setEncabezados_diagnostico_id(int encabezados_diagnostico_id) {
		this.encabezados_diagnostico_id = encabezados_diagnostico_id;
	}
	@Override
	public String toString() {
		return "EncabezadoActividadAutorizada [id=" + id + ", descripcion=" + descripcion + ", lugar=" + lugar
				+ ", activo=" + activo + ", creado_por=" + creado_por + ", creado=" + creado + ", modificado_por="
				+ modificado_por + ", modificado=" + modificado + ", ordenes_id=" + ordenes_id + "]";
	}
}
