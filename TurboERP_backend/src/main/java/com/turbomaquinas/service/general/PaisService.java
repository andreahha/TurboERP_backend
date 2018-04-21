package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Estado;
import com.turbomaquinas.POJO.general.Pais;

public interface PaisService {
	
	public Pais buscar(String clave);
	public List<Pais> consultar();
	public List<Estado> consultarEstados(int id);	
}
