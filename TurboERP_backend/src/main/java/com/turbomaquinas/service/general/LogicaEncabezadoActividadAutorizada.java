package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.EncabezadoActividadAutorizadaDAO;
import com.turbomaquinas.POJO.general.EncabezadoActividadAutorizada;
import com.turbomaquinas.POJO.general.EncabezadoActividadAutorizadaVista;

@Service
public class LogicaEncabezadoActividadAutorizada implements EncabezadoActividadAutorizadaService{

	@Autowired
	EncabezadoActividadAutorizadaDAO repositorio;
	
	@Override
	public EncabezadoActividadAutorizadaVista crear(EncabezadoActividadAutorizada e) throws DataAccessException{
		int ultimoLugar = repositorio.recuperarUltimoLugar(e.getOrdenes_id());
		int id = repositorio.crear(e);
		if(e.getLugar() <= ultimoLugar){
			//reordenar Lugar de los Encabezados
			repositorio.reordenar(e.getOrdenes_id(), 
									e.getLugar(), id);
		}
		return repositorio.buscar(id);
	}

	@Override
	public void actualizar(EncabezadoActividadAutorizada e) throws DataAccessException{
		EncabezadoActividadAutorizadaVista encabezado = buscar(e.getId());
		repositorio.actualizar(e);
		if(encabezado.getLugar() != e.getLugar()){
			repositorio.reordenar(e.getOrdenes_id(), 
									e.getLugar(), e.getId());
		}
	}

	@Override
	public EncabezadoActividadAutorizadaVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<EncabezadoActividadAutorizadaVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

}
