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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.general.EncabezadoActividadAutorizada;
import com.turbomaquinas.POJO.general.EncabezadoActividadAutorizadaVista;
import com.turbomaquinas.service.general.EncabezadoActividadAutorizadaService;

@RestController
@RequestMapping("/general/encabezadoactivaut")
public class WSEncabezadoActividadAutorizada {
	
	private static final Log bitacora = LogFactory.getLog(WSEncabezadoActividadAutorizada.class);

	@Autowired
	EncabezadoActividadAutorizadaService s;
	
	@PostMapping()
	public ResponseEntity<EncabezadoActividadAutorizadaVista> crear(@RequestBody EncabezadoActividadAutorizada encabezado){
		EncabezadoActividadAutorizadaVista respuesta = null;
		bitacora.info(encabezado);
		try{
			respuesta = s.crear(encabezado);
			return new ResponseEntity<EncabezadoActividadAutorizadaVista>(respuesta, HttpStatus.CREATED);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<EncabezadoActividadAutorizadaVista>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<Void> actualizar(@RequestBody EncabezadoActividadAutorizada encabezado){
		bitacora.info(encabezado);
		try{
		s.actualizar(encabezado);
		return new ResponseEntity<Void>(HttpStatus.OK);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	
	@GetMapping()
	public ResponseEntity<List<EncabezadoActividadAutorizadaVista>> consultar(){
		List<EncabezadoActividadAutorizadaVista> ev = null;
		try{
			ev = s.consultar();
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<EncabezadoActividadAutorizadaVista>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<EncabezadoActividadAutorizadaVista>>(ev, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EncabezadoActividadAutorizadaVista> buscar(@PathVariable ("id") int id){
			EncabezadoActividadAutorizadaVista ev = null;
			try{
				ev = s.buscar(id);
			}catch (DataAccessException e) {
				bitacora.error(e.getMessage());
				return new ResponseEntity<EncabezadoActividadAutorizadaVista>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<EncabezadoActividadAutorizadaVista>(ev, HttpStatus.OK);
	}
}
