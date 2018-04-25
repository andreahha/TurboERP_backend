package com.turbomaquinas.REST.comercial;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.comercial.ConceptosNotasCredito;
import com.turbomaquinas.service.comercial.ConceptosNotasCreditoService;

@RestController
@RequestMapping("comercial/conceptosnotascredito")
public class WSConceptosNotasCredito {
	
	private static final Log bitacora = LogFactory.getLog(WSConceptosFacturacion.class);
	
	@Autowired
	ConceptosNotasCreditoService s;
	
	@GetMapping()
	public ResponseEntity<List<ConceptosNotasCredito>> consultar(){
		List<ConceptosNotasCredito> cnc = s.consultar();
		if( cnc.isEmpty())
			return new ResponseEntity<List<ConceptosNotasCredito>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<ConceptosNotasCredito>>(cnc, HttpStatus.OK);
		
	}


}
