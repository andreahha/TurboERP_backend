package com.turbomaquinas.POJO.servexternos;

import java.util.Date;

public class SolicitudServExterno {
	private int id;
	private int numero;
	private String iniciales;
	private int anio;
	private Date fecha_alta;
	private String descripcion;
	private int monto;
	private String moneda;
	private int mes_estimado;
	private int año_estimado;
	private int activo;
	private String status;
	private Date fecha_baja;
	private Date fecha_detenido;
	private String probabilidad;
	private String comentario;
	private Date fecha_cierre;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int clientes_id;
	
	public SolicitudServExterno() {
		super();
	}

	public SolicitudServExterno(int id, int numero, String iniciales, int anio, Date fecha_alta, String descripcion,
			int monto, String moneda, int mes_estimado, int año_estimado, int activo, String status, Date fecha_baja,
			Date fecha_detenido, String probabilidad, String comentario, Date fecha_cierre, int creado_por, Date creado,
			int modificado_por, Date modificado, int clientes_id) {
		super();
		this.id = id;
		this.numero = numero;
		this.iniciales = iniciales;
		this.anio = anio;
		this.fecha_alta = fecha_alta;
		this.descripcion = descripcion;
		this.monto = monto;
		this.moneda = moneda;
		this.mes_estimado = mes_estimado;
		this.año_estimado = año_estimado;
		this.activo = activo;
		this.status = status;
		this.fecha_baja = fecha_baja;
		this.fecha_detenido = fecha_detenido;
		this.probabilidad = probabilidad;
		this.comentario = comentario;
		this.fecha_cierre = fecha_cierre;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.clientes_id = clientes_id;
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

	public Date getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public int getMes_estimado() {
		return mes_estimado;
	}

	public void setMes_estimado(int mes_estimado) {
		this.mes_estimado = mes_estimado;
	}

	public int getAño_estimado() {
		return año_estimado;
	}

	public void setAño_estimado(int año_estimado) {
		this.año_estimado = año_estimado;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getFecha_baja() {
		return fecha_baja;
	}

	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}

	public Date getFecha_detenido() {
		return fecha_detenido;
	}

	public void setFecha_detenido(Date fecha_detenido) {
		this.fecha_detenido = fecha_detenido;
	}

	public String getProbabilidad() {
		return probabilidad;
	}

	public void setProbabilidad(String probabilidad) {
		this.probabilidad = probabilidad;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Date getFecha_cierre() {
		return fecha_cierre;
	}

	public void setFecha_cierre(Date fecha_cierre) {
		this.fecha_cierre = fecha_cierre;
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

	public int getClientes_id() {
		return clientes_id;
	}

	public void setClientes_id(int clientes_id) {
		this.clientes_id = clientes_id;
	}
}
