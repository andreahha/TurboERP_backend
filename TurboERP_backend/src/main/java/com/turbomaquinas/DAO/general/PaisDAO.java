package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Pais;

public interface PaisDAO {
	
	public Pais buscar (String clave);
	public List<Pais> consultar();

}
