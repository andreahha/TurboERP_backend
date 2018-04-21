package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class ConceptosFacturacion {
	
	public int id;
	public String descripcion;
	public int activo;
	public int creado_por;
	public Date creado;
	public int modificado_por;
	public Date modificado;
	public int productos_sat_id;
	public int medidas_sat_id;
	
	public ConceptosFacturacion() {
		super();
	}

	public ConceptosFacturacion(int id, String descripcion, int activo, int creado_por, Date creado, int modificado_por,
			Date modificado, int productos_sat_id, int medidas_sat_id) {
		this.id = id;
		this.descripcion = descripcion;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.productos_sat_id = productos_sat_id;
		this.medidas_sat_id = medidas_sat_id;
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

	public int getMedidas_sat_id() {
		return medidas_sat_id;
	}

	public void setMedidas_sat_id(int medidas_sat_id) {
		this.medidas_sat_id = medidas_sat_id;
	}
	
}
