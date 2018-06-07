package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.NotaCredito;
import com.turbomaquinas.POJO.comercial.NotaCreditoVista;

public interface NotaCreditoDAO {

	public int crearNotasCredito(String doc);
	public void actualizar(NotaCredito nc);
	public NotaCreditoVista buscar(int id);
	public List<NotaCreditoVista> consultar();
	public void desactivar(int id, int modificado_por);
}
