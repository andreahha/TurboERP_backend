package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.turbomaquinas.DAO.general.ActividadAutorizadaDAO;
import com.turbomaquinas.DAO.general.OTIrregularDAO;
import com.turbomaquinas.POJO.general.DocumentoOTIrregular;
import com.turbomaquinas.POJO.general.OTIrregular;
import com.turbomaquinas.POJO.general.OTIrregularVista;

@Service
public class LogicaOTIrregular implements OTIrregularService {
	
	@Autowired
	OTIrregularDAO repOTI;

	@Autowired
	ActividadAutorizadaDAO repoAA;
	
	@Override
	@Transactional
	public OTIrregularVista crearOTIrregular(DocumentoOTIrregular doc) throws DataAccessException{
		int ordenId = repoAA.buscarOrdenPorAAOTI(doc.getActividades_Ids().get(0));

		int id = repOTI.crear(doc.getIniciales(), doc.getFecha_regularizacion(), doc.getComentarios(), doc.getProceso(), 
				doc.getCreado_por(), doc.getOrdenes_id(), doc.getContactos_id());
		repoAA.actualizarOTIrregular(ordenId, id, doc.getActividades_Ids());
		return repOTI.buscar(id);
	}

	@Override
	public void actualizar(OTIrregular oti) throws DataAccessException {
		repOTI.actualizar(oti);
	}

	@Override
	public OTIrregularVista buscar(int id) throws DataAccessException {
		return repOTI.buscar(id);
	}

	@Override
	public List<OTIrregularVista> consultar() throws DataAccessException {
		return repOTI.consultar();
	}

	@Override
	public OTIrregularVista buscarOTIrregular(String Folio) throws DataAccessException{
		return repOTI.buscarOTIrregular(Folio);
	}

	@Override
	public void aceptaOTI(int id, int usuarioAcepta, String estado) throws DataAccessException{
		repOTI.aceptaOTI(id, usuarioAcepta, estado);
		
	}
}
