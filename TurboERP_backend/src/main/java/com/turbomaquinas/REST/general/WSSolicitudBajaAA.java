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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.general.ActividadAutorizadaVista;
import com.turbomaquinas.POJO.general.SolicitudDesautorizacionAA;
import com.turbomaquinas.service.general.SolicitudBajaAAService;

@RestController
@RequestMapping("/general/solicitudbaja-aa")
public class WSSolicitudBajaAA {

	private static final Log bitacora = LogFactory.getLog(WSSolicitudBajaAA.class);
	
	@Autowired
	SolicitudBajaAAService ss;
	
	@PutMapping("/{id}/alfresco")
	public ResponseEntity<Void> actualizarAlfresco(@PathVariable("id") int id, @RequestParam String alfrescoId){
		bitacora.info(id);
		try{
			ss.actualizarAlfresco(id, alfrescoId);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}	
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<SolicitudDesautorizacionAA> buscar(@PathVariable int id){
		SolicitudDesautorizacionAA solicitud;
		try{
			solicitud = ss.buscar(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<SolicitudDesautorizacionAA>(HttpStatus.NOT_FOUND);
		}	
		return new ResponseEntity<SolicitudDesautorizacionAA>(solicitud, HttpStatus.OK);
	}
	
	@GetMapping("/folio/{numero}")
	public ResponseEntity<SolicitudDesautorizacionAA> buscarPorFolio(@PathVariable int numero){
		SolicitudDesautorizacionAA solicitud;
		try{
			solicitud = ss.buscarFolio(numero);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<SolicitudDesautorizacionAA>(HttpStatus.NOT_FOUND);
		}	
		return new ResponseEntity<SolicitudDesautorizacionAA>(solicitud, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/actividades")
	public ResponseEntity<List<ActividadAutorizadaVista>> consultarActividades(@PathVariable int id){
		List<ActividadAutorizadaVista> actividades;
		try{
			actividades = ss.consultarActividades(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<ActividadAutorizadaVista>>(HttpStatus.NOT_FOUND);
		}	
		return new ResponseEntity<List<ActividadAutorizadaVista>>(actividades, HttpStatus.OK);
	}
	
	@PutMapping("/{id}/resultado")
	public ResponseEntity<Void> actualizarResultado(@PathVariable("id") int id, @RequestParam String estado){
		try{
			ss.actualizarEstado(id, estado);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}	
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/orden/{id}")
	public ResponseEntity<List<SolicitudDesautorizacionAA>> consultarPorOrden(@PathVariable int id){
		List<SolicitudDesautorizacionAA> solicitudes;
		try{
			solicitudes = ss.consultarPorOrden(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<SolicitudDesautorizacionAA>>(HttpStatus.NOT_FOUND);
		}	
		return new ResponseEntity<List<SolicitudDesautorizacionAA>>(solicitudes, HttpStatus.OK);
	}
	
	@GetMapping("/orden/{id}/filtradas")
	public ResponseEntity<List<SolicitudDesautorizacionAA>> consultarPorOrdenyEstado(@PathVariable int id, @RequestParam String estado){
		List<SolicitudDesautorizacionAA> solicitudes;
		try{
			solicitudes = ss.consultarPorOrdenEstado(id, estado);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<SolicitudDesautorizacionAA>>(HttpStatus.NOT_FOUND);
		}	
		return new ResponseEntity<List<SolicitudDesautorizacionAA>>(solicitudes, HttpStatus.OK);
	}
}
