package com.turbomaquinas.POJO.general;

import java.math.BigDecimal;

public class ActividadAutorizadaFactura {
	
		private int id;
		private String descripcion;
		private String tipo_actividad;		
		private BigDecimal importe_a_facturar;
		private BigDecimal descuento_disponible;
		private int encabezados_cotizaciones_id;
		private String encabezados_cotizaciones_descripcion;

		public ActividadAutorizadaFactura() {
			super();
		}

		public ActividadAutorizadaFactura(int id, String descripcion, String tipo_actividad,
				BigDecimal importe_a_facturar, BigDecimal descuento_disponible, int encabezados_cotizaciones_id,
				String encabezados_cotizaciones_descripcion) {
			super();
			this.id = id;
			this.descripcion = descripcion;
			this.tipo_actividad = tipo_actividad;
			this.importe_a_facturar = importe_a_facturar;
			this.descuento_disponible = descuento_disponible;
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

		public BigDecimal getImporte_a_facturar() {
			return importe_a_facturar;
		}

		public void setImporte_a_facturar(BigDecimal importe_a_facturar) {
			this.importe_a_facturar = importe_a_facturar;
		}

		public BigDecimal getDescuento_disponible() {
			return descuento_disponible;
		}

		public void setDescuento_disponible(BigDecimal descuento_disponible) {
			this.descuento_disponible = descuento_disponible;
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
