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

import com.turbomaquinas.POJO.comercial.OportunidadTrabajo;
import com.turbomaquinas.service.comercial.OportunidadTrabajoService;

@RestController
@RequestMapping("/comercial/oportunidadtrabajo")
public class WSOportunidadTrabajo {

private static final Log bitacora = LogFactory.getLog(WSOportunidadTrabajo.class);
	
	@Autowired
	OportunidadTrabajoService s;
	
	@PostMapping
	public ResponseEntity<OportunidadTrabajo> crear(@RequestBody OportunidadTrabajo opt){
		OportunidadTrabajo respuesta = null;
		bitacora.info(opt);
		try {
			respuesta = s.crear(opt);
			return new ResponseEntity<OportunidadTrabajo>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<OportunidadTrabajo>(HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody OportunidadTrabajo opt){
		bitacora.info(opt);
		try {
			s.actualizar(opt);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	
	}

	@GetMapping("/{id}")
	public ResponseEntity<OportunidadTrabajo> buscar(@PathVariable int id){
		OportunidadTrabajo opt = null;
		try {
			opt = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<OportunidadTrabajo>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<OportunidadTrabajo>(opt, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<OportunidadTrabajo>> consultar(){
		List<OportunidadTrabajo> opt = s.consultar();
		if (opt == null)
			return new ResponseEntity<List<OportunidadTrabajo>>(HttpStatus.CONFLICT);
		return new ResponseEntity<List<OportunidadTrabajo>>(opt, HttpStatus.OK);
	}
}
