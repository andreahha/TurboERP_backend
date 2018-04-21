package com.turbomaquinas.POJO.diagnostico;

import java.sql.Time;
import java.util.Date;

public class Diagnostico {
	
	private int id;
	private int consecutivo;
	private Date fecha_diags;
	private Time hora_diags;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int areas_id;
	private int ordenes_id;
	private int personal_id;
	
	public Diagnostico() {
		super();
	}

	public Diagnostico(int id, int consecutivo, Date fecha_diags, Time hora_diags, int activo, int creado_por,
			Date creado, int modificado_por, Date modificado, int areas_id, int ordenes_id, int personal_id) {
		this.id = id;
		this.consecutivo = consecutivo;
		this.fecha_diags = fecha_diags;
		this.hora_diags = hora_diags;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.areas_id = areas_id;
		this.ordenes_id = ordenes_id;
		this.personal_id = personal_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAreas_id() {
		return areas_id;
	}

	public void setAreas_id(int areas_id) {
		this.areas_id = areas_id;
	}

	public int getOrdenes_id() {
		return ordenes_id;
	}

	public void setOrdenes_id(int ordenes_id) {
		this.ordenes_id = ordenes_id;
	}

	public int getPersonal_id() {
		return personal_id;
	}

	public void setPersonal_id(int personal_id) {
		this.personal_id = personal_id;
	}
	
}
