package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.ConceptosNotasCredito;
import com.turbomaquinas.POJO.comercial.ConceptosNotasCreditoVista;

public interface ConceptosNotasCreditoDAO {
	
	public ConceptosNotasCreditoVista buscar(int id);
	public List<ConceptosNotasCredito> consultar();

}
