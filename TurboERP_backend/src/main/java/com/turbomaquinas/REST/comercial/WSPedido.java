package com.turbomaquinas.REST.comercial;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.comercial.Pedido;
import com.turbomaquinas.service.comercial.PedidoService;

@RestController
@RequestMapping("/comercial/pedidos")
public class WSPedido {
	
	private static final Log bitacora = LogFactory.getLog(WSPedido.class);
	
	@Autowired
	PedidoService s;
	
	
	@PostMapping
	public ResponseEntity<Pedido> crear(@RequestBody Pedido p) {
		
		Pedido respuesta = null;
		bitacora.info(p);
		try {
			respuesta = s.crear(p);
			return new ResponseEntity<Pedido> (respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Pedido> (HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody Pedido p){
		bitacora.info(p);
		try {
			s.actualizar(p);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void> (HttpStatus.OK);
	}
	

	@GetMapping("/{id}")
	public ResponseEntity<Pedido> buscar(@PathVariable int id){
		Pedido p = null;
		try {
			p = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Pedido>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Pedido>(p, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Pedido>> consultar(){
		List<Pedido> pl = s.consultar();
		if (pl == null)
			return new ResponseEntity<List<Pedido>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Pedido>>(pl, HttpStatus.OK);
	}
	
	@GetMapping("/cliente/{id}/años")
	public ResponseEntity<List<Integer>> anioPedidos(@PathVariable int id){
		List<Integer> anios = s.anioPedidos(id);
		if (anios.isEmpty())
			return new ResponseEntity<List<Integer>> (HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Integer>>(anios, HttpStatus.OK);
	}
	
	@GetMapping("/cliente/{id}/filtrados/{anio}")
	public ResponseEntity<List<Pedido>> pedidosAnio(@PathVariable int id, @PathVariable int anio){
		List<Pedido> p = s.pedidosAnio(id, anio);
		if (p.isEmpty())
			return new ResponseEntity<List<Pedido>> (HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Pedido>>(p, HttpStatus.OK);
	}
	
	@GetMapping("/orden/{id}")
	public ResponseEntity<List<Pedido>> pedidosAAOrden(@PathVariable int id){
		List<Pedido> pedido = s.pedidosAAPorOrden(id);
		if (pedido.isEmpty())
			return new ResponseEntity<List<Pedido>> (HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Pedido>>(pedido, HttpStatus.OK);
	}
}
