package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Estado;

public interface EstadoDAO {
	public Estado buscar (String clave);
	public List<Estado> consultar();
	public List<Estado> consultarPorPais(int id);
}
