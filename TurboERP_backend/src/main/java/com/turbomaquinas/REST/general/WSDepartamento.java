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

import com.turbomaquinas.POJO.SGC.SolicitudCambioVista;
import com.turbomaquinas.POJO.general.Departamento;
import com.turbomaquinas.POJO.general.DepartamentoVista;
import com.turbomaquinas.POJO.general.Personal;
import com.turbomaquinas.service.general.DepartamentoService;


@RestController
@RequestMapping("/general/deptos")
public class WSDepartamento {

	private static final Log bitacora = LogFactory.getLog(WSDepartamento.class);
	
	@Autowired
	DepartamentoService s;
	
	@GetMapping()
	public ResponseEntity<List<DepartamentoVista>> consultar(){
		List<DepartamentoVista> deptos = s.consultar();
		if(deptos == null)
			return new ResponseEntity<List<DepartamentoVista>>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<DepartamentoVista>>(deptos, HttpStatus.OK);
	}
	
	@GetMapping("/{clave}")
	public ResponseEntity<DepartamentoVista> buscar(@PathVariable String clave){
		DepartamentoVista dv = null;
		try{
			dv = s.buscar(clave);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<DepartamentoVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<DepartamentoVista>(dv, HttpStatus.OK);
	}
	
	@GetMapping("/{clave}/solicitudes-cambio")
	public ResponseEntity<List<SolicitudCambioVista>> consultarSolicitudes(@PathVariable String clave){
		List<SolicitudCambioVista> solicitudes = null;
		try{
			solicitudes = s.consultar(clave);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<SolicitudCambioVista>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<SolicitudCambioVista>>(solicitudes, HttpStatus.OK);
	}
	
	@GetMapping("/{clave}/evaluadores")
	public ResponseEntity<List<Personal>> consultarEvaluadores(@PathVariable String clave){
		List<Personal> evaluadores = null;
		try{
			evaluadores = s.consultarEvaluadores(clave);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<Personal>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Personal>>(evaluadores, HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<Void> crear(@RequestBody Departamento departamento){
		bitacora.info(departamento);
		try{
			s.crear(departamento);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
		
	@PutMapping()
	public ResponseEntity<Void> actualizar(@RequestBody Departamento departamento){
		bitacora.info(departamento);
		try{
			s.actualizar(departamento);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	

}
