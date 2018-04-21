package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.TipoCambio;

public interface TipoCambioService {
	public void crear(TipoCambio t);
	public void actualizar(TipoCambio t);
	public TipoCambio buscar(int id);
	public List<TipoCambio> consultar();
	public TipoCambio aldia();
	public TipoCambio buscarPorFecha(String fecha);
}
