package com.turbomaquinas.service.diagnostico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.turbomaquinas.DAO.diagnostico.DetalleDiagnosticoDAO;
import com.turbomaquinas.DAO.diagnostico.EncabezadoDiagnosticoDAO;
import com.turbomaquinas.POJO.diagnostico.EncabezadoDiagnostico;
import com.turbomaquinas.POJO.diagnostico.EncabezadoDiagnosticoVista;

@Service
public class LogicaEncabezadoDiagnostico implements EncabezadoDiagnosticoService{

	@Autowired
	EncabezadoDiagnosticoDAO repositorio;
	@Autowired
	DetalleDiagnosticoDAO repoDetalles;
	
	@Override
	public EncabezadoDiagnosticoVista crear(EncabezadoDiagnostico ed) throws DataAccessException{
		int ultimoLugar = repositorio.recuperarUltimoLugar(ed.getDiagnostico_id());
		ed.setLugar(ultimoLugar + 1);
		int id = repositorio.crear(ed);
		return repositorio.buscar(id);
	}

	@Override
	@Transactional
	public EncabezadoDiagnosticoVista actualizar(EncabezadoDiagnostico ed) throws DataAccessException{
		EncabezadoDiagnosticoVista encabezado = repositorio.buscar(ed.getId());
		if(encabezado.getLugar() != ed.getLugar()){
			repositorio.reordenar_actualiza(ed.getDiagnostico_id(), encabezado.getLugar(), ed.getLugar());
		}
		repositorio.actualizar(ed);
		return repositorio.buscar(ed.getId());		
	}

	@Override
	public EncabezadoDiagnosticoVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<EncabezadoDiagnosticoVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

	@Override
	public int consultarCantidadDetalles(int id) throws DataAccessException {
		return repoDetalles.consultarCantidadPorEncabezado(id);
	}

	@Override
	public boolean borrar(EncabezadoDiagnostico ed) throws DataAccessException {
		if (repositorio.consultarCantidadporDiagnostico(ed.getDiagnostico_id())>1){
			ed.setActivo(0);
			repositorio.actualizar(ed);
			repositorio.reordenar_elimina(ed.getDiagnostico_id(), 
					ed.getLugar());
			return true;
		} else return false;	
	}

}
