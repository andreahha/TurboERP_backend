package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.MarcaEquipoDAO;
import com.turbomaquinas.POJO.general.MarcaEquipo;

@Service
public class LogicaMarcaEquipo implements MarcaEquipoService {
	
	@Autowired
	MarcaEquipoDAO repMarca;

	@Override
	public MarcaEquipo buscar(int id) throws DataAccessException {
		return repMarca.buscar(id);
	}

	@Override
	public List<MarcaEquipo> consultar() throws DataAccessException {
		return repMarca.consultar();
	}

	@Override
	public MarcaEquipo crear(MarcaEquipo m) throws DataAccessException {
		return repMarca.crear(m);
	}

	@Override
	public MarcaEquipo actualizar(MarcaEquipo m) throws DataAccessException {
		return repMarca.actualizar(m);
	}
	

}
