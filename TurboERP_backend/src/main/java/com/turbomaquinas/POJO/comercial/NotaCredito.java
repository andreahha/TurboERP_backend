package com.turbomaquinas.POJO.comercial;

import java.util.Date;
import java.util.List;

public class NotaCredito {
	
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
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int datos_timbrado_id;
	private int conceptos_facturacion_contable_id;
	private int notas_credito_id_sust;
	private List<DocumentoAplicarNotasCredito.Facturas> facturas;
	private Float importe_total;
	
	public NotaCredito() {
		super();
	}

	public NotaCredito(int id, String tipo, int numero, Date fecha, Float subtotal, Float iva, Float tipo_cambio,
			Date fecha_baja, int mes_baja, int anio_baja, String descripcion, int activo, int creado_por, Date creado,
			int modificado_por, Date modificado, int datos_timbrado_id, int conceptos_facturacion_contable_id,
			int notas_credito_id_sust, List<DocumentoAplicarNotasCredito.Facturas> facturas, Float importe_total) {
		super();
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
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.datos_timbrado_id = datos_timbrado_id;
		this.conceptos_facturacion_contable_id = conceptos_facturacion_contable_id;
		this.notas_credito_id_sust = notas_credito_id_sust;
		this.facturas = facturas;
		this.importe_total = importe_total;
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

	public int getDatos_timbrado_id() {
		return datos_timbrado_id;
	}

	public void setDatos_timbrado_id(int datos_timbrado_id) {
		this.datos_timbrado_id = datos_timbrado_id;
	}

	public int getConceptos_facturacion_contable_id() {
		return conceptos_facturacion_contable_id;
	}

	public void setConceptos_facturacion_contable_id(int conceptos_facturacion_contable_id) {
		this.conceptos_facturacion_contable_id = conceptos_facturacion_contable_id;
	}

	public int getNotas_credito_id_sust() {
		return notas_credito_id_sust;
	}

	public void setNotas_credito_id_sust(int notas_credito_id_sust) {
		this.notas_credito_id_sust = notas_credito_id_sust;
	}

	public List<DocumentoAplicarNotasCredito.Facturas> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<DocumentoAplicarNotasCredito.Facturas> facturas) {
		this.facturas = facturas;
	}

	public Float getImporte_total() {
		return importe_total;
	}

	public void setImporte_total(Float importe_total) {
		this.importe_total = importe_total;
	}

	@Override
	public String toString() {
		try {
	        return new com.fasterxml.jackson.databind.ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(this);
	    } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
}
