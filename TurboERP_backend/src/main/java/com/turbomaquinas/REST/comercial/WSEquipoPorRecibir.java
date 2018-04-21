package com.turbomaquinas.REST.comercial;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.comercial.EquipoPorRecibir;
import com.turbomaquinas.POJO.comercial.EquipoPorRecibirVista;
import com.turbomaquinas.service.comercial.EquipoPorRecibirService;

@RestController
@RequestMapping("/comercial/eqrecibir")
public class WSEquipoPorRecibir {

	private static final Log bitacora = LogFactory.getLog(WSEquipoPorRecibir.class);
	
	@Autowired
	EquipoPorRecibirService ers;
	
	@PostMapping()
	public ResponseEntity<Void> crear(@RequestBody EquipoPorRecibir equiporecibir){
		bitacora.info(equiporecibir);
		try{
			ers.crear(equiporecibir);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<Void> actulaizar(@RequestBody EquipoPorRecibir equiporecibir){
		bitacora.info(equiporecibir);
		try{
			ers.actualizar(equiporecibir);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<List<EquipoPorRecibirVista>> consultar(){
		List<EquipoPorRecibirVista> ev = null;
		try{
			ev = ers.consultar();
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<EquipoPorRecibirVista>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<EquipoPorRecibirVista>>(ev, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EquipoPorRecibirVista> buscar(@PathVariable("id") int id) {
		EquipoPorRecibirVista ev = null;
		try{
			ev = ers.buscar(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<EquipoPorRecibirVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<EquipoPorRecibirVista>(ev, HttpStatus.OK);
	}
	
	@GetMapping("/cliente/{id}")
	public ResponseEntity<List<EquipoPorRecibirVista>> consultarPorCliente(@PathVariable int id){
		List<EquipoPorRecibirVista> ev = null;
		try{
			ev = ers.ConsultarPorCliente(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<EquipoPorRecibirVista>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<EquipoPorRecibirVista>>(ev, HttpStatus.OK);
	}
	
	@DeleteMapping()
	public ResponseEntity<Void> borrar(@RequestBody EquipoPorRecibir epr){
		boolean borrado = false;
		try{
			borrado = ers.borrar(epr);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
		}
		if(borrado){
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else return new ResponseEntity<Void>(HttpStatus.CONFLICT);		
	}
}
