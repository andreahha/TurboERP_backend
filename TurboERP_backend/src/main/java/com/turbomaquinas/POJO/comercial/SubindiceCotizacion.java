package com.turbomaquinas.POJO.comercial;

import java.math.BigDecimal;
import java.util.Date;

public class SubindiceCotizacion {
	private int id;
	private String descripcion;
	private BigDecimal importe;
	private String tipo_actividad;
	private int lugar;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int detalle_cotizaciones_id;

	public SubindiceCotizacion() {
		super();
	}

	public SubindiceCotizacion(int id, String descripcion, BigDecimal importe, String tipo_actividad, int lugar, int activo,
			int creado_por, Date creado, int modificado_por, Date modificado, int detalle_cotizaciones_id) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.importe = importe;
		this.tipo_actividad = tipo_actividad;
		this.lugar = lugar;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.detalle_cotizaciones_id = detalle_cotizaciones_id;
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

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
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

	public int getDetalle_cotizaciones_id() {
		return detalle_cotizaciones_id;
	}

	public void setDetalle_cotizaciones_id(int detalle_cotizaciones_id) {
		this.detalle_cotizaciones_id = detalle_cotizaciones_id;
	}
}
