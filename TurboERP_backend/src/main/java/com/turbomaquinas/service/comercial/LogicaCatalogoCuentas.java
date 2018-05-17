package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.CatalogoCuentasDAO;
import com.turbomaquinas.POJO.comercial.CatalogoCuentas;

@Service
public class LogicaCatalogoCuentas implements CatalogoCuentasService{
	
	@Autowired
	CatalogoCuentasDAO repCC;

	@Override
	public List<CatalogoCuentas> consultar() {
		return repCC.consultar();
	}

}
