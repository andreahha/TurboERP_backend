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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.general.Personal;
import com.turbomaquinas.POJO.general.PersonalVista;
import com.turbomaquinas.service.general.PersonalService;

@RestController
@RequestMapping("general/personal")
public class WSPersonal {
	
	private static final Log bitacora = LogFactory.getLog(WSPersonal.class);
	
	@Autowired
	PersonalService ps;
	
	@PostMapping
	public ResponseEntity<PersonalVista> crear(@RequestBody Personal p){
		PersonalVista respuesta = null;
		bitacora.info(p);
		try {
			respuesta = ps.crear(p);
			return new ResponseEntity<PersonalVista>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<PersonalVista>(HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<PersonalVista> actualizar(@RequestBody Personal p){
		bitacora.info(p);
		PersonalVista respuesta = null;
		try {
			respuesta=ps.actualizar(p);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<PersonalVista> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<PersonalVista>(respuesta, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PersonalVista> buscar(@PathVariable int id){
		PersonalVista pv = null;
		try {
			pv = ps.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<PersonalVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<PersonalVista>(pv, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<PersonalVista>> consultar(){
		
		List<PersonalVista> lpv = ps.consultar();
		if (lpv == null )
			return new ResponseEntity<List<PersonalVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<PersonalVista>>(lpv, HttpStatus.OK);
	}
	
	@GetMapping("/numero/{numero}")
	public ResponseEntity<PersonalVista> buscarPorNumero(@PathVariable int numero){
		PersonalVista pv = null;
		try {
			pv = ps.buscarPorNumero(numero);
		} catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<PersonalVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<PersonalVista>(pv, HttpStatus.OK);
	}

	@GetMapping("/{numero}/autorizadorecibirequipo")
	public ResponseEntity<PersonalVista> buscarPersonalAutorizadoRE(@PathVariable int numero){
		PersonalVista pav = null;
		try {
			pav = ps.buscarPersonalAutorizadoRE(numero);
		} catch (Exception e) {
			//bitacora.error(e.getMessage());
			return new ResponseEntity<PersonalVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<PersonalVista>(pav, HttpStatus.OK);
	}

	@GetMapping("/autorizadorecibirequipo")
	public ResponseEntity<List<PersonalVista>> consultarPersonalAutorizadoRE(){
		
		List<PersonalVista> lpav = ps.consultarPersonalAutorizadoRE();
		if (lpav == null )
			return new ResponseEntity<List<PersonalVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<PersonalVista>>(lpav, HttpStatus.OK);
	}

	@GetMapping("/{numero}/compras")
	public ResponseEntity<PersonalVista> buscarPersonalCompras(@PathVariable int numero){
		PersonalVista pcv = null;
		try {
			pcv = ps.buscarPersonalCompras(numero);
		} catch (Exception e) {
			//bitacora.error(e.getMessage());
			return new ResponseEntity<PersonalVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<PersonalVista>(pcv, HttpStatus.OK);
	}

	@GetMapping("/compras")
	public ResponseEntity<List<PersonalVista>> consultarPersonalCompras(){
		
		List<PersonalVista> lpcv = ps.consultarPersonalCompras();
		if (lpcv == null )
			return new ResponseEntity<List<PersonalVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<PersonalVista>>(lpcv, HttpStatus.OK);
	}
	
	@GetMapping("/{numero}/departameto")
	public ResponseEntity<PersonalVista> buscarPorNumeroYDepto(@PathVariable int numero,@RequestParam String clave){
		PersonalVista pcv = null;
		try {
			pcv = ps.buscarPorNumeroYDepto(numero, clave);
		} catch (Exception e) {
			//bitacora.error(e.getMessage());
			return new ResponseEntity<PersonalVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<PersonalVista>(pcv, HttpStatus.OK);
	}
	
	@GetMapping("/departamento/{clave}")
	public ResponseEntity<List<PersonalVista>> consultarPersonalPorDepto(@PathVariable String clave){
		List<PersonalVista> lpcv = null;
		try{
			lpcv = ps.consultarPersonalPorDepto(clave);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<PersonalVista>>(HttpStatus.NO_CONTENT);
		}
		if (lpcv.isEmpty())
			return new ResponseEntity<List<PersonalVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<PersonalVista>>(lpcv, HttpStatus.OK);
	}

}
