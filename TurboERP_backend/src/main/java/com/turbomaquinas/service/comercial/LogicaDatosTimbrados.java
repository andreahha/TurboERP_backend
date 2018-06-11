package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.DatosTimbradosDAO;
import com.turbomaquinas.POJO.comercial.DatosTimbrados;

@Service
public class LogicaDatosTimbrados implements DatosTimbradosService {
	
	@Autowired
	DatosTimbradosDAO repDt;

	@Override
	public DatosTimbrados crear(DatosTimbrados dt) throws DataAccessException {
		int id = repDt.crear(dt);
		return repDt.buscar(id);
	}

	@Override
	public DatosTimbrados actualizar(DatosTimbrados dt) throws DataAccessException {
		return repDt.actualizar(dt);
	}

	@Override
	public DatosTimbrados buscar(int id) throws DataAccessException {
		return repDt.buscar(id);
	}

	@Override
	public List<DatosTimbrados> consultar() throws DataAccessException {
		return repDt.consultar();
	}

	@Override
	public void actualizarIdsAlfresco(int id, String alfresco_id_pdf, String alfresco_id_xml) {
		repDt.actualizarIdsAlfresco(id,alfresco_id_pdf,alfresco_id_xml);
	}
	
	@Override
	public void actualizarIdsAlfrescoCancelado(int id, String alfresco_id_pdf_cancelacion, String alfresco_id_xml_cancelacion) {
		repDt.actualizarIdsAlfrescoCancelado(id,alfresco_id_pdf_cancelacion,alfresco_id_xml_cancelacion);
	}

}
