package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.FacturaVarios;
import com.turbomaquinas.POJO.comercial.FacturaVariosVista;

public interface FacturaVariosService {

	public FacturaVariosVista crear(FacturaVarios fv);
	public void actualizar(FacturaVarios fv);
	public FacturaVariosVista buscar(int id);
	public List<FacturaVariosVista> consultar();
	public void cancelar(FacturaVarios fv);
	public List<FacturaVariosVista> consultarFacturasVariosPendientesPorCliente(int id, String moneda);
	public FacturaVariosVista buscarFacturaFolio(String folio, String estado, String tipo);
	public FacturaVariosVista buscarPorTipoNumero(int numero, String tipo, String estado); 
	
}
