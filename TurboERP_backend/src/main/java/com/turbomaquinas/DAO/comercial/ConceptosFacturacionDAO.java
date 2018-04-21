package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.ConceptosFacturacion;
import com.turbomaquinas.POJO.comercial.ConceptosFacturacionVista;

public interface ConceptosFacturacionDAO {
	
	public int crear(ConceptosFacturacion cf);
	public ConceptosFacturacion actualizar (ConceptosFacturacion cf);
	public ConceptosFacturacionVista buscar(int id);
	public List<ConceptosFacturacionVista> consultar();
	public void desactivar(int id, int modificado_por);

}
