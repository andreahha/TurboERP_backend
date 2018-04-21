package com.turbomaquinas.REST.general;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.general.MetodoPago;
import com.turbomaquinas.service.general.MetodoPagoService;


@RestController
@RequestMapping("/general/metodopago")
public class WSMetodoPago {
	
	public static final Log bitacora = LogFactory.getLog(WSMetodoPago.class);
	
	@Autowired
	MetodoPagoService s;
	
	@GetMapping()
	public ResponseEntity<List<MetodoPago>> consultar(){
		List<MetodoPago> metodoPago = null;
		try{
			metodoPago = s.consultar();
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<MetodoPago>>(HttpStatus.NO_CONTENT);
		}
			return new ResponseEntity<List<MetodoPago>>(metodoPago, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<MetodoPago> buscar(@PathVariable ("id") int id){
		MetodoPago metodoPago = null;
		try{
			metodoPago = s.buscar(id);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<MetodoPago>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<MetodoPago>(metodoPago, HttpStatus.OK);
	}
	
	@GetMapping("/clave/{clave}")
	public ResponseEntity<MetodoPago> buscarPorClave(@PathVariable ("clave") String clave){
		MetodoPago metodoPagoc = null;
		try{
			metodoPagoc = s.buscarPorClave(clave);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<MetodoPago>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<MetodoPago>(metodoPagoc, HttpStatus.OK);
	}
}
