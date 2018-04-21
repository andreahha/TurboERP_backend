package com.turbomaquinas.REST.comercial;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.DAO.comercial.JDBCDetalleCotizacion.ActividadCotizacion;
import com.turbomaquinas.POJO.comercial.DetalleCotizacion;
import com.turbomaquinas.POJO.comercial.DetalleCotizacionVista;
import com.turbomaquinas.service.comercial.DetalleCotizacionService;

@RestController
@RequestMapping("comercial/detallecotizacion")
public class WSDetalleCotizacion {

	private static final Log bitacora = LogFactory.getLog(WSDetalleCotizacion.class);
	
	@Autowired
	DetalleCotizacionService s;
	
	@PostMapping
	public ResponseEntity<DetalleCotizacionVista> crear(@RequestBody DetalleCotizacion dc){
		DetalleCotizacionVista respuesta = null;
//		bitacora.info(dc);
		bitacora.info(dc.toString());
		try {
			respuesta = s.crear(dc);
			return new ResponseEntity<DetalleCotizacionVista>(respuesta, HttpStatus.CREATED);
		} catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DetalleCotizacionVista>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping
	public ResponseEntity<DetalleCotizacionVista> actualizar(@RequestBody DetalleCotizacion dc) {
		DetalleCotizacionVista dcv = null;
		bitacora.info(dc);
		try {
			dcv = s.actualizar(dc);		
		} catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DetalleCotizacionVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<DetalleCotizacionVista>(dcv, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<DetalleCotizacionVista> buscar(@PathVariable ("id") int id){
		DetalleCotizacionVista dcv = null;
		try {
			dcv = s.buscar(id);
		} catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DetalleCotizacionVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<DetalleCotizacionVista>(dcv, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<DetalleCotizacionVista>> consultar(){
		List<DetalleCotizacionVista> dcl = null;
		try{
			dcl = s.consultar();
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<DetalleCotizacionVista>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<DetalleCotizacionVista>>(dcl, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/cantidad")
	public ResponseEntity<Integer> contarSubindices(@PathVariable int id){
		int cantidad = 0;
		try {
			cantidad = s.consultarCantidadSubindices(id);
		} catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Integer> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Integer> (cantidad, HttpStatus.OK);
	}
	
	@DeleteMapping()
	public ResponseEntity<Void> borrar(@RequestBody DetalleCotizacion dc){
		boolean borrado = false;
		try{
			borrado = s.borrar(dc);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		if(borrado){
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else return new ResponseEntity<Void>(HttpStatus.CONFLICT);		
	}

	@GetMapping("/sinautorizar/{cotizacion_id}")
	public ResponseEntity<List<DetalleCotizacionVista>> consultarSinAutorizar(@PathVariable int cotizacion_id	){
		List<DetalleCotizacionVista> dcl = null;
		try{
			dcl = s.consultarSinAutorizar(cotizacion_id);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<DetalleCotizacionVista>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<DetalleCotizacionVista>>(dcl, HttpStatus.OK);
	}
	
	@PutMapping("/{id}/{importe}")
	public ResponseEntity<Void> actualizaImporte(@PathVariable int id, @PathVariable float importe) {
		try{
			s.actualizarImporte(id, importe);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}	
		 return new ResponseEntity<Void>(HttpStatus.OK);	
	}
	
	@GetMapping("/detalles")
	public ResponseEntity<List<ActividadCotizacion>> consultarDetallePorIds(@RequestParam List<Integer> ids){
		List<ActividadCotizacion> detalles = null;
		try {
			detalles = s.consultarPorListaId(ids);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<ActividadCotizacion>> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<List<ActividadCotizacion>> (detalles, HttpStatus.OK);
	}

}
