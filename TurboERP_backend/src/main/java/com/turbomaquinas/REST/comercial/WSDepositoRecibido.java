package com.turbomaquinas.REST.comercial;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.comercial.DepositoRecibido;
import com.turbomaquinas.POJO.comercial.DepositoRecibidoVista;
import com.turbomaquinas.service.comercial.DepositoRecibidoService;

@RestController
@RequestMapping("/comercial/depositorecibido")
public class WSDepositoRecibido {
	
	private static final Log bitacora = LogFactory.getLog(WSDepositoRecibido.class);

	@Autowired
	DepositoRecibidoService s;
	
	@PostMapping()
	public ResponseEntity<DepositoRecibidoVista> crear(@RequestBody DepositoRecibido depositoRecibido){
		DepositoRecibidoVista respuesta = null;
		bitacora.info(depositoRecibido);
		try{
			respuesta = s.crear(depositoRecibido);
			return new ResponseEntity<DepositoRecibidoVista>(respuesta, HttpStatus.CREATED);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DepositoRecibidoVista>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<Void> actualizar(@RequestBody DepositoRecibido depositoRecibido){
		bitacora.info(depositoRecibido);
		try{
			s.actualizar(depositoRecibido);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DepositoRecibidoVista> buscar(@PathVariable("id") int id){
		DepositoRecibidoVista d = null;
		try{
			d = s.buscar(id);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DepositoRecibidoVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<DepositoRecibidoVista>(d, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<DepositoRecibidoVista>> consultar(){
		List<DepositoRecibidoVista> d = null;
		try{
			d = s.consultar();
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<DepositoRecibidoVista>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<DepositoRecibidoVista>>(d, HttpStatus.OK);
	}
	
	
	@GetMapping("/fechas")
	public ResponseEntity<List<DepositoRecibidoVista>> consultarPorFechas(@RequestParam String fechainicio,@RequestParam String fechafin){
		List<DepositoRecibidoVista> p = s.depositosRecibidosFecha(fechainicio,fechafin);
		if (p.isEmpty())
			return new ResponseEntity<List<DepositoRecibidoVista>> (HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<DepositoRecibidoVista>>(p, HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> borrar(@PathVariable("id") int idDR,@RequestParam int modificado_por){
		
		try{
			s.borrarDR(idDR,modificado_por);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);		
	}
	
	@GetMapping("/{id}/nacional")
	public ResponseEntity<Boolean> buscarMonedaNacional(@PathVariable int id){
		boolean nacional = true;
		try {
			nacional = s.consultarMonedaDepositoRecibido(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Boolean> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Boolean> (nacional, HttpStatus.OK);
	}
}
