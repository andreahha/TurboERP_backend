package com.turbomaquinas.POJO.general;

public class PedidoPrepedidoAA {
	private int id_actividad_autorizada;
	private int id_pedido;
	private int id_prepedido;
	
	public int getId_actividad_autorizada() {
		return id_actividad_autorizada;
	}
	public void setId_actividad_autorizada(int id_actividad_autorizada) {
		this.id_actividad_autorizada = id_actividad_autorizada;
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
	
	@Override
	public String toString() {
		return "PedidoPrepedidoAA [id_actividad_autorizada=" + id_actividad_autorizada + ", id_pedido=" + id_pedido
				+ ", id_prepedido=" + id_prepedido + "]";
	}
}
