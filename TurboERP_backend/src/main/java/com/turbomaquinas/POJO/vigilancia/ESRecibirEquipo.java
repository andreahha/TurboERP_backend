package com.turbomaquinas.POJO.vigilancia;

import java.sql.Date;

public class ESRecibirEquipo {

	private int id;
	private String vehiculo;
	private String placas;
	private String tcir_alfresco_id;
	private int totalmente_recibido;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int equipo_por_recibir_id;
	private int clientes_id;
	private int entradas_salidas_externos_id;
	
	public ESRecibirEquipo() {
		super();
	}

	public ESRecibirEquipo(int id, String vehiculo, String placas, String tcir_alfresco_id, int totalmente_recibido,
			int activo, int creado_por, Date creado, int modificado_por, Date modificado, int equipo_por_recibir_id,
			int clientes_id, int entradas_salidas_externos_id) {
		super();
		this.id = id;
		this.vehiculo = vehiculo;
		this.placas = placas;
		this.tcir_alfresco_id = tcir_alfresco_id;
		this.totalmente_recibido = totalmente_recibido;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.equipo_por_recibir_id = equipo_por_recibir_id;
		this.clientes_id = clientes_id;
		this.entradas_salidas_externos_id = entradas_salidas_externos_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}

	public String getTcir_alfresco_id() {
		return tcir_alfresco_id;
	}

	public void setTcir_alfresco_id(String tcir_alfresco_id) {
		this.tcir_alfresco_id = tcir_alfresco_id;
	}

	public int getTotalmente_recibido() {
		return totalmente_recibido;
	}

	public void setTotalmente_recibido(int totalmente_recibido) {
		this.totalmente_recibido = totalmente_recibido;
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

	public int getEquipo_por_recibir_id() {
		return equipo_por_recibir_id;
	}

	public void setEquipo_por_recibir_id(int equipo_por_recibir_id) {
		this.equipo_por_recibir_id = equipo_por_recibir_id;
	}

	public int getClientes_id() {
		return clientes_id;
	}

	public void setClientes_id(int clientes_id) {
		this.clientes_id = clientes_id;
	}

	public int getEntradas_salidas_externos_id() {
		return entradas_salidas_externos_id;
	}

	public void setEntradas_salidas_externos_id(int entradas_salidas_externos_id) {
		this.entradas_salidas_externos_id = entradas_salidas_externos_id;
	}
}
