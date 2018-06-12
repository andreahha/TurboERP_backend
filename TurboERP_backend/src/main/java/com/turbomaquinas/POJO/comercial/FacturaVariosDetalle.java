package com.turbomaquinas.POJO.comercial;

import java.math.BigDecimal;
import java.util.Date;

public class FacturaVariosDetalle {
	private int id;
	private String descripcion;
	private int cantidad;
	private BigDecimal precio_unitario;
	private BigDecimal importe;
	private float cuota_iva;
	private BigDecimal iva;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int conceptos_facturacion_id;
	private int factura_varios_id;
	
	public FacturaVariosDetalle() {
		super();
	}

	public FacturaVariosDetalle(int id, String descripcion, int cantidad, BigDecimal precio_unitario,
			BigDecimal importe, float cuota_iva, BigDecimal iva, int activo, int creado_por, Date creado,
			int modificado_por, Date modificado, int conceptos_facturacion_id, int factura_varios_id) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio_unitario = precio_unitario;
		this.importe = importe;
		this.cuota_iva = cuota_iva;
		this.iva = iva;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.conceptos_facturacion_id = conceptos_facturacion_id;
		this.factura_varios_id = factura_varios_id;
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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(BigDecimal precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public float getCuota_iva() {
		return cuota_iva;
	}

	public void setCuota_iva(float cuota_iva) {
		this.cuota_iva = cuota_iva;
	}

	public BigDecimal getIva() {
		return iva;
	}

	public void setIva(BigDecimal iva) {
		this.iva = iva;
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

	public int getConceptos_facturacion_id() {
		return conceptos_facturacion_id;
	}

	public void setConceptos_facturacion_id(int conceptos_facturacion_id) {
		this.conceptos_facturacion_id = conceptos_facturacion_id;
	}

	public int getFactura_varios_id() {
		return factura_varios_id;
	}

	public void setFactura_varios_id(int factura_varios_id) {
		this.factura_varios_id = factura_varios_id;
	}

}
