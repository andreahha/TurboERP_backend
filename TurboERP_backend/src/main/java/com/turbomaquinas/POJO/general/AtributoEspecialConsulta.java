package com.turbomaquinas.POJO.general;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonView;

public class AtributoEspecialConsulta {
	
	//PROPIEDADES DE CONSULTA
	
		@JsonView(AtributoEspecialConsultaVistaJSON.AtributoVistaEspecial.class)
	    public String atributo;
	 
	    @JsonView(AtributoEspecialConsultaVistaJSON.AtributoVistaEspecial.class)
	    public String valor;
	 
	    @JsonView(AtributoEspecialConsultaVistaJSON.AtributoVistaEspecial.class)
	    public int creado_por;
	    
	    @JsonView(AtributoEspecialConsultaVistaJSON.AtributoVistaEspecial.class)
	    public Date fecha;
	    
	    @JsonView(AtributoEspecialConsultaVistaJSON.AtributoVistaMoneda.class)
	    public float tipo_cambio;
	    
	    @JsonView(AtributoEspecialConsultaVistaJSON.AtributoVistaMoneda.class)
	    public float tipo_cambio_calculado;
	    
}
