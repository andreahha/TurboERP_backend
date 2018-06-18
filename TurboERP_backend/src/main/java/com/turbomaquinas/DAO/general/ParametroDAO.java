package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Parametro;

public interface ParametroDAO {
	
	public List<Parametro> consultar();
	public Parametro buscar(int id);
	public Parametro cierreMes (Parametro parametro);

}
