package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.DeptoPrecotizacionDAO;
import com.turbomaquinas.POJO.comercial.DeptoPrecotizacion;
import com.turbomaquinas.POJO.comercial.DeptoPrecotizacionVista;

@Service
public class LogicaDeptoPrecotizacion implements DeptoPrecotizacionService{

	@Autowired
	DeptoPrecotizacionDAO repositorio;
	
	@Override
	public void crear(DeptoPrecotizacion dp) throws DataAccessException{
		repositorio.crear(dp);
	}

	@Override
	public void actualizar(DeptoPrecotizacion dp) throws DataAccessException{
		repositorio.actualizar(dp);
	}

	@Override
	public DeptoPrecotizacionVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<DeptoPrecotizacionVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

}
