package com.turbomaquinas.POJO.diagnostico;

import java.util.Date;

public class InspeccionEquipo {
	private int id;
	private String comentarios;
	private int consecutivo;
	private int sustituye_id;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private String alfresco_id;
	private int ordenes_id;
	private int personal_id;
	
	public InspeccionEquipo() {
		super();
	}

	public InspeccionEquipo(int id, String comentarios, int consecutivo, int sustituye_id, int activo, int creado_por,
			Date creado, int modificado_por, Date modificado, String alfresco_id, int ordenes_id, int personal_id) {
		super();
		this.id = id;
		this.comentarios = comentarios;
		this.consecutivo = consecutivo;
		this.sustituye_id = sustituye_id;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.alfresco_id = alfresco_id;
		this.ordenes_id = ordenes_id;
		this.personal_id = personal_id;
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

	public int getConsecutivo() {
		return consecutivo;
	}

	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public int getSustituye_id() {
		return sustituye_id;
	}

	public void setSustituye_id(int sustituye_id) {
		this.sustituye_id = sustituye_id;
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

	public int getPersonal_id() {
		return personal_id;
	}

	public void setPersonal_id(int personal_id) {
		this.personal_id = personal_id;
	}
}
