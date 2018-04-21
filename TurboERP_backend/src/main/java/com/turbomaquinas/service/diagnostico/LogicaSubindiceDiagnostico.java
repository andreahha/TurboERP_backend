package com.turbomaquinas.service.diagnostico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.turbomaquinas.DAO.diagnostico.SubindiceDiagnosticoDAO;
import com.turbomaquinas.POJO.diagnostico.SubindiceDiagnostico;
import com.turbomaquinas.POJO.diagnostico.SubindiceDiagnosticoVista;

@Service
public class LogicaSubindiceDiagnostico implements SubindiceDiagnosticoService{

	@Autowired
	SubindiceDiagnosticoDAO repositorio;
	
	@Override
	public SubindiceDiagnosticoVista crear(SubindiceDiagnostico sd) throws DataAccessException{
		int ultimoLugar = repositorio.recuperarUltimoLugar(sd.getDetalle_diagnostico_id());
		sd.setLugar(ultimoLugar + 1);
		int id = repositorio.crear(sd);
		return repositorio.buscar(id);
	}

	@Override
	@Transactional
	public SubindiceDiagnosticoVista actualizar(SubindiceDiagnostico sd) throws DataAccessException{
		SubindiceDiagnosticoVista subindice = repositorio.buscar(sd.getId());
		if(subindice.getLugar() != sd.getLugar()){
			repositorio.reordenar_actualiza(sd.getDetalle_diagnostico_id(),
					  			  sd.getLugar(), subindice.getLugar());
		}
		repositorio.actualizar(sd);
		return repositorio.buscar(sd.getId());
	}

	@Override
	public SubindiceDiagnosticoVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<SubindiceDiagnosticoVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

	@Override
	public boolean borrar(SubindiceDiagnostico sd) throws DataAccessException {
		sd.setActivo(0);
		repositorio.actualizar(sd);
		repositorio.reordenar_elimina(sd.getDetalle_diagnostico_id(), sd.getLugar());
		return true;
	}

}
