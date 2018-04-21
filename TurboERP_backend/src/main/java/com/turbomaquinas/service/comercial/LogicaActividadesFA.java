package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.ActividadesFADAO;
import com.turbomaquinas.POJO.comercial.ActividadesFA;

@Service
public class LogicaActividadesFA implements ActividadesFAService {


	@Autowired
	ActividadesFADAO repAFA;
	
	@Override
	public ActividadesFA crear(ActividadesFA afa) throws DataAccessException {
		int id = repAFA.crear(afa);
		return repAFA.buscar(id);
	}

	@Override
	public ActividadesFA actualizar(ActividadesFA afa) throws DataAccessException {
		return repAFA.actualizar(afa);
	}

	@Override
	public ActividadesFA buscar(int id) throws DataAccessException {
		return repAFA.buscar(id);
	}

	@Override
	public List<ActividadesFA> consultar() throws DataAccessException {
		return repAFA.consultar();
	}

}
