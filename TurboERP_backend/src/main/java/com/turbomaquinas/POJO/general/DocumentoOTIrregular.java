package com.turbomaquinas.POJO.general;

import java.util.Date;
import java.util.List;

public class DocumentoOTIrregular {
	private String iniciales;
	private Date fecha_regularizacion;
	private String comentarios;
	private String proceso;
	private int creado_por;
	private int ordenes_id;
	private int contactos_id;
	private List<Integer> actividades_Ids;
	
	public String getIniciales() {
		return iniciales;
	}
	public void setIniciales(String iniciales) {
		this.iniciales = iniciales;
	}
	public Date getFecha_regularizacion() {
		return fecha_regularizacion;
	}
	public void setFecha_regularizacion(Date fecha_regularizacion) {
		this.fecha_regularizacion = fecha_regularizacion;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public String getProceso() {
		return proceso;
	}
	public void setProceso(String proceso) {
		this.proceso = proceso;
	}
	public int getCreado_por() {
		return creado_por;
	}
	public void setCreado_por(int creado_por) {
		this.creado_por = creado_por;
	}
	public int getOrdenes_id() {
		return ordenes_id;
	}
	public void setOrdenes_id(int ordenes_id) {
		this.ordenes_id = ordenes_id;
	}
	public int getContactos_id() {
		return contactos_id;
	}
	public void setContactos_id(int contactos_id) {
		this.contactos_id = contactos_id;
	}
	public List<Integer> getActividades_Ids() {
		return actividades_Ids;
	}
	public void setActividades_Ids(List<Integer> actividades_Ids) {
		this.actividades_Ids = actividades_Ids;
	}
	@Override
	public String toString() {
		return "DocumentoOTIrregular [iniciales=" + iniciales + ", fecha_regularizacion=" + fecha_regularizacion
				+ ", comentarios=" + comentarios + ", proceso=" + proceso + ", creado_por=" + creado_por
				+ ", ordenes_id=" + ordenes_id + ", contactos_id=" + contactos_id + ", actividades_Ids="
				+ actividades_Ids + "]";
	}
}
