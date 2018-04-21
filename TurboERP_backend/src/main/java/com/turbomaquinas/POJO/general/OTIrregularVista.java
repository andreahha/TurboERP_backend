package com.turbomaquinas.POJO.general;

import java.util.Date;

public class OTIrregularVista {
	
	private int id;
	private String folio;
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
	private int ordenes_id;
	private String numero_orden;
	private int contactos_id;
	private String contacto;
	
	public OTIrregularVista() {
		super();
	}

	public OTIrregularVista(int id, String folio, int numero, String iniciales, int anio, Date fecha_solicitud,
			Date fecha_regularizacion, String comentarios, String proceso, String estado, int usuario_acepta,
			Date fecha_acepta, int ordenes_id, String numero_orden, int contactos_id, String contacto) {
		super();
		this.id = id;
		this.folio = folio;
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
		this.ordenes_id = ordenes_id;
		this.numero_orden = numero_orden;
		this.contactos_id = contactos_id;
		this.contacto = contacto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
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

	public int getOrdenes_id() {
		return ordenes_id;
	}

	public void setOrdenes_id(int ordenes_id) {
		this.ordenes_id = ordenes_id;
	}

	public String getNumero_orden() {
		return numero_orden;
	}

	public void setNumero_orden(String numero_orden) {
		this.numero_orden = numero_orden;
	}

	public int getContactos_id() {
		return contactos_id;
	}

	public void setContactos_id(int contactos_id) {
		this.contactos_id = contactos_id;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
}
