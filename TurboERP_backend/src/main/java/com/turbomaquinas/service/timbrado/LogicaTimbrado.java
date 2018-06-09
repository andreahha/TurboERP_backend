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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.turbomaquinas.DAO.comercial.DatosTimbradosDAO;
import com.turbomaquinas.DAO.comercial.FacturaFinalDAO;
import com.turbomaquinas.DAO.timbrado.TimbradoDAO;
import com.turbomaquinas.POJO.comercial.DatosTimbrados;

import twitter4j.JSONObject;


@Service
public class LogicaTimbrado implements TimbradoService{
	
	@Autowired
	TimbradoDAO repositorio;
	
	@Autowired
	FacturaFinalDAO repoFF;
	
	@Autowired
	DatosTimbradosDAO repoDT;
	
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
	public String obtenerJSONFacturaFinal(int idFactura,String modo) throws DataAccessException {
		return repositorio.obtenerJSONFacturaFinal(idFactura,modo);
	}

	@Override
	@Transactional
	public ResponseEntity<String> timbrarFactura(String cfdi,int id,int numEmpleado,String modo) {
		ResponseEntity<String> response= timbrar(cfdi);
		if(modo.equals("produccion")){
			try{
				JSONObject jsonRespuesta = new JSONObject(response.getBody());
		        String AckEnlaceFiscal=(String) jsonRespuesta.getString("AckEnlaceFiscal");
			    JSONObject json_AckEnlaceFiscal = new JSONObject(AckEnlaceFiscal);
			    String estatusDocumento=(String) json_AckEnlaceFiscal.getString("estatusDocumento");
			    if(estatusDocumento.equalsIgnoreCase("aceptado")){
			    	//Actualizar estado de la factura a Timbrado
			    	repoFF.actualizarEstado(id, "T");
			    	
			    	
			    	//Actualizar el tipo_cambio de la Factura a cambio del dia que se genera en el JSON del PA
			    	float tipoCambio=1;
			    	try{
				    	JSONObject json = new JSONObject(cfdi);
				        String cfdi_json=(String) json.getString("CFDi");
					    JSONObject cfdiObj = new JSONObject(cfdi_json);
					    tipoCambio=Float.parseFloat(cfdiObj.getString("tipoCambio"));				    
			    	}catch(Exception e){tipoCambio=1;}
			    	float tipo_cambio=Float.parseFloat(""+tipoCambio);		    	
			    	repoFF.actualizarTipoCambio(id,tipo_cambio);
			    	
			    	
			    	//Insertar registro en Datos Timbrados
			    	DatosTimbrados dt=new DatosTimbrados();
			    	dt.setFolio_fiscal((String) json_AckEnlaceFiscal.getString("folioFiscalUUID"));
			    	dt.setFecha((String) json_AckEnlaceFiscal.getString("fechaTFD"));
			    	dt.setSello_emisor((String) json_AckEnlaceFiscal.getString("selloCFDi"));
			    	dt.setCadena_original((String) json_AckEnlaceFiscal.getString("cadenaTFD"));
			    	dt.setSello_sat((String) json_AckEnlaceFiscal.getString("selloSAT"));
			    	dt.setLeyenda("leyenda");
			    	dt.setActivo(1);
			    	dt.setCreado_por(numEmpleado);
			    	int idDatosTimbrados=repoDT.crear(dt);
			    	
			    	//Actualizar DATOS_TIMBRADO_id
			    	repoFF.actualizarIdDatosTimbrados(id, idDatosTimbrados);
			    }
			}catch(Exception e){}
		}
	    return response;
	}
	
	
}
