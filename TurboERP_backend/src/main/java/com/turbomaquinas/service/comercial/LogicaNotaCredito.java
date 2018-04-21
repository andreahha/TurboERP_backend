package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.NotaCreditoDAO;
import com.turbomaquinas.POJO.comercial.NotaCredito;
import com.turbomaquinas.POJO.comercial.NotaCreditoVista;

@Service
public class LogicaNotaCredito implements NotaCreditoService {

	@Autowired
	NotaCreditoDAO repNc;
	
	@Override
	public NotaCreditoVista crear(NotaCredito nc) throws DataAccessException {
		int id = repNc.crear(nc);
		return repNc.buscar(id);
	}

	@Override
	public void actualizar(NotaCredito nc) throws DataAccessException {
		repNc.actualizar(nc);
		
	}

	@Override
	public NotaCreditoVista buscar(int id) throws DataAccessException {
		return repNc.buscar(id);
	}

	@Override
	public List<NotaCreditoVista> consultar() throws DataAccessException {
		return repNc.consultar();
	}

}
