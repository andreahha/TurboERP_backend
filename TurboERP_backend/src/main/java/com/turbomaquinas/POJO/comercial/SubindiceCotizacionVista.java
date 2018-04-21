package com.turbomaquinas.POJO.comercial;

import java.math.BigDecimal;
import java.util.Date;

public class SubindiceCotizacionVista {
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
	private String detalle_descripcion;
	private String detalle_tipo_actividad;
	private int detalle_lugar;
	private int encabezados_cotizaciones_id;
	private String descripcion_encabezado;
	private int lugar_encabezado;
	private int cotizaciones_id;
	private int numero_cotizacion;
	
	public SubindiceCotizacionVista() {
		super();
	}

	public SubindiceCotizacionVista(int id, String descripcion, BigDecimal importe, String tipo_actividad, int lugar,
			int activo, int creado_por, Date creado, int modificado_por, Date modificado, int detalle_cotizaciones_id,
			String detalle_descripcion, String detalle_tipo_actividad, int detalle_lugar,
			int encabezados_cotizaciones_id, String descripcion_encabezado, int lugar_encabezado, int cotizaciones_id,
			int numero_cotizacion) {
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
		this.detalle_descripcion = detalle_descripcion;
		this.detalle_tipo_actividad = detalle_tipo_actividad;
		this.detalle_lugar = detalle_lugar;
		this.encabezados_cotizaciones_id = encabezados_cotizaciones_id;
		this.descripcion_encabezado = descripcion_encabezado;
		this.lugar_encabezado = lugar_encabezado;
		this.cotizaciones_id = cotizaciones_id;
		this.numero_cotizacion = numero_cotizacion;
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

	public String getDetalle_descripcion() {
		return detalle_descripcion;
	}

	public void setDetalle_descripcion(String detalle_descripcion) {
		this.detalle_descripcion = detalle_descripcion;
	}

	public String getDetalle_tipo_actividad() {
		return detalle_tipo_actividad;
	}

	public void setDetalle_tipo_actividad(String detalle_tipo_actividad) {
		this.detalle_tipo_actividad = detalle_tipo_actividad;
	}

	public int getDetalle_lugar() {
		return detalle_lugar;
	}

	public void setDetalle_lugar(int detalle_lugar) {
		this.detalle_lugar = detalle_lugar;
	}

	public int getEncabezados_cotizaciones_id() {
		return encabezados_cotizaciones_id;
	}

	public void setEncabezados_cotizaciones_id(int encabezados_cotizaciones_id) {
		this.encabezados_cotizaciones_id = encabezados_cotizaciones_id;
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

	public int getCotizaciones_id() {
		return cotizaciones_id;
	}

	public void setCotizaciones_id(int cotizaciones_id) {
		this.cotizaciones_id = cotizaciones_id;
	}

	public int getNumero_cotizacion() {
		return numero_cotizacion;
	}

	public void setNumero_cotizacion(int numero_cotizacion) {
		this.numero_cotizacion = numero_cotizacion;
	}
}
