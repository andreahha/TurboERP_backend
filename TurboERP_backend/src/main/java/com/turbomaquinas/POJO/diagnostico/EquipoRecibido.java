package com.turbomaquinas.POJO.diagnostico;

import java.sql.Date;

public class EquipoRecibido {
	
	private int id;
	private String descripcion_equipo;
	private Date fecha_ingreso;
	private String descripcion_empaque;
	private int cantidad;
	private int peso;
	private int usuario_acepta;
	private Date fecha_acepta;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int ordenes_id;
	private int ordenes_id_adonde;
	private int es_recibir_equipo;
	private String tipo;
	
	public EquipoRecibido() {
		super();
	}

	public EquipoRecibido(int id, String descripcion_equipo, Date fecha_ingreso, String descripcion_empaque,
			int cantidad, int peso, int usuario_acepta, Date fecha_acepta, int activo, int creado_por, Date creado,
			int modificado_por, Date modificado, int ordenes_id, int ordenes_id_adonde, int es_recibir_equipo, String tipo) {
		this.id = id;
		this.descripcion_equipo = descripcion_equipo;
		this.fecha_ingreso = fecha_ingreso;
		this.descripcion_empaque = descripcion_empaque;
		this.cantidad = cantidad;
		this.peso = peso;
		this.usuario_acepta = usuario_acepta;
		this.fecha_acepta = fecha_acepta;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.ordenes_id = ordenes_id;
		this.ordenes_id_adonde = ordenes_id_adonde;
		this.es_recibir_equipo = es_recibir_equipo;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion_equipo() {
		return descripcion_equipo;
	}

	public void setDescripcion_equipo(String descripcion_equipo) {
		this.descripcion_equipo = descripcion_equipo;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public String getDescripcion_empaque() {
		return descripcion_empaque;
	}

	public void setDescripcion_empaque(String descripcion_empaque) {
		this.descripcion_empaque = descripcion_empaque;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
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

	public int getOrdenes_id_adonde() {
		return ordenes_id_adonde;
	}

	public void setOrdenes_id_adonde(int ordenes_id_adonde) {
		this.ordenes_id_adonde = ordenes_id_adonde;
	}

	public int getEs_recibir_equipo() {
		return es_recibir_equipo;
	}

	public void setEs_recibir_equipo(int es_recibir_equipo) {
		this.es_recibir_equipo = es_recibir_equipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
