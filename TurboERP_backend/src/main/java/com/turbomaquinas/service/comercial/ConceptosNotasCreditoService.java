package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.ConceptosNotasCredito;
import com.turbomaquinas.POJO.comercial.ConceptosNotasCreditoVista;

public interface ConceptosNotasCreditoService {
	
	public ConceptosNotasCreditoVista buscar(int id);
	public List<ConceptosNotasCreditoVista> consultar();
	public ConceptosNotasCreditoVista crear(ConceptosNotasCredito cnc); 

}
