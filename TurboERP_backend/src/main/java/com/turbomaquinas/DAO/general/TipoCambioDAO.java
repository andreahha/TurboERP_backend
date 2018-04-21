package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.TipoCambio;

public interface TipoCambioDAO {
	public void crear(TipoCambio t);
	public void actualizar(TipoCambio t);
	public TipoCambio buscar(int id);
	public List<TipoCambio> consultar();
	public TipoCambio aldia();
	public TipoCambio buscarPorFecha(String fecha);
}
