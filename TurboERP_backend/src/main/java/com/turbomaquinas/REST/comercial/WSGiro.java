package com.turbomaquinas.REST.comercial;

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

import com.turbomaquinas.POJO.comercial.Giro;
import com.turbomaquinas.service.comercial.GiroService;

@RestController
@RequestMapping("/comercial/giros")
public class WSGiro {
	
	private static final Log bitacora = LogFactory.getLog(WSGiro.class);
	
	@Autowired
	GiroService gs;
	
	@GetMapping()
	public ResponseEntity<List<Giro>> consultar(){
		List<Giro> giros = null;
		try{
				giros = gs.consultar();
			}catch(DataAccessException e){
				bitacora.error(e.getMessage());
				return new ResponseEntity<List<Giro>>(HttpStatus.NO_CONTENT);
			}	
				return new ResponseEntity<List<Giro>>(giros, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Giro> buscar(@PathVariable("id") int id) {
		Giro giro = null;
		try{
			giro = gs.buscar(id);
		}catch(DataAccessException e){
				bitacora.error(e.getMessage());
			return new ResponseEntity<Giro>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<Giro>(giro, HttpStatus.OK);			
	}
	
	@PostMapping()
	public ResponseEntity<Void> crear(@RequestBody Giro giro){
		bitacora.info(giro);
		try{
			gs.crear(giro);	
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}catch(DataAccessException e){
		bitacora.error(e.getMessage());;
		return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<Void> actualizar(@RequestBody Giro giro){
		bitacora.info(giro);
			try{
				gs.actualizar(giro);
			}catch(DataAccessException e){
				bitacora.error(e.getMessage());
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
			 return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
}
