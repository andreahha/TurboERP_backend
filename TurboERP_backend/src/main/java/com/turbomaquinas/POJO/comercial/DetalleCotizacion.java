package com.turbomaquinas.POJO.comercial;

import java.math.BigDecimal;
import java.util.Date;

public class DetalleCotizacion {
	
	private int id;
	private String descripcion;
	private String tipo_actividad;
	private int lugar;
	private int suministro;
	private int planta;
	private String clase_actividad;
	private BigDecimal importe;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int encabezados_cotizaciones_id;
	private int detalle_diagnostico_id;
	
	public DetalleCotizacion() {
		super();
	}

	public DetalleCotizacion(int id, String descripcion, String tipo_actividad, int lugar, int suministro, int planta,
			String clase_actividad, BigDecimal importe, int activo, int creado_por, Date creado, int modificado_por,
			Date modificado, int encabezados_cotizaciones_id) {
		this.id = id;
		this.descripcion = descripcion;
		this.tipo_actividad = tipo_actividad;
		this.lugar = lugar;
		this.suministro = suministro;
		this.planta = planta;
		this.clase_actividad = clase_actividad;
		this.importe = importe;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.encabezados_cotizaciones_id = encabezados_cotizaciones_id;
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

	public int getSuministro() {
		return suministro;
	}

	public void setSuministro(int suministro) {
		this.suministro = suministro;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public String getClase_actividad() {
		return clase_actividad;
	}

	public void setClase_actividad(String clase_actividad) {
		this.clase_actividad = clase_actividad;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
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

	public int getEncabezados_cotizaciones_id() {
		return encabezados_cotizaciones_id;
	}

	public void setEncabezados_cotizaciones_id(int encabezados_cotizaciones_id) {
		this.encabezados_cotizaciones_id = encabezados_cotizaciones_id;
	}

	public int getDetalle_diagnostico_id() {
		return detalle_diagnostico_id;
	}

	public void setDetalle_diagnostico_id(int detalle_diagnostico_id) {
		this.detalle_diagnostico_id = detalle_diagnostico_id;
	}
	
}
