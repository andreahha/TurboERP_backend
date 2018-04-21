package com.turbomaquinas.REST.general;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.general.UsoCfdi;
import com.turbomaquinas.service.general.UsoCfdiService;

@RestController
@RequestMapping("/general/usocfdi")
public class WSUsoCfdi {
	
	private static final Log bitacora = LogFactory.getLog(WSUsoCfdi.class);
	
	@Autowired
	UsoCfdiService s;
	
	@GetMapping("/{clave}")
	public ResponseEntity<UsoCfdi> buscar(@PathVariable String clave){
		UsoCfdi uc = null;
		try {
			uc = s.buscar(clave);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<UsoCfdi>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<UsoCfdi>(uc, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<UsoCfdi>> consultar() {
		List<UsoCfdi> ucl = s.consultar();
		if (ucl == null)
			return new ResponseEntity<List<UsoCfdi>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(ucl, HttpStatus.OK);
	}
	
}
