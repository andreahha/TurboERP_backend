package com.turbomaquinas.POJO.timbrado;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DocumentoCFDi {
	private CFDi CFDi;

	public DocumentoCFDi(com.turbomaquinas.POJO.timbrado.CFDi cFDi) {
		super();
		CFDi = cFDi;
	}

	public DocumentoCFDi() {
		super();
	}

	@JsonProperty("CFDi")
	public CFDi getCFDi() {
		return CFDi;
	}

	public void setCFDi(CFDi cFDi) {
		CFDi = cFDi;
	}
	
	@Override
	public String toString() {
		try {
	        return new com.fasterxml.jackson.databind.ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(this);
	    } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
	
}
