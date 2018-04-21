package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Autorizacion;

public interface AutorizacionService {
	public Autorizacion buscar(int id);
	public List<Autorizacion> consultarPorOrdenid (int id);
}
