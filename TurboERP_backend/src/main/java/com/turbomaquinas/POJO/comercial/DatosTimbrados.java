package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class DatosTimbrados {
	
	private int id;
	private String folio_fiscal;
	private String fecha;
	private String cadena_original;
	private String sello_emisor;
	private String sello_sat;
	private String leyenda;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	
	public DatosTimbrados() {
		super();
	}

	public DatosTimbrados(int id, String folio_fiscal, String fecha, String cadena_original, String sello_emisor,
			String sello_sat, String leyenda, int activo, int creado_por, Date creado, int modificado_por,
			Date modificado) {
		this.id = id;
		this.folio_fiscal = folio_fiscal;
		this.fecha = fecha;
		this.cadena_original = cadena_original;
		this.sello_emisor = sello_emisor;
		this.sello_sat = sello_sat;
		this.leyenda = leyenda;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFolio_fiscal() {
		return folio_fiscal;
	}

	public void setFolio_fiscal(String folio_fiscal) {
		this.folio_fiscal = folio_fiscal;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCadena_original() {
		return cadena_original;
	}

	public void setCadena_original(String cadena_original) {
		this.cadena_original = cadena_original;
	}

	public String getSello_emisor() {
		return sello_emisor;
	}

	public void setSello_emisor(String sello_emisor) {
		this.sello_emisor = sello_emisor;
	}

	public String getSello_sat() {
		return sello_sat;
	}

	public void setSello_sat(String sello_sat) {
		this.sello_sat = sello_sat;
	}

	public String getLeyenda() {
		return leyenda;
	}

	public void setLeyenda(String leyenda) {
		this.leyenda = leyenda;
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
}
