package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.FacturaVariosDetalleDAO;
import com.turbomaquinas.POJO.comercial.FacturaVariosDetalle;

@Service
public class LogicaFacturaVariosDetalle implements FacturaVariosDetalleService{

	@Autowired
	FacturaVariosDetalleDAO repositorio;
	
	@Override
	public FacturaVariosDetalle crear(FacturaVariosDetalle fvd) throws DataAccessException{
		int id = repositorio.crear(fvd);
		return repositorio.buscar(id);
	}

	@Override
	public FacturaVariosDetalle actualizar(FacturaVariosDetalle fvd) throws DataAccessException{
		return repositorio.actualizar(fvd);
	}

	@Override
	public FacturaVariosDetalle buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<FacturaVariosDetalle> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

}
