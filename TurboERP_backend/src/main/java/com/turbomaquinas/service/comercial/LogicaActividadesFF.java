package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.ActividadesFFDAO;
import com.turbomaquinas.DAO.comercial.ConceptosFacturacionDAO;
import com.turbomaquinas.POJO.comercial.ActividadesFF;
import com.turbomaquinas.POJO.comercial.ConceptosFacturacionVista;

@Service
public class LogicaActividadesFF implements ActividadesFFService {
	
	@Autowired
	ActividadesFFDAO repAFF;
	
	@Autowired
	ConceptosFacturacionDAO repCF;

	@Override
	public ActividadesFF crear(ActividadesFF aff) throws DataAccessException {
		ConceptosFacturacionVista cfv = repCF.buscar(aff.getConceptos_facturacion_id());
		aff.setMedidas_sat_id(cfv.getMedidas_sat_id());
		aff.setProductos_sat_id(cfv.getProductos_sat_id());
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
