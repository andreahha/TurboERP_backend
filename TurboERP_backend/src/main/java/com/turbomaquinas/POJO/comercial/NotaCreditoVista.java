package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class NotaCreditoVista {
	
	private int id;
	private String tipo;
	private int numero;
	private Date fecha;
	private Float subtotal;
	private Float iva;
	private Float tipo_cambio;
	private Date fecha_baja;
	private int mes_baja;
	private int anio_baja;
	private String descripcion;
	private int activo;
	private int factura_varios_id;
	private String num_factura_varios;
	private int datos_timbrado_id;
	private String uuid;
	private int factura_final_id;
	private String num_factura_final;
	private int facturas_anticipo_id;
	private String num_factura_anticipo;
	private int conceptos_notas_credito_id;
	private String concepto;
	private int notas_credito_id_sust;

	public NotaCreditoVista() {
		super();
	}

	public NotaCreditoVista(int id, String tipo, int numero, Date fecha, Float subtotal, Float iva, Float tipo_cambio,
			Date fecha_baja, int mes_baja, int anio_baja, String descripcion, int activo, int factura_varios_id,
			String num_factura_varios, int datos_timbrado_id, String uuid, int factura_final_id,
			String num_factura_final, int facturas_anticipo_id, String num_factura_anticipo,
			int conceptos_notas_credito_id, String concepto, int notas_credito_id_sust) {
		this.id = id;
		this.tipo = tipo;
		this.numero = numero;
		this.fecha = fecha;
		this.subtotal = subtotal;
		this.iva = iva;
		this.tipo_cambio = tipo_cambio;
		this.fecha_baja = fecha_baja;
		this.mes_baja = mes_baja;
		this.anio_baja = anio_baja;
		this.descripcion = descripcion;
		this.activo = activo;
		this.factura_varios_id = factura_varios_id;
		this.num_factura_varios = num_factura_varios;
		this.datos_timbrado_id = datos_timbrado_id;
		this.uuid = uuid;
		this.factura_final_id = factura_final_id;
		this.num_factura_final = num_factura_final;
		this.facturas_anticipo_id = facturas_anticipo_id;
		this.num_factura_anticipo = num_factura_anticipo;
		this.conceptos_notas_credito_id = conceptos_notas_credito_id;
		this.concepto = concepto;
		this.notas_credito_id_sust = notas_credito_id_sust;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}

	public Float getIva() {
		return iva;
	}

	public void setIva(Float iva) {
		this.iva = iva;
	}

	public Float getTipo_cambio() {
		return tipo_cambio;
	}

	public void setTipo_cambio(Float tipo_cambio) {
		this.tipo_cambio = tipo_cambio;
	}

	public Date getFecha_baja() {
		return fecha_baja;
	}

	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}

	public int getMes_baja() {
		return mes_baja;
	}

	public void setMes_baja(int mes_baja) {
		this.mes_baja = mes_baja;
	}

	public int getAnio_baja() {
		return anio_baja;
	}

	public void setAnio_baja(int anio_baja) {
		this.anio_baja = anio_baja;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public int getFactura_varios_id() {
		return factura_varios_id;
	}

	public void setFactura_varios_id(int factura_varios_id) {
		this.factura_varios_id = factura_varios_id;
	}

	public String getNum_factura_varios() {
		return num_factura_varios;
	}

	public void setNum_factura_varios(String num_factura_varios) {
		this.num_factura_varios = num_factura_varios;
	}

	public int getDatos_timbrado_id() {
		return datos_timbrado_id;
	}

	public void setDatos_timbrado_id(int datos_timbrado_id) {
		this.datos_timbrado_id = datos_timbrado_id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public int getFactura_final_id() {
		return factura_final_id;
	}

	public void setFactura_final_id(int factura_final_id) {
		this.factura_final_id = factura_final_id;
	}

	public String getNum_factura_final() {
		return num_factura_final;
	}

	public void setNum_factura_final(String num_factura_final) {
		this.num_factura_final = num_factura_final;
	}

	public int getFacturas_anticipo_id() {
		return facturas_anticipo_id;
	}

	public void setFacturas_anticipo_id(int facturas_anticipo_id) {
		this.facturas_anticipo_id = facturas_anticipo_id;
	}

	public String getNum_factura_anticipo() {
		return num_factura_anticipo;
	}

	public void setNum_factura_anticipo(String num_factura_anticipo) {
		this.num_factura_anticipo = num_factura_anticipo;
	}

	public int getConceptos_notas_credito_id() {
		return conceptos_notas_credito_id;
	}

	public void setConceptos_notas_credito_id(int conceptos_notas_credito_id) {
		this.conceptos_notas_credito_id = conceptos_notas_credito_id;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public int getNotas_credito_id_sust() {
		return notas_credito_id_sust;
	}

	public void setNotas_credito_id_sust(int notas_credito_id_sust) {
		this.notas_credito_id_sust = notas_credito_id_sust;
	}

}
