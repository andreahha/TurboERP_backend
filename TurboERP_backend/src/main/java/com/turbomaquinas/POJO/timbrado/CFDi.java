package com.turbomaquinas.POJO.timbrado;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CFDi{
	private String modo;
	private String versionEF;
	private String serie;
	private int folioInterno;
	private String fechaEmision;
	private BigDecimal subTotal;
	private BigDecimal descuentos;
	private BigDecimal total;
	private String tipoMoneda;
	private float tipoCambio;
	private String nombreDisenio;
	private String rfc;	
	private DatosDePago DatosDePago;	
	private ComprobantesRelacionados ComprobantesRelacionados;
	private Receptor Receptor;
	private List<Partidas> Partidas;
	private Impuestos Impuestos;
	private BloquesInfoAdicional BloquesInfoAdicional;
	private EnviarCFDI EnviarCFDI;
	private List<Personalizados> Personalizados;
	private Pagare Pagare;
	
	
	public CFDi() {
		super();
	}

	
	public CFDi(String modo, String versionEF, String serie, int folioInterno, String fechaEmision, BigDecimal subTotal,
			BigDecimal descuentos, BigDecimal total, String tipoMoneda, float tipoCambio, String nombreDisenio,
			String rfc, com.turbomaquinas.POJO.timbrado.DatosDePago datosDePago,
			com.turbomaquinas.POJO.timbrado.ComprobantesRelacionados comprobantesRelacionados,
			com.turbomaquinas.POJO.timbrado.Receptor receptor, List<com.turbomaquinas.POJO.timbrado.Partidas> partidas,
			com.turbomaquinas.POJO.timbrado.CFDi.Impuestos impuestos,
			com.turbomaquinas.POJO.timbrado.BloquesInfoAdicional bloquesInfoAdicional,
			com.turbomaquinas.POJO.timbrado.EnviarCFDI enviarCFDI,
			List<com.turbomaquinas.POJO.timbrado.Personalizados> personalizados,
			com.turbomaquinas.POJO.timbrado.Pagare pagare) {
		super();
		this.modo = modo;
		this.versionEF = versionEF;
		this.serie = serie;
		this.folioInterno = folioInterno;
		this.fechaEmision = fechaEmision;
		this.subTotal = subTotal;
		this.descuentos = descuentos;
		this.total = total;
		this.tipoMoneda = tipoMoneda;
		this.tipoCambio = tipoCambio;
		this.nombreDisenio = nombreDisenio;
		this.rfc = rfc;
		DatosDePago = datosDePago;
		ComprobantesRelacionados = comprobantesRelacionados;
		Receptor = receptor;
		Partidas = partidas;
		Impuestos = impuestos;
		BloquesInfoAdicional = bloquesInfoAdicional;
		EnviarCFDI = enviarCFDI;
		Personalizados = personalizados;
		Pagare = pagare;
	}




	@JsonInclude(JsonInclude.Include.NON_NULL) 	
	public String getModo() {
		return modo;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 	
	public void setModo(String modo) {
		this.modo = modo;
	}


	public String getVersionEF() {
		return versionEF;
	}


	public void setVersionEF(String versionEF) {
		this.versionEF = versionEF;
	}


	public String getSerie() {
		return serie;
	}


	public void setSerie(String serie) {
		this.serie = serie;
	}


	public int getFolioInterno() {
		return folioInterno;
	}


	public void setFolioInterno(int folioInterno) {
		this.folioInterno = folioInterno;
	}


	public String getFechaEmision() {
		return fechaEmision;
	}


	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}


	public BigDecimal getSubTotal() {
		return subTotal;
	}


	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public BigDecimal getDescuentos() {
		return descuentos;
	}

	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public void setDescuentos(BigDecimal descuentos) {
		this.descuentos = descuentos;
	}


	public BigDecimal getTotal() {
		return total;
	}


	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String getTipoMoneda() {
		return tipoMoneda;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public float getTipoCambio() {
		return tipoCambio;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public void setTipoCambio(float tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String getNombreDisenio() {
		return nombreDisenio;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public void setNombreDisenio(String nombreDisenio) {
		this.nombreDisenio = nombreDisenio;
	}


	public String getRfc() {
		return rfc;
	}


	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	@JsonProperty("DatosDePago")
	public DatosDePago getDatosDePago() {
		return DatosDePago;
	}


	public void setDatosDePago(DatosDePago datosDePago) {
		DatosDePago = datosDePago;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("ComprobantesRelacionados")
	public ComprobantesRelacionados getComprobantesRelacionados() {
		return ComprobantesRelacionados;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public void setComprobantesRelacionados(ComprobantesRelacionados comprobantesRelacionados) {
		ComprobantesRelacionados = comprobantesRelacionados;
	}

	@JsonProperty("Receptor")
	public Receptor getReceptor() {
		return Receptor;
	}

	
	public void setReceptor(Receptor receptor) {
		Receptor = receptor;
	}

	@JsonProperty("Partidas")
	public List<Partidas> getPartidas() {
		return Partidas;
	}
	
	public void setPartidas(List<Partidas> partidas) {
		Partidas = partidas;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("Impuestos")
	public Impuestos getImpuestos() {
		return Impuestos;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public void setImpuestos(Impuestos impuestos) {
		Impuestos = impuestos;
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL) 	
	@JsonProperty("BloquesInfoAdicional")
	public BloquesInfoAdicional getBloquesInfoAdicional() {
		return BloquesInfoAdicional;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 	
	public void setBloquesInfoAdicional(BloquesInfoAdicional bloquesInfoAdicional) {
		BloquesInfoAdicional = bloquesInfoAdicional;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonProperty("EnviarCFDI")
	public EnviarCFDI getEnviarCFDI() {
		return EnviarCFDI;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setEnviarCFDI(EnviarCFDI enviarCFDI) {
		EnviarCFDI = enviarCFDI;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonProperty("Personalizados")
	public List<Personalizados> getPersonalizados() {
		return Personalizados;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setPersonalizados(List<Personalizados> personalizados) {
		Personalizados = personalizados;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonProperty("Pagare")
	public Pagare getPagare() {
		return Pagare;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setPagare(Pagare pagare) {
		Pagare = pagare;
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
	
	
	
	public class Impuestos{
		public Totales Totales;
		public List<com.turbomaquinas.POJO.timbrado.Impuestos> Impuestos;
		
		public Impuestos() {
			super();
		}

		public Impuestos(Totales totales,List<com.turbomaquinas.POJO.timbrado.Impuestos> impuestos) {
			super();
			Totales = totales;
			Impuestos = impuestos;
		}

		public Totales getTotales() {
			return Totales;
		}

		public void setTotales(Totales totales) {
			Totales = totales;
		}

		public List<com.turbomaquinas.POJO.timbrado.Impuestos> getImpuestos() {
			return Impuestos;
		}

		public void setImpuestos(List<com.turbomaquinas.POJO.timbrado.Impuestos> impuestos) {
			Impuestos = impuestos;
		}

	}
}

























