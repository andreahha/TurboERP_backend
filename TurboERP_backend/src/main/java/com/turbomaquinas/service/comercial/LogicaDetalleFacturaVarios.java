package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.DetalleFacturaVariosDAO;
import com.turbomaquinas.POJO.comercial.DetalleFacturaVarios;
import com.turbomaquinas.POJO.comercial.DetalleFacturaVariosVista;

@Service
public class LogicaDetalleFacturaVarios implements DetalleFacturaVariosService{

	@Autowired
	DetalleFacturaVariosDAO repositorio;
	
	@Override
	public DetalleFacturaVariosVista crear(DetalleFacturaVarios fvd) throws DataAccessException{
		int id = repositorio.crear(fvd);
		return repositorio.buscar(id);
	}

	@Override
	public void actualizar(DetalleFacturaVarios fvd) throws DataAccessException{
		repositorio.actualizar(fvd);
	}

	@Override
	public DetalleFacturaVariosVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<DetalleFacturaVariosVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

}
