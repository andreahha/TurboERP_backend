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

import com.turbomaquinas.POJO.comercial.DTPrecotizacion;
import com.turbomaquinas.service.comercial.DTPrecotizacionService;

@RestController
@RequestMapping("comercial/dtprecotizacion")
public class WSDTPrecotizacion {
	
	private static final Log bitacora = LogFactory.getLog(WSPrecotizacion.class);

	@Autowired
	DTPrecotizacionService s;
	
	@PostMapping
	public ResponseEntity<DTPrecotizacion> crear(@RequestBody DTPrecotizacion dtp) {
		DTPrecotizacion respuesta = null;
//		bitacora.info(dtp);
		bitacora.info(dtp.toString());

		try {
			respuesta = s.crear(dtp);
			return new ResponseEntity<DTPrecotizacion>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DTPrecotizacion> (HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody DTPrecotizacion dtp){
		bitacora.info(dtp);
		try {
			s.actualizar(dtp);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DTPrecotizacion> buscar(@PathVariable int id){
		DTPrecotizacion dtp = null;
		try {
			dtp = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DTPrecotizacion>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<DTPrecotizacion>(dtp, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<DTPrecotizacion>> consultar(){
		List<DTPrecotizacion> dtprec = s.consultar();
		if (dtprec == null)
			return new ResponseEntity<List<DTPrecotizacion>>(HttpStatus.CONFLICT);
		return new ResponseEntity<List<DTPrecotizacion>>(dtprec, HttpStatus.OK);
		
	}
	
	
	
}
