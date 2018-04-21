package com.turbomaquinas.REST.general;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.general.TipoCambio;
import com.turbomaquinas.service.general.TipoCambioService;

@RestController
@RequestMapping("/general/tipocambio")
public class WSTipoCambio {

	private static final Log bitacora = LogFactory.getLog(WSTipoCambio.class);
	
	@Autowired
	TipoCambioService s;
	
	@PostMapping()
	public ResponseEntity<Void> crear(@RequestBody TipoCambio tipoCambio){
		bitacora.info(tipoCambio);
		try{
			s.crear(tipoCambio);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<Void> actualizar(@RequestBody TipoCambio tipoCambio){
		bitacora.info(tipoCambio);
		try{
			s.actualizar(tipoCambio);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	/*@GetMapping()
	public ResponseEntity<List<TipoCambio>> consultar(){
		List<TipoCambio> tipoCambio = null;
		try{
			tipoCambio = s.consultar();
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<TipoCambio>>(HttpStatus.NO_CONTENT);
		}
			return new ResponseEntity<List<TipoCambio>>(tipoCambio, HttpStatus.OK);
	}*/
	
	@GetMapping("/{id}")
	public ResponseEntity<TipoCambio> buscar(@PathVariable ("id") int id){
		TipoCambio tipoCambio = null;
		try{
			tipoCambio = s.buscar(id);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<TipoCambio>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<TipoCambio>(tipoCambio, HttpStatus.OK);
	}
	@GetMapping("")
	public ResponseEntity<TipoCambio> buscar(){
		TipoCambio tipoCambio = null;
		try{
			tipoCambio = s.aldia();
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<TipoCambio>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<TipoCambio>(tipoCambio, HttpStatus.OK);
	}
	
	@GetMapping("/fecha")
	public ResponseEntity<TipoCambio> buscarPorFecha(@RequestParam String fecha){
		TipoCambio tipoCambio = null;
		try{
			tipoCambio = s.buscarPorFecha(fecha);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<TipoCambio>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<TipoCambio>(tipoCambio, HttpStatus.OK);
	}

}
