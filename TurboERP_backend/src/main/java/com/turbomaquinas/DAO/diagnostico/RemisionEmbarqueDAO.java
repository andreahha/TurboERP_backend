package com.turbomaquinas.DAO.diagnostico;

import com.turbomaquinas.POJO.diagnostico.RemisionesEmbarqueVista;

public interface RemisionEmbarqueDAO {
	
	public void RemisionEmbarque(String doc);
	public RemisionesEmbarqueVista buscar(int id);

}
