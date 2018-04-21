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

import com.turbomaquinas.POJO.comercial.Convenio;
import com.turbomaquinas.service.comercial.ConvenioService;

@RestController
@RequestMapping("/comercial/convenio")
public class WSConvenio {

	private static final Log bitacora = LogFactory.getLog(WSConvenio.class);
	
	@Autowired
	ConvenioService s;
	
	@PostMapping
	public ResponseEntity<Convenio> crear(@RequestBody Convenio c){
		Convenio respuesta = null;
		bitacora.info(c);
		try {
			respuesta = s.crear(c);
			return new ResponseEntity<Convenio>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Convenio> (HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody Convenio c){
		bitacora.info(c);
		try {
			s.actualizar(c);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void> (HttpStatus.OK);
	
	}

	@GetMapping("/{id}")
	public ResponseEntity<Convenio> buscar(@PathVariable int id){
		Convenio c = null;
		try {
			c = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Convenio> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Convenio> (c, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Convenio>> consultar(){
		List<Convenio> c = s.consultar();
		if (c == null)
			return new ResponseEntity<List<Convenio>> (HttpStatus.CONFLICT);
		return new ResponseEntity<List<Convenio>>(c, HttpStatus.OK);
}
}
