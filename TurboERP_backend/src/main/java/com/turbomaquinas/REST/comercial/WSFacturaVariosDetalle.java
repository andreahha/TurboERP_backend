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

import com.turbomaquinas.POJO.comercial.FacturaVariosDetalle;
import com.turbomaquinas.POJO.comercial.FacturaVariosDetalleVista;
import com.turbomaquinas.service.comercial.FacturaVariosDetalleService;

@RestController
@RequestMapping("/comercial/facturavariosdetalle")
public class WSFacturaVariosDetalle {
	
	private static final Log bitacora = LogFactory.getLog(WSFacturaVariosDetalle.class); 

	@Autowired
	FacturaVariosDetalleService s;
	
	@PostMapping()
	public ResponseEntity<FacturaVariosDetalleVista> crear(@RequestBody FacturaVariosDetalle factura){
		FacturaVariosDetalleVista respuesta = null;
		bitacora.info(factura);
		try{
			respuesta = s.crear(factura);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<FacturaVariosDetalleVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<FacturaVariosDetalleVista>(respuesta, HttpStatus.CREATED);
	}
	
	@PutMapping()
	public ResponseEntity<Void> actualizar(@RequestBody FacturaVariosDetalle factura){
		bitacora.info(factura);
		try{
			s.actualizar(factura);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<FacturaVariosDetalleVista> buscar(@PathVariable int id){
		FacturaVariosDetalleVista respuesta = null;
		try {
			respuesta = s.buscar(id);
		} catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<FacturaVariosDetalleVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<FacturaVariosDetalleVista>(respuesta, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<FacturaVariosDetalleVista>> consultar(){
		List<FacturaVariosDetalleVista> factura = s.consultar();
		if ( factura == null)
			return new ResponseEntity<List<FacturaVariosDetalleVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<FacturaVariosDetalleVista>>(factura, HttpStatus.OK);
	}
}
