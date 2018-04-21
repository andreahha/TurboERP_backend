package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.SubindiceActividadAutorizadaDAO;
import com.turbomaquinas.POJO.general.SubindiceActividadAutorizada;
import com.turbomaquinas.POJO.general.SubindiceActividadAutorizadaVista;

@Service
public class LogicaSubindiceActividadAutorizada implements SubindiceActividadAutorizadaService{

	@Autowired
	SubindiceActividadAutorizadaDAO repositorio;
	
	@Override
	public SubindiceActividadAutorizadaVista crear(SubindiceActividadAutorizada s) throws DataAccessException{
		int ultimoLugar = repositorio.recuperarUltimoLugar(s.getActividades_autorizadas_id());
		int id = repositorio.crear(s);
		if(s.getLugar() <= ultimoLugar){
			//reordenar lugares de los subindices
			repositorio.reordenar(s.getActividades_autorizadas_id(), 
									s.getLugar(), id);
		}
		return repositorio.buscar(id);
	}

	@Override
	public void actualizar(SubindiceActividadAutorizada s) throws DataAccessException{
		SubindiceActividadAutorizadaVista subindice = buscar(s.getId());
		repositorio.actualizar(s);
		if(subindice.getLugar() != s.getLugar()){
			repositorio.reordenar(s.getActividades_autorizadas_id(), 
									s.getLugar(), s.getId());
		}
	}

	@Override
	public SubindiceActividadAutorizadaVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<SubindiceActividadAutorizadaVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

}
