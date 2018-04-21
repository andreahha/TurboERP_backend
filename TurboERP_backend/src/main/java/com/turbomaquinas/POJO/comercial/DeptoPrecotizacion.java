package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class DeptoPrecotizacion {
	private int id;
	private Date fecha_registro;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int detalle_precotizaciones_id;
	private int departamentos_id;
	
	public DeptoPrecotizacion() {
		super();
	}

	public DeptoPrecotizacion(int id, Date fecha_registro, int activo, int creado_por, Date creado, int modificado_por,
			Date modificado, int detalle_precotizaciones_id, int departamentos_id) {
		super();
		this.id = id;
		this.fecha_registro = fecha_registro;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.detalle_precotizaciones_id = detalle_precotizaciones_id;
		this.departamentos_id = departamentos_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
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

	public int getDetalle_precotizaciones_id() {
		return detalle_precotizaciones_id;
	}

	public void setDetalle_precotizaciones_id(int detalle_precotizaciones_id) {
		this.detalle_precotizaciones_id = detalle_precotizaciones_id;
	}

	public int getDepartamentos_id() {
		return departamentos_id;
	}

	public void setDepartamentos_id(int departamentos_id) {
		this.departamentos_id = departamentos_id;
	}
}
