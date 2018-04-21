package com.turbomaquinas.POJO.diagnostico;

import java.util.Date;

public class SubindiceDiagnosticoVista {
	private int id;
	private String descripcion;
	private int lugar;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int detalle_diagnostico_id;
	private String detalle_diagnostico;
	private String tipo_actividad;
	private int detalle_lugar;
	private int encabezados_diagnostico_id;
	private String descripcion_encabezado;
	private int lugar_encabezado;
	private int diagnostico_id;
	private int consecutivo_diagnostico;
	
	public SubindiceDiagnosticoVista() {
		super();
	}

	public SubindiceDiagnosticoVista(int id, String descripcion, int lugar, int activo, int creado_por, Date creado,
			int modificado_por, Date modificado, int detalle_diagnostico_id, String detalle_diagnostico,
			String tipo_actividad, int detalle_lugar, int encabezados_diagnostico_id, String descripcion_encabezado,
			int lugar_encabezado, int diagnostico_id, int consecutivo_diagnostico) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.lugar = lugar;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.detalle_diagnostico_id = detalle_diagnostico_id;
		this.detalle_diagnostico = detalle_diagnostico;
		this.tipo_actividad = tipo_actividad;
		this.detalle_lugar = detalle_lugar;
		this.encabezados_diagnostico_id = encabezados_diagnostico_id;
		this.descripcion_encabezado = descripcion_encabezado;
		this.lugar_encabezado = lugar_encabezado;
		this.diagnostico_id = diagnostico_id;
		this.consecutivo_diagnostico = consecutivo_diagnostico;
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

	public int getDetalle_diagnostico_id() {
		return detalle_diagnostico_id;
	}

	public void setDetalle_diagnostico_id(int detalle_diagnostico_id) {
		this.detalle_diagnostico_id = detalle_diagnostico_id;
	}

	public String getDetalle_diagnostico() {
		return detalle_diagnostico;
	}

	public void setDetalle_diagnostico(String detalle_diagnostico) {
		this.detalle_diagnostico = detalle_diagnostico;
	}

	public String getTipo_actividad() {
		return tipo_actividad;
	}

	public void setTipo_actividad(String tipo_actividad) {
		this.tipo_actividad = tipo_actividad;
	}

	public int getDetalle_lugar() {
		return detalle_lugar;
	}

	public void setDetalle_lugar(int detalle_lugar) {
		this.detalle_lugar = detalle_lugar;
	}

	public int getEncabezados_diagnostico_id() {
		return encabezados_diagnostico_id;
	}

	public void setEncabezados_diagnostico_id(int encabezados_diagnostico_id) {
		this.encabezados_diagnostico_id = encabezados_diagnostico_id;
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

	public int getDiagnostico_id() {
		return diagnostico_id;
	}

	public void setDiagnostico_id(int diagnostico_id) {
		this.diagnostico_id = diagnostico_id;
	}

	public int getConsecutivo_diagnostico() {
		return consecutivo_diagnostico;
	}

	public void setConsecutivo_diagnostico(int consecutivo_diagnostico) {
		this.consecutivo_diagnostico = consecutivo_diagnostico;
	}
}
