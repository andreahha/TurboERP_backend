package com.turbomaquinas.POJO.general;

import java.math.BigDecimal;

public class ActividadAutorizadaFactura {
	
		private int id;
		private String descripcion;
		private String tipo_actividad;		
		private BigDecimal importe_pendiente_facturar;
		private BigDecimal descuento_facturar;
		private int encabezados_cotizaciones_id;
		private String encabezados_cotizaciones_descripcion;

		public ActividadAutorizadaFactura() {
			super();
		}		

		public ActividadAutorizadaFactura(int id, String descripcion, String tipo_actividad,
				BigDecimal importe_pendiente_facturar, BigDecimal descuento_facturar,
				int encabezados_cotizaciones_id, String encabezados_cotizaciones_descripcion) {
			super();
			this.id = id;
			this.descripcion = descripcion;
			this.tipo_actividad = tipo_actividad;
			this.importe_pendiente_facturar = importe_pendiente_facturar;
			this.descuento_facturar = descuento_facturar;
			this.encabezados_cotizaciones_id = encabezados_cotizaciones_id;
			this.encabezados_cotizaciones_descripcion = encabezados_cotizaciones_descripcion;
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

		public BigDecimal getImporte_pendiente_facturar() {
			return importe_pendiente_facturar;
		}

		public void setImporte_pendiente_facturar(BigDecimal importe_pendiente_facturar) {
			this.importe_pendiente_facturar = importe_pendiente_facturar;
		}

		public BigDecimal getDescuento_facturar() {
			return descuento_facturar;
		}

		public void setDescuento_facturar(BigDecimal descuento_facturar) {
			this.descuento_facturar = descuento_facturar;
		}

		public int getEncabezados_cotizaciones_id() {
			return encabezados_cotizaciones_id;
		}

		public void setEncabezados_cotizaciones_id(int encabezados_cotizaciones_id) {
			this.encabezados_cotizaciones_id = encabezados_cotizaciones_id;
		}

		public String getEncabezados_cotizaciones_descripcion() {
			return encabezados_cotizaciones_descripcion;
		}

		public void setEncabezados_cotizaciones_descripcion(String encabezados_cotizaciones_descripcion) {
			this.encabezados_cotizaciones_descripcion = encabezados_cotizaciones_descripcion;
		}
}
