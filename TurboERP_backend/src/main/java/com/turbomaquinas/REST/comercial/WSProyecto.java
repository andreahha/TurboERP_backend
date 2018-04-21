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

import com.turbomaquinas.POJO.comercial.Proyecto;
import com.turbomaquinas.service.comercial.ProyectoService;

@RestController
@RequestMapping("/comercial/proyecto")
public class WSProyecto {

	private static final Log bitacora = LogFactory.getLog(WSProyecto.class);
	
	@Autowired
	ProyectoService s;
	
	@PostMapping
	public ResponseEntity<Proyecto> crear(@RequestBody Proyecto p){
		Proyecto respuesta = null;
		bitacora.info(p);
		try {
			respuesta = s.crear(p);
			return new ResponseEntity<Proyecto>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Proyecto> (HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody Proyecto p){
		bitacora.info(p);
		try {
			s.actualizar(p);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void> (HttpStatus.OK);
	
	}

	@GetMapping("/{id}")
	public ResponseEntity<Proyecto> buscar(@PathVariable int id){
		Proyecto p = null;
		try {
			p = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Proyecto> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Proyecto> (p, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Proyecto>> consultar(){
		List<Proyecto> p = s.consultar();
		if (p == null)
			return new ResponseEntity<List<Proyecto>> (HttpStatus.CONFLICT);
		return new ResponseEntity<List<Proyecto>>(p, HttpStatus.OK);
}
}
