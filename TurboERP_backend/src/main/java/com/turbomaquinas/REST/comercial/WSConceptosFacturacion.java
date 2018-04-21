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

import com.turbomaquinas.POJO.comercial.ConceptosFacturacion;
import com.turbomaquinas.POJO.comercial.ConceptosFacturacionVista;
import com.turbomaquinas.service.comercial.ConceptosFacturacionService;

@RestController
@RequestMapping("comercial/conceptosfacturacion")
public class WSConceptosFacturacion {
	
	private static final Log bitacora = LogFactory.getLog(WSConceptosFacturacion.class);
	
	@Autowired
	ConceptosFacturacionService s;
	
	
	@PostMapping
	public ResponseEntity<ConceptosFacturacionVista> crear(@RequestBody ConceptosFacturacion cf){
		
		ConceptosFacturacionVista respuesta = null;
		bitacora.info(cf);
		try {
			respuesta = s.crear(cf);
			return new ResponseEntity<ConceptosFacturacionVista>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<ConceptosFacturacionVista>(HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody ConceptosFacturacion cf){
		bitacora.info(cf);
		try {
			s.actualizar(cf);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ConceptosFacturacionVista> buscar (@PathVariable int id){
		
		ConceptosFacturacionVista cfb = null;
		try {
			cfb = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<ConceptosFacturacionVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<ConceptosFacturacionVista>(cfb, HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<List<ConceptosFacturacionVista>> consultar(){
		List<ConceptosFacturacionVista> cfv = s.consultar();
		if( cfv == null)
			return new ResponseEntity<List<ConceptosFacturacionVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<ConceptosFacturacionVista>>(cfv, HttpStatus.OK);
		
	}

	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> desactivar(@PathVariable("id") int id,@RequestParam int modificado_por){
		
		try{
			s.desactivar(id,modificado_por);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);		
	}
	
}
