package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class FechasEstimadasCobro {
	
	private int id;
	private Date fecha_cobro;
	private String comentario;
	private int indefinida;
	private int negociacion;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int factura_final_id;
	
	
	public FechasEstimadasCobro() {
		super();
	}


	public FechasEstimadasCobro(int id, Date fecha_cobro, String comentario, int indefinida, int negociacion,
			int activo, int creado_por, Date creado, int modificado_por, Date modificado, int factura_final_id) {
		super();
		this.id = id;
		this.fecha_cobro = fecha_cobro;
		this.comentario = comentario;
		this.indefinida = indefinida;
		this.negociacion = negociacion;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.factura_final_id = factura_final_id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getFecha_cobro() {
		return fecha_cobro;
	}


	public void setFecha_cobro(Date fecha_cobro) {
		this.fecha_cobro = fecha_cobro;
	}


	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}


	public int getIndefinida() {
		return indefinida;
	}


	public void setIndefinida(int indefinida) {
		this.indefinida = indefinida;
	}


	public int getNegociacion() {
		return negociacion;
	}


	public void setNegociacion(int negociacion) {
		this.negociacion = negociacion;
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


	public int getFactura_final_id() {
		return factura_final_id;
	}


	public void setFactura_final_id(int factura_final_id) {
		this.factura_final_id = factura_final_id;
	}


	@Override
	public String toString() {
		return "FechasEstimadasCobro [id=" + id + ", fecha_cobro=" + fecha_cobro + ", comentario=" + comentario
				+ ", indefinida=" + indefinida + ", negociacion=" + negociacion + ", activo=" + activo + ", creado_por="
				+ creado_por + ", creado=" + creado + ", modificado_por=" + modificado_por + ", modificado="
				+ modificado + ", factura_final_id=" + factura_final_id + "]";
	}



}
