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

import com.turbomaquinas.POJO.general.Autorizacion;
import com.turbomaquinas.service.general.AutorizacionService;

@RestController
@RequestMapping("/general/autorizacion")
public class WSAutorizacion {
	
	@Autowired
	private static final Log bitacora = LogFactory.getLog(WSAutorizacion.class);
	
	@Autowired
	AutorizacionService s;
	
	@GetMapping("/{id}")
	public ResponseEntity<Autorizacion> buscar(@PathVariable int id){
		Autorizacion a = null;
		try{
			a = s.buscar(id);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Autorizacion>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Autorizacion>(a, HttpStatus.OK);
	}
	
	@GetMapping("/orden/{id}")
	public ResponseEntity<List<Autorizacion>> consultarPorOrdenId(@PathVariable int id){
		List<Autorizacion> a = null;
		try{
			a = s.consultarPorOrdenid(id);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<Autorizacion>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Autorizacion>>(a, HttpStatus.OK);
	}
}
