package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.ConceptosNotasCreditoDAO;
import com.turbomaquinas.POJO.comercial.ConceptosNotasCredito;
import com.turbomaquinas.POJO.comercial.ConceptosNotasCreditoVista;

@Service
public class LogicaConceptosNotasCredito implements ConceptosNotasCreditoService {

	@Autowired
	ConceptosNotasCreditoDAO repCNC;
	
	@Override
	public ConceptosNotasCreditoVista buscar(int id) {
		return repCNC.buscar(id);
	}
	
	@Override
	public List<ConceptosNotasCredito> consultar() {
		return repCNC.consultar();
	}


}
