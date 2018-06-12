package com.turbomaquinas.POJO.comercial;

import java.math.BigDecimal;

public class FacturaVariosDetalleVista {
	private int id;
	private int cantidad;
	private String descripcion;
	private BigDecimal precio_unitario;
	private BigDecimal importe;
	private float cuota_iva;
	private BigDecimal iva;
	private int conceptos_facturacion_id;
	private int activo;
	private String cve_producto;
	private String des_producto;
	private String cve_medida;
	private String des_medida;
	private int factura_varios_id;
	
	public FacturaVariosDetalleVista() {
		super();
	}

	public FacturaVariosDetalleVista(int id, int cantidad, String descripcion, BigDecimal precio_unitario,
			BigDecimal importe, float cuota_iva, BigDecimal iva, int conceptos_facturacion_id, int activo,
			String cve_producto, String des_producto, String cve_medida, String des_medida, int factura_varios_id) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.descripcion = descripcion;
		this.precio_unitario = precio_unitario;
		this.importe = importe;
		this.cuota_iva = cuota_iva;
		this.iva = iva;
		this.conceptos_facturacion_id = conceptos_facturacion_id;
		this.activo = activo;
		this.cve_producto = cve_producto;
		this.des_producto = des_producto;
		this.cve_medida = cve_medida;
		this.des_medida = des_medida;
		this.factura_varios_id = factura_varios_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public int getConceptos_facturacion_id() {
		return conceptos_facturacion_id;
	}

	public void setConceptos_facturacion_id(int conceptos_facturacion_id) {
		this.conceptos_facturacion_id = conceptos_facturacion_id;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public String getCve_producto() {
		return cve_producto;
	}

	public void setCve_producto(String cve_producto) {
		this.cve_producto = cve_producto;
	}

	public String getDes_producto() {
		return des_producto;
	}

	public void setDes_producto(String des_producto) {
		this.des_producto = des_producto;
	}

	public String getCve_medida() {
		return cve_medida;
	}

	public void setCve_medida(String cve_medida) {
		this.cve_medida = cve_medida;
	}

	public String getDes_medida() {
		return des_medida;
	}

	public void setDes_medida(String des_medida) {
		this.des_medida = des_medida;
	}

	public int getFactura_varios_id() {
		return factura_varios_id;
	}

	public void setFactura_varios_id(int factura_varios_id) {
		this.factura_varios_id = factura_varios_id;
	}

}
