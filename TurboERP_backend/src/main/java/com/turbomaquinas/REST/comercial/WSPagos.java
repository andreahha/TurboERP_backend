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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.comercial.Pagos;
import com.turbomaquinas.POJO.comercial.PagosVista;
import com.turbomaquinas.service.comercial.PagosService;

@RestController
@RequestMapping("/comercial/pagos")
public class WSPagos {
	
	private static final Log bitacora = LogFactory.getLog(WSPagos.class);
	
	@Autowired
	PagosService s;
	
	@PostMapping
	public ResponseEntity<PagosVista> crear(@RequestBody Pagos p){
		
		PagosVista respuesta = null;
		bitacora.info(p);
		try {
			respuesta = s.crear(p);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<PagosVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<PagosVista>(respuesta, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody Pagos p){
		
		bitacora.info(p);
		try {
			s.actualizar(p);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PagosVista> buscar(@PathVariable int id){
		
		PagosVista pb = null;
		try {
			pb = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<PagosVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<PagosVista>(pb, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<PagosVista>> consultar(){
		List<PagosVista> pl = s.consultar();
		if ( pl == null)
			return new ResponseEntity<List<PagosVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<PagosVista>>(pl, HttpStatus.OK);
	}
}