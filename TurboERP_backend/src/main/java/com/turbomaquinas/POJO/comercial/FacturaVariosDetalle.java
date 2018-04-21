package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class FacturaVariosDetalle {
	private int id;
	private String descripcion;
	private Float importe;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int productos_sat_id;
	private int factura_varios_id;
	
	public FacturaVariosDetalle() {
		super();
	}

	public FacturaVariosDetalle(int id, String descripcion, Float importe, int activo, int creado_por, Date creado,
			int modificado_por, Date modificado, int productos_sat_id, int factura_varios_id) {
		this.id = id;
		this.descripcion = descripcion;
		this.importe = importe;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.productos_sat_id = productos_sat_id;
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

	public Float getImporte() {
		return importe;
	}

	public void setImporte(Float importe) {
		this.importe = importe;
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

	public int getProductos_sat_id() {
		return productos_sat_id;
	}

	public void setProductos_sat_id(int productos_sat_id) {
		this.productos_sat_id = productos_sat_id;
	}

	public int getFactura_varios_id() {
		return factura_varios_id;
	}

	public void setFactura_varios_id(int factura_varios_id) {
		this.factura_varios_id = factura_varios_id;
	}

}
