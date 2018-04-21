package com.turbomaquinas.REST.SGC;

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

import com.turbomaquinas.POJO.SGC.SolicitudCambio;
import com.turbomaquinas.POJO.SGC.SolicitudCambioVista;
import com.turbomaquinas.service.SGC.SolicitudCambioService;

@RestController
@RequestMapping("/sgc/solicitudes-cambio")
public class WSSolicitudCambio {

	private static final Log bitacora = LogFactory.getLog(WSSolicitudCambio.class);
	
	@Autowired
	SolicitudCambioService s;
	
	@PostMapping()
	public ResponseEntity<SolicitudCambioVista> crear(@RequestBody SolicitudCambio solicitud){
		
		SolicitudCambioVista respuesta = null;
		bitacora.info(solicitud);
		try{
			 respuesta = s.crear(solicitud);	
			return new ResponseEntity<SolicitudCambioVista>(respuesta, HttpStatus.CREATED);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<SolicitudCambioVista>(HttpStatus.CONFLICT);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<SolicitudCambioVista> buscar(@PathVariable int id){
		SolicitudCambioVista sc = null;
		try{
			sc = s.buscar(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<SolicitudCambioVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<SolicitudCambioVista>(sc, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<SolicitudCambioVista>> consultar(){
		List<SolicitudCambioVista> solicitudes = null;
		try{
			solicitudes = s.consultar();
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<SolicitudCambioVista>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<SolicitudCambioVista>>(solicitudes, HttpStatus.OK);
	}
	
	
	@GetMapping("/pendientes/{rol}")
	public ResponseEntity<List<SolicitudCambioVista>> consultarPendientes(@PathVariable String rol){
		List<SolicitudCambioVista> solicitudes = null;
		try{
			solicitudes = s.consultarporEstado("P", rol);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<SolicitudCambioVista>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<SolicitudCambioVista>>(solicitudes, HttpStatus.OK);
	}
	
	@GetMapping("/evaluadas/{rol}")
	public ResponseEntity<List<SolicitudCambioVista>> consultarEvaluadas(@PathVariable String rol){
		List<SolicitudCambioVista> solicitudes = null;
		try{
			solicitudes = s.consultarporEstado("E", rol);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<SolicitudCambioVista>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<SolicitudCambioVista>>(solicitudes, HttpStatus.OK);
	}
	
	@GetMapping("/resueltas/{rol}")
	public ResponseEntity<List<SolicitudCambioVista>> consultarResueltas(@PathVariable String rol){
		List<SolicitudCambioVista> solicitudes = null;
		try{
			solicitudes = s.consultarporEstado("R", rol);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<SolicitudCambioVista>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<SolicitudCambioVista>>(solicitudes, HttpStatus.OK);
	}
	
	@GetMapping("/verificadas/{rol}")
	public ResponseEntity<List<SolicitudCambioVista>> consultarVerificadas(@PathVariable String rol){
		List<SolicitudCambioVista> solicitudes = null;
		try{
			solicitudes = s.consultarporEstado("V", rol);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<SolicitudCambioVista>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<SolicitudCambioVista>>(solicitudes, HttpStatus.OK);
	}
	
	@PutMapping("/evaluacion")
	public ResponseEntity<Void> actualizarEvaluacion(@RequestBody SolicitudCambio solicitud){
		bitacora.info(solicitud);
		try{
			s.actualizarEvaluacion(solicitud);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping("/resolucion")
	public ResponseEntity<Void> actualizarResolucion(@RequestBody SolicitudCambio solicitud){
		try{
			s.actualizarResolucion(solicitud);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping("/verificacion")
	public ResponseEntity<Void> actualizarVerificacion(@RequestBody SolicitudCambio solicitud){
		try{
			bitacora.info(solicitud);
			s.actualizarVerificacion(solicitud);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
