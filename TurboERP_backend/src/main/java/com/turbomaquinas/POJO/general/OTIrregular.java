package com.turbomaquinas.POJO.general;

import java.util.Date;

public class OTIrregular {
	
	private int id;
	private int numero;
	private String iniciales;
	private int anio;
	private Date fecha_solicitud;
	private Date fecha_regularizacion;
	private String comentarios;
	private String proceso;
	private String estado;
	private int usuario_acepta;
	private Date fecha_acepta;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int ordenes_id;
	private int contactos_id;
	
	public OTIrregular() {
		super();
	}

	public OTIrregular(int id, int numero, String iniciales, int anio, Date fecha_solicitud, Date fecha_regularizacion,
			String comentarios, String proceso, String estado, int usuario_acepta, Date fecha_acepta, int activo,
			int creado_por, Date creado, int modificado_por, Date modificado, int ordenes_id, int contactos_id) {
		super();
		this.id = id;
		this.numero = numero;
		this.iniciales = iniciales;
		this.anio = anio;
		this.fecha_solicitud = fecha_solicitud;
		this.fecha_regularizacion = fecha_regularizacion;
		this.comentarios = comentarios;
		this.proceso = proceso;
		this.estado = estado;
		this.usuario_acepta = usuario_acepta;
		this.fecha_acepta = fecha_acepta;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.ordenes_id = ordenes_id;
		this.contactos_id = contactos_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getIniciales() {
		return iniciales;
	}

	public void setIniciales(String iniciales) {
		this.iniciales = iniciales;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Date getFecha_solicitud() {
		return fecha_solicitud;
	}

	public void setFecha_solicitud(Date fecha_solicitud) {
		this.fecha_solicitud = fecha_solicitud;
	}

	public Date getFecha_regularizacion() {
		return fecha_regularizacion;
	}

	public void setFecha_regularizacion(Date fecha_regularizacion) {
		this.fecha_regularizacion = fecha_regularizacion;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getProceso() {
		return proceso;
	}

	public void setProceso(String proceso) {
		this.proceso = proceso;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getUsuario_acepta() {
		return usuario_acepta;
	}

	public void setUsuario_acepta(int usuario_acepta) {
		this.usuario_acepta = usuario_acepta;
	}

	public Date getFecha_acepta() {
		return fecha_acepta;
	}

	public void setFecha_acepta(Date fecha_acepta) {
		this.fecha_acepta = fecha_acepta;
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

	public int getContactos_id() {
		return contactos_id;
	}

	public void setContactos_id(int contactos_id) {
		this.contactos_id = contactos_id;
	}
	
}
