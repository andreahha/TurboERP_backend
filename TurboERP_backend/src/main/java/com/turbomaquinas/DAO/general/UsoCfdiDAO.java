package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.UsoCfdi;

public interface UsoCfdiDAO {
	
	public UsoCfdi buscar(String clave);
	public List<UsoCfdi> consultar();

}
