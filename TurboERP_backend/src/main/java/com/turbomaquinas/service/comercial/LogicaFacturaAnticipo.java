package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.FacturaAnticipoDAO;
import com.turbomaquinas.POJO.comercial.FacturaAnticipo;

@Service
public class LogicaFacturaAnticipo implements FacturaAnticipoService {
	
	@Autowired
	FacturaAnticipoDAO respFA;

	@Override
	public FacturaAnticipo crear(FacturaAnticipo fa) throws DataAccessException {
		int id = respFA.crear(fa);
		return respFA.buscar(id);
	}

	@Override
	public FacturaAnticipo actualizar(FacturaAnticipo fa) throws DataAccessException  {
		return respFA.actualizar(fa);
	}

	@Override
	public FacturaAnticipo buscar(int id) throws DataAccessException  {
		return respFA.buscar(id);
	}

	@Override
	public List<FacturaAnticipo> consultar()  throws DataAccessException  {
		return respFA.consultar();
	}

}
