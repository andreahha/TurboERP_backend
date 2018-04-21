package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.CatctasDAO;
import com.turbomaquinas.POJO.general.Catctas;

@Service
public class LogicaCatctas implements CatctasService {
	
	@Autowired
	CatctasDAO repCC;

	@Override
	public Catctas buscar(String cuenta) throws DataAccessException {
		return repCC.buscar(cuenta);
	}

	@Override
	public List<Catctas> consultar() throws DataAccessException {
		return repCC.consultar();
	}

}
