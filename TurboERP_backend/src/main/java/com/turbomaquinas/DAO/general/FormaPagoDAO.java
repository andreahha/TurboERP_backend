package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.FormaPago;

public interface FormaPagoDAO {
	public FormaPago buscar(int id);
	public List<FormaPago> consultar();
	public FormaPago buscarPorClave(String clave);
}
