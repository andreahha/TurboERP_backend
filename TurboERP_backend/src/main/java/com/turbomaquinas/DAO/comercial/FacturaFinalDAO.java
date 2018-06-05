package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.FacturaFinal;
import com.turbomaquinas.POJO.comercial.FacturaFinalVista;

public interface FacturaFinalDAO {

	public int crear(FacturaFinal ff);
	public FacturaFinal actualizar(FacturaFinal ff);
	public FacturaFinalVista buscar(int id);
	public List<FacturaFinalVista> consultar();
	public void cancelar(FacturaFinal ff);
	public FacturaFinalVista buscarPorTipoNumero (int numero, String tipo,String estado);
	public List<FacturaFinalVista> consultarFacturasPendientesPorCliente(int id, String moneda);
	public List<Integer> consultarIdsOrdenesFactura(int id);
	public FacturaFinalVista buscarFacturaFolio(String folio, String estado, String tipo);
	public int creardoc(String doc);
	public List<FacturaFinalVista> consultarFacturasPorIds(List<Integer> ids);
	public List<FacturaFinalVista> consultarPorEstado(String estado);
	public void actualizarEstado(int id, String estado);
	
	
}
