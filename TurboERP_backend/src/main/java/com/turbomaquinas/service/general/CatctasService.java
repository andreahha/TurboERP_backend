package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Catctas;

public interface CatctasService {
	
	public Catctas buscar (String cuenta);
	public List<Catctas> consultar();
}
