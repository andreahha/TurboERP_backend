package com.turbomaquinas.REST.general;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.general.Parametro;
import com.turbomaquinas.service.general.ParametroService;

@RestController
@RequestMapping("general/parametro")
public class WSParametro {
	
	private static final Log bitacora = LogFactory.getLog(WSParametro.class);
	
	@Autowired
	ParametroService p;
	
	@GetMapping()
	public ResponseEntity<List<Parametro>> consultar(){
		List<Parametro> parametro = null; 
		try{
			parametro = p.consultar();
			
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<Parametro>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Parametro>>(parametro, HttpStatus.OK);
	}
	
	@PutMapping()
	public ResponseEntity<Parametro> cerrarMes(@RequestBody Parametro parametro){
		Parametro respuesta = null;
		bitacora.info(parametro);
		try{
			respuesta = p.cierreMes(parametro);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Parametro>(HttpStatus.CONFLICT);
		}	
		return new ResponseEntity<Parametro>(respuesta, HttpStatus.OK);
	}
	

}
