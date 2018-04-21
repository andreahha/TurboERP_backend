package com.turbomaquinas.REST.diagnostico;

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

import com.turbomaquinas.POJO.diagnostico.EquipoRecibido;
import com.turbomaquinas.POJO.diagnostico.EquipoRecibidoVista;
import com.turbomaquinas.service.diagnostico.EquipoRecibidoService;

@RestController
@RequestMapping("/diagnostico/eqrecibido")
public class WSEquipoRecibido {
	
	private static final Log bitacora = LogFactory.getLog(WSEquipoRecibido.class);
	
	@Autowired
	EquipoRecibidoService s;
	
	@PostMapping
	public ResponseEntity<EquipoRecibidoVista> crear(@RequestBody EquipoRecibido er) {
		EquipoRecibidoVista respuesta = null;
		bitacora.info(er);
		try{
			respuesta = s.crear(er);
			return new ResponseEntity<EquipoRecibidoVista>(respuesta, HttpStatus.CREATED);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<EquipoRecibidoVista>(HttpStatus.CONFLICT);
		}

	}
	
	@PutMapping
	public ResponseEntity<EquipoRecibidoVista> actualizar(@RequestBody EquipoRecibido er) {
		EquipoRecibidoVista respuesta = null;
		bitacora.info(er);
		try{
			respuesta = s.actualizar(er);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<EquipoRecibidoVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<EquipoRecibidoVista>(respuesta, HttpStatus.OK);
	}
	

	@GetMapping("/{id}")
	public ResponseEntity<EquipoRecibidoVista> buscar(@PathVariable int id) {
		EquipoRecibidoVista ev = null;
		try{
			ev = s.buscar(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<EquipoRecibidoVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<EquipoRecibidoVista>(ev, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<EquipoRecibidoVista>> consultar() {
		List<EquipoRecibidoVista> ev = null;
		try{
			ev = s.consultar();
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<EquipoRecibidoVista>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<EquipoRecibidoVista>>(ev, HttpStatus.OK);
	}
	
	@DeleteMapping()
	public ResponseEntity<Void> borrar(@RequestBody EquipoRecibido er){
		boolean borrado = false;
		try{
			borrado = s.borrar(er);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
		}
		if(borrado){
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else return new ResponseEntity<Void>(HttpStatus.CONFLICT);		
	}
	
	@GetMapping("/cantidad/{orden_id}/{ES_Recibir_Equipo_id}")
	public ResponseEntity<Integer> cantidad(@PathVariable int orden_id, @PathVariable int ES_Recibir_Equipo_id){
		int cantidad = 0;
		try {
			cantidad = s.consultarCantidad(orden_id, ES_Recibir_Equipo_id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Integer> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Integer> (cantidad, HttpStatus.OK);
	}
	
	@GetMapping("/orden/{id}")
	public ResponseEntity<List<EquipoRecibidoVista>> consultarPorOrden(@PathVariable int id) {
		List<EquipoRecibidoVista> ev = null;
		try{
			ev = s.consultarPorOrden(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<EquipoRecibidoVista>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<EquipoRecibidoVista>>(ev, HttpStatus.OK);
	}
	
}
