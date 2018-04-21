package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Bancos;

public interface BancosService {

	public Bancos buscar (String clave);
	public List<Bancos> consultar();

}
