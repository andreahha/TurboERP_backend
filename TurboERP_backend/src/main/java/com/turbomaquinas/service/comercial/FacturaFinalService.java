package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.ActividadesFFVista;
import com.turbomaquinas.POJO.comercial.DocumentoFacturaFinal;
import com.turbomaquinas.POJO.comercial.FacturaFinal;
import com.turbomaquinas.POJO.comercial.FacturaFinalVista;
import com.turbomaquinas.POJO.general.OrdenFactura;

public interface FacturaFinalService {

	public FacturaFinalVista crear(FacturaFinal ff);
	public FacturaFinal actualizar(FacturaFinal ff);
	public FacturaFinalVista buscar(int id);
	public List<FacturaFinalVista> consultar();
	public void cancelar(FacturaFinal ff);	
	public FacturaFinalVista buscarPorTipoNumero (int numero, String tipo,String estado);
	public List<FacturaFinalVista> consultarFacturasPendientesPorCliente(int id,String moneda);
	public List<OrdenFactura> consultarOrdenes(int id);
	public FacturaFinalVista buscarFacturaFolio(String folio, String estado, String tipo);
	public FacturaFinalVista creardoc(DocumentoFacturaFinal doc);
	public List<ActividadesFFVista> consultarActividadesPorFactura(int id);
	public List<FacturaFinalVista> consultarPorEstado(String estado);
	public List<FacturaFinalVista> consultarPorIds(List<Integer> lista);
	public void actualizarEstado(int id,String estado);

}
