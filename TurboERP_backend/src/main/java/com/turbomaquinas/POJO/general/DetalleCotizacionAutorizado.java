package com.turbomaquinas.POJO.general;

public class DetalleCotizacionAutorizado {
	private int id_detalle_cotizacion;
	private int id_pedido;
	private int id_prepedido;
	private int planta;
	private int[] recomendaciones;
	
	public int getId_detalle_cotizacion() {
		return id_detalle_cotizacion;
	}
	public void setId_detalle_cotizacion(int id_detalle_cotizacion) {
		this.id_detalle_cotizacion = id_detalle_cotizacion;
	}
	public int getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}
	public int getId_prepedido() {
		return id_prepedido;
	}
	public void setId_prepedido(int id_prepedido) {
		this.id_prepedido = id_prepedido;
	}
	public int getPlanta() {
		return planta;
	}
	public void setPlanta(int planta) {
		this.planta = planta;
	}
	public int[] getRecomendaciones() {
		return recomendaciones;
	}
	public void setRecomendaciones(int[] recomendaciones) {
		this.recomendaciones = recomendaciones;
	}
	
	@Override
	public String toString() {
		return "DetalleCotizacionAutorizado [id_detalle_cotizacion=" + id_detalle_cotizacion + 
				", id_pedido=" + id_pedido + ", id_prepedido=" + id_prepedido
				+ ", recomendaciones=" + recomendaciones + "]";
	}
	
}
