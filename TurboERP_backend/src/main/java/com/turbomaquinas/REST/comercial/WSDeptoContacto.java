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

import com.turbomaquinas.POJO.comercial.DeptoContacto;
import com.turbomaquinas.service.comercial.DeptoContactoService;

@RestController
@RequestMapping("/comercial/deptoscontactos")
public class WSDeptoContacto {
	
	private static final Log bitacora = LogFactory.getLog(WSDeptoContacto.class);

	@Autowired
	DeptoContactoService dcs;
	
	@PostMapping()
	public ResponseEntity<Void> crear(@RequestBody DeptoContacto deptoContacto){
		bitacora.info(deptoContacto);
		try{
			dcs.crear(deptoContacto);	
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}catch(DataAccessException e){
				bitacora.error(e.getMessage());;
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<Void> actualizar(@RequestBody DeptoContacto deptoContacto){
		bitacora.info(deptoContacto);
		try{
			dcs.actualizar(deptoContacto);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}	
		 return new ResponseEntity<Void>(HttpStatus.OK);	
	}
	
	@GetMapping()
	public ResponseEntity<List<DeptoContacto>> consultar(){
		List<DeptoContacto> dc= null;
		try{
				dc = dcs.consultar();
			}catch(DataAccessException e){
				bitacora.error(e.getMessage());
				return new ResponseEntity<List<DeptoContacto>>(HttpStatus.NO_CONTENT);
			}	
				return new ResponseEntity<List<DeptoContacto>>(dc, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DeptoContacto> buscar(@PathVariable("id") int id) {
		DeptoContacto dc = null;
		try{
			dc = dcs.buscar(id);
		}catch(DataAccessException e){
				bitacora.error(e.getMessage());
			return new ResponseEntity<DeptoContacto>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<DeptoContacto>(dc, HttpStatus.OK);			
	}
	
}
