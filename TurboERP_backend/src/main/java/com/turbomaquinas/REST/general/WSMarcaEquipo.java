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

import com.turbomaquinas.POJO.general.MarcaEquipo;
import com.turbomaquinas.service.general.MarcaEquipoService;

@RestController
@RequestMapping("/general/marcas")

public class WSMarcaEquipo {
	
	private static final Log bitacora = LogFactory.getLog(WSMarcaEquipo.class);

	@Autowired
	MarcaEquipoService s;
	
	@GetMapping("/{id}")
	public ResponseEntity<MarcaEquipo> buscar(@PathVariable int id){
		MarcaEquipo me = null;
		try {
			me = s.buscar(id);
		} catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<MarcaEquipo>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<MarcaEquipo>(me, HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<List<MarcaEquipo>> consultar(){
		List<MarcaEquipo> mcas = s.consultar();
		if (mcas == null)
			return new ResponseEntity<List<MarcaEquipo>>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<MarcaEquipo>>(mcas, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> crear(@RequestBody MarcaEquipo m){
		s.crear(m);
		return new ResponseEntity<Void> (HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody MarcaEquipo m) {
		s.actualizar(m);
		return new ResponseEntity<Void> (HttpStatus.OK);
	}
}
