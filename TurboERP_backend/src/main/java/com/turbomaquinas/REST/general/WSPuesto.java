package com.turbomaquinas.REST.general;

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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.general.Puesto;
import com.turbomaquinas.service.general.PuestoService;

@RestController
@RequestMapping("/general/puesto")
public class WSPuesto {

	private static final Log bitacora = LogFactory.getLog(WSPuesto.class);
	
	@Autowired
	PuestoService s;
	
	@GetMapping()
	public ResponseEntity<List<Puesto>> consultar(){
		List<Puesto> puesto = null;
		try{
			puesto = s.consultar();
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<Puesto>>(HttpStatus.NO_CONTENT);
		}
			return new ResponseEntity<List<Puesto>>(puesto, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Puesto> crear(@RequestBody Puesto p) {
		Puesto respuesta = null;
		bitacora.info(p);
		try {
			respuesta = s.crear(p);
			return new ResponseEntity<Puesto>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e);
			return new ResponseEntity<Puesto>(HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody Puesto p) {
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
	public ResponseEntity<Puesto> buscar(@PathVariable int id){
		Puesto pv = null;
		try{
			pv = s.buscar(id);
		} catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Puesto>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Puesto>(pv, HttpStatus.OK);
	}	

}
