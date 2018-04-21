package com.turbomaquinas.POJO.general;

import java.util.Date;

public class RelacionAA {
	private int id;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int actividades_autorizadas_id;
	private int detalle_cotizaciones_id;
	private int detalle_diagnostico_id;
	
	public RelacionAA() {
		super();
	}

	public RelacionAA(int id, int activo, int creado_por, Date creado, int modificado_por,
			Date modificado, int actividades_autorizadas_id, int detalle_cotizaciones_id, int detalle_diagnostico_id) {
		super();
		this.id = id;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.actividades_autorizadas_id = actividades_autorizadas_id;
		this.detalle_cotizaciones_id = detalle_cotizaciones_id;
		this.detalle_diagnostico_id = detalle_diagnostico_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getActividades_autorizadas_id() {
		return actividades_autorizadas_id;
	}

	public void setActividades_autorizadas_id(int actividades_autorizadas_id) {
		this.actividades_autorizadas_id = actividades_autorizadas_id;
	}

	public int getDetalle_cotizaciones_id() {
		return detalle_cotizaciones_id;
	}

	public void setDetalle_cotizaciones_id(int detalle_cotizaciones_id) {
		this.detalle_cotizaciones_id = detalle_cotizaciones_id;
	}

	public int getDetalle_diagnostico_id() {
		return detalle_diagnostico_id;
	}

	public void setDetalle_diagnostico_id(int detalle_diagnostico_id) {
		this.detalle_diagnostico_id = detalle_diagnostico_id;
	}

	@Override
	public String toString() {
		return "RelacionAA [id=" + id + ", activo=" + activo + ", creado_por=" + creado_por + ", creado=" + creado
				+ ", modificado_por=" + modificado_por + ", modificado=" + modificado + ", actividades_autorizadas_id="
				+ actividades_autorizadas_id + ", detalle_cotizaciones_id=" + detalle_cotizaciones_id
				+ ", detalle_diagnostico_id=" + detalle_diagnostico_id + "]";
	}
	
	
}
