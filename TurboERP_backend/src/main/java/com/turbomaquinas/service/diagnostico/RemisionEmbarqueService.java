package com.turbomaquinas.service.diagnostico;

import java.util.List;

import com.turbomaquinas.POJO.diagnostico.DocumentoRemisionEmbarque;
import com.turbomaquinas.POJO.diagnostico.RemisionesEmbarqueVista;

public interface RemisionEmbarqueService {

	public void aplicarRemisionEmbarque(DocumentoRemisionEmbarque doc);
	public RemisionesEmbarqueVista buscar(int id);
	public List<RemisionesEmbarqueVista> consultarREPorOrden(int idOrden);
	public List<RemisionesEmbarqueVista> remisionEmbarqueFecha(String fechainicio, String fechafin);

}
