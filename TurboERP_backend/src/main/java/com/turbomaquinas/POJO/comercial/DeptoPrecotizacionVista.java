package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class DeptoPrecotizacionVista {
	private int id;
	private Date fechaRegistro;
	private int detalle_precotizaciones_id;
	private String detalle_precotizacion;
	private int departamentos_id;
	private String departamento;
	
	public DeptoPrecotizacionVista() {
		super();
	}

	public DeptoPrecotizacionVista(int id, Date fechaRegistro, int detalle_precotizaciones_id,
			String detalle_precotizacion, int departamentos_id, String departamento) {
		super();
		this.id = id;
		this.fechaRegistro = fechaRegistro;
		this.detalle_precotizaciones_id = detalle_precotizaciones_id;
		this.detalle_precotizacion = detalle_precotizacion;
		this.departamentos_id = departamentos_id;
		this.departamento = departamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public int getDetalle_precotizaciones_id() {
		return detalle_precotizaciones_id;
	}

	public void setDetalle_precotizaciones_id(int detalle_precotizaciones_id) {
		this.detalle_precotizaciones_id = detalle_precotizaciones_id;
	}

	public String getDetalle_precotizacion() {
		return detalle_precotizacion;
	}

	public void setDetalle_precotizacion(String detalle_precotizacion) {
		this.detalle_precotizacion = detalle_precotizacion;
	}

	public int getDepartamentos_id() {
		return departamentos_id;
	}

	public void setDepartamentos_id(int departamentos_id) {
		this.departamentos_id = departamentos_id;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}	
}
