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

import com.turbomaquinas.POJO.general.ModeloEquipo;
import com.turbomaquinas.service.general.ModeloEquipoService;

@RestController
@RequestMapping("/general/modelos")
public class WSModeloEquipo {

	private static final Log bitacora = LogFactory.getLog(WSModeloEquipo.class);

	@Autowired
	ModeloEquipoService s;
	
	@GetMapping("/{id}")
	public ResponseEntity<ModeloEquipo> buscar(@PathVariable int id){
		ModeloEquipo md = null;
		try {
			md = s.buscar(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<ModeloEquipo>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<ModeloEquipo>(md, HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<List<ModeloEquipo>> consultar(){
		List<ModeloEquipo> mlos = s.consultar();
		if (mlos == null)
			return new ResponseEntity<List<ModeloEquipo>>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<ModeloEquipo>>(mlos, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> crear(@RequestBody ModeloEquipo md){
		s.crear(md);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody ModeloEquipo m){
		s.actualizar(m);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	
	
}
