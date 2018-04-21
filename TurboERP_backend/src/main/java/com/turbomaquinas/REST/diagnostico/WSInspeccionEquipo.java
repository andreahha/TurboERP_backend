package com.turbomaquinas.REST.diagnostico;

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

import com.turbomaquinas.POJO.diagnostico.InspeccionEquipo;
import com.turbomaquinas.POJO.diagnostico.InspeccionEquipoVista;
import com.turbomaquinas.service.diagnostico.InspeccionEquipoService;

@RestController
@RequestMapping("/diagnostico/inspeccionequipo")
public class WSInspeccionEquipo {

	private static final Log bitacora = LogFactory.getLog(WSInspeccionEquipo.class);
	
	@Autowired
	InspeccionEquipoService s;
	
	@PostMapping
	public ResponseEntity<InspeccionEquipoVista> crear(@RequestBody InspeccionEquipo ie) {
		InspeccionEquipoVista respuesta = null;
		bitacora.info(ie);
		try{
			respuesta = s.crear(ie);
			return new ResponseEntity<InspeccionEquipoVista>(respuesta, HttpStatus.CREATED);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<InspeccionEquipoVista>(HttpStatus.CONFLICT);
		}

	}
	
	@PutMapping
	public ResponseEntity<InspeccionEquipoVista> actualizar(@RequestBody InspeccionEquipo ie) {
		InspeccionEquipoVista respuesta = null;
		bitacora.info(ie);
		try{
			respuesta = s.actualizar(ie);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<InspeccionEquipoVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<InspeccionEquipoVista>(respuesta, HttpStatus.OK);
	}
	

	@GetMapping("/{id}")
	public ResponseEntity<InspeccionEquipoVista> buscar(@PathVariable int id) {
		InspeccionEquipoVista iv = null;
		try{
			iv = s.buscar(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<InspeccionEquipoVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<InspeccionEquipoVista>(iv, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<InspeccionEquipoVista>> consultar() {
		List<InspeccionEquipoVista> iv = null;
		try{
			iv = s.consultar();
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<InspeccionEquipoVista>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<InspeccionEquipoVista>>(iv, HttpStatus.OK);
	}
	
	@GetMapping("/años")
	public ResponseEntity<List<Integer>> aniosInspeccionEquipo(){
		List<Integer> inspeccion = s.anioInspeccionEquipo();
		if (inspeccion == null)
			return new ResponseEntity<List<Integer>> (HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Integer>>(inspeccion, HttpStatus.OK);
	}
	
	@GetMapping("/filtradas/{anio}")
	public ResponseEntity<List<InspeccionEquipoVista>> consultarPorAño(@PathVariable int anio){
		List<InspeccionEquipoVista> iv = s.inspeccionEquipoAnio(anio);
		if (iv == null)
			return new ResponseEntity<List<InspeccionEquipoVista>> (HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<InspeccionEquipoVista>>(iv, HttpStatus.OK);
	}
	
	@GetMapping("/orden/{id}")
	public ResponseEntity<List<InspeccionEquipoVista>> consultarPorOrden(@PathVariable int id) {
		List<InspeccionEquipoVista> iv = null;
		try{
			iv = s.consultaPorOrden(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<InspeccionEquipoVista>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<InspeccionEquipoVista>>(iv, HttpStatus.OK);
	}
}
