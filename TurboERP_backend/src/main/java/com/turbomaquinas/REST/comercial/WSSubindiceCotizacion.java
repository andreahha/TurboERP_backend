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

import com.turbomaquinas.POJO.comercial.SubindiceCotizacion;
import com.turbomaquinas.POJO.comercial.SubindiceCotizacionVista;
import com.turbomaquinas.service.comercial.SubindiceCotizacionService;

@RestController
@RequestMapping("/comercial/subindicecotizacion")
public class WSSubindiceCotizacion {

	private static final Log bitacora = LogFactory.getLog(WSSubindiceCotizacion.class);
	
	@Autowired
	SubindiceCotizacionService scs;
	
	@PostMapping()
	public ResponseEntity<SubindiceCotizacionVista> crear(@RequestBody SubindiceCotizacion subindiceCotizacion){
		SubindiceCotizacionVista respuesta = null;
		bitacora.info(subindiceCotizacion);
		try{
			respuesta = scs.crear(subindiceCotizacion);
			return new ResponseEntity<SubindiceCotizacionVista>(respuesta, HttpStatus.CREATED);
		}catch (DataAccessException e) {
				bitacora.error(e.getMessage());
			return new ResponseEntity<SubindiceCotizacionVista>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<SubindiceCotizacionVista> actualizar(@RequestBody SubindiceCotizacion subindiceCotizacion){
		SubindiceCotizacionVista scv = null;
		bitacora.info(subindiceCotizacion);
		try{
			scv = scs.actualizar(subindiceCotizacion);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<SubindiceCotizacionVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<SubindiceCotizacionVista>(scv, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<SubindiceCotizacionVista>> consultar(){
		List<SubindiceCotizacionVista> sc = null;
		try{
			sc = scs.consultar();
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<SubindiceCotizacionVista>>(HttpStatus.NO_CONTENT);
		}
			return new ResponseEntity<List<SubindiceCotizacionVista>>(sc, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<SubindiceCotizacionVista> buscar(@PathVariable ("id") int id){
		SubindiceCotizacionVista sc = null;
		try{
			sc = scs.buscar(id);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<SubindiceCotizacionVista>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<SubindiceCotizacionVista>(sc, HttpStatus.OK);
	}
	
	@DeleteMapping()
	public ResponseEntity<Void> borrar(@RequestBody SubindiceCotizacion sc){
		boolean borrado = false;
		try{
			borrado = scs.borrar(sc);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		if(borrado){
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else return new ResponseEntity<Void>(HttpStatus.CONFLICT);		
	}
	
	
}
