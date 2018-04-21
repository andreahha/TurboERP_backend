package com.turbomaquinas.REST.proveedores;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.proveedores.ConsultaRequisiciones;
import com.turbomaquinas.service.proveedores.ConsultaRequisicionesService;

@RestController
@RequestMapping("/proveedores/requisiciones")
public class WSConsultaRequisiciones {
	
	private static final Log bitacora = LogFactory.getLog(WSConsultaRequisiciones.class);
	
	@Autowired
	ConsultaRequisicionesService cs;
	

	@GetMapping
	public ResponseEntity<List<ConsultaRequisiciones>> consultar(){
		
		List<ConsultaRequisiciones> cr = cs.consultar();
		if (cr == null )
			return new ResponseEntity<List<ConsultaRequisiciones>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<ConsultaRequisiciones>>(cr, HttpStatus.OK);
	}
	
	@GetMapping("/ordenrequisicion/{id}")
	public ResponseEntity<List<ConsultaRequisiciones>> consultarReqPorOrden(@PathVariable("id") int id){
		
		List<ConsultaRequisiciones> cr = null;
		try {
			cr = cs.consultarPorOrden(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<ConsultaRequisiciones>> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<List<ConsultaRequisiciones>> (cr, HttpStatus.OK);
		
	}
	
}

