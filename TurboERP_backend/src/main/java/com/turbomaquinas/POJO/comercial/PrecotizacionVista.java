package com.turbomaquinas.POJO.comercial;

import java.sql.Date;

public class PrecotizacionVista {
	
	private int id;
	private String origen;
	private int numero;
	private int anio;
	private String numero_precotizacion;
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
	private int marcas_equipos_id;
	private String marca;
	private int modelos_equipos_id;
	private String modelo;
	private int clientes_id;
	private String nombre_fiscal;
	private String nombre_comercial;
	private String giro;
	private int contactos_id;
	private String contacto;
	
	public PrecotizacionVista() {
		super();
	}

	public PrecotizacionVista(int id, String origen, int numero, int anio, String numero_precotizacion, Date fecha_pre,
			String descripcion, String comentarios, Date fecha_requiere_cotizacion, Date fecha_estimada_logro,
			Date fecha_junta_aclara, Date fecha_propuesta, Date fecha_fallo, Date fecha_llegada_equipo, int licitacion,
			String estado, int activo, int marcas_equipos_id, String marca, int modelos_equipos_id, String modelo,
			int clientes_id, String nombre_fiscal, String nombre_comercial, String giro, int contactos_id,
			String contacto) {
		super();
		this.id = id;
		this.origen = origen;
		this.numero = numero;
		this.anio = anio;
		this.numero_precotizacion = numero_precotizacion;
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
		this.marcas_equipos_id = marcas_equipos_id;
		this.marca = marca;
		this.modelos_equipos_id = modelos_equipos_id;
		this.modelo = modelo;
		this.clientes_id = clientes_id;
		this.nombre_fiscal = nombre_fiscal;
		this.nombre_comercial = nombre_comercial;
		this.giro = giro;
		this.contactos_id = contactos_id;
		this.contacto = contacto;
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

	public String getNumero_precotizacion() {
		return numero_precotizacion;
	}

	public void setNumero_precotizacion(String numero_precotizacion) {
		this.numero_precotizacion = numero_precotizacion;
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

	public int getMarcas_equipos_id() {
		return marcas_equipos_id;
	}

	public void setMarcas_equipos_id(int marcas_equipos_id) {
		this.marcas_equipos_id = marcas_equipos_id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelos_equipos_id() {
		return modelos_equipos_id;
	}

	public void setModelos_equipos_id(int modelos_equipos_id) {
		this.modelos_equipos_id = modelos_equipos_id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getClientes_id() {
		return clientes_id;
	}

	public void setClientes_id(int clientes_id) {
		this.clientes_id = clientes_id;
	}

	public String getNombre_fiscal() {
		return nombre_fiscal;
	}

	public void setNombre_fiscal(String nombre_fiscal) {
		this.nombre_fiscal = nombre_fiscal;
	}

	public String getNombre_comercial() {
		return nombre_comercial;
	}

	public void setNombre_comercial(String nombre_comercial) {
		this.nombre_comercial = nombre_comercial;
	}

	public String getGiro() {
		return giro;
	}

	public void setGiro(String giro) {
		this.giro = giro;
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
