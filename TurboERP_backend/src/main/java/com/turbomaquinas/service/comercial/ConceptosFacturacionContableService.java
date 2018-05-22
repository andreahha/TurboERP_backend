package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.ConceptosFacturacionContable;
import com.turbomaquinas.POJO.comercial.ConceptosFacturacionContableVista;

public interface ConceptosFacturacionContableService {
	
	public ConceptosFacturacionContableVista buscar(int id);
	public List<ConceptosFacturacionContableVista> consultar();
	public ConceptosFacturacionContableVista crear(ConceptosFacturacionContable cnc); 
	public void desactivar(int id, int modificado_por);
	
}
