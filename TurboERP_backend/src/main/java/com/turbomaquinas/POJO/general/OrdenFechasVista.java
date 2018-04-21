package com.turbomaquinas.POJO.general;

import java.util.Date;

public class OrdenFechasVista {
	
	private int ordenes_id;
	private String numero_orden;
	private int clientes_id;
	private Float importe_pendiente;
	private Date fecha_ingreso;
	private Date fecha_autorizacion;
	private Date fecha_terminacion;
	private Date fecha_embarque;
	
	public OrdenFechasVista() {
		super();
	}

	public OrdenFechasVista(int ordenes_id, String numero_orden, int clientes_id, Float importe_pendiente,
			Date fecha_ingreso, Date fecha_autorizacion, Date fecha_terminacion, Date fecha_embarque) {
		super();
		this.ordenes_id = ordenes_id;
		this.numero_orden = numero_orden;
		this.clientes_id = clientes_id;
		this.importe_pendiente = importe_pendiente;
		this.fecha_ingreso = fecha_ingreso;
		this.fecha_autorizacion = fecha_autorizacion;
		this.fecha_terminacion = fecha_terminacion;
		this.fecha_embarque = fecha_embarque;
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

	public int getClientes_id() {
		return clientes_id;
	}

	public void setClientes_id(int clientes_id) {
		this.clientes_id = clientes_id;
	}

	public Float getImporte_pendiente() {
		return importe_pendiente;
	}

	public void setImporte_pendiente(Float importe_pendiente) {
		this.importe_pendiente = importe_pendiente;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public Date getFecha_autorizacion() {
		return fecha_autorizacion;
	}

	public void setFecha_autorizacion(Date fecha_autorizacion) {
		this.fecha_autorizacion = fecha_autorizacion;
	}

	public Date getFecha_terminacion() {
		return fecha_terminacion;
	}

	public void setFecha_terminacion(Date fecha_terminacion) {
		this.fecha_terminacion = fecha_terminacion;
	}

	public Date getFecha_embarque() {
		return fecha_embarque;
	}

	public void setFecha_embarque(Date fecha_embarque) {
		this.fecha_embarque = fecha_embarque;
	}

	@Override
	public String toString() {
		return "OrdenFechasVista [ordenes_id=" + ordenes_id + ", numero_orden=" + numero_orden + ", clientes_id="
				+ clientes_id + ", importe_pendiente=" + importe_pendiente + ", fecha_ingreso=" + fecha_ingreso
				+ ", fecha_autorizacion=" + fecha_autorizacion + ", fecha_terminacion=" + fecha_terminacion
				+ ", fecha_embarque=" + fecha_embarque + "]";
	}
	
	

}
