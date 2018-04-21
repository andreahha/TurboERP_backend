package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.ProductosSat;

public interface ProductosSatDAO {
	
	public ProductosSat buscar(String codigo);
	public List<ProductosSat> consultar();

}
