package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.FacturaVariosDAO;
import com.turbomaquinas.POJO.comercial.DocumentoFacturaVarios;
import com.turbomaquinas.POJO.comercial.FacturaVarios;
import com.turbomaquinas.POJO.comercial.FacturaVariosVista;

@Service
public class LogicaFacturaVarios implements FacturaVariosService {
	
	@Autowired
	FacturaVariosDAO repFV;

	@Override
	public void actualizar(FacturaVarios fv) throws DataAccessException {
		repFV.actualizar(fv);
	}

	@Override
	public FacturaVariosVista buscar(int id) throws DataAccessException {
		return repFV.buscar(id);
	}

	@Override
	public List<FacturaVariosVista> consultar() throws DataAccessException {
		return repFV.consultar();
	}

	@Override
	public void cancelar(FacturaVarios fv) throws DataAccessException {
		repFV.cancelar(fv);		
	}

	@Override
	public List<FacturaVariosVista> consultarFacturasVariosPendientesPorCliente(int id, String moneda) {
		return repFV.consultarFacturasVariosPendientesPorCliente(id,moneda);
	}

	@Override
	public FacturaVariosVista buscarFacturaFolio(String folio, String estado, String tipo) {
		return repFV.buscarFacturaFolio(folio, estado, tipo);
	}

	@Override
	public FacturaVariosVista buscarPorTipoNumero(int numero, String tipo, String estado) {
		return repFV.buscarPorTipoNumero(numero, tipo,estado);
	}

	@Override
	public FacturaVariosVista crearDoc(DocumentoFacturaVarios doc) {
		int id = repFV.crearDoc(doc.toString());
		return repFV.buscar(id);
	}

}
