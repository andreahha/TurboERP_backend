package com.turbomaquinas.REST.comercial;

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
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.comercial.PrePedido;
import com.turbomaquinas.service.comercial.PrePedidoService;
@RestController
@RequestMapping("/comercial/prepedido")
public class WSPrePedido {

	private static final Log bitacora = LogFactory.getLog(WSPrecotizacion.class);
	
		@Autowired
		PrePedidoService s;
	
		@PostMapping
		public ResponseEntity<PrePedido> crear(@RequestBody PrePedido prePedido){
			PrePedido respuesta = null;
			bitacora.info(prePedido);
			try {
				respuesta = s.crear(prePedido);
				return new ResponseEntity<PrePedido>(respuesta, HttpStatus.CREATED);
			} catch (Exception e) {
				bitacora.error(e.getMessage());
				return new ResponseEntity<PrePedido> (HttpStatus.CONFLICT);
			}
		}
	
		@PutMapping
		public ResponseEntity<Void> actualizar(@RequestBody PrePedido prePedido){
			bitacora.info(prePedido);
			try {
				s.actualizar(prePedido);
			} catch (Exception e) {
				bitacora.error(e.getMessage());
				return new ResponseEntity<Void> (HttpStatus.CONFLICT);
			}
			return new ResponseEntity<Void> (HttpStatus.OK);
		
		}

		@GetMapping("/{id}")
		public ResponseEntity<PrePedido> buscar(@PathVariable int id){
			PrePedido p = null;
			try {
				p = s.buscar(id);
			} catch (Exception e) {
				bitacora.error(e.getMessage());
				return new ResponseEntity<PrePedido> (HttpStatus.CONFLICT);
			}
			return new ResponseEntity<PrePedido> (p, HttpStatus.OK);
		}
	
		@GetMapping
		public ResponseEntity<List<PrePedido>> consultar(){
			List<PrePedido> p = s.consultar();
			if (p == null)
				return new ResponseEntity<List<PrePedido>> (HttpStatus.CONFLICT);
			return new ResponseEntity<List<PrePedido>>(p, HttpStatus.OK);
	}
		
		@GetMapping("/cliente/{id}/anios")
		public ResponseEntity<List<Integer>> añosPorCliente(@PathVariable int id) {
			List<Integer> i = null;
			try{
				i = s.aniosPrepedido(id);
			}catch(DataAccessException e){
				bitacora.error(e.getMessage());
				return new ResponseEntity<List<Integer>>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<List<Integer>>(i, HttpStatus.OK);
		}
		
		@GetMapping("/cliente/{id}/filtrados/{anio}")
		public ResponseEntity<List<PrePedido>> filtradosAñoCliente(@PathVariable String anio, @PathVariable int id) {
			List<PrePedido> p = null;
			try{
				p = s.filtrarAnioCliente(anio, id);
			}catch(DataAccessException e){
				bitacora.error(e.getMessage());
				return new ResponseEntity<List<PrePedido>>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<List<PrePedido>>(p, HttpStatus.OK);
		}
		
		@GetMapping("/actividadaut/orden/{id}/")
		public ResponseEntity<List<PrePedido>> prePedidosAAOrden(@PathVariable int id){
			List<PrePedido> prePedido = s.prePedidosAAPorOrden(id);
			if (prePedido.isEmpty())
				return new ResponseEntity<List<PrePedido>> (HttpStatus.NOT_FOUND);
			return new ResponseEntity<List<PrePedido>>(prePedido, HttpStatus.OK);
		}
	}
