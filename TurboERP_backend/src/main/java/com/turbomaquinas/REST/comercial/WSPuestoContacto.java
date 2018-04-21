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

import com.turbomaquinas.POJO.comercial.PuestoContacto;
import com.turbomaquinas.service.comercial.PuestoContactoService;

@RestController
@RequestMapping("/comercial/puestoscontactos")
public class WSPuestoContacto {
	
	private static final Log bitacora = LogFactory.getLog(WSPuestoContacto.class);

	@Autowired
	PuestoContactoService pcs;
	
	@PostMapping()
	public ResponseEntity<Void> crear(@RequestBody PuestoContacto puestoContacto){
		bitacora.info(puestoContacto);
		try{
			pcs.crear(puestoContacto);	
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}catch(DataAccessException e){
				bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<Void> actualizar(@RequestBody PuestoContacto puestoContacto){
		bitacora.info(puestoContacto);
		try{
			pcs.actualizar(puestoContacto);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}	
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<PuestoContacto>> consultar(){
		List<PuestoContacto> pc= null;
		try{
				pc = pcs.consultar();
			}catch(DataAccessException e){
				bitacora.error(e.getMessage());
				return new ResponseEntity<List<PuestoContacto>>(HttpStatus.NO_CONTENT);
			}	
				return new ResponseEntity<List<PuestoContacto>>(pc, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PuestoContacto> buscar(@PathVariable("id") int id) {
		PuestoContacto pc = null;
		try{
			pc = pcs.buscar(id);
		}catch(DataAccessException e){
				bitacora.error(e.getMessage());
			return new ResponseEntity<PuestoContacto>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<PuestoContacto>(pc, HttpStatus.OK);			
	}
	
}
