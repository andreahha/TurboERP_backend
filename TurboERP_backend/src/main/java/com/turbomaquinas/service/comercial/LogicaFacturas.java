package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.FacturasDAO;
import com.turbomaquinas.POJO.comercial.Facturas;

@Service
public class LogicaFacturas implements FacturasService {
	
	@Autowired
	FacturasDAO repF;

	@Override
	public List<Facturas> consultarFacturasPendientesPorCliente(int id, String moneda) {
		return repF.consultarFacturasPendientesPorCliente(id,moneda);
	}

}
