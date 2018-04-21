package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.DTPrecotizacionDAO;
import com.turbomaquinas.POJO.comercial.DTPrecotizacion;

@Service
public class LogicaDTPrecotizacion implements DTPrecotizacionService {
	
	@Autowired
	DTPrecotizacionDAO repDTPrecotiza;

	@Override
	public DTPrecotizacion crear(DTPrecotizacion dtp) throws DataAccessException {
		int id = repDTPrecotiza.crear(dtp);
		return repDTPrecotiza.buscar(id);
	}

	@Override
	public DTPrecotizacion actualizar(DTPrecotizacion dtp) throws DataAccessException {
		return repDTPrecotiza.actualizar(dtp);
	}

	@Override
	public DTPrecotizacion buscar(int id) throws DataAccessException {
		return repDTPrecotiza.buscar(id);
	}

	@Override
	public List<DTPrecotizacion> consultar() throws DataAccessException {
		return repDTPrecotiza.consultar();
	}

}
