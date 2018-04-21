package com.turbomaquinas.POJO.comercial;

import java.sql.Date;

public class Precotizacion {
	
	private int id;
	private String origen;
	private int numero;
	private int anio;
	private Date fecha_pre;
	private String descripcion;
	private String comentarios;
	private Date fecha_requiere_cotizacion;
	private Date fecha_estimada_logro;
	private Date fecha_junta_aclara;
	private Date fecha_propuesta;
	private Date fecha_fallo;
	private Date fecha_llegada_equipo;
	private int licitacion;
	private String estado;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int marcas_equipos_id;
	private int modelos_equipos_id;
	private int clientes_id;
	private int contactos_id;
	
	public Precotizacion() {
		super();
	}

	public Precotizacion(int id, String origen, int numero, int anio, Date fecha_pre, String descripcion,
			String comentarios, Date fecha_requiere_cotizacion, Date fecha_estimada_logro, Date fecha_junta_aclara,
			Date fecha_propuesta, Date fecha_fallo, Date fecha_llegada_equipo, int licitacion, String estado,
			int activo, int creado_por, Date creado, int modificado_por, Date modificado, int marcas_equipos_id,
			int modelos_equipos_id, int clientes_id, int contactos_id) {
		super();
		this.id = id;
		this.origen = origen;
		this.numero = numero;
		this.anio = anio;
		this.fecha_pre = fecha_pre;
		this.descripcion = descripcion;
		this.comentarios = comentarios;
		this.fecha_requiere_cotizacion = fecha_requiere_cotizacion;
		this.fecha_estimada_logro = fecha_estimada_logro;
		this.fecha_junta_aclara = fecha_junta_aclara;
		this.fecha_propuesta = fecha_propuesta;
		this.fecha_fallo = fecha_fallo;
		this.fecha_llegada_equipo = fecha_llegada_equipo;
		this.licitacion = licitacion;
		this.estado = estado;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.marcas_equipos_id = marcas_equipos_id;
		this.modelos_equipos_id = modelos_equipos_id;
		this.clientes_id = clientes_id;
		this.contactos_id = contactos_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Date getFecha_pre() {
		return fecha_pre;
	}

	public void setFecha_pre(Date fecha_pre) {
		this.fecha_pre = fecha_pre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public Date getFecha_requiere_cotizacion() {
		return fecha_requiere_cotizacion;
	}

	public void setFecha_requiere_cotizacion(Date fecha_requiere_cotizacion) {
		this.fecha_requiere_cotizacion = fecha_requiere_cotizacion;
	}

	public Date getFecha_estimada_logro() {
		return fecha_estimada_logro;
	}

	public void setFecha_estimada_logro(Date fecha_estimada_logro) {
		this.fecha_estimada_logro = fecha_estimada_logro;
	}

	public Date getFecha_junta_aclara() {
		return fecha_junta_aclara;
	}

	public void setFecha_junta_aclara(Date fecha_junta_aclara) {
		this.fecha_junta_aclara = fecha_junta_aclara;
	}

	public Date getFecha_propuesta() {
		return fecha_propuesta;
	}

	public void setFecha_propuesta(Date fecha_propuesta) {
		this.fecha_propuesta = fecha_propuesta;
	}

	public Date getFecha_fallo() {
		return fecha_fallo;
	}

	public void setFecha_fallo(Date fecha_fallo) {
		this.fecha_fallo = fecha_fallo;
	}

	public Date getFecha_llegada_equipo() {
		return fecha_llegada_equipo;
	}

	public void setFecha_llegada_equipo(Date fecha_llegada_equipo) {
		this.fecha_llegada_equipo = fecha_llegada_equipo;
	}

	public int getLicitacion() {
		return licitacion;
	}

	public void setLicitacion(int licitacion) {
		this.licitacion = licitacion;
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

	public int getMarcas_equipos_id() {
		return marcas_equipos_id;
	}

	public void setMarcas_equipos_id(int marcas_equipos_id) {
		this.marcas_equipos_id = marcas_equipos_id;
	}

	public int getModelos_equipos_id() {
		return modelos_equipos_id;
	}

	public void setModelos_equipos_id(int modelos_equipos_id) {
		this.modelos_equipos_id = modelos_equipos_id;
	}

	public int getClientes_id() {
		return clientes_id;
	}

	public void setClientes_id(int clientes_id) {
		this.clientes_id = clientes_id;
	}

	public int getContactos_id() {
		return contactos_id;
	}

	public void setContactos_id(int contactos_id) {
		this.contactos_id = contactos_id;
	}
}
