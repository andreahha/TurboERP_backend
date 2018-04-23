package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class ConceptosNotasCredito {

	public int id;
	public String descripcion;
	public int activo;
	public int creado_por;
	public Date creado;
	public int modificado_por;
	public Date modificado;
	public int catalogo_cuentas_id_nac;
	public int catalogo_cuentas_id_ext;
	public int aplica_iva;

	public ConceptosNotasCredito() {
		super();
	}

	public ConceptosNotasCredito(int id, String descripcion, int activo, int creado_por, Date creado,
			int modificado_por, Date modificado, int catalogo_cuentas_id_nac, int catalogo_cuentas_id_ext,
			int aplica_iva) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.catalogo_cuentas_id_nac = catalogo_cuentas_id_nac;
		this.catalogo_cuentas_id_ext = catalogo_cuentas_id_ext;
		this.aplica_iva = aplica_iva;
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

}
