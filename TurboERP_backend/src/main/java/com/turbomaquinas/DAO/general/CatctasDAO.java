package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Catctas;

public interface CatctasDAO {
	
	public Catctas buscar (String cuenta);
	public List<Catctas> consultar();
}
