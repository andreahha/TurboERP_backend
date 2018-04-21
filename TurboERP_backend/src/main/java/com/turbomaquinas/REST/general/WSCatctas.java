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

import com.turbomaquinas.POJO.general.Catctas;
import com.turbomaquinas.service.general.CatctasService;

@RestController
@RequestMapping("/general/catctas")
public class WSCatctas {
	
	private static final Log bitacora = LogFactory.getLog(WSCatctas.class);
	
	@Autowired
	CatctasService s;
	
	@GetMapping("/{cuenta}")
	public ResponseEntity<Catctas> buscar(@PathVariable String cuenta){
		Catctas cc = null;
		try{
			cc = s.buscar(cuenta);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Catctas>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Catctas>(cc, HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<List<Catctas>> consultar(){
		List<Catctas> ccl = s.consultar();
		if(ccl == null)
			return new ResponseEntity<List<Catctas>>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<Catctas>>(ccl, HttpStatus.OK);
	}
}
