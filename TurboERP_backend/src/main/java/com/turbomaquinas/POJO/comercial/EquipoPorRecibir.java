package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class EquipoPorRecibir {
	private int id;
	private String descripcion;
	private Date fecha_estimada_llegada;
	private String transporte;
	private String comentarios;
	private String soportes;
	private int soporte_turbomaquinas;
	private Float peso;
	private int flete;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int ordenes_id;
	private int clientes_id;
	private int solicitud_fletes_id;
	private int medidas_equipos_id;
	
	public EquipoPorRecibir() {
		super();
	}

	public EquipoPorRecibir(int id, String descripcion, Date fecha_estimada_llegada, String transporte,
			String comentarios, String soportes, int soporte_turbomaquinas, Float peso, int flete, int activo,
			int creado_por, Date creado, int modificado_por, Date modificado, int ordenes_id, int clientes_id,
			int solicitud_fletes_id, int medidas_equipos_id) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.fecha_estimada_llegada = fecha_estimada_llegada;
		this.transporte = transporte;
		this.comentarios = comentarios;
		this.soportes = soportes;
		this.soporte_turbomaquinas = soporte_turbomaquinas;
		this.peso = peso;
		this.flete = flete;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.ordenes_id = ordenes_id;
		this.clientes_id = clientes_id;
		this.solicitud_fletes_id = solicitud_fletes_id;
		this.medidas_equipos_id = medidas_equipos_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha_estimada_llegada() {
		return fecha_estimada_llegada;
	}

	public void setFecha_estimada_llegada(Date fecha_estimada_llegada) {
		this.fecha_estimada_llegada = fecha_estimada_llegada;
	}

	public String getTransporte() {
		return transporte;
	}

	public void setTransporte(String transporte) {
		this.transporte = transporte;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getSoportes() {
		return soportes;
	}

	public void setSoportes(String soportes) {
		this.soportes = soportes;
	}

	public int getSoporte_turbomaquinas() {
		return soporte_turbomaquinas;
	}

	public void setSoporte_turbomaquinas(int soporte_turbomaquinas) {
		this.soporte_turbomaquinas = soporte_turbomaquinas;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public int getFlete() {
		return flete;
	}

	public void setFlete(int flete) {
		this.flete = flete;
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

	public int getClientes_id() {
		return clientes_id;
	}

	public void setClientes_id(int clientes_id) {
		this.clientes_id = clientes_id;
	}

	public int getSolicitud_fletes_id() {
		return solicitud_fletes_id;
	}

	public void setSolicitud_fletes_id(int solicitud_fletes_id) {
		this.solicitud_fletes_id = solicitud_fletes_id;
	}

	public int getMedidas_equipos_id() {
		return medidas_equipos_id;
	}

	public void setMedidas_equipos_id(int medidas_equipos_id) {
		this.medidas_equipos_id = medidas_equipos_id;
	}
}
