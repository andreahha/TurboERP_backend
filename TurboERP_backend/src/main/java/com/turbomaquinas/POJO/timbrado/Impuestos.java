package com.turbomaquinas.POJO.timbrado;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Impuestos{
		private String tipo;
		private String claveImpuesto;
		private String tipoFactor;
		private float tasaOCuota;
		private float baseImpuesto;
		private BigDecimal importe;
		
		public Impuestos() {
			super();
		}

		public Impuestos(String tipo, String claveImpuesto, String tipoFactor, float tasaOCuota, float baseImpuesto,
				BigDecimal importe) {
			super();
			this.tipo = tipo;
			this.claveImpuesto = claveImpuesto;
			this.tipoFactor = tipoFactor;
			this.tasaOCuota = tasaOCuota;
			this.baseImpuesto = baseImpuesto;
			this.importe = importe;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getClaveImpuesto() {
			return claveImpuesto;
		}

		public void setClaveImpuesto(String claveImpuesto) {
			this.claveImpuesto = claveImpuesto;
		}

		public String getTipoFactor() {
			return tipoFactor;
		}

		public void setTipoFactor(String tipoFactor) {
			this.tipoFactor = tipoFactor;
		}

		@JsonInclude(JsonInclude.Include.NON_NULL) 
		public float getTasaOCuota() {
			return tasaOCuota;
		}

		@JsonInclude(JsonInclude.Include.NON_NULL) 
		public void setTasaOCuota(float tasaOCuota) {
			this.tasaOCuota = tasaOCuota;
		}

		public float getBaseImpuesto() {
			return baseImpuesto;
		}

		public void setBaseImpuesto(float baseImpuesto) {
			this.baseImpuesto = baseImpuesto;
		}

		@JsonInclude(JsonInclude.Include.NON_NULL) 
		public BigDecimal getImporte() {
			return importe;
		}

		@JsonInclude(JsonInclude.Include.NON_NULL) 
		public void setImporte(BigDecimal importe) {
			this.importe = importe;
		}
		
}
