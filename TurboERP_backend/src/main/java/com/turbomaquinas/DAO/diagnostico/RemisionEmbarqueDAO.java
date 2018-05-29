package com.turbomaquinas.DAO.diagnostico;

import java.util.List;

import com.turbomaquinas.POJO.diagnostico.RemisionesEmbarqueVista;

public interface RemisionEmbarqueDAO {
	
	public void RemisionEmbarque(String doc);
	public RemisionesEmbarqueVista buscar(int id);
	public List<RemisionesEmbarqueVista> buscarRemisionOrden(int idOrden);

}
