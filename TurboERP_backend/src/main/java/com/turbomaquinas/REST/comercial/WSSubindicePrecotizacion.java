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

import com.turbomaquinas.POJO.comercial.SubindicePrecotizacion;
import com.turbomaquinas.POJO.comercial.SubindicePrecotizacionVista;
import com.turbomaquinas.service.comercial.SubindicePrecotizacionService;

@RestController
@RequestMapping("/comercial/subindiceprecotizacion")
public class WSSubindicePrecotizacion {
	
	private static final Log bitacora = LogFactory.getLog(WSSubindicePrecotizacion.class);
	
	@Autowired
	SubindicePrecotizacionService sps;
	
	@PostMapping()
	public ResponseEntity<SubindicePrecotizacionVista> crear(@RequestBody SubindicePrecotizacion subindicePrecotizacion){
		SubindicePrecotizacionVista respuesta = null;
		bitacora.info(subindicePrecotizacion);
		try{
			respuesta = sps.crear(subindicePrecotizacion);
			return new ResponseEntity<SubindicePrecotizacionVista>(respuesta, HttpStatus.CREATED);
		}catch(DataAccessException e) {
				bitacora.error(e.getMessage());
			return new ResponseEntity<SubindicePrecotizacionVista>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<SubindicePrecotizacionVista> actualizar(@RequestBody SubindicePrecotizacion subindicePrecotizacion){
		SubindicePrecotizacionVista spv = null;
		bitacora.info(subindicePrecotizacion);
		try{
			spv = sps.actualizar(subindicePrecotizacion);
		}catch(DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<SubindicePrecotizacionVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<SubindicePrecotizacionVista>(spv, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<SubindicePrecotizacionVista>> consultar(){
		List<SubindicePrecotizacionVista> sp = null;
		try{
			sp = sps.consultar();
		}catch(DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<SubindicePrecotizacionVista>>(HttpStatus.NO_CONTENT);
		}
			return new ResponseEntity<List<SubindicePrecotizacionVista>>(sp, HttpStatus.OK);
	}
 
	@GetMapping("/{id}")
	public ResponseEntity<SubindicePrecotizacionVista> buscar(@PathVariable("id") int id){
		SubindicePrecotizacionVista sp = null;
		try{
			sp = sps.buscar(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<SubindicePrecotizacionVista>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<SubindicePrecotizacionVista>(sp, HttpStatus.OK);
	}
	
	@DeleteMapping()
	public ResponseEntity<Void> borrar(@RequestBody SubindicePrecotizacion sp){
		boolean borrado = false;
		try{
			borrado = sps.borrar(sp);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		if(borrado){
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else return new ResponseEntity<Void>(HttpStatus.CONFLICT);		
	}
}
