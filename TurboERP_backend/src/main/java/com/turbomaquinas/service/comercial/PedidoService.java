package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.Pedido;

public interface PedidoService {
	public Pedido crear(Pedido p);
	public Pedido actualizar(Pedido p);
	public Pedido buscar(int id);
	public List<Pedido> consultar();
	public List<Integer> anioPedidos(int clienteId);
	public List<Pedido> pedidosAnio(int clienteId, int anio);
	public List<Pedido> pedidosAAPorOrden(int id);
}
