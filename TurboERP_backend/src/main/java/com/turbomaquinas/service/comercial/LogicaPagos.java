package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.PagosDAO;
import com.turbomaquinas.POJO.comercial.Pagos;
import com.turbomaquinas.POJO.comercial.PagosVista;

@Service
public class LogicaPagos implements PagosService {

	@Autowired
	PagosDAO resPago;
	
	@Override
	public PagosVista crear(Pagos p) throws DataAccessException {
		int id = resPago.crear(p);
		return resPago.buscar(id);
	}

	@Override
	public Pagos actualizar(Pagos p) throws DataAccessException {
		return resPago.actualizar(p);
	}

	@Override
	public PagosVista buscar(int id) throws DataAccessException {
		return resPago.buscar(id);
	}

	@Override
	public List<PagosVista> consultar() throws DataAccessException {
		return resPago.consultar();
	}
	
	

}
