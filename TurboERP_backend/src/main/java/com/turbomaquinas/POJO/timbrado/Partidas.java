package com.turbomaquinas.POJO.timbrado;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Partidas{
	private float cantidad;
	private String claveUnidad;
	private String unidad;
	private String claveProdServ;
	private String noIdentificacion;
	private String descripcion;
	private BigDecimal valorUnitario;
	private BigDecimal importe;
	private BigDecimal descuento;
	private List<com.turbomaquinas.POJO.timbrado.Impuestos> Impuestos;
	private String numeroCuentaPredial;
	private InformacionAduanera InformacionAduanera;
	
	public Partidas() {
		super();
	}

	public Partidas(float cantidad, String claveUnidad, String unidad, String claveProdServ, String noIdentificacion,
			String descripcion, BigDecimal valorUnitario, BigDecimal importe, BigDecimal descuento,
			List<com.turbomaquinas.POJO.timbrado.Impuestos> impuestos, String numeroCuentaPredial,
			com.turbomaquinas.POJO.timbrado.Partidas.InformacionAduanera informacionAduanera) {
		super();
		this.cantidad = cantidad;
		this.claveUnidad = claveUnidad;
		this.unidad = unidad;
		this.claveProdServ = claveProdServ;
		this.noIdentificacion = noIdentificacion;
		this.descripcion = descripcion;
		this.valorUnitario = valorUnitario;
		this.importe = importe;
		this.descuento = descuento;
		Impuestos = impuestos;
		this.numeroCuentaPredial = numeroCuentaPredial;
		InformacionAduanera = informacionAduanera;
	}





	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public String getClaveUnidad() {
		return claveUnidad;
	}

	public void setClaveUnidad(String claveUnidad) {
		this.claveUnidad = claveUnidad;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public String getUnidad() {
		return unidad;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getClaveProdServ() {
		return claveProdServ;
	}

	public void setClaveProdServ(String claveProdServ) {
		this.claveProdServ = claveProdServ;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public String getNoIdentificacion() {
		return noIdentificacion;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setNoIdentificacion(String noIdentificacion) {
		this.noIdentificacion = noIdentificacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public BigDecimal getDescuento() {
		return descuento;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("Impuestos")
	public List<com.turbomaquinas.POJO.timbrado.Impuestos> getImpuestos() {
		return Impuestos;
	}
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public void setImpuestos(List<com.turbomaquinas.POJO.timbrado.Impuestos> impuestos) {
		Impuestos = impuestos;
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String getNumeroCuentaPredial() {
		return numeroCuentaPredial;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public void setNumeroCuentaPredial(String numeroCuentaPredial) {
		this.numeroCuentaPredial = numeroCuentaPredial;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("InformacionAduanera")
	public InformacionAduanera getInformacionAduanera() {
		return InformacionAduanera;
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public void setInformacionAduanera(InformacionAduanera informacionAduanera) {
		InformacionAduanera = informacionAduanera;
	}
	









	public class InformacionAduanera{
		private String numeroPedimento;

		public InformacionAduanera() {
			super();
		}

		public InformacionAduanera(String numeroPedimento) {
			super();
			this.numeroPedimento = numeroPedimento;
		}

		public String getNumeroPedimento() {
			return numeroPedimento;
		}

		public void setNumeroPedimento(String numeroPedimento) {
			this.numeroPedimento = numeroPedimento;
		}
		
	}
	
	
	
	
}
