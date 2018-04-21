package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class FechasEstimadasFacturacion {
	
	private int id;
	private Date fecha_estimada;
	private String comentario;
	private int indefinida;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int ordenes_id;
	
	public FechasEstimadasFacturacion() {
		super();
	}

	public FechasEstimadasFacturacion(int id, Date fecha_estimada, String comentario, int indefinida, int activo,
			int creado_por, Date creado, int modificado_por, Date modificado, int ordenes_id) {
		super();
		this.id = id;
		this.fecha_estimada = fecha_estimada;
		this.comentario = comentario;
		this.indefinida = indefinida;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.ordenes_id = ordenes_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha_estimada() {
		return fecha_estimada;
	}

	public void setFecha_estimada(Date fecha_estimada) {
		this.fecha_estimada = fecha_estimada;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getIndefinida() {
		return indefinida;
	}

	public void setIndefinida(int indefinida) {
		this.indefinida = indefinida;
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

	public int getOrdenes_id() {
		return ordenes_id;
	}

	public void setOrdenes_id(int ordenes_id) {
		this.ordenes_id = ordenes_id;
	}

	@Override
	public String toString() {
		return "FechasEstimadasFacturacion [id=" + id + ", fecha_estimada=" + fecha_estimada + ", comentario="
				+ comentario + ", indefinida=" + indefinida + ", activo=" + activo + ", creado_por=" + creado_por
				+ ", creado=" + creado + ", modificado_por=" + modificado_por + ", modificado=" + modificado
				+ ", ordenes_id=" + ordenes_id + "]";
	}
	
	
	
}
