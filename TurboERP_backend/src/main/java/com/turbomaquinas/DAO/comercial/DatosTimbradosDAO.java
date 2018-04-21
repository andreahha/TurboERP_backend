package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DatosTimbrados;

public interface DatosTimbradosDAO {
	
	public int crear(DatosTimbrados dt);
	public DatosTimbrados actualizar(DatosTimbrados dt);
	public DatosTimbrados buscar(int id);
	public List<DatosTimbrados> consultar();
}
