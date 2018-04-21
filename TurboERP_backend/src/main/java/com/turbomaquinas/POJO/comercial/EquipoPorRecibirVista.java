package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class EquipoPorRecibirVista {
	private int id;
	private String descripcion;
	private Date fecha_estimada_llegada;
	private String transporte;
	private String comentarios;
	private String soportes;
	private int soporte_turbomaquinas;
	private Float peso;
	private int flete;
	private int ordenes_id;
	private int orden_no;
	private int anio;
	private String numero_orden;
	private int clientes_id;
	private int cliente_no;
	private String nombre_fiscal;
	private String nombre_comercial;
	private int giro;
	private String ciudad_origen;
	private int medidas_equipos_id;
	private String medida_equipo;
	private int es_recibir_equipo_id;
	
	public EquipoPorRecibirVista() {
		super();
	}

	public EquipoPorRecibirVista(int id, String descripcion, Date fecha_estimada_llegada, String transporte,
			String comentarios, String soportes, int soporte_turbomaquinas, Float peso, int flete, int ordenes_id,
			int orden_no, int anio, String numero_orden, int clientes_id, int cliente_no, String nombre_fiscal,
			String nombre_comercial, int giro, String ciudad_origen, int medidas_equipos_id, String medida_equipo,
			int es_recibir_equipo_id) {
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
		this.ordenes_id = ordenes_id;
		this.orden_no = orden_no;
		this.anio = anio;
		this.numero_orden = numero_orden;
		this.clientes_id = clientes_id;
		this.cliente_no = cliente_no;
		this.nombre_fiscal = nombre_fiscal;
		this.nombre_comercial = nombre_comercial;
		this.giro = giro;
		this.ciudad_origen = ciudad_origen;
		this.medidas_equipos_id = medidas_equipos_id;
		this.medida_equipo = medida_equipo;
		this.es_recibir_equipo_id = es_recibir_equipo_id;
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

	public int getOrdenes_id() {
		return ordenes_id;
	}

	public void setOrdenes_id(int ordenes_id) {
		this.ordenes_id = ordenes_id;
	}

	public int getOrden_no() {
		return orden_no;
	}

	public void setOrden_no(int orden_no) {
		this.orden_no = orden_no;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getNumero_orden() {
		return numero_orden;
	}

	public void setNumero_orden(String numero_orden) {
		this.numero_orden = numero_orden;
	}

	public int getClientes_id() {
		return clientes_id;
	}

	public void setClientes_id(int clientes_id) {
		this.clientes_id = clientes_id;
	}

	public int getCliente_no() {
		return cliente_no;
	}

	public void setCliente_no(int cliente_no) {
		this.cliente_no = cliente_no;
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

	public int getGiro() {
		return giro;
	}

	public void setGiro(int giro) {
		this.giro = giro;
	}

	public String getCiudad_origen() {
		return ciudad_origen;
	}

	public void setCiudad_origen(String ciudad_origen) {
		this.ciudad_origen = ciudad_origen;
	}

	public int getMedidas_equipos_id() {
		return medidas_equipos_id;
	}

	public void setMedidas_equipos_id(int medidas_equipos_id) {
		this.medidas_equipos_id = medidas_equipos_id;
	}

	public String getMedida_equipo() {
		return medida_equipo;
	}

	public void setMedida_equipo(String medida_equipo) {
		this.medida_equipo = medida_equipo;
	}

	public int getEs_recibir_equipo_id() {
		return es_recibir_equipo_id;
	}

	public void setEs_recibir_equipo_id(int es_recibir_equipo_id) {
		this.es_recibir_equipo_id = es_recibir_equipo_id;
	}
}
