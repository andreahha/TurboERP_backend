package com.turbomaquinas.service.diagnostico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.diagnostico.RemisionEmbarqueDAO;
import com.turbomaquinas.POJO.diagnostico.DocumentoRemisionEmbarque;
import com.turbomaquinas.POJO.diagnostico.RemisionesEmbarqueVista;

@Service
public class LogicaRemisionEmbarque implements RemisionEmbarqueService{
	
	@Autowired
	RemisionEmbarqueDAO resRemision;

	@Override
	public void aplicarRemisionEmbarque(DocumentoRemisionEmbarque doc) throws DataAccessException{
		
		resRemision.RemisionEmbarque(doc.toString());
		
	}

	@Override
	public RemisionesEmbarqueVista buscar(int id) {
		return resRemision.buscar(id);
	}

	@Override
	public List<RemisionesEmbarqueVista> consultarREPorOrden(int idOrden) {
		return resRemision.buscarRemisionOrden(idOrden);
	}

	@Override
	public List<RemisionesEmbarqueVista> remisionEmbarqueFecha(String fechainicio, String fechafin) {
		
		return resRemision.remisionEmbarqueRangoFecha(fechainicio, fechafin);
	}

}
