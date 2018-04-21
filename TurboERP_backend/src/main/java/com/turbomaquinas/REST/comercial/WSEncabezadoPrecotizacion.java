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

import com.turbomaquinas.POJO.comercial.EncabezadoPrecotizacion;
import com.turbomaquinas.POJO.comercial.EncabezadoPrecotizacionVista;
import com.turbomaquinas.service.comercial.EncabezadoPrecotizacionService;


@RestController
@RequestMapping("/comercial/encabezadoprecotizacion")
public class WSEncabezadoPrecotizacion {
	
	private static final Log bitacora = LogFactory.getLog(WSEncabezadoPrecotizacion.class);

	@Autowired
	EncabezadoPrecotizacionService eps;
	
	@PostMapping()
	public ResponseEntity<EncabezadoPrecotizacionVista> crear(@RequestBody EncabezadoPrecotizacion encabezadoPrecotizacion){
		EncabezadoPrecotizacionVista respuesta = null;
		bitacora.info(encabezadoPrecotizacion);
		try{
			respuesta = eps.crear(encabezadoPrecotizacion);
			return new ResponseEntity<EncabezadoPrecotizacionVista>(respuesta, HttpStatus.CREATED);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<EncabezadoPrecotizacionVista>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<EncabezadoPrecotizacionVista> actualizar(@RequestBody EncabezadoPrecotizacion encabezadoPrecotizacion){
		EncabezadoPrecotizacionVista epv = null;
		bitacora.info(encabezadoPrecotizacion);
		try{
			epv = eps.actualizar(encabezadoPrecotizacion);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<EncabezadoPrecotizacionVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<EncabezadoPrecotizacionVista>(epv, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<EncabezadoPrecotizacionVista>> consultar(){
		List<EncabezadoPrecotizacionVista> epv = null;
		try{
			epv = eps.consultar();
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<EncabezadoPrecotizacionVista>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<EncabezadoPrecotizacionVista>>(epv, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EncabezadoPrecotizacionVista> buscar(@PathVariable("id") int id){
		EncabezadoPrecotizacionVista epv = null;
		try{
			epv = eps.buscar(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<EncabezadoPrecotizacionVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<EncabezadoPrecotizacionVista>(epv, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/cantidad")
	public ResponseEntity<Integer> contarDetalles(@PathVariable int id){
		int cantidad = 0;
		try {
			cantidad = eps.consultarCantidadDetalles(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Integer> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Integer> (cantidad, HttpStatus.OK);
	}
	
	@DeleteMapping()
	public ResponseEntity<Void> borrar(@RequestBody EncabezadoPrecotizacion ep){
		boolean borrado = false;
		try{
			borrado = eps.borrar(ep);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		if(borrado){
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else return new ResponseEntity<Void>(HttpStatus.CONFLICT);		
	}
}
