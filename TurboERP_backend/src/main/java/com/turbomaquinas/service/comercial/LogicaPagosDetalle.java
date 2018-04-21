package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.PagosDetalleDAO;
import com.turbomaquinas.POJO.comercial.PagosDetalle;
import com.turbomaquinas.POJO.comercial.PagosDetalleVista;

@Service
public class LogicaPagosDetalle implements PagosDetalleService {
	
	@Autowired
	PagosDetalleDAO repPD;

	@Override
	public PagosDetalleVista crear(PagosDetalle pd) throws DataAccessException {
		int id = repPD.crear(pd);
		return repPD.buscar(id);
	}

	@Override
	public PagosDetalle actualizar(PagosDetalle pd) throws DataAccessException {
		return repPD.actualizar(pd);
	}

	@Override
	public PagosDetalleVista buscar(int id) throws DataAccessException {
		return repPD.buscar(id);
	}

	@Override
	public List<PagosDetalleVista> consultar() throws DataAccessException {
		return repPD.consultar();
	}

}
