package com.turbomaquinas.POJO.comercial;

public class ConceptosFacturacionVista {
	
	public int id;
	public String descripcion;
	public int activo;
	public int creado_por;
	public int modificado_por;
	public int productos_sat_id;
	public int medidas_sat_id;
	public String ps_clave;
	public String ps_descripcion;
	public String ms_clave;
	public String ms_descripcion;

	public ConceptosFacturacionVista() {
		super();
	}

	public ConceptosFacturacionVista(int id, String descripcion, int activo, int creado_por, int modificado_por,
			int productos_sat_id, int medidas_sat_id, String ps_clave, String ps_descripcion, String ms_clave,
			String ms_descripcion) {
		this.id = id;
		this.descripcion = descripcion;
		this.activo = activo;
		this.creado_por = creado_por;
		this.modificado_por = modificado_por;
		this.productos_sat_id = productos_sat_id;
		this.medidas_sat_id = medidas_sat_id;
		this.ps_clave = ps_clave;
		this.ps_descripcion = ps_descripcion;
		this.ms_clave = ms_clave;
		this.ms_descripcion = ms_descripcion;
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

	public int getModificado_por() {
		return modificado_por;
	}

	public void setModificado_por(int modificado_por) {
		this.modificado_por = modificado_por;
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

	public String getPs_clave() {
		return ps_clave;
	}

	public void setPs_clave(String ps_clave) {
		this.ps_clave = ps_clave;
	}

	public String getPs_descripcion() {
		return ps_descripcion;
	}

	public void setPs_descripcion(String ps_descripcion) {
		this.ps_descripcion = ps_descripcion;
	}

	public String getMs_clave() {
		return ms_clave;
	}

	public void setMs_clave(String ms_clave) {
		this.ms_clave = ms_clave;
	}

	public String getMs_descripcion() {
		return ms_descripcion;
	}

	public void setMs_descripcion(String ms_descripcion) {
		this.ms_descripcion = ms_descripcion;
	}
	
}
