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

import com.turbomaquinas.POJO.general.Cubre;
import com.turbomaquinas.service.general.CubreService;

@RestController
@RequestMapping("/general/cubre")
public class WSCubre {

private static final Log bitacora = LogFactory.getLog(WSCubre.class);
	
	@Autowired
	CubreService s;
	
	@PostMapping()
	public ResponseEntity<Cubre> crear(@RequestBody Cubre cubre){
		Cubre respuesta = null;
		bitacora.info(cubre);
		try{
			 respuesta = s.crear(cubre);	
			 if(respuesta == null){
				 return new ResponseEntity<Cubre>(HttpStatus.CONFLICT);
			 }
			return new ResponseEntity<Cubre>(respuesta, HttpStatus.CREATED);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Cubre>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<Cubre> actualizar(@RequestBody Cubre cubre){
		bitacora.info(cubre);
		Cubre c = null; 
		try{
			c = s.actualizar(cubre);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Cubre>(HttpStatus.CONFLICT);
		}	
		return new ResponseEntity<Cubre>(c, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cubre> buscar(@PathVariable("id") int id){
			Cubre cubre = null;
		try{
			cubre = s.buscar(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Cubre>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Cubre>(cubre, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<Cubre>> consultar(){
		List<Cubre> cubre = null;
		try{
			cubre = s.consultar();
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<Cubre>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Cubre>>(cubre, HttpStatus.OK);
	}
	
	@GetMapping("/personal/{id}")
	public ResponseEntity<Cubre> buscarporPersonal(@PathVariable("id") int id){
			Cubre cubre = null;
		try{
			cubre = s.buscarporPersonal(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Cubre>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Cubre>(cubre, HttpStatus.OK);
	}
}
