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

import com.turbomaquinas.POJO.comercial.DeptoPrecotizacion;
import com.turbomaquinas.POJO.comercial.DeptoPrecotizacionVista;
import com.turbomaquinas.service.comercial.DeptoPrecotizacionService;


@RestController
@RequestMapping("/comercial/deptoprecotizacion")
public class WSDeptoPrecotizacion {
	
	private static final Log bitacora = LogFactory.getLog(WSDeptoPrecotizacion.class);
	
	@Autowired
	DeptoPrecotizacionService dps;
	
	@PostMapping()
	public ResponseEntity<Void> crear(@RequestBody DeptoPrecotizacion deptoPrecotizacion){
		bitacora.info(deptoPrecotizacion);
		try{
			dps.crear(deptoPrecotizacion);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}catch(DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody DeptoPrecotizacion deptoPrecotizacion){
		bitacora.info(deptoPrecotizacion);
		try{
			dps.actualizar(deptoPrecotizacion);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<DeptoPrecotizacionVista>> consultar(){
		List<DeptoPrecotizacionVista> dpv = null;
		try{
			dpv = dps.consultar();
		}catch(DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<DeptoPrecotizacionVista>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<DeptoPrecotizacionVista>>(dpv, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DeptoPrecotizacionVista> buscar(@PathVariable("id") int id){
		DeptoPrecotizacionVista dpv = null;
		try{
			dpv = dps.buscar(id);
		}catch(DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DeptoPrecotizacionVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<DeptoPrecotizacionVista>(dpv, HttpStatus.OK);
	}
}
