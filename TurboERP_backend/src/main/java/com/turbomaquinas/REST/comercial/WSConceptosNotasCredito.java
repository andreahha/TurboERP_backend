package com.turbomaquinas.REST.comercial;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.comercial.ConceptosNotasCredito;
import com.turbomaquinas.POJO.comercial.ConceptosNotasCreditoVista;
import com.turbomaquinas.service.comercial.ConceptosNotasCreditoService;

@RestController
@RequestMapping("comercial/conceptosnotascredito")
public class WSConceptosNotasCredito {
	
	private static final Log bitacora = LogFactory.getLog(WSConceptosFacturacion.class);
	
	@Autowired
	ConceptosNotasCreditoService s;
    
	
	@GetMapping("/{id}")
	public ResponseEntity<ConceptosNotasCreditoVista> buscar (@PathVariable int id){
		
		ConceptosNotasCreditoVista cncv = null;
		try {
			cncv = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<ConceptosNotasCreditoVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<ConceptosNotasCreditoVista>(cncv, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<ConceptosNotasCreditoVista>> consultar(){
		List<ConceptosNotasCreditoVista> cncv = s.consultar();
		if( cncv.isEmpty())
			return new ResponseEntity<List<ConceptosNotasCreditoVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<ConceptosNotasCreditoVista>>(cncv, HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<ConceptosNotasCreditoVista> crear(@RequestBody ConceptosNotasCredito cnc){
		
		ConceptosNotasCreditoVista respuesta = null;
		bitacora.info(cnc);
		try {
			respuesta = s.crear(cnc);
			return new ResponseEntity<ConceptosNotasCreditoVista>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<ConceptosNotasCreditoVista>(HttpStatus.CONFLICT);
		}
	}



}
