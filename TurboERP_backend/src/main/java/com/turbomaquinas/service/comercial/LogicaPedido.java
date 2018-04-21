package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.PedidoDAO;
import com.turbomaquinas.POJO.comercial.Pedido;

@Service
public class LogicaPedido implements PedidoService {
	
	@Autowired
	PedidoDAO repoPed;

	@Override
	public Pedido crear(Pedido p) throws DataAccessException {
		int id = repoPed.crear(p);
		return repoPed.buscar(id);	
	}

	@Override
	public Pedido actualizar(Pedido p) throws DataAccessException {
		return repoPed.actualizar(p);
	}

	@Override
	public Pedido buscar(int id) throws DataAccessException {
		return repoPed.buscar(id);
	}

	@Override
	public List<Pedido> consultar() throws DataAccessException {
		return repoPed.consultar();
	}

	@Override
	public List<Integer> anioPedidos(int clienteId) throws DataAccessException {
		return repoPed.anioPedidos(clienteId);
	}

	@Override
	public List<Pedido> pedidosAnio(int clienteId, int anio) throws DataAccessException {
		return repoPed.pedidosAnio(clienteId, anio);
	}

	@Override
	public List<Pedido> pedidosAAPorOrden(int id) throws DataAccessException{
		return repoPed.pedidosAAPorOrden(id);
	}


}
