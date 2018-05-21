package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.ActividadesFFDAO;
import com.turbomaquinas.DAO.comercial.ConceptosFacturacionDAO;
import com.turbomaquinas.POJO.comercial.ActividadesFF;

@Service
public class LogicaActividadesFF implements ActividadesFFService {
	
	@Autowired
	ActividadesFFDAO repAFF;
	
	@Autowired
	ConceptosFacturacionDAO repCF;

	@Override
	public ActividadesFF crear(ActividadesFF aff) throws DataAccessException {
		int id = repAFF.crear(aff);
		return repAFF.buscar(id);
	}

	@Override
	public ActividadesFF actualizar(ActividadesFF aff) throws DataAccessException {
		return repAFF.actualizar(aff);
	}

	@Override
	public ActividadesFF buscar(int id) throws DataAccessException {
		return repAFF.buscar(id);
	}

	@Override
	public List<ActividadesFF> consultar() throws DataAccessException {
		return repAFF.consultar();
	}

}
