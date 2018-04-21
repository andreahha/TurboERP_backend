package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.EquipoPorRecibirDAO;
import com.turbomaquinas.POJO.comercial.EquipoPorRecibir;
import com.turbomaquinas.POJO.comercial.EquipoPorRecibirVista;

@Service
public class LogicaEquipoPorRecibir implements EquipoPorRecibirService{

	@Autowired
	EquipoPorRecibirDAO repositorio;
	
	@Override
	public void crear(EquipoPorRecibir epr) throws DataAccessException{
		repositorio.crear(epr);
	}

	@Override
	public void actualizar(EquipoPorRecibir epr) throws DataAccessException{
		repositorio.actualizar(epr);
	}

	@Override
	public EquipoPorRecibirVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<EquipoPorRecibirVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

	@Override
	public List<EquipoPorRecibirVista> ConsultarPorCliente(int id) {
		return repositorio.ConsultarPorCliente(id);
	}

	@Override
	public boolean borrar(EquipoPorRecibir epr) throws DataAccessException{
		epr.setActivo(0);
		repositorio.actualizar(epr);
		return true;
	}

	

}
