package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.FacturaVariosDetalleDAO;
import com.turbomaquinas.POJO.comercial.FacturaVariosDetalle;
import com.turbomaquinas.POJO.comercial.FacturaVariosDetalleVista;

@Service
public class LogicaFacturaVariosDetalle implements FacturaVariosDetalleService{

	@Autowired
	FacturaVariosDetalleDAO repositorio;
	
	@Override
	public FacturaVariosDetalleVista crear(FacturaVariosDetalle fvd) throws DataAccessException{
		int id = repositorio.crear(fvd);
		return repositorio.buscar(id);
	}

	@Override
	public void actualizar(FacturaVariosDetalle fvd) throws DataAccessException{
		repositorio.actualizar(fvd);
	}

	@Override
	public FacturaVariosDetalleVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<FacturaVariosDetalleVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

}
