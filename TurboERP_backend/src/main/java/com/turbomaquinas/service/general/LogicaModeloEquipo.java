package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.ModeloEquipoDAO;
import com.turbomaquinas.POJO.general.ModeloEquipo;

@Service
public class LogicaModeloEquipo implements ModeloEquipoService{
	
	@Autowired
	ModeloEquipoDAO repModelo;

	@Override
	public ModeloEquipo buscar(int id) throws DataAccessException {
		return repModelo.buscar(id);
	}

	@Override
	public List<ModeloEquipo> consultar() throws DataAccessException {
		return repModelo.consultar();
	}

	@Override
	public ModeloEquipo crear(ModeloEquipo md) throws DataAccessException {
		return repModelo.crear(md);
	}

	@Override
	public ModeloEquipo actualizar(ModeloEquipo md) throws DataAccessException {
		return repModelo.actualizar(md);
	}

}
