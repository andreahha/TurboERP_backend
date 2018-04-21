package com.turbomaquinas.REST.general;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.general.TipoCadenaPago;
import com.turbomaquinas.service.general.TipoCadenaPagoService;

@RestController
@RequestMapping("/general/tipocadenapago")
public class WSTipoCadenaPago {
	
	private static final Log bitacora = LogFactory.getLog(WSTipoCadenaPago.class);
	
	@Autowired
	TipoCadenaPagoService tcps;
	
	@PostMapping()
	public ResponseEntity<Void> crear(@RequestBody TipoCadenaPago tcp){
		bitacora.info(tcp);
		try{
			tcps.crear(tcp);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<Void> actualizar(@RequestBody TipoCadenaPago tcp){
		bitacora.info(tcp);
		try{
			tcps.actualizar(tcp);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<TipoCadenaPago>> consultar(){
		List<TipoCadenaPago> tcp = null;
		try{
			tcp = tcps.consultar();
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<TipoCadenaPago>>(HttpStatus.NO_CONTENT);
		}
			System.out.println(tcp);
			
			return new ResponseEntity<List<TipoCadenaPago>>(tcp, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TipoCadenaPago> buscar(@PathVariable ("id") int id){
		TipoCadenaPago tcp = null;
		try{
			tcp = tcps.buscar(id);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<TipoCadenaPago>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<TipoCadenaPago>(tcp, HttpStatus.OK);
	}
	
	@GetMapping("/clave/{clave}")
	public ResponseEntity<TipoCadenaPago> buscarPorClave(@PathVariable String clave){
		
		TipoCadenaPago tcp = null;
		try{
			tcp = tcps.buscarClave(clave);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<TipoCadenaPago>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<TipoCadenaPago>(tcp, HttpStatus.OK);
	}

}
