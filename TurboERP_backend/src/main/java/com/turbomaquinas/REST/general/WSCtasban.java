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

import com.turbomaquinas.POJO.general.Ctasban;
import com.turbomaquinas.POJO.general.CtasbanVista;
import com.turbomaquinas.service.general.CtasbanService;

@RestController
@RequestMapping("/general/ctasban")
public class WSCtasban {

	private static final Log bitacora = LogFactory.getLog(WSCtasban.class);
	
	@Autowired
	CtasbanService s;
	
	@PostMapping
	public ResponseEntity<CtasbanVista> crear(@RequestBody Ctasban cb){
		CtasbanVista respuesta = null;
		bitacora.info(cb);
		try {
			respuesta = s.crear(cb);
			return new ResponseEntity<CtasbanVista>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<CtasbanVista>(HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(Ctasban cb){
		bitacora.info(cb);
		try {
			s.actualizar(cb);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CtasbanVista> buscar(@PathVariable int id){
		CtasbanVista cv = null;
		try {
			cv = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<CtasbanVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<CtasbanVista>(cv, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<CtasbanVista>> consultar(){
		
		List<CtasbanVista> lcv = s.consultar();
		if (lcv == null )
			return new ResponseEntity<List<CtasbanVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<CtasbanVista>>(lcv, HttpStatus.OK);
	}


	@GetMapping("/numero/{numero}")
	public ResponseEntity<CtasbanVista> buscarPorNumero(@PathVariable String numero){
		
		CtasbanVista cb = null;
		try{
			cb = s.buscarporNumero(numero);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<CtasbanVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<CtasbanVista>(cb, HttpStatus.OK);
	}
}
