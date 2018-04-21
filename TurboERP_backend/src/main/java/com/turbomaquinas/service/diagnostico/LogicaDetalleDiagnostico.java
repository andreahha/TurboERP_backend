package com.turbomaquinas.service.diagnostico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.diagnostico.DetalleDiagnosticoDAO;
import com.turbomaquinas.DAO.diagnostico.JDBCDetalleDiagnostico.Deptos;
import com.turbomaquinas.DAO.diagnostico.SubindiceDiagnosticoDAO;
import com.turbomaquinas.POJO.diagnostico.DetalleDiagnostico;
import com.turbomaquinas.POJO.diagnostico.DetalleDiagnostico.ListaDeptos;
import com.turbomaquinas.POJO.diagnostico.DetalleDiagnosticoVista;

@Service
public class LogicaDetalleDiagnostico implements DetalleDiagnosticoService{
	
	@Autowired
	DetalleDiagnosticoDAO repDetDia;
	@Autowired
	SubindiceDiagnosticoDAO repSubDia;

	@Override
	public DetalleDiagnosticoVista crear(DetalleDiagnostico dd) throws DataAccessException {
		int ultimoLugar = repDetDia.recuperarUltimoLugar(dd.getEncabezados_diagnostico_id());
		dd.setLugar(ultimoLugar + 1);
		int id = repDetDia.crear(dd);
		return repDetDia.buscar(id);	
	}

	@Override
	public DetalleDiagnosticoVista actualizar(DetalleDiagnostico dd) throws DataAccessException {
		DetalleDiagnosticoVista detalle = repDetDia.buscar(dd.getId());
		if(detalle.getLugar() != dd.getLugar()){
			repDetDia.reordenar_actualiza(dd.getEncabezados_diagnostico_id(),
					  			  dd.getLugar(), detalle.getLugar());
		}
		repDetDia.actualizar(dd);
		return repDetDia.buscar(dd.getId());
	}

	@Override
	public DetalleDiagnosticoVista buscar(int id) throws DataAccessException {
		return repDetDia.buscar(id);
	}

	@Override
	public List<DetalleDiagnosticoVista> consultar() throws DataAccessException {
		return repDetDia.consultar();
	}

	@Override
	public int consultarCantidadSubindices(int id) throws DataAccessException{
		return repSubDia.consultarCantidadPorDetalle(id);
	}

	@Override
	public boolean borrar(DetalleDiagnostico dd) throws DataAccessException{
		if (repDetDia.consultarCantidadPorEncabezado(dd.getEncabezados_diagnostico_id()) > 1){
			dd.setActivo(0);
			repDetDia.actualizar(dd);
			repDetDia.reordenar_elimina(dd.getEncabezados_diagnostico_id(), dd.getLugar());
			return true;
		} else return false;	
	}

	@Override
	public List<DetalleDiagnosticoVista> consultarPorListaId(List<Integer> ids) throws DataAccessException {
		return repDetDia.consultarPorListaId(ids);
	}

	@Override
	public List<DetalleDiagnosticoVista> consultarAutorizadosPorDetalleCO(int id) throws DataAccessException {
		return repDetDia.consultarAutorizadosPorDetalleCO(id);
	}

	@Override
	public List<DetalleDiagnosticoVista> consultarAutorizadosPorDetalleDI(int id) throws DataAccessException {
		return repDetDia.consultarAutorizadosPorDetalleDI(id);
	}

	@Override
	public void asignarDeptos(int id, ListaDeptos lista) throws DataAccessException {
		repDetDia.asignarDeptos(id, lista);	
	}

	@Override
	public List<Deptos> consultarDeptos(int id) throws DataAccessException {
		return repDetDia.consultarDeptos(id);
	}
}
