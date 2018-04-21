package com.turbomaquinas.POJO.comercial;


import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

public class CotizacionVista {
	
	private int id;
	private int numero;
	private int anio;
	private String numero_cotizacion;
	private String encabezado;
	private String descripcion_general;
	private String pie_pagina;
	private String pie_pagina_usuario;
	private Date fecha_cot;
	private Time hora_cot;
	private BigDecimal subtotal;
	private BigDecimal descuento;
	private String descripcion_descto;
	private BigDecimal iva;
	private BigDecimal iva_retenido;
	private BigDecimal total;
	private String moneda;
	private int activo;
	private int areas_id;
	private int narea;
	private int personal_id;
	private String personal;
	private int ordenes_id;
	private int orden;
	private int precotizaciones_id;
	private int precotizacion;
	private int contactos_id;
	private String contactos;
	private int revision;
	private int cotizaciones_id_original;

	public CotizacionVista() {
		super();
	}

	public CotizacionVista(int id, int numero, int anio, String numero_cotizacion, String encabezado,
			String descripcion_general, String pie_pagina, String pie_pagina_usuario, Date fecha_cot, Time hora_cot,
			BigDecimal subtotal, BigDecimal descuento, String descripcion_descto, BigDecimal iva, BigDecimal iva_retenido, BigDecimal total,
			String moneda, int activo, int areas_id, int narea, int personal_id, String personal, int ordenes_id,
			int orden, int precotizaciones_id, int precotizacion, int contactos_id, String contactos) {
		super();
		this.id = id;
		this.numero = numero;
		this.anio = anio;
		this.numero_cotizacion = numero_cotizacion;
		this.encabezado = encabezado;
		this.descripcion_general = descripcion_general;
		this.pie_pagina = pie_pagina;
		this.pie_pagina_usuario = pie_pagina_usuario;
		this.fecha_cot = fecha_cot;
		this.hora_cot = hora_cot;
		this.subtotal = subtotal;
		this.descuento = descuento;
		this.descripcion_descto = descripcion_descto;
		this.iva = iva;
		this.iva_retenido = iva_retenido;
		this.total = total;
		this.moneda = moneda;
		this.activo = activo;
		this.areas_id = areas_id;
		this.narea = narea;
		this.personal_id = personal_id;
		this.personal = personal;
		this.ordenes_id = ordenes_id;
		this.orden = orden;
		this.precotizaciones_id = precotizaciones_id;
		this.precotizacion = precotizacion;
		this.contactos_id = contactos_id;
		this.contactos = contactos;
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

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getNumero_cotizacion() {
		return numero_cotizacion;
	}

	public void setNumero_cotizacion(String numero_cotizacion) {
		this.numero_cotizacion = numero_cotizacion;
	}

	public String getEncabezado() {
		return encabezado;
	}

	public void setEncabezado(String encabezado) {
		this.encabezado = encabezado;
	}

	public String getDescripcion_general() {
		return descripcion_general;
	}

	public void setDescripcion_general(String descripcion_general) {
		this.descripcion_general = descripcion_general;
	}

	public String getPie_pagina() {
		return pie_pagina;
	}

	public void setPie_pagina(String pie_pagina) {
		this.pie_pagina = pie_pagina;
	}

	public String getPie_pagina_usuario() {
		return pie_pagina_usuario;
	}

	public void setPie_pagina_usuario(String pie_pagina_usuario) {
		this.pie_pagina_usuario = pie_pagina_usuario;
	}

	public Date getFecha_cot() {
		return fecha_cot;
	}

	public void setFecha_cot(Date fecha_cot) {
		this.fecha_cot = fecha_cot;
	}

	public Time getHora_cot() {
		return hora_cot;
	}

	public void setHora_cot(Time hora_cot) {
		this.hora_cot = hora_cot;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getDescuento() {
		return descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

	public String getDescripcion_descto() {
		return descripcion_descto;
	}

	public void setDescripcion_descto(String descripcion_descto) {
		this.descripcion_descto = descripcion_descto;
	}

	public BigDecimal getIva() {
		return iva;
	}

	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}

	public BigDecimal getIva_retenido() {
		return iva_retenido;
	}

	public void setIva_retenido(BigDecimal iva_retenido) {
		this.iva_retenido = iva_retenido;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
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

	public int getNarea() {
		return narea;
	}

	public void setNarea(int narea) {
		this.narea = narea;
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

	public int getOrdenes_id() {
		return ordenes_id;
	}

	public void setOrdenes_id(int ordenes_id) {
		this.ordenes_id = ordenes_id;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public int getPrecotizaciones_id() {
		return precotizaciones_id;
	}

	public void setPrecotizaciones_id(int precotizaciones_id) {
		this.precotizaciones_id = precotizaciones_id;
	}

	public int getPrecotizacion() {
		return precotizacion;
	}

	public void setPrecotizacion(int precotizacion) {
		this.precotizacion = precotizacion;
	}

	public int getContactos_id() {
		return contactos_id;
	}

	public void setContactos_id(int contactos_id) {
		this.contactos_id = contactos_id;
	}

	public String getContactos() {
		return contactos;
	}

	public void setContactos(String contactos) {
		this.contactos = contactos;
	}

	public int getRevision() {
		return revision;
	}

	public void setRevision(int revision) {
		this.revision = revision;
	}

	public int getCotizaciones_id_original() {
		return cotizaciones_id_original;
	}

	public void setCotizaciones_id_original(int cotizaciones_id_original) {
		this.cotizaciones_id_original = cotizaciones_id_original;
	}
	
}
