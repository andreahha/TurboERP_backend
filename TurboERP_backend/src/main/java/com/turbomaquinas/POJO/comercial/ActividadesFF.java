package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class ActividadesFF {
	
	public int id;
	public String descripcion;
	public float subtotal;
	public float descuento;
	public int activo;
	public int creado_por;
	public Date creado;
	public int modificado_por;
	public Date modificado;
	public int factura_final_id;
	public int productos_sat_id;
	public int medidas_sat_id;
	public int conceptos_facturacion_id;
	public String tipo_actividad;
	
	public ActividadesFF() {
		super();
	}

	public ActividadesFF(int id, String descripcion, float subtotal, float descuento, int activo, int creado_por,
			Date creado, int modificado_por, Date modificado, int factura_final_id, int productos_sat_id,
			int medidas_sat_id, int conceptos_facturacion_id, String tipo_actividad) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.subtotal = subtotal;
		this.descuento = descuento;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.factura_final_id = factura_final_id;
		this.productos_sat_id = productos_sat_id;
		this.medidas_sat_id = medidas_sat_id;
		this.conceptos_facturacion_id = conceptos_facturacion_id;
		this.tipo_actividad = tipo_actividad;
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

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
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

	public int getProductos_sat_id() {
		return productos_sat_id;
	}

	public void setProductos_sat_id(int productos_sat_id) {
		this.productos_sat_id = productos_sat_id;
	}

	public int getMedidas_sat_id() {
		return medidas_sat_id;
	}

	public void setMedidas_sat_id(int medidas_sat_id) {
		this.medidas_sat_id = medidas_sat_id;
	}

	public int getConceptos_facturacion_id() {
		return conceptos_facturacion_id;
	}

	public void setConceptos_facturacion_id(int conceptos_facturacion_id) {
		this.conceptos_facturacion_id = conceptos_facturacion_id;
	}

	public String getTipo_actividad() {
		return tipo_actividad;
	}

	public void setTipo_actividad(String tipo_actividad) {
		this.tipo_actividad = tipo_actividad;
	}
	
	
}
