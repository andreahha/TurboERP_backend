package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Parametro;

public interface ParametroService {

	public List<Parametro> consultar();
	public Parametro cierreMes (Parametro par);
}
