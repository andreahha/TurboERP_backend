package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.DetallePrecotizacionDAO;
import com.turbomaquinas.DAO.comercial.SubindicePrecotizacionDAO;
import com.turbomaquinas.POJO.comercial.DetallePrecotizacion;
import com.turbomaquinas.POJO.comercial.DetallePrecotizacionVista;

@Service
public class LogicaDetallePrecotizacion implements DetallePrecotizacionService{

	@Autowired
	DetallePrecotizacionDAO repositorio;
	@Autowired
	SubindicePrecotizacionDAO repoSubindices;
	
	@Override
	public DetallePrecotizacionVista crear(DetallePrecotizacion dp) throws DataAccessException{
		int ultimoLugar = repositorio.recuperarUltimoLugar(dp.getEncabezados_precotizaciones_id());
		dp.setLugar(ultimoLugar + 1);
		int id = repositorio.crear(dp);
		return repositorio.buscar(id);		
	}

	@Override
	public DetallePrecotizacionVista actualizar(DetallePrecotizacion dp) throws DataAccessException{
		DetallePrecotizacionVista detalle = repositorio.buscar(dp.getId());
		if(detalle.getLugar() != dp.getLugar()){
			repositorio.reordenar_actualiza(dp.getEncabezados_precotizaciones_id(),
					  			  dp.getLugar(), detalle.getLugar());
		}
		repositorio.actualizar(dp);
		return repositorio.buscar(dp.getId());
	}

	@Override
	public DetallePrecotizacionVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<DetallePrecotizacionVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

	@Override
	public int consultarCantidadSubindices(int id)  throws DataAccessException{
		return repoSubindices.consultarCantidadPorDetalle(id);
	}

	@Override
	public boolean borrar(DetallePrecotizacion dp)  throws DataAccessException{
		if (repositorio.consultarCantidadPorEncabezado(dp.getEncabezados_precotizaciones_id()) > 1){
			dp.setActivo(0);
			repositorio.actualizar(dp);
			repositorio.reordenar_elimina(dp.getEncabezados_precotizaciones_id(), dp.getLugar());
			return true;
		} else return false;	
	}

}
