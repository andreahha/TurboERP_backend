package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.turbomaquinas.DAO.comercial.SubindiceCotizacionDAO;
import com.turbomaquinas.POJO.comercial.SubindiceCotizacion;
import com.turbomaquinas.POJO.comercial.SubindiceCotizacionVista;

@Service
public class LogicaSubindiceCotizacion implements SubindiceCotizacionService{

	@Autowired
	SubindiceCotizacionDAO repositorio;
	
	@Override
	public SubindiceCotizacionVista crear(SubindiceCotizacion sc) throws DataAccessException{
		int ultimoLugar = repositorio.recuperarUltimoLugar(sc.getDetalle_cotizaciones_id());
		sc.setLugar(ultimoLugar + 1);
		int id = repositorio.crear(sc);
		return repositorio.buscar(id);
	}

	@Override
	@Transactional
	public SubindiceCotizacionVista actualizar(SubindiceCotizacion sc) throws DataAccessException{
		SubindiceCotizacionVista subindice = repositorio.buscar(sc.getId());
		if(subindice.getLugar() != sc.getLugar()){
			repositorio.reordenar_actualiza(sc.getDetalle_cotizaciones_id(), 
									sc.getLugar(), subindice.getLugar());
		}
		repositorio.actualizar(sc);
		return repositorio.buscar(sc.getId());
	}

	@Override
	public SubindiceCotizacionVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<SubindiceCotizacionVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}
	
	@Override
	public boolean borrar(SubindiceCotizacion sc) {
			sc.setActivo(0);
			repositorio.actualizar(sc);
			repositorio.reordenar_elimina(sc.getDetalle_cotizaciones_id(), sc.getLugar());
			return true;
	}


}
