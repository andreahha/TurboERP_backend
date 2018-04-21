package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.PrePedido;

public interface PrePedidoService {
	public PrePedido crear(PrePedido pp);
	public void actualizar(PrePedido pp);
	public PrePedido buscar(int id);
	public List<PrePedido> consultar();
	public List<Integer> aniosPrepedido(int id);
	public List<PrePedido> filtrarAnioCliente(String anio, int id);
	public List<PrePedido> prePedidosAAPorOrden(int id);
}
