package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.FormaPago;

public interface FormaPagoService {
	public FormaPago buscar(int id);
	public List<FormaPago> consultar();
	public FormaPago buscarPorClave(String clave);
}
