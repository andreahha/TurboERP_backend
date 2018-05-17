package com.turbomaquinas.REST.timbrado;

import java.io.IOException;
import java.util.Base64;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.turbomaquinas.service.timbrado.TimbradoService;

import twitter4j.JSONObject;


@RestController
@RequestMapping("/timbrado")
public class WSTimbrado {

	private static final Log bitacora = LogFactory.getLog(WSTimbrado.class);
	
	@Autowired
	TimbradoService ts;
	
	private String user="AAA010101AAA";
	private String pass="7aa16d2e055554fcf3d182758db23c91";
	private String urlGenerarCfdi = "https://api.enlacefiscal.com/v6/generarCfdi";	
	private String userpass = user+":"+pass;
	private String headerValue = "Basic " + new String(Base64.getEncoder().encode(userpass.getBytes()));	
	
	
	
	
	@PostMapping("/facturafinal/{id}")
	public ResponseEntity<String> crear(@PathVariable int id) throws JsonParseException, JsonMappingException, IOException{
		//Encabezados 
		HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", headerValue);
        headers.add("x-api-key", "7aa16d2e055554fcf3d182758db23c91"); 
        
        //Recuperar JSON PA		
		String json=null;
		try{
			 json=ts.timbrarFactura(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<String>(HttpStatus.CONFLICT);
		}
		
        HttpEntity<?> httpEntity = new HttpEntity<Object>(json, headers);
        RestTemplate restTemplate = new RestTemplate();
        
        try{
	        ResponseEntity<String> response = restTemplate.exchange(urlGenerarCfdi, HttpMethod.POST, httpEntity, String.class);
	        JSONObject jsonRespuesta = new JSONObject(response.getBody());
	        String AckEnlaceFiscal=(String) jsonRespuesta.getString("AckEnlaceFiscal");
		    JSONObject json_AckEnlaceFiscal = new JSONObject(AckEnlaceFiscal);
		    String estatusDocumento=(String) json_AckEnlaceFiscal.getString("estatusDocumento");
		    if(estatusDocumento.equalsIgnoreCase("aceptado")){
		    	return new ResponseEntity<String>(response.getBody(),HttpStatus.OK);
		    }else if(estatusDocumento.equalsIgnoreCase("rechazado")){
		    	return new ResponseEntity<String>(response.getBody(),HttpStatus.NOT_ACCEPTABLE);
		    }else{
		    	return null;
		    }
		
        }catch(Exception e){return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);}
        
	}
	
	
}
