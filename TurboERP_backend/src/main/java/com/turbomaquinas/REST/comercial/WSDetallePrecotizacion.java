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
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.comercial.DetallePrecotizacion;
import com.turbomaquinas.POJO.comercial.DetallePrecotizacionVista;
import com.turbomaquinas.service.comercial.DetallePrecotizacionService;

@RestController
@RequestMapping("/comercial/detalleprecotizacion")
public class WSDetallePrecotizacion {
	
	private static final Log bitacora = LogFactory.getLog(WSDetallePrecotizacion.class);
	
	@Autowired
	DetallePrecotizacionService dps;
	
	@PostMapping()
	public ResponseEntity<DetallePrecotizacionVista> crear(@RequestBody DetallePrecotizacion detallePrecotizacion){
		DetallePrecotizacionVista respuesta = null;
		bitacora.info(detallePrecotizacion);
		try{
			respuesta = dps.crear(detallePrecotizacion);
			return new ResponseEntity<DetallePrecotizacionVista>(respuesta, HttpStatus.CREATED);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<DetallePrecotizacionVista>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<DetallePrecotizacionVista> actualizar(@RequestBody DetallePrecotizacion detallePrecotizacion){
		DetallePrecotizacionVista dpv = null;
		bitacora.info(detallePrecotizacion);
		try{
			dpv = dps.actualizar(detallePrecotizacion);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<DetallePrecotizacionVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<DetallePrecotizacionVista>(dpv, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<DetallePrecotizacionVista>> consultar(){
		List<DetallePrecotizacionVista> dpv = null;
		try{
			dpv = dps.consultar();
		}catch(DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<DetallePrecotizacionVista>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<DetallePrecotizacionVista>>(dpv, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DetallePrecotizacionVista> buscar(@PathVariable ("id") int id){
		DetallePrecotizacionVista dpv = null;
		try{
			dpv = dps.buscar(id);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DetallePrecotizacionVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<DetallePrecotizacionVista>(dpv, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/cantidad")
	public ResponseEntity<Integer> contarSubindices(@PathVariable int id){
		int cantidad = 0;
		try {
			cantidad = dps.consultarCantidadSubindices(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Integer> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Integer> (cantidad, HttpStatus.OK);
	}
	
	@DeleteMapping()
	public ResponseEntity<Void> borrar(@RequestBody DetallePrecotizacion dp){
		boolean borrado = false;
		try{
			borrado = dps.borrar(dp);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		if(borrado){
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else return new ResponseEntity<Void>(HttpStatus.CONFLICT);		
	}
	
}
