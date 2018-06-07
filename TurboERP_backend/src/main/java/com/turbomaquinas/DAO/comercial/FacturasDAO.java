package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.Facturas;

public interface FacturasDAO {
	
	public List<Facturas> consultarFacturasPendientesPorCliente(int id, String moneda);
	public Facturas buscar(int id, String tipo);

}
