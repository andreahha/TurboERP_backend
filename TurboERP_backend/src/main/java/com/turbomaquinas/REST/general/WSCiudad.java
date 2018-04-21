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

import com.turbomaquinas.POJO.general.Ciudad;
import com.turbomaquinas.POJO.general.CiudadVista;
import com.turbomaquinas.service.general.CiudadService;

@RestController
@RequestMapping("general/ciudades")
public class WSCiudad {
	
	private static final Log bitacora = LogFactory.getLog(WSCiudad.class);
	
	@Autowired
	CiudadService s;
	
	@PostMapping
	public ResponseEntity<CiudadVista> crear(@RequestBody Ciudad c) {
		CiudadVista respuesta = null;
		bitacora.info(c);
		try {
			respuesta = s.crear(c);
			return new ResponseEntity<CiudadVista>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e);
			return new ResponseEntity<CiudadVista>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody Ciudad c) {
		bitacora.info(c);
		try {
			s.actualizar(c);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}


	@GetMapping("/{id}")
	public ResponseEntity<CiudadVista> buscar(@PathVariable int id){
		CiudadVista cv = null;
		try{
			cv = s.buscar(id);
		} catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<CiudadVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<CiudadVista>(cv, HttpStatus.OK);
	}	

	@GetMapping()
	public ResponseEntity<List<CiudadVista>> consultar(){
		List<CiudadVista> cius = s.consultar();
		if (cius == null)
			return new ResponseEntity<List<CiudadVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<CiudadVista>>(cius, HttpStatus.OK);
	}
		
}
