package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.CodigoTRX;

public interface CodigoTRXService {
	public List<CodigoTRX> consultar(String clave);
	public CodigoTRX buscarClave(String clave);

}
