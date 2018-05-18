package com.turbomaquinas.POJO.comercial;


public class ConceptosNotasCreditoVista {
	
	public int id;
	public String descripcion;
	public int activo;
	public int creado_por;
	public int modificado_por;
	public int catalogo_cuentas_id_nac;
	public int catalogo_cuentas_id_ext;
	public int aplica_iva;
	public String cuenta_nac;
	public String nombre_cuenta_nac;
	public String id_sat_nac;
	public String cuenta_ext;
	public String nombre_cuenta_ext;
	public String id_sat_ext;
	
	public ConceptosNotasCreditoVista() {
		super();
	}

	public ConceptosNotasCreditoVista(int id, String descripcion, int activo, int creado_por, int modificado_por,
			int catalogo_cuentas_id_nac, int catalogo_cuentas_id_ext, int aplica_iva, String cuenta_nac,
			String nombre_cuenta_nac, String id_sat_nac, String cuenta_ext, String nombre_cuenta_ext,
			String id_sat_ext) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.activo = activo;
		this.creado_por = creado_por;
		this.modificado_por = modificado_por;
		this.catalogo_cuentas_id_nac = catalogo_cuentas_id_nac;
		this.catalogo_cuentas_id_ext = catalogo_cuentas_id_ext;
		this.aplica_iva = aplica_iva;
		this.cuenta_nac = cuenta_nac;
		this.nombre_cuenta_nac = nombre_cuenta_nac;
		this.id_sat_nac = id_sat_nac;
		this.cuenta_ext = cuenta_ext;
		this.nombre_cuenta_ext = nombre_cuenta_ext;
		this.id_sat_ext = id_sat_ext;
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

	public int getCatalogo_cuentas_id_nac() {
		return catalogo_cuentas_id_nac;
	}

	public void setCatalogo_cuentas_id_nac(int catalogo_cuentas_id_nac) {
		this.catalogo_cuentas_id_nac = catalogo_cuentas_id_nac;
	}

	public int getCatalogo_cuentas_id_ext() {
		return catalogo_cuentas_id_ext;
	}

	public void setCatalogo_cuentas_id_ext(int catalogo_cuentas_id_ext) {
		this.catalogo_cuentas_id_ext = catalogo_cuentas_id_ext;
	}

	public int getAplica_iva() {
		return aplica_iva;
	}

	public void setAplica_iva(int aplica_iva) {
		this.aplica_iva = aplica_iva;
	}

	public String getCuenta_nac() {
		return cuenta_nac;
	}

	public void setCuenta_nac(String cuenta_nac) {
		this.cuenta_nac = cuenta_nac;
	}

	public String getNombre_cuenta_nac() {
		return nombre_cuenta_nac;
	}

	public void setNombre_cuenta_nac(String nombre_cuenta_nac) {
		this.nombre_cuenta_nac = nombre_cuenta_nac;
	}

	public String getId_sat_nac() {
		return id_sat_nac;
	}

	public void setId_sat_nac(String id_sat_nac) {
		this.id_sat_nac = id_sat_nac;
	}

	public String getCuenta_ext() {
		return cuenta_ext;
	}

	public void setCuenta_ext(String cuenta_ext) {
		this.cuenta_ext = cuenta_ext;
	}

	public String getNombre_cuenta_ext() {
		return nombre_cuenta_ext;
	}

	public void setNombre_cuenta_ext(String nombre_cuenta_ext) {
		this.nombre_cuenta_ext = nombre_cuenta_ext;
	}

	public String getId_sat_ext() {
		return id_sat_ext;
	}

	public void setId_sat_ext(String id_sat_ext) {
		this.id_sat_ext = id_sat_ext;
	}
	

}
