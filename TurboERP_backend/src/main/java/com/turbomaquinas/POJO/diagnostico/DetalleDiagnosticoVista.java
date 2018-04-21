package com.turbomaquinas.POJO.diagnostico;

public class DetalleDiagnosticoVista {

	private int id;
	private String descripcion;
	private String tipo_actividad;
	private int lugar;
	private int suministro;
	private int activo;
	private int planta;
	private int unidades;
	private int encabezados_diagnostico_id;
	private String descripcionEncabezado;
	private int lugarEncabezado;
	private int diagnostico_id;
	private int consecutivo_diagnostico;
	private String fecha_diags;
	private int cant_subindices;
	private int autorizado;

	public DetalleDiagnosticoVista() {
		super();
	}

	public DetalleDiagnosticoVista(int id, String descripcion, String tipo_actividad, int lugar, int suministro,
			int activo, int encabezados_diagnostico_id, String descripcionEncabezado, int lugarEncabezado,
			int diagnostico_id, int consecutivo_diagnostico, int cant_subindices) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.tipo_actividad = tipo_actividad;
		this.lugar = lugar;
		this.suministro = suministro;
		this.activo = activo;
		this.encabezados_diagnostico_id = encabezados_diagnostico_id;
		this.descripcionEncabezado = descripcionEncabezado;
		this.lugarEncabezado = lugarEncabezado;
		this.diagnostico_id = diagnostico_id;
		this.consecutivo_diagnostico = consecutivo_diagnostico;
		this.cant_subindices = cant_subindices;
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

	public int getEncabezados_diagnostico_id() {
		return encabezados_diagnostico_id;
	}

	public void setEncabezados_diagnostico_id(int encabezados_diagnostico_id) {
		this.encabezados_diagnostico_id = encabezados_diagnostico_id;
	}

	public String getDescripcionEncabezado() {
		return descripcionEncabezado;
	}

	public void setDescripcionEncabezado(String descripcionEncabezado) {
		this.descripcionEncabezado = descripcionEncabezado;
	}

	public int getLugarEncabezado() {
		return lugarEncabezado;
	}

	public void setLugarEncabezado(int lugarEncabezado) {
		this.lugarEncabezado = lugarEncabezado;
	}

	public int getDiagnostico_id() {
		return diagnostico_id;
	}

	public void setDiagnostico_id(int diagnostico_id) {
		this.diagnostico_id = diagnostico_id;
	}

	public int getConsecutivo_diagnostico() {
		return consecutivo_diagnostico;
	}

	public void setConsecutivo_diagnostico(int consecutivo_diagnostico) {
		this.consecutivo_diagnostico = consecutivo_diagnostico;
	}

	public int getCant_subindices() {
		return cant_subindices;
	}

	public void setCant_subindices(int cant_subindices) {
		this.cant_subindices = cant_subindices;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public String getFecha_diags() {
		return fecha_diags;
	}

	public void setFecha_diags(String fecha_diags) {
		this.fecha_diags = fecha_diags;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public int getAutorizado() {
		return autorizado;
	}

	public void setAutorizado(int autorizado) {
		this.autorizado = autorizado;
	}
	
}
