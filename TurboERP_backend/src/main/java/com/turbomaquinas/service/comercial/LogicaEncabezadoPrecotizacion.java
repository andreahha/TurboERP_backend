package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.turbomaquinas.DAO.comercial.DetallePrecotizacionDAO;
import com.turbomaquinas.DAO.comercial.EncabezadoPrecotizacionDAO;
import com.turbomaquinas.POJO.comercial.EncabezadoPrecotizacion;
import com.turbomaquinas.POJO.comercial.EncabezadoPrecotizacionVista;

@Service
public class LogicaEncabezadoPrecotizacion implements EncabezadoPrecotizacionService{

	@Autowired
	EncabezadoPrecotizacionDAO repositorio;
	@Autowired
	DetallePrecotizacionDAO repoDetalles;
	
	@Override
	public EncabezadoPrecotizacionVista crear(EncabezadoPrecotizacion ep) throws DataAccessException{
		int ultimoLugar = repositorio.recuperarUltimoLugar(ep.getPrecotizaciones_id());
		ep.setLugar(ultimoLugar + 1);
		int id = repositorio.crear(ep);
		return repositorio.buscar(id);
	}

	@Override
	@Transactional
	public EncabezadoPrecotizacionVista actualizar(EncabezadoPrecotizacion ep) throws DataAccessException{
		EncabezadoPrecotizacionVista encabezado = repositorio.buscar(ep.getId());
		if(encabezado.getLugar() != ep.getLugar()){
			repositorio.reordenar_actualiza(ep.getPrecotizaciones_id(), 
								ep.getLugar(), encabezado.getLugar());
		}
		repositorio.actualizar(ep);
		return repositorio.buscar(ep.getId());
	}

	@Override
	public EncabezadoPrecotizacionVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<EncabezadoPrecotizacionVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

	@Override
	public int consultarCantidadDetalles(int id) throws DataAccessException {
		return repoDetalles.consultarCantidadPorEncabezado(id);
	}

	@Override
	public boolean borrar(EncabezadoPrecotizacion ep) throws DataAccessException {
		if (repositorio.consultarCantidadporPrecotizacion(ep.getPrecotizaciones_id())>1){
			ep.setActivo(0);
			repositorio.actualizar(ep);
			repositorio.reordenar_elimina(ep.getPrecotizaciones_id(), 
					ep.getLugar());
			return true;
		} else return false;	
	}


}
