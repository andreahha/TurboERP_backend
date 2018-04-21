package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.PrePedido;

public interface PrePedidoDAO {
	public int crear(PrePedido pp);
	public void actualizar(PrePedido pp);
	public PrePedido buscar(int id);
	public List<PrePedido> consultar();
	public List<Integer> aniosPrepedido(int id);
	public List<PrePedido> filtrarAnioCliente(String anio, int id);
	public List<PrePedido> prePedidosAAPorOrden(int id);
}
