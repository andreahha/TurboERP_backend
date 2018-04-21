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

import com.turbomaquinas.POJO.general.ProductosSat;
import com.turbomaquinas.service.general.ProductosSatService;

@RestController
@RequestMapping("/general/productossat")
public class WSProductosSat {
	
	private static final Log bitacora = LogFactory.getLog(WSProductosSat.class);
	
	@Autowired
	ProductosSatService s;
	
	@GetMapping("/{codigo}")
	public ResponseEntity<ProductosSat> buscar(@PathVariable String codigo){
		ProductosSat ps = null;
		try {
			ps = s.buscar(codigo);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<ProductosSat>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<ProductosSat>(ps, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<ProductosSat>> consultar() {
		
		List<ProductosSat> psl = s.consultar();
		if (psl == null)
			return new ResponseEntity<List<ProductosSat>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<ProductosSat>>(psl, HttpStatus.OK);
	}

}
