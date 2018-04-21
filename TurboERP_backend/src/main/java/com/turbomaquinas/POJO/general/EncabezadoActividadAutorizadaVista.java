package com.turbomaquinas.POJO.general;

public class EncabezadoActividadAutorizadaVista {
	private int id;
	private String descripcion;
	private int lugar;
	private int activo;
	private int ordenes_id;
	private int numero;
	private int anio;
	private String orden_descripcion;
	private int encabezados_diagnostico_id;
	
	public EncabezadoActividadAutorizadaVista() {
		super();
	}

	public EncabezadoActividadAutorizadaVista(int id, String descripcion, int lugar, int activo, int ordenes_id,
			int numero, int anio, String orden_descripcion, int encabezados_diagnostico_id) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.lugar = lugar;
		this.activo = activo;
		this.ordenes_id = ordenes_id;
		this.numero = numero;
		this.anio = anio;
		this.orden_descripcion = orden_descripcion;
		this.encabezados_diagnostico_id = encabezados_diagnostico_id;
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

	public int getLugar() {
		return lugar;
	}

	public void setLugar(int lugar) {
		this.lugar = lugar;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public int getOrdenes_id() {
		return ordenes_id;
	}

	public void setOrdenes_id(int ordenes_id) {
		this.ordenes_id = ordenes_id;
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

	public String getOrden_descripcion() {
		return orden_descripcion;
	}

	public void setOrden_descripcion(String orden_descripcion) {
		this.orden_descripcion = orden_descripcion;
	}
	
	public int getEncabezados_diagnostico_id() {
		return encabezados_diagnostico_id;
	}

	public void setEncabezados_diagnostico_id(int encabezados_diagnostico_id) {
		this.encabezados_diagnostico_id = encabezados_diagnostico_id;
	}

	@Override
	public String toString() {
		return "EncabezadoActividadAutorizadaVista [id=" + id + ", descripcion=" + descripcion + ", lugar=" + lugar
				+ ", activo=" + activo + ", ordenes_id=" + ordenes_id + ", numero=" + numero + ", anio=" + anio
				+ ", orden_descripcion=" + orden_descripcion + "]";
	}
}
