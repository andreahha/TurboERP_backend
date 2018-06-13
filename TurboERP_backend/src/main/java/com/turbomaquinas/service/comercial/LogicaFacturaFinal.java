package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.turbomaquinas.DAO.comercial.ActividadesFFDAO;
import com.turbomaquinas.DAO.comercial.FacturaFinalDAO;
import com.turbomaquinas.POJO.comercial.ActividadesFFVista;
import com.turbomaquinas.POJO.comercial.DocumentoFacturaFinal;
import com.turbomaquinas.POJO.comercial.FacturaFinal;
import com.turbomaquinas.POJO.comercial.FacturaFinalVista;
import com.turbomaquinas.POJO.general.OrdenFactura;
import com.turbomaquinas.service.general.OrdenService;

@Service
public class LogicaFacturaFinal implements FacturaFinalService {
	
	@Autowired
	FacturaFinalDAO repFF;
	
	@Autowired
	OrdenService serviceOrden;
	
	@Autowired
	ActividadesFFDAO repActividadesFF;

	
	@Override
	public FacturaFinal actualizar(FacturaFinal ff) throws DataAccessException {
		return repFF.actualizar(ff);
	}

	@Override
	public FacturaFinalVista buscar(int id) throws DataAccessException {
		return repFF.buscar(id);
	}

	@Override
	public List<FacturaFinalVista> consultar() throws DataAccessException {
		return repFF.consultar();
	}

	@Override
	public void cancelar(FacturaFinal ff) throws DataAccessException {
			repFF.cancelar(ff);
	}

	@Override
	public FacturaFinalVista buscarPorTipoNumero(int numero, String tipo,String estado) throws DataAccessException {
		return repFF.buscarPorTipoNumero(numero, tipo,estado);
	}
	
	@Override
	public List<FacturaFinalVista> consultarFacturasPendientesPorCliente(int id,String moneda) {		
		return repFF.consultarFacturasPendientesPorCliente(id,moneda);
	}

	@Override
	public List<OrdenFactura> consultarOrdenes(int id) {
		return serviceOrden.consultarOrdenesPorIdsFactura(repFF.consultarIdsOrdenesFactura(id),id);
	}

	@Override
	public FacturaFinalVista buscarFacturaFolio(String folio, String estado, String tipo) {
		return repFF.buscarFacturaFolio(folio, estado, tipo);
	}

	@Override
	@Transactional
	public FacturaFinalVista creardoc(DocumentoFacturaFinal doc) throws DataAccessException {
		int id = repFF.creardoc(doc.toString());
		return repFF.buscar(id);
	}

	@Override
	public List<ActividadesFFVista> consultarActividadesPorFactura(int id) {
		return repActividadesFF.consultarPorFactura(id);
	}

	@Override
	public List<FacturaFinalVista> consultarPorEstado(String estado) {
		return repFF.consultarPorEstado(estado);
	}

	@Override
	public List<FacturaFinalVista> consultarPorIds(List<Integer> lista) {
		return repFF.consultarFacturasPorIds(lista);
	}

	@Override
	public void actualizarEstado(int id, String estado) {
		repFF.actualizarEstado(id,estado);
	}

	@Override
	public FacturaFinalVista buscarUltimaFacturaPorTipo(String tipo) {
		return repFF.buscarUltimaFacturaPorTipo(tipo);
	}

	@Override
	public void actualizarIdAlfresco(int id, String alfresco_id) {
		repFF.actualizarIdAlfresco(id,alfresco_id);
	}
	
	@Override
	public String obtenerJSONFacturaFinal(int idFactura,String modo) throws DataAccessException {
		return repFF.obtenerJSONFacturaFinal(idFactura,modo);
	}

	@Override
	public String obtenerJSONCancelarFacturaFinal(int idFactura, String modo,String justificacion) {
		return repFF.obtenerJSONCancelarFacturaFinal(idFactura,modo,justificacion);
	}

}
