package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.CodigoTRX;

public interface CodigoTRXDAO {
	public List<CodigoTRX> consultar(String clave);
	public CodigoTRX buscarClave(String clave);
	public List<CodigoTRX> consultar();
}
