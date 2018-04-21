package com.turbomaquinas.POJO.diagnostico;

import java.util.Date;

public class DetalleDiagnostico {
	
	public static class ListaDeptos{
		private int[] ids;

		public int[] getIds() {
			return ids;
		}

		public void setIds(int[] ids) {
			this.ids = ids;
		}
		
		@Override
		public String toString() {
			try {
		        return new com.fasterxml.jackson.databind.ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(this);
		    } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
		        e.printStackTrace();
		    }
		    return null;
		}
		
	}
	
	private int id;
	private String descripcion;
	private String tipo_actividad;
	private int lugar;
	private int suministro;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int encabezados_diagnostico_id;
	private int planta;
	private int unidades;

	public DetalleDiagnostico() {
		super();
	}


	public DetalleDiagnostico(int id, String descripcion, String tipo_actividad, int lugar, int suministro, int activo,
			int creado_por, Date creado, int modificado_por, Date modificado, int encabezados_diagnostico_id,
			int planta, int unidades) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.tipo_actividad = tipo_actividad;
		this.lugar = lugar;
		this.suministro = suministro;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.encabezados_diagnostico_id = encabezados_diagnostico_id;
		this.planta = planta;
		this.unidades = unidades;
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


	public String getTipo_actividad() {
		return tipo_actividad;
	}


	public void setTipo_actividad(String tipo_actividad) {
		this.tipo_actividad = tipo_actividad;
	}


	public int getLugar() {
		return lugar;
	}


	public void setLugar(int lugar) {
		this.lugar = lugar;
	}


	public int getSuministro() {
		return suministro;
	}


	public void setSuministro(int suministro) {
		this.suministro = suministro;
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


	public int getEncabezados_diagnostico_id() {
		return encabezados_diagnostico_id;
	}


	public void setEncabezados_diagnostico_id(int encabezados_diagnostico_id) {
		this.encabezados_diagnostico_id = encabezados_diagnostico_id;
	}


	public int getPlanta() {
		return planta;
	}


	public void setPlanta(int planta) {
		this.planta = planta;
	}


	public int getUnidades() {
		return unidades;
	}


	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}


}
