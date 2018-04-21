package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Ctasban;
import com.turbomaquinas.POJO.general.CtasbanVista;

public interface CtasbanDAO {
	
	public int crear(Ctasban cb);
	public void actualizar(Ctasban cb);
	public CtasbanVista buscar(int id);
	public List<CtasbanVista> consultar();
	
	public CtasbanVista buscarporNumero(String numero);

}
