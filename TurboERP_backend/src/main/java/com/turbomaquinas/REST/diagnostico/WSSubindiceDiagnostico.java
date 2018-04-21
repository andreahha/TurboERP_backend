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

import com.turbomaquinas.POJO.diagnostico.SubindiceDiagnostico;
import com.turbomaquinas.POJO.diagnostico.SubindiceDiagnosticoVista;
import com.turbomaquinas.service.diagnostico.SubindiceDiagnosticoService;

@RestController
@RequestMapping("/diagnostico/subindicediagnostico")
public class WSSubindiceDiagnostico {
	
	private static final Log bitacora = LogFactory.getLog(WSSubindiceDiagnostico.class);
	
	@Autowired
	SubindiceDiagnosticoService sds;
	
	@PostMapping()
	public ResponseEntity<SubindiceDiagnosticoVista> crear(@RequestBody SubindiceDiagnostico subindiceDiagnostico){
		SubindiceDiagnosticoVista respuesta = null;
		bitacora.info(subindiceDiagnostico);
		try{
			respuesta = sds.crear(subindiceDiagnostico);
			return new ResponseEntity<SubindiceDiagnosticoVista>(respuesta, HttpStatus.CREATED);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<SubindiceDiagnosticoVista>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<SubindiceDiagnosticoVista> actualizar(@RequestBody SubindiceDiagnostico subindiceDiagnostico){
		SubindiceDiagnosticoVista sdv = null;
		bitacora.info(subindiceDiagnostico);
		try{
			sdv = sds.actualizar(subindiceDiagnostico);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<SubindiceDiagnosticoVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<SubindiceDiagnosticoVista>(sdv, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<SubindiceDiagnosticoVista>> consultar(){
		List<SubindiceDiagnosticoVista> sd = null;
		try{
			sd = sds.consultar();
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<SubindiceDiagnosticoVista>>(HttpStatus.NO_CONTENT);
		}
			return new ResponseEntity<List<SubindiceDiagnosticoVista>>(sd, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<SubindiceDiagnosticoVista> buscar(@PathVariable ("id") int id){
		SubindiceDiagnosticoVista sd = null;
		try{
			sd = sds.buscar(id);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<SubindiceDiagnosticoVista>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<SubindiceDiagnosticoVista>(sd, HttpStatus.OK);
	}
	
	@DeleteMapping()
	public ResponseEntity<Void> borrar(@RequestBody SubindiceDiagnostico sd){
		boolean borrado = false;
		try{
			borrado = sds.borrar(sd);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		if(borrado){
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else return new ResponseEntity<Void>(HttpStatus.CONFLICT);		
	}
}
