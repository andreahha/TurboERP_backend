package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.ConceptosFacturacionDAO;
import com.turbomaquinas.POJO.comercial.ConceptosFacturacion;
import com.turbomaquinas.POJO.comercial.ConceptosFacturacionVista;

@Service
public class LogicaConceptosFacturacion implements ConceptosFacturacionService {
	
	@Autowired
	ConceptosFacturacionDAO repCF;

	@Override
	public ConceptosFacturacionVista crear(ConceptosFacturacion cf) {
		int id = repCF.crear(cf);
		return repCF.buscar(id);
	}

	@Override
	public ConceptosFacturacion actualizar(ConceptosFacturacion cf) {
		return repCF.actualizar(cf);
	}

	@Override
	public ConceptosFacturacionVista buscar(int id) {
		return repCF.buscar(id);
	}

	@Override
	public List<ConceptosFacturacionVista> consultar() {
		return repCF.consultar();
	}

	@Override
	public void desactivar(int id, int modificado_por) {
		repCF.desactivar(id,modificado_por);
		
	}

}
