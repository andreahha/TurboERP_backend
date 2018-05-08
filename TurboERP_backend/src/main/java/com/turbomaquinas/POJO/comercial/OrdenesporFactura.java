package com.turbomaquinas.POJO.comercial;

import java.math.BigDecimal;

public class OrdenesporFactura {
	
	private int id_orden;
	private BigDecimal importe_pagado;
	
	public int getId_orden() {
		return id_orden;
	}
	public void setId_orden(int id_orden) {
		this.id_orden = id_orden;
	}
	public BigDecimal getImporte_pagado() {
		return importe_pagado;
	}
	public void setImporte_pagado(BigDecimal importe_pagado) {
		this.importe_pagado = importe_pagado;
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
