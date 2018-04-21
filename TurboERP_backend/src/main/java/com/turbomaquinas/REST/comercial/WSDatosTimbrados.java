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

import com.turbomaquinas.POJO.comercial.DatosTimbrados;
import com.turbomaquinas.service.comercial.DatosTimbradosService;

@RestController
@RequestMapping("/comercial/datostimbrado")
public class WSDatosTimbrados {

	private static final Log bitacora = LogFactory.getLog(WSDatosTimbrados.class);
	
	@Autowired
	DatosTimbradosService s;
	
	@PostMapping
	public ResponseEntity<DatosTimbrados> crear(@RequestBody DatosTimbrados dt){
		DatosTimbrados respuesta = null;
		bitacora.info(dt);
		try {
			respuesta = s.crear(dt);
			return new ResponseEntity<DatosTimbrados>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DatosTimbrados> (HttpStatus.CONFLICT);
		}
	}

	
	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody DatosTimbrados dt){
		bitacora.info(dt);
		try {
			s.actualizar(dt);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<DatosTimbrados> buscar(@PathVariable int id){
		DatosTimbrados dt = null;
		try {
			dt = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DatosTimbrados>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<DatosTimbrados>(dt, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<DatosTimbrados>> consultar(){
		List<DatosTimbrados> dtl = s.consultar();
		if (dtl == null)
			return new ResponseEntity<List<DatosTimbrados>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<DatosTimbrados>>(dtl, HttpStatus.OK);
	}
	
	
}
