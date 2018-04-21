package com.turbomaquinas.POJO.general;

public class OT {
	private int id;
	private String descripcion;
	private int clientes_id;
	private String moneda;
	private float importe_autorizado;
	private float importe_pedido;
	private String numero_orden;
	private int cliente_no;
	private String nombre_fiscal;
	private String nombre_comercial;
	private String giro;
	
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
	public int getClientes_id() {
		return clientes_id;
	}
	public void setClientes_id(int clientes_id) {
		this.clientes_id = clientes_id;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public float getImporte_autorizado() {
		return importe_autorizado;
	}
	public void setImporte_autorizado(float importe_autorizado) {
		this.importe_autorizado = importe_autorizado;
	}
	public float getImporte_pedido() {
		return importe_pedido;
	}
	public void setImporte_pedido(float importe_pedido) {
		this.importe_pedido = importe_pedido;
	}
	public String getNumero_orden() {
		return numero_orden;
	}
	public void setNumero_orden(String numero_orden) {
		this.numero_orden = numero_orden;
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
	
}
