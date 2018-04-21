package com.turbomaquinas.service.inventarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.inventarios.TransitorioDAO;
import com.turbomaquinas.POJO.inventarios.TransitorioVista;

@Service
public class LogicaTransitorio implements TransitorioService{
	
	@Autowired
	TransitorioDAO repositorio;
	
	@Override
	public List<TransitorioVista> consultarArticulosTransitorios(int almacen) throws DataAccessException{
		return repositorio.consultarArticulosTransitorios(almacen);
	}
	
	@Override
	public void actualizarExistenciaFisica(int articulo_id, int almacen_id, float cantidad) {
		repositorio.actualizarExistenciaFisica(articulo_id, almacen_id, cantidad);
	}
	
	@Override
	public TransitorioVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}
	
	@Override
	public void actualizarUbicacion(int articulo_id, int almacen_id, String ubicaciones[]) {
		repositorio.actualizarUbicacion(articulo_id, almacen_id, ubicaciones);
	}

}
