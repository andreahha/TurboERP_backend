package com.turbomaquinas.POJO.comercial;

public class FacturasJSON {

	private int idFactura;
	private String tipoFactura;
	private Float importe;
	public FacturasJSON() {
		super();
	}
	public FacturasJSON(int idFactura, String tipoFactura, Float importe) {
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
	
}
