package com.turbomaquinas.POJO.diagnostico;

import java.util.Date;

public class DetalleRemisionEmbarqueVista {
	
	private int id;
	private String comentarios;
	private String status_reparacion;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int remisiones_embarque_id;
	private int equipo_recibido_id;
	private String descripcion_equipo;
	private String descripcion_empaque;
	private float peso;
	private Date fecha_ingreso;
	
	public DetalleRemisionEmbarqueVista() {
		super();
	}

	public DetalleRemisionEmbarqueVista(int id, String comentarios, String status_reparacion, int activo,
			int creado_por, Date creado, int modificado_por, Date modificado, int remisiones_embarque_id,
			int equipo_recibido_id, String descripcion_equipo, String descripcion_empaque, float peso,
			Date fecha_ingreso) {
		super();
		this.id = id;
		this.comentarios = comentarios;
		this.status_reparacion = status_reparacion;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.remisiones_embarque_id = remisiones_embarque_id;
		this.equipo_recibido_id = equipo_recibido_id;
		this.descripcion_equipo = descripcion_equipo;
		this.descripcion_empaque = descripcion_empaque;
		this.peso = peso;
		this.fecha_ingreso = fecha_ingreso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getStatus_reparacion() {
		return status_reparacion;
	}

	public void setStatus_reparacion(String status_reparacion) {
		this.status_reparacion = status_reparacion;
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

	public int getRemisiones_embarque_id() {
		return remisiones_embarque_id;
	}

	public void setRemisiones_embarque_id(int remisiones_embarque_id) {
		this.remisiones_embarque_id = remisiones_embarque_id;
	}

	public int getEquipo_recibido_id() {
		return equipo_recibido_id;
	}

	public void setEquipo_recibido_id(int equipo_recibido_id) {
		this.equipo_recibido_id = equipo_recibido_id;
	}

	public String getDescripcion_equipo() {
		return descripcion_equipo;
	}

	public void setDescripcion_equipo(String descripcion_equipo) {
		this.descripcion_equipo = descripcion_equipo;
	}

	public String getDescripcion_empaque() {
		return descripcion_empaque;
	}

	public void setDescripcion_empaque(String descripcion_empaque) {
		this.descripcion_empaque = descripcion_empaque;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}
	
	

}
