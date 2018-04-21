package com.turbomaquinas.POJO.general;

import java.util.Date;

public class SolicitudDesautorizacionAA {
	private int id;
	private int folio;
	private String motivo;
	private Date fecha_aceptacion;
	private String tipo;
	private String estado;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private String alfresco_id;
	private int ordenes_id;
	
	public SolicitudDesautorizacionAA() {
		super();
	}

	public SolicitudDesautorizacionAA(int id, int folio, String motivo, Date fecha_aceptacion, String tipo,
			String estado, int activo, int creado_por, Date creado, int modificado_por, Date modificado,
			String alfresco_id, int ordenes_id) {
		super();
		this.id = id;
		this.folio = folio;
		this.motivo = motivo;
		this.fecha_aceptacion = fecha_aceptacion;
		this.tipo = tipo;
		this.estado = estado;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.alfresco_id = alfresco_id;
		this.ordenes_id = ordenes_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Date getFecha_aceptacion() {
		return fecha_aceptacion;
	}

	public void setFecha_aceptacion(Date fecha_aceptacion) {
		this.fecha_aceptacion = fecha_aceptacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	public String getAlfresco_id() {
		return alfresco_id;
	}

	public void setAlfresco_id(String alfresco_id) {
		this.alfresco_id = alfresco_id;
	}

	public int getOrdenes_id() {
		return ordenes_id;
	}

	public void setOrdenes_id(int ordenes_id) {
		this.ordenes_id = ordenes_id;
	}
}
