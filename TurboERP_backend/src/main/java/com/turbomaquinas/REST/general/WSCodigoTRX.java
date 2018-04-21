package com.turbomaquinas.REST.general;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.turbomaquinas.POJO.general.CodigoTRX;
import com.turbomaquinas.service.general.CodigoTRXService;

@RestController
@RequestMapping("/general/trx")
public class WSCodigoTRX {
	
	@Autowired
	CodigoTRXService s;
	
	@GetMapping("/{clave}")
	public ResponseEntity<List<CodigoTRX>> consultar(@PathVariable String clave){
		List<CodigoTRX> codigos = new ArrayList<>();
		try{
			CodigoTRX respuesta = s.buscarClave(clave);
				codigos.add(respuesta);
		} catch (DataAccessException e) {
			System.out.println(e.getMessage());
			codigos = s.consultar(clave);
		} 
		if (codigos.isEmpty()){
			codigos.add(new CodigoTRX(0, "ERROR", "", ""));
			return new ResponseEntity<List<CodigoTRX>>(codigos, HttpStatus.OK);
		}
		return new ResponseEntity<List<CodigoTRX>>(codigos, HttpStatus.OK);			
	}
	
	@GetMapping()
	public RedirectView redireccionar(){
		return new RedirectView("/general/trx/*");
	}
}
