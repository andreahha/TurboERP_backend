package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.FacturaVariosDAO;
import com.turbomaquinas.POJO.comercial.FacturaVarios;

@Service
public class LogicaFacturaVarios implements FacturaVariosService {
	
	@Autowired
	FacturaVariosDAO repFV;
	
	@Override
	public FacturaVarios crear(FacturaVarios fv) throws DataAccessException {
		int id = repFV.crear(fv);
		return repFV.buscar(id);
	}

	@Override
	public FacturaVarios actualizar(FacturaVarios fv) throws DataAccessException {
		return repFV.actualizar(fv);
	}

	@Override
	public FacturaVarios buscar(int id) throws DataAccessException {
		return repFV.buscar(id);
	}

	@Override
	public List<FacturaVarios> consultar() throws DataAccessException {
		return repFV.consultar();
	}

	@Override
	public void cancelar(FacturaVarios fv) throws DataAccessException {
		repFV.cancelar(fv);		
	}

}
