package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.FechasEstimadasFacturacionDAO;
import com.turbomaquinas.DAO.comercial.JDBCFechasEstimadasFacturacion.DatosFechas;
import com.turbomaquinas.POJO.comercial.FechasEstimadasFacturacion;

@Service
public class LogicaFechasEstimadasFacturacion implements FechasEstimadasFacturacionService {
	
	@Autowired
	FechasEstimadasFacturacionDAO repositorio;

	@Override
	public void crear(FechasEstimadasFacturacion fef) throws DataAccessException{
		repositorio.crear(fef);

	}

	@Override
	public List<DatosFechas> consultarPorOrden(int idOrden) throws DataAccessException {
		return repositorio.consultarPorOrden(idOrden);
	}

	
	

}
