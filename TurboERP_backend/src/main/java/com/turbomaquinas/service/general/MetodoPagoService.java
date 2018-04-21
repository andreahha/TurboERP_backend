package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.MetodoPago;

public interface MetodoPagoService {
	public MetodoPago buscar(int id);
	public List<MetodoPago> consultar();
	public MetodoPago buscarPorClave(String clave);
	
}
