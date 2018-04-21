package com.turbomaquinas.POJO.general;

import java.util.Date;

public class OrdenVista {
	private int id;
	private int numero;
	private int anio;
	private String numero_orden;
	private String descripcion;
	private String estado;
	private String tipo;
	private String moneda;
	private int creado_por;
	private Date creado;
	private Float importe_cotizado;
	private Float importe_autorizado;
	private Float importe_bajas;
	private Float importe_facturado;
	private Float importe_descuento;
	private Float importe_pedido;
	private int clientes_id;
	private int cliente_no;
	private String nombre_fiscal;
	private String nombre_comercial;
	private String giro;
	private int marcas_equipos_id;
	private String marca_equipo;
	private int modelos_equipos_id;
	private String modelo_equipo;
	private String alfresco_id_OIT;
	private String cliente;
	private int cliente_factura_id;
	
	public OrdenVista() {
		super();
	}

	public OrdenVista(int id, int numero, int anio, String numero_orden, String descripcion, String estado, String tipo,
			String moneda, int creado_por, Date creado, Float importe_cotizado, Float importe_autorizado,
			Float importe_bajas, Float importe_facturado, Float importe_descuento, Float importe_pedido,
			int clientes_id, int cliente_no, String nombre_fiscal, String nombre_comercial, String giro,
			int marcas_equipos_id, String marca_equipo, int modelos_equipos_id, String modelo_equipo,
			String alfresco_id_OIT, String cliente, int cliente_factura_id) {
		super();
		this.id = id;
		this.numero = numero;
		this.anio = anio;
		this.numero_orden = numero_orden;
		this.descripcion = descripcion;
		this.estado = estado;
		this.tipo = tipo;
		this.moneda = moneda;
		this.creado_por = creado_por;
		this.creado = creado;
		this.importe_cotizado = importe_cotizado;
		this.importe_autorizado = importe_autorizado;
		this.importe_bajas = importe_bajas;
		this.importe_facturado = importe_facturado;
		this.importe_descuento = importe_descuento;
		this.importe_pedido = importe_pedido;
		this.clientes_id = clientes_id;
		this.cliente_no = cliente_no;
		this.nombre_fiscal = nombre_fiscal;
		this.nombre_comercial = nombre_comercial;
		this.giro = giro;
		this.marcas_equipos_id = marcas_equipos_id;
		this.marca_equipo = marca_equipo;
		this.modelos_equipos_id = modelos_equipos_id;
		this.modelo_equipo = modelo_equipo;
		this.alfresco_id_OIT = alfresco_id_OIT;
		this.cliente = cliente;
		this.cliente_factura_id = cliente_factura_id;
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

	public String getNumero_orden() {
		return numero_orden;
	}

	public void setNumero_orden(String numero_orden) {
		this.numero_orden = numero_orden;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
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

	public Float getImporte_cotizado() {
		return importe_cotizado;
	}

	public void setImporte_cotizado(Float importe_cotizado) {
		this.importe_cotizado = importe_cotizado;
	}

	public Float getImporte_autorizado() {
		return importe_autorizado;
	}

	public void setImporte_autorizado(Float importe_autorizado) {
		this.importe_autorizado = importe_autorizado;
	}

	public Float getImporte_bajas() {
		return importe_bajas;
	}

	public void setImporte_bajas(Float importe_bajas) {
		this.importe_bajas = importe_bajas;
	}

	public Float getImporte_facturado() {
		return importe_facturado;
	}

	public void setImporte_facturado(Float importe_facturado) {
		this.importe_facturado = importe_facturado;
	}

	public Float getImporte_descuento() {
		return importe_descuento;
	}

	public void setImporte_descuento(Float importe_descuento) {
		this.importe_descuento = importe_descuento;
	}

	public Float getImporte_pedido() {
		return importe_pedido;
	}

	public void setImporte_pedido(Float importe_pedido) {
		this.importe_pedido = importe_pedido;
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

	public String getGiro() {
		return giro;
	}

	public void setGiro(String giro) {
		this.giro = giro;
	}

	public int getMarcas_equipos_id() {
		return marcas_equipos_id;
	}

	public void setMarcas_equipos_id(int marcas_equipos_id) {
		this.marcas_equipos_id = marcas_equipos_id;
	}

	public String getMarca_equipo() {
		return marca_equipo;
	}

	public void setMarca_equipo(String marca_equipo) {
		this.marca_equipo = marca_equipo;
	}

	public int getModelos_equipos_id() {
		return modelos_equipos_id;
	}

	public void setModelos_equipos_id(int modelos_equipos_id) {
		this.modelos_equipos_id = modelos_equipos_id;
	}

	public String getModelo_equipo() {
		return modelo_equipo;
	}

	public void setModelo_equipo(String modelo_equipo) {
		this.modelo_equipo = modelo_equipo;
	}

	public String getAlfresco_id_OIT() {
		return alfresco_id_OIT;
	}

	public void setAlfresco_id_OIT(String alfresco_id_OIT) {
		this.alfresco_id_OIT = alfresco_id_OIT;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getCliente_factura_id() {
		return cliente_factura_id;
	}

	public void setCliente_factura_id(int cliente_factura_id) {
		this.cliente_factura_id = cliente_factura_id;
	}

	
	
	
}
