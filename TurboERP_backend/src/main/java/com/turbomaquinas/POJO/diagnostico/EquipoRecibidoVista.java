package com.turbomaquinas.POJO.diagnostico;

import java.sql.Date;

public class EquipoRecibidoVista {
	
	private int id;
	private String descripcion_equipo;
	private Date fecha_ingreso;
	private String descripcion_empaque;
	private int cantidad;
	private int peso;
	private int usuario_acepta;
	private Date fecha_acepta;
	private int ordenes_id;
	private String numero_orden;
	private int ordenes_id_adonde;
	private String numero_orden_adonde;
	private int es_recibir_equipo;
	private String vehiculo;
	private String placas;
	private String tipo;
	
	public EquipoRecibidoVista() {
		super();
	}

	public EquipoRecibidoVista(int id, String descripcion_equipo, Date fecha_ingreso, String descripcion_empaque,
			int cantidad, int peso, int usuario_acepta, Date fecha_acepta, int ordenes_id, String numero_orden,
			int ordenes_id_adonde, String numero_orden_adonde, int es_recibir_equipo, String vehiculo, String placas, String tipo) {
		this.id = id;
		this.descripcion_equipo = descripcion_equipo;
		this.fecha_ingreso = fecha_ingreso;
		this.descripcion_empaque = descripcion_empaque;
		this.cantidad = cantidad;
		this.peso = peso;
		this.usuario_acepta = usuario_acepta;
		this.fecha_acepta = fecha_acepta;
		this.ordenes_id = ordenes_id;
		this.numero_orden = numero_orden;
		this.ordenes_id_adonde = ordenes_id_adonde;
		this.numero_orden_adonde = numero_orden_adonde;
		this.es_recibir_equipo = es_recibir_equipo;
		this.vehiculo = vehiculo;
		this.placas = placas;
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

	public int getOrdenes_id_adonde() {
		return ordenes_id_adonde;
	}

	public void setOrdenes_id_adonde(int ordenes_id_adonde) {
		this.ordenes_id_adonde = ordenes_id_adonde;
	}

	public String getNumero_orden_adonde() {
		return numero_orden_adonde;
	}

	public void setNumero_orden_adonde(String numero_orden_adonde) {
		this.numero_orden_adonde = numero_orden_adonde;
	}

	public int getEs_recibir_equipo() {
		return es_recibir_equipo;
	}

	public void setEs_recibir_equipo(int es_recibir_equipo) {
		this.es_recibir_equipo = es_recibir_equipo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
