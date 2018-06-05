package com.turbomaquinas.POJO.comercial;

import java.math.BigDecimal;
import java.util.Date;

public class ActividadesFF {
	
	public int id;
	public String descripcion;
	public BigDecimal importe;
	public BigDecimal descuento;
	public float cuota_iva;
	public float cuota_iva_retenido;
	public String tipo_actividad;
	public int activo;
	public int creado_por;
	public Date creado;
	public int modificado_por;
	public Date modificado;
	public int factura_final_id;
	public int conceptos_facturacion_id;
	public BigDecimal iva;
	public BigDecimal iva_retenido;
	
	public ActividadesFF() {
		super();
	}

	public ActividadesFF(int id, String descripcion, BigDecimal importe, BigDecimal descuento, float cuota_iva,
			float cuota_iva_retenido, String tipo_actividad, int activo, int creado_por, Date creado,
			int modificado_por, Date modificado, int factura_final_id, int conceptos_facturacion_id, BigDecimal iva,
			BigDecimal iva_retenido) {
		super();
		this.id = id;
		this.descripcion = descripcion;
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
