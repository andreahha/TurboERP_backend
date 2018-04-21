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

import com.turbomaquinas.POJO.general.SubindiceActividadAutorizada;
import com.turbomaquinas.POJO.general.SubindiceActividadAutorizadaVista;
import com.turbomaquinas.service.general.SubindiceActividadAutorizadaService;

@RestController
@RequestMapping("/general/subindiceactivaut")
public class WSSubindiceActividadAutorizada {

	private static final Log bitacora = LogFactory.getLog(WSSubindiceActividadAutorizada.class);
	
	@Autowired
	SubindiceActividadAutorizadaService svc;
	
	@PostMapping()
	public ResponseEntity<SubindiceActividadAutorizadaVista> crear(@RequestBody SubindiceActividadAutorizada subindice){
		SubindiceActividadAutorizadaVista respuesta = null;
		bitacora.info(subindice);
		try{
			respuesta = svc.crear(subindice);
			return new ResponseEntity<SubindiceActividadAutorizadaVista>(respuesta, HttpStatus.CREATED);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<SubindiceActividadAutorizadaVista>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<Void> actualizar(@RequestBody SubindiceActividadAutorizada subindice){
		bitacora.info(subindice);
		try{
			svc.actualizar(subindice);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<SubindiceActividadAutorizadaVista>> consultar(){
		List<SubindiceActividadAutorizadaVista> sv = null;
		try{
		sv = svc.consultar();
	}catch (DataAccessException e) {
		bitacora.error(e.getMessage());
		return new ResponseEntity<List<SubindiceActividadAutorizadaVista>>(HttpStatus.NO_CONTENT);
	}
	return new ResponseEntity<List<SubindiceActividadAutorizadaVista>>(sv, HttpStatus.OK);
}
	
	@GetMapping("/{id}")
	public ResponseEntity<SubindiceActividadAutorizadaVista> buscar(@PathVariable ("id") int id){
		SubindiceActividadAutorizadaVista sv = null;
		try{
			sv = svc.buscar(id);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<SubindiceActividadAutorizadaVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<SubindiceActividadAutorizadaVista>(sv, HttpStatus.OK);
	}
}
