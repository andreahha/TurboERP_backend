package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.ProductosSatDAO;
import com.turbomaquinas.POJO.general.ProductosSat;

@Service
public class LogicaProductosSat implements ProductosSatService{
	
	@Autowired
	ProductosSatDAO repPros;

	@Override
	public ProductosSat buscar(String codigo) throws DataAccessException {
		return repPros.buscar(codigo);
	}

	@Override
	public List<ProductosSat> consultar() throws DataAccessException {
		return repPros.consultar();
	}

}
