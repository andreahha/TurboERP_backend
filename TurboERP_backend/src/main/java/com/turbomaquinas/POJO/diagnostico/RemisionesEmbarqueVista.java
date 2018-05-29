package com.turbomaquinas.POJO.diagnostico;

import java.util.Date;

public class RemisionesEmbarqueVista {
	
	private int id;
	private int numero;
	private int anio;
	private Date fecha;
	private String vehiculo;
	private String marca;
	private String placas;
	private String chofer;
	private String atencion;
	private String flete;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int ordenes_id;
	private int departamentos_id;
	private String clave_depto;
	private String descripcion_depto;
	
	public RemisionesEmbarqueVista() {
		super();
	}
	
	public RemisionesEmbarqueVista(int id, int numero, int anio, Date fecha, String vehiculo, String marca,
			String placas, String chofer, String atencion, String flete, int activo, int creado_por, Date creado,
			int modificado_por, Date modificado, int ordenes_id, int departamentos_id, String clave_depto,
			String descripcion_depto) {
		super();
		this.id = id;
		this.numero = numero;
		this.anio = anio;
		this.fecha = fecha;
		this.vehiculo = vehiculo;
		this.marca = marca;
		this.placas = placas;
		this.chofer = chofer;
		this.atencion = atencion;
		this.flete = flete;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.ordenes_id = ordenes_id;
		this.departamentos_id = departamentos_id;
		this.clave_depto = clave_depto;
		this.descripcion_depto = descripcion_depto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}

	public String getChofer() {
		return chofer;
	}

	public void setChofer(String chofer) {
		this.chofer = chofer;
	}

	public String getAtencion() {
		return atencion;
	}

	public void setAtencion(String atencion) {
		this.atencion = atencion;
	}

	public String getFlete() {
		return flete;
	}

	public void setFlete(String flete) {
		this.flete = flete;
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

	public int getOrdenes_id() {
		return ordenes_id;
	}

	public void setOrdenes_id(int ordenes_id) {
		this.ordenes_id = ordenes_id;
	}

	public int getDepartamentos_id() {
		return departamentos_id;
	}

	public void setDepartamentos_id(int departamentos_id) {
		this.departamentos_id = departamentos_id;
	}

	public String getClave_depto() {
		return clave_depto;
	}

	public void setClave_depto(String clave_depto) {
		this.clave_depto = clave_depto;
	}

	public String getDescripcion_depto() {
		return descripcion_depto;
	}

	public void setDescripcion_depto(String descripcion_depto) {
		this.descripcion_depto = descripcion_depto;
	}
	
	

}
