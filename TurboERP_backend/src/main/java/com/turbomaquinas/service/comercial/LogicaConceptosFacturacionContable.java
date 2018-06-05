package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.ConceptosFacturacionContableDAO;
import com.turbomaquinas.POJO.comercial.ConceptosFacturacionContable;
import com.turbomaquinas.POJO.comercial.ConceptosFacturacionContableVista;

@Service
public class LogicaConceptosFacturacionContable implements ConceptosFacturacionContableService {

	@Autowired
	ConceptosFacturacionContableDAO repCNC;
	
	@Override
	public ConceptosFacturacionContableVista buscar(int id) {
		return repCNC.buscar(id);
	}
	
	@Override
	public List<ConceptosFacturacionContableVista> consultar() {
		return repCNC.consultar();
	}

	@Override
	public ConceptosFacturacionContableVista crear(ConceptosFacturacionContable cnc) {
		int id = repCNC.crear(cnc);
		return repCNC.buscar(id);
	}

	@Override
	public void desactivar(int id, int modificado_por) {
		repCNC.desactivar(id, modificado_por);
	}


	


}
