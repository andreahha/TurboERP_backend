package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class SubindicePrecotizacionVista {
	private int id;
	private String descripcion;
	private String tipo_actividad;
	private int lugar;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int detalle_precotizaciones_id;
	private String descripcion_detalle;
	private int detalle_lugar;
	private int encabezados_precotizaciones_id;
	private String descripcion_encabezado;
	private int lugar_encabezado;
	private int precotizaciones_id;
	private int numero_precotizacion;
	
	public SubindicePrecotizacionVista() {
		super();
	}

	public SubindicePrecotizacionVista(int id, String descripcion, String tipo_actividad, int lugar, int activo,
			int creado_por, Date creado, int modificado_por, Date modificado, int detalle_precotizaciones_id,
			String descripcion_detalle, int detalle_lugar, int encabezados_precotizaciones_id,
			String descripcion_encabezado, int lugar_encabezado, int precotizaciones_id, int numero_precotizacion) {
		this.id = id;
		this.descripcion = descripcion;
		this.tipo_actividad = tipo_actividad;
		this.lugar = lugar;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.detalle_precotizaciones_id = detalle_precotizaciones_id;
		this.descripcion_detalle = descripcion_detalle;
		this.detalle_lugar = detalle_lugar;
		this.encabezados_precotizaciones_id = encabezados_precotizaciones_id;
		this.descripcion_encabezado = descripcion_encabezado;
		this.lugar_encabezado = lugar_encabezado;
		this.precotizaciones_id = precotizaciones_id;
		this.numero_precotizacion = numero_precotizacion;
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

	public String getTipo_actividad() {
		return tipo_actividad;
	}

	public void setTipo_actividad(String tipo_actividad) {
		this.tipo_actividad = tipo_actividad;
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

	public int getDetalle_precotizaciones_id() {
		return detalle_precotizaciones_id;
	}

	public void setDetalle_precotizaciones_id(int detalle_precotizaciones_id) {
		this.detalle_precotizaciones_id = detalle_precotizaciones_id;
	}

	public String getDescripcion_detalle() {
		return descripcion_detalle;
	}

	public void setDescripcion_detalle(String descripcion_detalle) {
		this.descripcion_detalle = descripcion_detalle;
	}

	public int getDetalle_lugar() {
		return detalle_lugar;
	}

	public void setDetalle_lugar(int detalle_lugar) {
		this.detalle_lugar = detalle_lugar;
	}

	public int getEncabezados_precotizaciones_id() {
		return encabezados_precotizaciones_id;
	}

	public void setEncabezados_precotizaciones_id(int encabezados_precotizaciones_id) {
		this.encabezados_precotizaciones_id = encabezados_precotizaciones_id;
	}

	public String getDescripcion_encabezado() {
		return descripcion_encabezado;
	}

	public void setDescripcion_encabezado(String descripcion_encabezado) {
		this.descripcion_encabezado = descripcion_encabezado;
	}

	public int getLugar_encabezado() {
		return lugar_encabezado;
	}

	public void setLugar_encabezado(int lugar_encabezado) {
		this.lugar_encabezado = lugar_encabezado;
	}

	public int getPrecotizaciones_id() {
		return precotizaciones_id;
	}

	public void setPrecotizaciones_id(int precotizaciones_id) {
		this.precotizaciones_id = precotizaciones_id;
	}

	public int getNumero_precotizacion() {
		return numero_precotizacion;
	}

	public void setNumero_precotizacion(int numero_precotizacion) {
		this.numero_precotizacion = numero_precotizacion;
	}
	
}
