package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.ProductosSat;

public interface ProductosSatService {
	
	public ProductosSat buscar(String codigo);
	public List<ProductosSat> consultar();

}
