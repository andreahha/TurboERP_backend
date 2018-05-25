package com.turbomaquinas.POJO.comercial;

import java.math.BigDecimal;
import java.util.Date;

public class ActividadesFFVista {
	private int id;
	private String descripcion;
	private int cantidad;
	private BigDecimal precio_unitario;
	private BigDecimal importe;
	private BigDecimal descuento;
	private float cuota_iva;
	private float cuota_iva_retenido;
	private String tipo_actividad;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int factura_final_id;
	private int conceptos_facturacion_id;
	private String um_sat;
	private String codigo_sat;
	private BigDecimal iva;
	private BigDecimal iva_retenido;
	
	public ActividadesFFVista() {
		super();
	}

	public ActividadesFFVista(int id, String descripcion, int cantidad, BigDecimal precio_unitario, BigDecimal importe,
			BigDecimal descuento, float cuota_iva, float cuota_iva_retenido, String tipo_actividad, int activo,
			int creado_por, Date creado, int modificado_por, Date modificado, int factura_final_id,
			int conceptos_facturacion_id, String um_sat, String codigo_sat, BigDecimal iva, BigDecimal iva_retenido) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio_unitario = precio_unitario;
		this.importe = importe;
		this.descuento = descuento;
		this.cuota_iva = cuota_iva;
		this.cuota_iva_retenido = cuota_iva_retenido;
		this.tipo_actividad = tipo_actividad;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.factura_final_id = factura_final_id;
		this.conceptos_facturacion_id = conceptos_facturacion_id;
		this.um_sat = um_sat;
		this.codigo_sat = codigo_sat;
		this.iva = iva;
		this.iva_retenido = iva_retenido;
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

	public BigDecimal getDescuento() {
		return descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

	public float getCuota_iva() {
		return cuota_iva;
	}

	public void setCuota_iva(float cuota_iva) {
		this.cuota_iva = cuota_iva;
	}

	public float getCuota_iva_retenido() {
		return cuota_iva_retenido;
	}

	public void setCuota_iva_retenido(float cuota_iva_retenido) {
		this.cuota_iva_retenido = cuota_iva_retenido;
	}

	public String getTipo_actividad() {
		return tipo_actividad;
	}

	public void setTipo_actividad(String tipo_actividad) {
		this.tipo_actividad = tipo_actividad;
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

	public int getFactura_final_id() {
		return factura_final_id;
	}

	public void setFactura_final_id(int factura_final_id) {
		this.factura_final_id = factura_final_id;
	}

	public int getConceptos_facturacion_id() {
		return conceptos_facturacion_id;
	}

	public void setConceptos_facturacion_id(int conceptos_facturacion_id) {
		this.conceptos_facturacion_id = conceptos_facturacion_id;
	}

	public String getUm_sat() {
		return um_sat;
	}

	public void setUm_sat(String um_sat) {
		this.um_sat = um_sat;
	}

	public String getCodigo_sat() {
		return codigo_sat;
	}

	public void setCodigo_sat(String codigo_sat) {
		this.codigo_sat = codigo_sat;
	}

	public BigDecimal getIva() {
		return iva;
	}

	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}

	public BigDecimal getIva_retenido() {
		return iva_retenido;
	}

	public void setIva_retenido(BigDecimal iva_retenido) {
		this.iva_retenido = iva_retenido;
	}
	
	
}
