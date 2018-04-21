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

import com.turbomaquinas.POJO.general.FormaPago;
import com.turbomaquinas.service.general.FormaPagoService;

@RestController
@RequestMapping("/general/formapago")
public class WSFormaPago {

	public static final Log bitacora = LogFactory.getLog(WSFormaPago.class);
	
	@Autowired
	FormaPagoService s;
	
	@GetMapping()
	public ResponseEntity<List<FormaPago>> consultar(){
		List<FormaPago> formaPago = null;
		try{
			formaPago = s.consultar();
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<FormaPago>>(HttpStatus.NO_CONTENT);
		}
			return new ResponseEntity<List<FormaPago>>(formaPago, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<FormaPago> buscar(@PathVariable ("id") int id){
		FormaPago formaPago = null;
		try{
			formaPago = s.buscar(id);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<FormaPago>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<FormaPago>(formaPago, HttpStatus.OK);
	}
	
	@GetMapping("/clave/{clave}")
	public ResponseEntity<FormaPago> buscarPorClave(@PathVariable ("clave") String clave){
		FormaPago formaPago = null;
		try{
			formaPago = s.buscarPorClave(clave);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<FormaPago>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<FormaPago>(formaPago, HttpStatus.OK);
	}

}