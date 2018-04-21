package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.UsoCfdi;

public interface UsoCfdiService {
	
	public UsoCfdi buscar(String clave);
	public List<UsoCfdi> consultar();

}
