package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.FacturaFinal;
import com.turbomaquinas.POJO.comercial.FacturaFinalVista;
import com.turbomaquinas.POJO.general.OrdenFactura;

public interface FacturaFinalService {

	public FacturaFinalVista crear(FacturaFinal ff);
	public FacturaFinal actualizar(FacturaFinal ff);
	public FacturaFinalVista buscar(int id);
	public List<FacturaFinalVista> consultar();
	public void cancelar(FacturaFinal ff);	
	public FacturaFinalVista facturaaSustituir (int numero);
	public FacturaFinalVista buscarPorNumero (int numero, String tipo);
	public List<FacturaFinal> consultarFacturasPendientesPorCliente(int id,String moneda);
	public List<OrdenFactura> consultarOrdenes(int id);

}
