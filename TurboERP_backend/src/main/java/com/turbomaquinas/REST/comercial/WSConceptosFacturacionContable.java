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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.comercial.ConceptosFacturacionContable;
import com.turbomaquinas.POJO.comercial.ConceptosFacturacionContableVista;
import com.turbomaquinas.service.comercial.ConceptosFacturacionContableService;

@RestController
@RequestMapping("comercial/conceptosfacturacioncontable")
public class WSConceptosFacturacionContable {
	
	private static final Log bitacora = LogFactory.getLog(WSConceptosFacturacion.class);
	
	@Autowired
	ConceptosFacturacionContableService s;
    
	
	@GetMapping("/{id}")
	public ResponseEntity<ConceptosFacturacionContableVista> buscar (@PathVariable int id){
		
		ConceptosFacturacionContableVista cncv = null;
		try {
			cncv = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<ConceptosFacturacionContableVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<ConceptosFacturacionContableVista>(cncv, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<ConceptosFacturacionContableVista>> consultar(){
		List<ConceptosFacturacionContableVista> cncv = s.consultar();
		if( cncv.isEmpty())
			return new ResponseEntity<List<ConceptosFacturacionContableVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<ConceptosFacturacionContableVista>>(cncv, HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<ConceptosFacturacionContableVista> crear(@RequestBody ConceptosFacturacionContable cnc){
		
		ConceptosFacturacionContableVista respuesta = null;
		bitacora.info(cnc);
		try {
			respuesta = s.crear(cnc);
			return new ResponseEntity<ConceptosFacturacionContableVista>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<ConceptosFacturacionContableVista>(HttpStatus.CONFLICT);
		}
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
