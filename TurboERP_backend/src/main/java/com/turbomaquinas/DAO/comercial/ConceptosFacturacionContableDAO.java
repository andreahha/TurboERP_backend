package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.ConceptosFacturacionContable;
import com.turbomaquinas.POJO.comercial.ConceptosFacturacionContableVista;

public interface ConceptosFacturacionContableDAO {
	
	public ConceptosFacturacionContableVista buscar(int id);
	public List<ConceptosFacturacionContableVista> consultar();
	public int crear(ConceptosFacturacionContable cnc);
	public void desactivar(int id, int modificado_por);

}
