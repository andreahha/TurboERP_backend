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

import com.turbomaquinas.POJO.general.Estado;
import com.turbomaquinas.POJO.general.Pais;
import com.turbomaquinas.service.general.PaisService;

@RestController
@RequestMapping("general/paises")

public class WSPais {
	
	private static final Log bitacora = LogFactory.getLog(WSPais.class);
	
	@Autowired
	PaisService p;
	
	@GetMapping("/{clave}")
	public ResponseEntity<Pais> buscar(@PathVariable String clave){
		Pais pv = null;
		try{
			pv = p.buscar(clave);
		} catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Pais>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Pais>(pv, HttpStatus.OK);
	}	

	@GetMapping()
	public ResponseEntity<List<Pais>> consultar(){
		List<Pais> paises = null; 
		try{
			paises = p.consultar();
		}catch(DataAccessException e){
			return new ResponseEntity<List<Pais>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Pais>>(paises, HttpStatus.OK);
	}

	@GetMapping("/{id}/estados")
	public ResponseEntity<List<Estado>> consultarEstados(@PathVariable int id){
		List<Estado> edos = null;
		try{
			edos = p.consultarEstados(id);
		} catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<Estado>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Estado>>(edos, HttpStatus.OK);
	}	
	


}
