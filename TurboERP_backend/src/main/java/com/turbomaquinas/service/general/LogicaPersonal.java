package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.PersonalDAO;
import com.turbomaquinas.POJO.general.Personal;
import com.turbomaquinas.POJO.general.PersonalVista;

@Service
public class LogicaPersonal implements PersonalService {
	
	@Autowired
	PersonalDAO repPersonal;

	@Override
	public PersonalVista crear(Personal p) throws DataAccessException {
		int id = repPersonal.crear(p);
		return repPersonal.buscar(id);
	}

	@Override
	public PersonalVista actualizar(Personal p) throws DataAccessException {
		repPersonal.actualizar(p);
		return repPersonal.buscar(p.getId());
	}

	@Override
	public PersonalVista buscar(int id) throws DataAccessException {
		return repPersonal.buscar(id);
	}

	@Override
	public List<PersonalVista> consultar() throws DataAccessException {
		return repPersonal.consultar();
	}

	@Override
	public PersonalVista buscarPorNumero(int numero) throws DataAccessException{
		return repPersonal.buscarPorNumero(numero);
	}

	@Override
	public PersonalVista buscarPersonalAutorizadoRE(int numero) throws DataAccessException {
		return repPersonal.buscarPersonalAutorizadoRE(numero);
	}

	@Override
	public List<PersonalVista> consultarPersonalAutorizadoRE() throws DataAccessException {
		return repPersonal.consultarPersonalAutorizadoRE();
	}

	@Override
	public PersonalVista buscarPersonalCompras(int numero) {
		return repPersonal.buscarPersonalCompras(numero);
	}

	@Override
	public List<PersonalVista> consultarPersonalCompras() {
		return repPersonal.consultarPersonalCompras();
	}

}
