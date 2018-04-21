package com.turbomaquinas.REST.comercial;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.comercial.DeptoCotizacion;
import com.turbomaquinas.service.comercial.DeptoCotizacionService;

@RestController
@RequestMapping("/comercial/deptocotizacion")
public class WSDeptoCotizacion {
	
	private static final Log bitacora = LogFactory.getLog(WSDeptoCotizacion.class);
	
	@Autowired
	DeptoCotizacionService s;
	
	
	@PostMapping
	public ResponseEntity<DeptoCotizacion> crear(@RequestBody DeptoCotizacion dc){
		DeptoCotizacion respuesta = null;
		bitacora.info(dc);
		try {
			respuesta = s.crear(dc);
			return new ResponseEntity<DeptoCotizacion>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DeptoCotizacion>(HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody DeptoCotizacion dc) {
		bitacora.info(dc);
		try {
			s.actualizar(dc);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void> (HttpStatus.CONFLICT);
		}
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DeptoCotizacion> buscar(@PathVariable int id){
		DeptoCotizacion dc = null;
		try {
			dc = s.buscar(id);
			return new ResponseEntity<DeptoCotizacion>(dc, HttpStatus.OK);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DeptoCotizacion>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping
	public ResponseEntity<List<DeptoCotizacion>> consultar(){
		List<DeptoCotizacion> dcot = s.consultar();
		if (dcot == null)
			return new ResponseEntity<List<DeptoCotizacion>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<DeptoCotizacion>>(dcot, HttpStatus.OK);
		
	}
	
	
	
}
