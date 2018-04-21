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

import com.turbomaquinas.POJO.diagnostico.EncabezadoDiagnostico;
import com.turbomaquinas.POJO.diagnostico.EncabezadoDiagnosticoVista;
import com.turbomaquinas.service.diagnostico.EncabezadoDiagnosticoService;

@RestController
@RequestMapping("/diagnostico/encabezadodiagnostico")
public class WSEncabezadoDiagnostico {
	
	private static final Log bitacora = LogFactory.getLog(WSEncabezadoDiagnostico.class);
	
	@Autowired
	EncabezadoDiagnosticoService eds;
	
	@PostMapping()
	public ResponseEntity<EncabezadoDiagnosticoVista> crear(@RequestBody EncabezadoDiagnostico encabezadoDiagnostico){
		EncabezadoDiagnosticoVista respuesta = null;
		bitacora.info(encabezadoDiagnostico);
		try{
			respuesta = eds.crear(encabezadoDiagnostico);
			return new ResponseEntity<EncabezadoDiagnosticoVista>(respuesta, HttpStatus.CREATED);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<EncabezadoDiagnosticoVista>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<EncabezadoDiagnosticoVista> actualizar(@RequestBody EncabezadoDiagnostico encabezadoDiagnostico){
		EncabezadoDiagnosticoVista edv = null;
		bitacora.info(encabezadoDiagnostico);
		try{
			edv = eds.actualizar(encabezadoDiagnostico);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<EncabezadoDiagnosticoVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<EncabezadoDiagnosticoVista>(edv, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<EncabezadoDiagnosticoVista>> consultar(){
		List<EncabezadoDiagnosticoVista> edv = null;
		try{
			edv = eds.consultar();
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<EncabezadoDiagnosticoVista>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<EncabezadoDiagnosticoVista>>(edv, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<EncabezadoDiagnosticoVista> buscar(@PathVariable("id") int id){
		EncabezadoDiagnosticoVista edv = null;
		try{
			edv = eds.buscar(id);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<EncabezadoDiagnosticoVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<EncabezadoDiagnosticoVista>(edv, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/cantidad")
	public ResponseEntity<Integer> contarDetalles(@PathVariable int id){
		int cantidad = 0;
		try {
			cantidad = eds.consultarCantidadDetalles(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Integer> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Integer> (cantidad, HttpStatus.OK);
	}
	
	@DeleteMapping()
	public ResponseEntity<Void> borrar(@RequestBody EncabezadoDiagnostico ed){
		boolean borrado = false;
		try{
			borrado = eds.borrar(ed);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		if(borrado){
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else return new ResponseEntity<Void>(HttpStatus.CONFLICT);		
	}
}
