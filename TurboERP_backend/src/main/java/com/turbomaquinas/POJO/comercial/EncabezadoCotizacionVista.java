package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class EncabezadoCotizacionVista {
	private int id;
	private String descripcion;
	private int lugar;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int cotizaciones_id;
	private int cotizaciones_no;
	private int encabezados_diagnostico_id;
	private int encabezados_precotizaciones_id;
	private int cant_detalles;
	
	public EncabezadoCotizacionVista() {
		super();
	}

	public EncabezadoCotizacionVista(int id, String descripcion, int lugar, int activo, int creado_por, Date creado,
			int modificado_por, Date modificado, int cotizaciones_id, int cotizaciones_no,
			int encabezados_diagnostico_id, int encabezados_precotizaciones_id, int cant_detalles) {
		this.id = id;
		this.descripcion = descripcion;
		this.lugar = lugar;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.cotizaciones_id = cotizaciones_id;
		this.cotizaciones_no = cotizaciones_no;
		this.encabezados_diagnostico_id = encabezados_diagnostico_id;
		this.encabezados_precotizaciones_id = encabezados_precotizaciones_id;
		this.cant_detalles = cant_detalles;
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

	public int getCotizaciones_id() {
		return cotizaciones_id;
	}

	public void setCotizaciones_id(int cotizaciones_id) {
		this.cotizaciones_id = cotizaciones_id;
	}

	public int getCotizaciones_no() {
		return cotizaciones_no;
	}

	public void setCotizaciones_no(int cotizaciones_no) {
		this.cotizaciones_no = cotizaciones_no;
	}

	public int getEncabezados_diagnostico_id() {
		return encabezados_diagnostico_id;
	}

	public void setEncabezados_diagnostico_id(int encabezados_diagnostico_id) {
		this.encabezados_diagnostico_id = encabezados_diagnostico_id;
	}

	public int getEncabezados_precotizaciones_id() {
		return encabezados_precotizaciones_id;
	}

	public void setEncabezados_precotizaciones_id(int encabezados_precotizaciones_id) {
		this.encabezados_precotizaciones_id = encabezados_precotizaciones_id;
	}

	public int getCant_detalles() {
		return cant_detalles;
	}

	public void setCant_detalles(int cant_detalles) {
		this.cant_detalles = cant_detalles;
	}

}
