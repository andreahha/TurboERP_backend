package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.DeptoCotizacionDAO;
import com.turbomaquinas.POJO.comercial.DeptoCotizacion;

@Service
public class LogicaDeptosCotizacion implements DeptoCotizacionService {

	@Autowired
	DeptoCotizacionDAO repDepC;
	
	@Override
	public DeptoCotizacion crear(DeptoCotizacion dc) throws DataAccessException {
		int id = repDepC.crear(dc);
		return repDepC.buscar(id);
	}

	@Override
	public DeptoCotizacion actualizar(DeptoCotizacion dc) throws DataAccessException {
		return repDepC.actualizar(dc);
	}

	@Override
	public DeptoCotizacion buscar(int id) throws DataAccessException {
		return repDepC.buscar(id);
	}

	@Override
	public List<DeptoCotizacion> consultar() throws DataAccessException {
		return repDepC.consultar();
	}
	
}
