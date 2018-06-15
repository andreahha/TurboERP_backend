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

import com.turbomaquinas.POJO.comercial.DetalleFacturaVarios;
import com.turbomaquinas.POJO.comercial.DetalleFacturaVariosVista;
import com.turbomaquinas.service.comercial.DetalleFacturaVariosService;

@RestController
@RequestMapping("/comercial/detallefacturavarios")
public class WSDetalleFacturaVarios {
	
	private static final Log bitacora = LogFactory.getLog(WSDetalleFacturaVarios.class); 

	@Autowired
	DetalleFacturaVariosService s;
	
	@PostMapping()
	public ResponseEntity<DetalleFacturaVariosVista> crear(@RequestBody DetalleFacturaVarios factura){
		DetalleFacturaVariosVista respuesta = null;
		bitacora.info(factura);
		try{
			respuesta = s.crear(factura);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DetalleFacturaVariosVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<DetalleFacturaVariosVista>(respuesta, HttpStatus.CREATED);
	}
	
	@PutMapping()
	public ResponseEntity<Void> actualizar(@RequestBody DetalleFacturaVarios factura){
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
	public ResponseEntity<DetalleFacturaVariosVista> buscar(@PathVariable int id){
		DetalleFacturaVariosVista respuesta = null;
		try {
			respuesta = s.buscar(id);
		} catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DetalleFacturaVariosVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<DetalleFacturaVariosVista>(respuesta, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<DetalleFacturaVariosVista>> consultar(){
		List<DetalleFacturaVariosVista> factura = s.consultar();
		if ( factura == null)
			return new ResponseEntity<List<DetalleFacturaVariosVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<DetalleFacturaVariosVista>>(factura, HttpStatus.OK);
	}
}
