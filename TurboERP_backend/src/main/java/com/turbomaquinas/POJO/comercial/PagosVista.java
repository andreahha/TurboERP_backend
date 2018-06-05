package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class PagosVista {
	
	public int id;
	public int folio;
	public Date fecha_pago;
	public float importe;
	public float tipo_cambio_cliente;
	public Date fecha_baja;
	public int mes_baja;
	public int anio_baja;
	public String observaciones;
	public int activo;
	public int creado_por;
	public Date creado;
	public int modificado_por;
	public Date modificado;
	public int depositos_recibidos_id;
	public String comentarios;
	
	public PagosVista() {
		super();
	}

	public PagosVista(int id, int folio, Date fecha_pago, float importe, float tipo_cambio_cliente, Date fecha_baja,
			int mes_baja, int anio_baja, String observaciones, int activo, int creado_por, Date creado,
			int modificado_por, Date modificado, int depositos_recibidos_id, String comentarios, int metodos_pago_id,
			String mp_clave, String metodos_pago_descripcion, int bancos_id, String bancos_clave,
			String bancos_descripcion) {
		this.id = id;
		this.folio = folio;
		this.fecha_pago = fecha_pago;
		this.importe = importe;
		this.tipo_cambio_cliente = tipo_cambio_cliente;
		this.fecha_baja = fecha_baja;
		this.mes_baja = mes_baja;
		this.anio_baja = anio_baja;
		this.observaciones = observaciones;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.depositos_recibidos_id = depositos_recibidos_id;
		this.comentarios = comentarios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public Date getFecha_pago() {
		return fecha_pago;
	}

	public void setFecha_pago(Date fecha_pago) {
		this.fecha_pago = fecha_pago;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public float getTipo_cambio_cliente() {
		return tipo_cambio_cliente;
	}

	public void setTipo_cambio_cliente(float tipo_cambio_cliente) {
		this.tipo_cambio_cliente = tipo_cambio_cliente;
	}

	public Date getFecha_baja() {
		return fecha_baja;
	}

	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}

	public int getMes_baja() {
		return mes_baja;
	}

	public void setMes_baja(int mes_baja) {
		this.mes_baja = mes_baja;
	}

	public int getAnio_baja() {
		return anio_baja;
	}

	public void setAnio_baja(int anio_baja) {
		this.anio_baja = anio_baja;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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

	public int getDepositos_recibidos_id() {
		return depositos_recibidos_id;
	}

	public void setDepositos_recibidos_id(int depositos_recibidos_id) {
		this.depositos_recibidos_id = depositos_recibidos_id;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

}
