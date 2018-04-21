package com.turbomaquinas.POJO.comercial;

public class DetallePrecotizacionVista {
	private int id;
	private String descripcion;
	private String tipoActividad;
	private int lugar;
	private int suministro;
	private int planta;
	private int activo;
	private int encabezados_precotizaciones_id;
	private String descripcion_encabezado;
	private int lugar_encabezado;
	private int precotizaciones_id;
	private int numero_precotizacion;
	private int cant_subindices;
	
	public DetallePrecotizacionVista() {
		super();
	}

	public DetallePrecotizacionVista(int id, String descripcion, String tipoActividad, int lugar, int suministro,
			int planta, int activo, int encabezados_precotizaciones_id, String descripcion_encabezado,
			int lugar_encabezado, int precotizaciones_id, int numero_precotizacion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.tipoActividad = tipoActividad;
		this.lugar = lugar;
		this.suministro = suministro;
		this.planta = planta;
		this.activo = activo;
		this.encabezados_precotizaciones_id = encabezados_precotizaciones_id;
		this.descripcion_encabezado = descripcion_encabezado;
		this.lugar_encabezado = lugar_encabezado;
		this.precotizaciones_id = precotizaciones_id;
		this.numero_precotizacion = numero_precotizacion;
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

	public String getTipoActividad() {
		return tipoActividad;
	}

	public void setTipoActividad(String tipoActividad) {
		this.tipoActividad = tipoActividad;
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

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public int getEncabezados_precotizaciones_id() {
		return encabezados_precotizaciones_id;
	}

	public void setEncabezados_precotizaciones_id(int encabezados_precotizaciones_id) {
		this.encabezados_precotizaciones_id = encabezados_precotizaciones_id;
	}

	public String getDescripcion_encabezado() {
		return descripcion_encabezado;
	}

	public void setDescripcion_encabezado(String descripcion_encabezado) {
		this.descripcion_encabezado = descripcion_encabezado;
	}

	public int getLugar_encabezado() {
		return lugar_encabezado;
	}

	public void setLugar_encabezado(int lugar_encabezado) {
		this.lugar_encabezado = lugar_encabezado;
	}

	public int getPrecotizaciones_id() {
		return precotizaciones_id;
	}

	public void setPrecotizaciones_id(int precotizaciones_id) {
		this.precotizaciones_id = precotizaciones_id;
	}

	public int getNumero_precotizacion() {
		return numero_precotizacion;
	}

	public void setNumero_precotizacion(int numero_precotizacion) {
		this.numero_precotizacion = numero_precotizacion;
	}

	public int getCant_subindices() {
		return cant_subindices;
	}

	public void setCant_subindices(int cant_subindices) {
		this.cant_subindices = cant_subindices;
	}
	
}
