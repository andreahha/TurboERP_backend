package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.turbomaquinas.DAO.comercial.SubindicePrecotizacionDAO;
import com.turbomaquinas.POJO.comercial.SubindicePrecotizacion;
import com.turbomaquinas.POJO.comercial.SubindicePrecotizacionVista;

@Service
public class LogicaSubindicePrecotizacion implements SubindicePrecotizacionService{

	@Autowired
	SubindicePrecotizacionDAO repositorio;
	
	@Override
	public SubindicePrecotizacionVista crear(SubindicePrecotizacion sp) throws DataAccessException{
		int ultimoLugar = repositorio.recuperarUltimoLugar(sp.getDetalle_precotizaciones_id());
		sp.setLugar(ultimoLugar + 1);
		int id = repositorio.crear(sp);
		return repositorio.buscar(id);
	}

	@Override
	@Transactional
	public SubindicePrecotizacionVista actualizar(SubindicePrecotizacion sp) throws DataAccessException{		
		SubindicePrecotizacionVista subindice = repositorio.buscar(sp.getId());
		if(subindice.getLugar() != sp.getLugar()){
			repositorio.reordenar_actualiza(sp.getDetalle_precotizaciones_id(),
					  			  sp.getLugar(), subindice.getLugar());
		}
		repositorio.actualizar(sp);
		return repositorio.buscar(sp.getId());
	}

	@Override
	public SubindicePrecotizacionVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<SubindicePrecotizacionVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

	@Override
	public boolean borrar(SubindicePrecotizacion sp) {
			sp.setActivo(0);
			repositorio.actualizar(sp);
			repositorio.reordenar_elimina(sp.getDetalle_precotizaciones_id(), sp.getLugar());
			return true;
	}

}
