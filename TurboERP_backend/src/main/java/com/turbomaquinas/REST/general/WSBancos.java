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

import com.turbomaquinas.POJO.general.Bancos;
import com.turbomaquinas.service.general.BancosService;

@RestController
@RequestMapping("/general/bancos")
public class WSBancos {
	
	private static final Log bitacora = LogFactory.getLog(WSBancos.class);
	
	@Autowired
	BancosService s;
	
	@GetMapping("/{clave}")
	public ResponseEntity<Bancos> buscar(@PathVariable String clave){
		Bancos b = null;
		try{
			b = s.buscar(clave);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Bancos>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Bancos>(b, HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<List<Bancos>> consultar(){
		List<Bancos> bl = s.consultar();
		if(bl == null)
			return new ResponseEntity<List<Bancos>>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<Bancos>>(bl, HttpStatus.OK);
	}
}
