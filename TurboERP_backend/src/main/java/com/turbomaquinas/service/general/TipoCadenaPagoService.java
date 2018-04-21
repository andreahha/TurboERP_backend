package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.TipoCadenaPago;

public interface TipoCadenaPagoService {
	
	public void crear(TipoCadenaPago tcp);
	public void actualizar(TipoCadenaPago tcp);
	public TipoCadenaPago buscar(int id);
	public List<TipoCadenaPago> consultar();
	
	public TipoCadenaPago buscarClave(String clave);

}
