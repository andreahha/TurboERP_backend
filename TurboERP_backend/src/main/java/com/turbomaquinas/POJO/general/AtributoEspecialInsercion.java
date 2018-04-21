package com.turbomaquinas.POJO.general;

import com.fasterxml.jackson.annotation.JsonView;

public class AtributoEspecialInsercion {
	
	//PROPIEDADES DE INSERCION
	
	@JsonView(AtributoEspecialInsercionVistaJSON.AtributoEspecial.class)
    public String atributo;
 
    @JsonView(AtributoEspecialInsercionVistaJSON.AtributoEspecial.class)
    public String valor;
 
    @JsonView(AtributoEspecialInsercionVistaJSON.AtributoEspecial.class)
    public int creado_por;
    
    @JsonView(AtributoEspecialInsercionVistaJSON.AtributoMoneda.class)
    public float tipo_cambio;
    
    @JsonView(AtributoEspecialInsercionVistaJSON.AtributoMoneda.class)
    public float tipo_cambio_calculado;

}
