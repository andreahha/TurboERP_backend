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

import com.turbomaquinas.POJO.comercial.EncabezadoCotizacion;
import com.turbomaquinas.POJO.comercial.EncabezadoCotizacionVista;
import com.turbomaquinas.service.comercial.EncabezadoCotizacionService;

@RestController
@RequestMapping("/comercial/encabezadocotizacion")
public class WSEncabezadoCotizacion {
	
	private static final Log bitacora = LogFactory.getLog(WSEncabezadoCotizacion.class);
	
	@Autowired
	EncabezadoCotizacionService ecs;
	
	@PostMapping()
	public ResponseEntity<EncabezadoCotizacionVista> crear(@RequestBody EncabezadoCotizacion encabezadoCotizacion){
		EncabezadoCotizacionVista respuesta = null;
		bitacora.info(encabezadoCotizacion);
		try{
			respuesta = ecs.crear(encabezadoCotizacion);
			return new ResponseEntity<EncabezadoCotizacionVista>(respuesta, HttpStatus.CREATED);
		}catch(DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<EncabezadoCotizacionVista>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<EncabezadoCotizacionVista> actualizar(@RequestBody EncabezadoCotizacion encabezadoCotizacion){
		EncabezadoCotizacionVista ecv = null;
		bitacora.info(encabezadoCotizacion);
		try{
			ecv = ecs.actualizar(encabezadoCotizacion);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<EncabezadoCotizacionVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<EncabezadoCotizacionVista>(ecv, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<EncabezadoCotizacionVista>> consultar(){
		List<EncabezadoCotizacionVista> ecv = null;
		try{
			ecv = ecs.consultar();
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<EncabezadoCotizacionVista>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<EncabezadoCotizacionVista>>(ecv, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EncabezadoCotizacionVista> buscar(@PathVariable("id") int id){
		EncabezadoCotizacionVista ecv = null;
		try{
			ecv = ecs.buscar(id);
		}catch (DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<EncabezadoCotizacionVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<EncabezadoCotizacionVista>(ecv, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/cantidad")
	public ResponseEntity<Integer> contarDetalles(@PathVariable int id){
		int cantidad = 0;
		try {
			cantidad = ecs.consultarCantidadDetalles(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Integer> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Integer> (cantidad, HttpStatus.OK);
	}
	
	@DeleteMapping()
	public ResponseEntity<Void> borrar(@RequestBody EncabezadoCotizacion ec){
		boolean borrado = false;
		try{
			borrado = ecs.borrar(ec);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		if(borrado){
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else return new ResponseEntity<Void>(HttpStatus.CONFLICT);		
	}
}
