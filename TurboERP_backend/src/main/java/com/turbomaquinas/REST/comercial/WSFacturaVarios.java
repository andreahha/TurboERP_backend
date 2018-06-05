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

import com.turbomaquinas.POJO.comercial.FacturaVarios;
import com.turbomaquinas.POJO.comercial.FacturaVariosVista;
import com.turbomaquinas.service.comercial.FacturaVariosService;

@RestController
@RequestMapping("/comercial/facturavarios")
public class WSFacturaVarios {

	private static final Log bitacora = LogFactory.getLog(WSFacturaVarios.class);
	
	@Autowired
	FacturaVariosService s;
	
	@PostMapping
	public ResponseEntity<FacturaVariosVista> crear(@RequestBody FacturaVarios fv){
		
		FacturaVariosVista respuesta = null;
		bitacora.info(fv);
		try {
			respuesta = s.crear(fv);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<FacturaVariosVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<FacturaVariosVista>(respuesta, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody FacturaVarios fv){

		bitacora.info(fv);
		try {
			s.actualizar(fv);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.NOT_MODIFIED);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<FacturaVariosVista> buscar(@PathVariable int id){
		
		FacturaVariosVista fvb = null;
		try {
			fvb = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<FacturaVariosVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<FacturaVariosVista>(fvb, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<FacturaVariosVista>> consultar(){
		
		List<FacturaVariosVista> fvl = s.consultar();
		if (fvl == null)
			return new ResponseEntity<List<FacturaVariosVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<FacturaVariosVista>>(fvl,HttpStatus.OK);
	}

	@DeleteMapping()
	public ResponseEntity<Void> cancelar(@RequestBody FacturaVarios fv){
		try{
			s.cancelar(fv);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
			return new ResponseEntity<Void>(HttpStatus.OK);		
	}
	
	@GetMapping("/cliente/{id}/{moneda}")
	public ResponseEntity<List<FacturaVariosVista>> consultarFacturasVariosPendientesPorCliente(@PathVariable int id,@PathVariable String moneda){
		List<FacturaVariosVista> fvl = null;
		try{
			fvl = s.consultarFacturasVariosPendientesPorCliente(id,moneda);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<FacturaVariosVista>>(HttpStatus.CONFLICT);
		}
		if (fvl.isEmpty()) {
			return new ResponseEntity<List<FacturaVariosVista>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<FacturaVariosVista>>(fvl, HttpStatus.OK);
		
	}
	
	@GetMapping("/folio/{estado}/{tipo}")
	public ResponseEntity<FacturaVariosVista> buscarFacturaFolio(@RequestParam String folio, @PathVariable String estado, @PathVariable String tipo){
		FacturaVariosVista factura = null;
		try{
			factura = s.buscarFacturaFolio(folio, estado, tipo);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<FacturaVariosVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<FacturaVariosVista>(factura, HttpStatus.OK);
	}
	
	@GetMapping("factura/{tipo}/{numero}/{estado}")
	public ResponseEntity<FacturaVariosVista> buscarPorNumero(@PathVariable String tipo, @PathVariable int numero, @PathVariable String estado){
		FacturaVariosVista ffv = null;
		try{
			ffv = s.buscarPorTipoNumero(numero, tipo,estado);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<FacturaVariosVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<FacturaVariosVista>(ffv, HttpStatus.OK);
		
	}
}
