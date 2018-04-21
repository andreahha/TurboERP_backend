package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.CiudadDAO;
import com.turbomaquinas.POJO.general.Ciudad;
import com.turbomaquinas.POJO.general.CiudadVista;

@Service
public class LogicaCiudad implements CiudadService {
	
	@Autowired
	CiudadDAO repCiudad;

	@Override
	public CiudadVista crear(Ciudad c)throws DataAccessException {
		int id = repCiudad.crear(c);
		return repCiudad.buscar(id);
	}

	@Override
	public Ciudad actualizar(Ciudad c)throws DataAccessException {
		return repCiudad.actualizar(c);
	}

	@Override
	public CiudadVista buscar(int id) throws DataAccessException {
		return repCiudad.buscar(id);
	}

	@Override
	public List<CiudadVista> consultar() throws DataAccessException {
		return repCiudad.consultar();
	}	

}
