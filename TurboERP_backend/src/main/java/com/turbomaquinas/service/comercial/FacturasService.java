package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.Facturas;

public interface FacturasService {
	
	public List<Facturas> consultarFacturasPendientesPorCliente(int id, String moneda);

}
