package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Autorizacion;

public interface AutorizacionDAO {
	public Autorizacion buscar(int id);
	public List<Autorizacion> consultarPorOrdenid (int id);
}
