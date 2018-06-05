package com.turbomaquinas.REST.diagnostico;

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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.diagnostico.DocumentoRemisionEmbarque;
import com.turbomaquinas.POJO.diagnostico.RemisionesEmbarqueVista;
import com.turbomaquinas.REST.comercial.WSPagos;
import com.turbomaquinas.service.diagnostico.RemisionEmbarqueService;

@RestController
@RequestMapping("/diagnostico/remisionequipo")
public class WSRemisionEmbarque {
	
	private static final Log bitacora = LogFactory.getLog(WSPagos.class);
	@Autowired
	RemisionEmbarqueService re;
	
	@PostMapping
	public ResponseEntity<Void> crear(@RequestBody DocumentoRemisionEmbarque doc){
		
		
		try{
			re.aplicarRemisionEmbarque(doc);
			
			return new ResponseEntity<Void>(HttpStatus.OK);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<RemisionesEmbarqueVista> buscar(@PathVariable int id) {
		RemisionesEmbarqueVista rev = null;
		try{
			rev = re.buscar(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<RemisionesEmbarqueVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<RemisionesEmbarqueVista>(rev, HttpStatus.OK);
	}
	
	@GetMapping("/orden/{id}")
	public ResponseEntity<List<RemisionesEmbarqueVista>> consultarPorOrden(@PathVariable int id) {
		List<RemisionesEmbarqueVista> rev = null;
		try{
			rev = re.consultarREPorOrden(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<RemisionesEmbarqueVista>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<RemisionesEmbarqueVista>>(rev, HttpStatus.OK);
	}
	
	@GetMapping("/fechas")
	public ResponseEntity<List<RemisionesEmbarqueVista>> consultarPorFechas(@RequestParam String fechainicio,@RequestParam String fechafin){
		List<RemisionesEmbarqueVista> p = re.remisionEmbarqueFecha(fechainicio,fechafin);
		if (p.isEmpty())
			return new ResponseEntity<List<RemisionesEmbarqueVista>> (HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<RemisionesEmbarqueVista>>(p, HttpStatus.OK);
	}

}
