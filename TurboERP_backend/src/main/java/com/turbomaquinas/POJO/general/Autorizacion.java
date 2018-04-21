package com.turbomaquinas.POJO.general;

import java.util.Date;

public class Autorizacion {
	private int id;
	private Date fecha;
	private int anio;
	private int numero;
	private String folio;
	private Float importe_pedido;
	private Float importe_irregular;
	private Float importe_total;
	private int ordenes_id;
	
	public Autorizacion() {
		super();
	}

	public Autorizacion(int id, Date fecha, Float importe_pedido, Float importe_irregular, Float importe_total,
			int ordenes_id) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.importe_pedido = importe_pedido;
		this.importe_irregular = importe_irregular;
		this.importe_total = importe_total;
		this.ordenes_id = ordenes_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Float getImporte_pedido() {
		return importe_pedido;
	}

	public void setImporte_pedido(Float importe_pedido) {
		this.importe_pedido = importe_pedido;
	}

	public Float getImporte_irregular() {
		return importe_irregular;
	}

	public void setImporte_irregular(Float importe_irregular) {
		this.importe_irregular = importe_irregular;
	}

	public Float getImporte_total() {
		return importe_total;
	}

	public void setImporte_total(Float importe_total) {
		this.importe_total = importe_total;
	}

	public int getOrdenes_id() {
		return ordenes_id;
	}

	public void setOrdenes_id(int ordenes_id) {
		this.ordenes_id = ordenes_id;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}
	
}
