package com.turbomaquinas.POJO.diagnostico;

import java.sql.Time;
import java.util.Date;

public class EncabezadoDiagnosticoVista {
	private int id;
	private String descripcion;
	private int lugar;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int diagnostico_id;
	private int consecutivo;
	private Date fecha_diags;
	private Time hora_diags;
	private int cant_detalles;
	
	public EncabezadoDiagnosticoVista() {
		super();
	}

	public EncabezadoDiagnosticoVista(int id, String descripcion, int lugar, int activo, int creado_por, Date creado,
			int modificado_por, Date modificado, int diagnostico_id, int consecutivo, Date fecha_diags, Time hora_diags,
			int cant_detalles) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.lugar = lugar;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.diagnostico_id = diagnostico_id;
		this.consecutivo = consecutivo;
		this.fecha_diags = fecha_diags;
		this.hora_diags = hora_diags;
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

	public int getDiagnostico_id() {
		return diagnostico_id;
	}

	public void setDiagnostico_id(int diagnostico_id) {
		this.diagnostico_id = diagnostico_id;
	}

	public int getConsecutivo() {
		return consecutivo;
	}

	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Date getFecha_diags() {
		return fecha_diags;
	}

	public void setFecha_diags(Date fecha_diags) {
		this.fecha_diags = fecha_diags;
	}

	public Time getHora_diags() {
		return hora_diags;
	}

	public void setHora_diags(Time hora_diags) {
		this.hora_diags = hora_diags;
	}

	public int getCant_detalles() {
		return cant_detalles;
	}

	public void setCant_detalles(int cant_detalles) {
		this.cant_detalles = cant_detalles;
	}
}
