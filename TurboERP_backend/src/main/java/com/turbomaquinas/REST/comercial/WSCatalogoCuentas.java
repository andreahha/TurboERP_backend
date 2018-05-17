package com.turbomaquinas.REST.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.comercial.CatalogoCuentas;
import com.turbomaquinas.service.comercial.CatalogoCuentasService;


@RestController
@RequestMapping("comercial/catalogocuentas")
public class WSCatalogoCuentas {
	
	@Autowired
	CatalogoCuentasService ccs;
	
	@GetMapping()
	public ResponseEntity<List<CatalogoCuentas>> consultar(){
	List<CatalogoCuentas> cc = ccs.consultar();
			if( cc == null)
				return new ResponseEntity<List<CatalogoCuentas>>(HttpStatus.NO_CONTENT);
			return new ResponseEntity<List<CatalogoCuentas>>(cc, HttpStatus.OK);
			
		}
	

}
