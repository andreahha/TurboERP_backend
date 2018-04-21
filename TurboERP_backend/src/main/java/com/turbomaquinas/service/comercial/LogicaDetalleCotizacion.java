package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.DetalleCotizacionDAO;
import com.turbomaquinas.DAO.comercial.JDBCDetalleCotizacion.ActividadCotizacion;
import com.turbomaquinas.DAO.comercial.SubindiceCotizacionDAO;
import com.turbomaquinas.POJO.comercial.DetalleCotizacion;
import com.turbomaquinas.POJO.comercial.DetalleCotizacionVista;

@Service
public class LogicaDetalleCotizacion implements DetalleCotizacionService {
	
	@Autowired
	DetalleCotizacionDAO repDetCot;
	@Autowired
	SubindiceCotizacionDAO repoSubindices;

	@Override
	public DetalleCotizacionVista crear(DetalleCotizacion dc) throws DataAccessException {
		int ultimoLugar = repDetCot.recuperarUltimoLugar(dc.getEncabezados_cotizaciones_id());
		dc.setLugar(ultimoLugar + 1);
		int id = repDetCot.crear(dc);
		return repDetCot.buscar(id);		
	}

	@Override
	public DetalleCotizacionVista actualizar(DetalleCotizacion dc) throws DataAccessException {
		DetalleCotizacionVista detalle = repDetCot.buscar(dc.getId());
		if(detalle.getLugar() != dc.getLugar()){
			repDetCot.reordenar_actualiza(dc.getEncabezados_cotizaciones_id(),
					  			  dc.getLugar(), detalle.getLugar());
		}
		repDetCot.actualizar(dc);
		return repDetCot.buscar(dc.getId());
	}

	@Override
	public DetalleCotizacionVista buscar(int id) throws DataAccessException {
		return repDetCot.buscar(id);
	}

	@Override
	public List<DetalleCotizacionVista> consultar() throws DataAccessException {
		return repDetCot.consultar();
	}
	
	@Override
	public int consultarCantidadSubindices(int id)  throws DataAccessException{
		return repoSubindices.consultarCantidadPorDetalle(id);
	}

	@Override
	public boolean borrar(DetalleCotizacion dc) throws DataAccessException{
		if (repDetCot.consultarCantidadPorEncabezado(dc.getEncabezados_cotizaciones_id()) > 1){
			dc.setActivo(0);
			repDetCot.actualizar(dc);
			repDetCot.reordenar_elimina(dc.getEncabezados_cotizaciones_id(), dc.getLugar());
			return true;
		} else return false;	
	}

	@Override
	public List<DetalleCotizacionVista> consultarSinAutorizar(int id) throws DataAccessException {
		return repDetCot.consultarSinAutorizar(id);
	}
	
	@Override
	public void actualizarImporte(int id, float importe) {
		repDetCot.actualizarImporte(id, importe);
	}

	@Override
	public List<ActividadCotizacion> consultarPorListaId(List<Integer> ids) {
		return repDetCot.consultarPorListaId(ids);
	}


}
