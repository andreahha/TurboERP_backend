package com.turbomaquinas.POJO.comercial;

import java.util.List;

public class DocumentoAplicarNotasCredito {
	
	private Float subtotal;
	private Float iva;
	private Float tipo_cambio;
	private String descripcion;
	private int activo;
	private int creado_por;
	private int datos_timbrado_id;
	private int conceptos_notas_credito_id;
	private int notas_credito_id_sust;
	private List<DocumentoAplicarNotasCredito.Facturas> facturas;
	
	public Float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}
	public Float getIva() {
		return iva;
	}
	public void setIva(Float iva) {
		this.iva = iva;
	}
	public Float getTipo_cambio() {
		return tipo_cambio;
	}
	public void setTipo_cambio(Float tipo_cambio) {
		this.tipo_cambio = tipo_cambio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	public int getDatos_timbrado_id() {
		return datos_timbrado_id;
	}
	public void setDatos_timbrado_id(int datos_timbrado_id) {
		this.datos_timbrado_id = datos_timbrado_id;
	}
	public int getConceptos_notas_credito_id() {
		return conceptos_notas_credito_id;
	}
	public void setConceptos_notas_credito_id(int conceptos_notas_credito_id) {
		this.conceptos_notas_credito_id = conceptos_notas_credito_id;
	}
	public int getNotas_credito_id_sust() {
		return notas_credito_id_sust;
	}
	public void setNotas_credito_id_sust(int notas_credito_id_sust) {
		this.notas_credito_id_sust = notas_credito_id_sust;
	}
	public List<DocumentoAplicarNotasCredito.Facturas> getFacturas() {
		return facturas;
	}
	public void setFacturas(List<DocumentoAplicarNotasCredito.Facturas> facturas) {
		this.facturas = facturas;
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
	
			public static class Facturas {
				
				private int idFactura;
				private String tipoFactura;
				private Float importe;
				public Facturas() {
					super();
				}
				public Facturas(int idFactura, String tipoFactura, Float importe) {
					super();
					this.idFactura = idFactura;
					this.tipoFactura = tipoFactura;
					this.importe = importe;
				}
				public int getIdFactura() {
					return idFactura;
				}
				public void setIdFactura(int idFactura) {
					this.idFactura = idFactura;
				}
				public String getTipoFactura() {
					return tipoFactura;
				}
				public void setTipoFactura(String tipoFactura) {
					this.tipoFactura = tipoFactura;
				}
				public Float getImporte() {
					return importe;
				}
				public void setImporte(Float importe) {
					this.importe = importe;
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

}
