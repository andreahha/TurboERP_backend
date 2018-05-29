package com.turbomaquinas.service.diagnostico;

import com.turbomaquinas.POJO.diagnostico.DocumentoRemisionEmbarque;
import com.turbomaquinas.POJO.diagnostico.RemisionesEmbarqueVista;

public interface RemisionEmbarqueService {

	public void aplicarRemisionEmbarque(DocumentoRemisionEmbarque doc);
	public RemisionesEmbarqueVista buscar(int id);

}
