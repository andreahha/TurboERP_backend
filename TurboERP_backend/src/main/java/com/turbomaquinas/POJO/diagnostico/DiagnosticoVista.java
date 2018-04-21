package com.turbomaquinas.POJO.diagnostico;

import java.sql.Time;
import java.util.Date;

public class DiagnosticoVista {
	
	private int id;
	private int consecutivo;
	private Date fecha_diags;
	private Time hora_diags;
	private int activo;
	private int areas_id;
	private int numarea;
	private String subindice_area;
	private int ordenes_id;
	private int numorden;
	private int anioorden;
	private String numero_orden;
	private int personal_id;
	private String personal;

	public DiagnosticoVista() {
		super();
	}

	public DiagnosticoVista(int id, int consecutivo, Date fecha_diags, Time hora_diags, int activo, int areas_id,
			int numarea, int ordenes_id, int numorden, int anioorden, String numero_orden, int personal_id,
			String personal) {
		this.id = id;
		this.consecutivo = consecutivo;
		this.fecha_diags = fecha_diags;
		this.hora_diags = hora_diags;
		this.activo = activo;
		this.areas_id = areas_id;
		this.numarea = numarea;
		this.ordenes_id = ordenes_id;
		this.numorden = numorden;
		this.anioorden = anioorden;
		this.numero_orden = numero_orden;
		this.personal_id = personal_id;
		this.personal = personal;
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

	public int getAreas_id() {
		return areas_id;
	}

	public void setAreas_id(int areas_id) {
		this.areas_id = areas_id;
	}

	public int getNumarea() {
		return numarea;
	}

	public void setNumarea(int numarea) {
		this.numarea = numarea;
	}

	
	public String getSubindice_area() {
		return subindice_area;
	}

	public void setSubindice_area(String subindice_area) {
		this.subindice_area = subindice_area;
	}

	public int getOrdenes_id() {
		return ordenes_id;
	}

	public void setOrdenes_id(int ordenes_id) {
		this.ordenes_id = ordenes_id;
	}

	public int getNumorden() {
		return numorden;
	}

	public void setNumorden(int numorden) {
		this.numorden = numorden;
	}

	public int getAnioorden() {
		return anioorden;
	}

	public void setAnioorden(int anioorden) {
		this.anioorden = anioorden;
	}

	public String getNumero_orden() {
		return numero_orden;
	}

	public void setNumero_orden(String numero_orden) {
		this.numero_orden = numero_orden;
	}

	public int getPersonal_id() {
		return personal_id;
	}

	public void setPersonal_id(int personal_id) {
		this.personal_id = personal_id;
	}

	public String getPersonal() {
		return personal;
	}

	public void setPersonal(String personal) {
		this.personal = personal;
	}
		
}
