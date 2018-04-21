package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Bancos;

public interface BancosDAO {
	
	public Bancos buscar (String clave);
	public List<Bancos> consultar();
}
