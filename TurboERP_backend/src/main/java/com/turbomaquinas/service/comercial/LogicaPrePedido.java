package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.PrePedidoDAO;
import com.turbomaquinas.POJO.comercial.PrePedido;

@Service
public class LogicaPrePedido implements PrePedidoService{

	@Autowired
	PrePedidoDAO repositorio;
	
	@Override
	public PrePedido crear(PrePedido pp) throws DataAccessException{
		int id = repositorio.crear(pp);
		return repositorio.buscar(id);
	}

	@Override
	public void actualizar(PrePedido pp) throws DataAccessException{
		repositorio.actualizar(pp);
	}

	@Override
	public PrePedido buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<PrePedido> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

	@Override
	public List<Integer> aniosPrepedido(int id) throws DataAccessException{
		return repositorio.aniosPrepedido(id);
	}

	@Override
	public List<PrePedido> filtrarAnioCliente(String anio, int id) throws DataAccessException{
		return repositorio.filtrarAnioCliente(anio, id);
	}

	@Override
	public List<PrePedido> prePedidosAAPorOrden(int id) throws DataAccessException{
		return repositorio.prePedidosAAPorOrden(id);
	}
}
