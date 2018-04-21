package com.turbomaquinas.POJO.diagnostico;

import java.util.Date;

public class InspeccionEquipoVista {
	private int id;
	private String comentarios;
	private int consecutivo;
	private int sustituye_id;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private String alfresco_id;
	private int ordenes_id;
	private String anio;
	private String numero_orden;
	private int personal_id;
	private String personal;
	
	public InspeccionEquipoVista() {
		super();
	}

	public InspeccionEquipoVista(int id, String comentarios, int consecutivo, int sustituye_id, int creado_por,
			Date creado, int modificado_por, Date modificado, String alfresco_id, int ordenes_id, String anio,
			String numero_orden, int personal_id, String personal) {
		super();
		this.id = id;
		this.comentarios = comentarios;
		this.consecutivo = consecutivo;
		this.sustituye_id = sustituye_id;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.alfresco_id = alfresco_id;
		this.ordenes_id = ordenes_id;
		this.anio = anio;
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

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
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
