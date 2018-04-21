package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.turbomaquinas.DAO.comercial.DetalleCotizacionDAO;
import com.turbomaquinas.DAO.comercial.EncabezadoCotizacionDAO;
import com.turbomaquinas.POJO.comercial.EncabezadoCotizacion;
import com.turbomaquinas.POJO.comercial.EncabezadoCotizacionVista;

@Service
public class LogicaEncabezadoCotizacion implements EncabezadoCotizacionService{

	@Autowired
	EncabezadoCotizacionDAO repositorio;
	@Autowired
	DetalleCotizacionDAO repoDetalles;
	
	@Override
	public EncabezadoCotizacionVista crear(EncabezadoCotizacion ec) throws DataAccessException{
		int ultimoLugar = repositorio.recuperarUltimoLugar(ec.getCotizaciones_id());
		ec.setLugar(ultimoLugar + 1);
		int id = repositorio.crear(ec);
		return repositorio.buscar(id);
	}

	@Override
	@Transactional
	public EncabezadoCotizacionVista actualizar(EncabezadoCotizacion ec) throws DataAccessException{
		EncabezadoCotizacionVista encabezado = repositorio.buscar(ec.getId());
		if(encabezado.getLugar() != ec.getLugar()){
			repositorio.reordenar_actualiza(ec.getCotizaciones_id(), 
							ec.getLugar(), encabezado.getLugar());
			
		}
		repositorio.actualizar(ec);
		return repositorio.buscar(ec.getId());
	}

	@Override
	public EncabezadoCotizacionVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<EncabezadoCotizacionVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}
	
	@Override
	public int consultarCantidadDetalles(int id) throws DataAccessException {
		return repoDetalles.consultarCantidadPorEncabezado(id);
	}
	
	@Override
	public boolean borrar(EncabezadoCotizacion ec) throws DataAccessException {
		if (repositorio.consultarCantidadporCotizacion(ec.getCotizaciones_id())>1){
			ec.setActivo(0);
			repositorio.actualizar(ec);
			repositorio.reordenar_elimina(ec.getCotizaciones_id(), 
					ec.getLugar());
			return true;
		} else return false;	
	}
}
