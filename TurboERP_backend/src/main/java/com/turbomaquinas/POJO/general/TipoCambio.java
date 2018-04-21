package com.turbomaquinas.POJO.general;

import java.util.Date;

public class TipoCambio {
	private int id;
	private Date fecha;
	private Float tipo_cambio;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	
	public TipoCambio() {
		super();
	}

	public TipoCambio(int id, Date fecha, Float tipo_cambio, int activo, int creado_por, Date creado,
			int modificado_por, Date modificado) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.tipo_cambio = tipo_cambio;
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Float getTipo_cambio() {
		return tipo_cambio;
	}

	public void setTipo_cambio(Float tipo_cambio) {
		this.tipo_cambio = tipo_cambio;
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
