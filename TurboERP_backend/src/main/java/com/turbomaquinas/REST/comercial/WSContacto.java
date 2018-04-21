package com.turbomaquinas.REST.comercial;

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

import com.turbomaquinas.POJO.comercial.Contacto;
import com.turbomaquinas.POJO.comercial.ContactoVista;
import com.turbomaquinas.service.comercial.ContactoService;

@RestController
@RequestMapping("/comercial/contactos")
public class WSContacto {
	
	private static final Log bitacora = LogFactory.getLog(WSContacto.class);
	
	@Autowired
	ContactoService cs;
	
	
	@PostMapping()
	public ResponseEntity<Void> crear(@RequestBody Contacto contacto){
		bitacora.info(contacto);
		try{
			cs.crear(contacto);	
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}catch(DataAccessException e){
				bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<Void> actualizar(@RequestBody Contacto contacto){
		bitacora.info(contacto);
		try{
			cs.actualizar(contacto);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}	
		 return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<ContactoVista>> consultar(){
		List<ContactoVista> cv= null;
		try{
				cv = cs.consultar();
			}catch(DataAccessException e){
				bitacora.error(e.getMessage());
				return new ResponseEntity<List<ContactoVista>>(HttpStatus.NO_CONTENT);
			}	
				return new ResponseEntity<List<ContactoVista>>(cv, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ContactoVista> buscar(@PathVariable("id") int id) {
		ContactoVista cv = null;
		try{
			cv = cs.buscar(id);
		}catch(DataAccessException e){
				bitacora.error(e.getMessage());
			return new ResponseEntity<ContactoVista>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<ContactoVista>(cv, HttpStatus.OK);			
	}
		
	@GetMapping("/cliente/{clienteID}")
	public ResponseEntity<List<ContactoVista>> consultarContactosCliente(@PathVariable int clienteID){
		List<ContactoVista> lc = null;
		try{
			lc = cs.consultarContactos(clienteID);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<ContactoVista>>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<List<ContactoVista>>(lc, HttpStatus.OK);
	}
	
}
