package com.turbomaquinas.POJO.general;

import java.util.Date;


public class ActividadAutorizada {

	public static class ListaFacts {
		
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
	private int numero_referencia;
	private String tipo_actividad;
	private int suministro;
	private int planta;
	private String clase_actividad;
	private Float importe_autorizado;
	private Float importe_baja;
	private Float importe_anticipo;
	private Float importe_factura;
	private Float importe_pendiente;
	private Float descuento; 
	private Date fecha_regularizacion;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int pedidos_id;
	private int solicitud_bajas_actividades_id;
	private int pre_pedidos_id;
	private int ot_irregulares_id;
	private int autorizaciones_id;
	private int detalles_cotizaciones_id;
	
	public ActividadAutorizada() {
		super();
	}

	public ActividadAutorizada(int id, int numero_referencia, String tipo_actividad, int suministro, int planta,
			String clase_actividad, Float importe_autorizado, Float importe_baja, Float importe_anticipo,
			Float importe_factura, Float importe_pendiente, Date fecha_regularizacion, int activo, int creado_por,
			Date creado, int modificado_por, Date modificado, int pedidos_id, int solicitud_bajas_actividades_id,
			int pre_pedidos_id, int ot_irregulares_id, int autorizaciones_id, int detalles_cotizaciones_id) {
		super();
		this.id = id;
		this.numero_referencia = numero_referencia;
		this.tipo_actividad = tipo_actividad;
		this.suministro = suministro;
		this.planta = planta;
		this.clase_actividad = clase_actividad;
		this.importe_autorizado = importe_autorizado;
		this.importe_baja = importe_baja;
		this.importe_anticipo = importe_anticipo;
		this.importe_factura = importe_factura;
		this.importe_pendiente = importe_pendiente;
		this.fecha_regularizacion = fecha_regularizacion;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.pedidos_id = pedidos_id;
		this.solicitud_bajas_actividades_id = solicitud_bajas_actividades_id;
		this.pre_pedidos_id = pre_pedidos_id;
		this.ot_irregulares_id = ot_irregulares_id;
		this.autorizaciones_id = autorizaciones_id;
		this.detalles_cotizaciones_id = detalles_cotizaciones_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero_referencia() {
		return numero_referencia;
	}

	public void setNumero_referencia(int numero_referencia) {
		this.numero_referencia = numero_referencia;
	}

	public String getTipo_actividad() {
		return tipo_actividad;
	}

	public void setTipo_actividad(String tipo_actividad) {
		this.tipo_actividad = tipo_actividad;
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

	public String getClase_actividad() {
		return clase_actividad;
	}

	public void setClase_actividad(String clase_actividad) {
		this.clase_actividad = clase_actividad;
	}

	public Float getImporte_autorizado() {
		return importe_autorizado;
	}

	public void setImporte_autorizado(Float importe_autorizado) {
		this.importe_autorizado = importe_autorizado;
	}

	public Float getImporte_baja() {
		return importe_baja;
	}

	public void setImporte_baja(Float importe_baja) {
		this.importe_baja = importe_baja;
	}

	public Float getImporte_anticipo() {
		return importe_anticipo;
	}

	public void setImporte_anticipo(Float importe_anticipo) {
		this.importe_anticipo = importe_anticipo;
	}

	public Float getImporte_factura() {
		return importe_factura;
	}

	public void setImporte_factura(Float importe_factura) {
		this.importe_factura = importe_factura;
	}

	public Float getImporte_pendiente() {
		return importe_pendiente;
	}

	public void setImporte_pendiente(Float importe_pendiente) {
		this.importe_pendiente = importe_pendiente;
	}
	
	public Float getDescuento() {
		return descuento;
	}

	public void setDescuento(Float descuento) {
		this.descuento = descuento;
	}

	public Date getFecha_regularizacion() {
		return fecha_regularizacion;
	}

	public void setFecha_regularizacion(Date fecha_regularizacion) {
		this.fecha_regularizacion = fecha_regularizacion;
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

	public int getPedidos_id() {
		return pedidos_id;
	}

	public void setPedidos_id(int pedidos_id) {
		this.pedidos_id = pedidos_id;
	}

	public int getSolicitud_bajas_actividades_id() {
		return solicitud_bajas_actividades_id;
	}

	public void setSolicitud_bajas_actividades_id(int solicitud_bajas_actividades_id) {
		this.solicitud_bajas_actividades_id = solicitud_bajas_actividades_id;
	}

	public int getPre_pedidos_id() {
		return pre_pedidos_id;
	}

	public void setPre_pedidos_id(int pre_pedidos_id) {
		this.pre_pedidos_id = pre_pedidos_id;
	}

	public int getOt_irregulares_id() {
		return ot_irregulares_id;
	}

	public void setOt_irregulares_id(int ot_irregulares_id) {
		this.ot_irregulares_id = ot_irregulares_id;
	}

	public int getAutorizaciones_id() {
		return autorizaciones_id;
	}

	public void setAutorizaciones_id(int autorizaciones_id) {
		this.autorizaciones_id = autorizaciones_id;
	}

	public int getDetalles_cotizaciones_id() {
		return detalles_cotizaciones_id;
	}

	public void setDetalles_cotizaciones_id(int detalles_cotizaciones_id) {
		this.detalles_cotizaciones_id = detalles_cotizaciones_id;
	}

	@Override
	public String toString() {
		return "ActividadAutorizada [id=" + id + ", numero_referencia=" + numero_referencia + ", tipo_actividad="
				+ tipo_actividad + ", suministro=" + suministro + ", planta=" + planta + ", clase_actividad="
				+ clase_actividad + ", importe_autorizado=" + importe_autorizado + ", importe_baja=" + importe_baja
				+ ", importe_anticipo=" + importe_anticipo + ", importe_factura=" + importe_factura
				+ ", importe_pendiente=" + importe_pendiente + ", fecha_regularizacion=" + fecha_regularizacion
				+ ", activo=" + activo + ", creado_por=" + creado_por + ", creado=" + creado + ", modificado_por="
				+ modificado_por + ", modificado=" + modificado + ", pedidos_id=" + pedidos_id
				+ ", solicitud_bajas_actividades_id=" + solicitud_bajas_actividades_id + ", pre_pedidos_id="
				+ pre_pedidos_id + ", ot_irregulares_id=" + ot_irregulares_id + ", autorizaciones_id="
				+ autorizaciones_id + ", detalles_cotizaciones_id=" + detalles_cotizaciones_id + "]";
	}

}
