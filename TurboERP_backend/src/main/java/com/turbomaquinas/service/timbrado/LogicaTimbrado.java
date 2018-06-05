package com.turbomaquinas.service.timbrado;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.turbomaquinas.DAO.timbrado.TimbradoDAO;


@Service
public class LogicaTimbrado implements TimbradoService{
	
	@Autowired
	TimbradoDAO repositorio;
	
	private String user="AAA010101AAA";
	private String pass="7aa16d2e055554fcf3d182758db23c91";
	private String urlGenerarCfdi = "https://api.enlacefiscal.com/v6/generarCfdi";	
	private String userpass = user+":"+pass;
	private String headerValue = "Basic " + new String(Base64.getEncoder().encode(userpass.getBytes()));		
	
	public HttpHeaders configurarPeticionAPIEnlaceFiscal(){
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", headerValue);
        headers.add("x-api-key", "7aa16d2e055554fcf3d182758db23c91");
        return headers;
	}
	
	private ResponseEntity<String> timbrar(String json){
		//Configurar petición Headers de las API enlace fiscal
		HttpHeaders headers=configurarPeticionAPIEnlaceFiscal();
		//PETICIÓN A LA API
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<?> httpEntity = new HttpEntity<Object>(json, headers);
		ResponseEntity<String> response = restTemplate.exchange(urlGenerarCfdi, HttpMethod.POST, httpEntity, String.class);
		return response;
	}
	
	
	@Override
	public String obtenerJSONFacturaFinal(int idFactura) throws DataAccessException {
		return repositorio.obtenerJSONFacturaFinal(idFactura);
	}

	@Override
	public ResponseEntity<String> timbrarFactura(String json) {
		return timbrar(json);
	}
	
	
}
