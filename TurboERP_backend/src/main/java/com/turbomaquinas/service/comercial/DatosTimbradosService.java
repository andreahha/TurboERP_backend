package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DatosTimbrados;

public interface DatosTimbradosService {
	
	public DatosTimbrados crear(DatosTimbrados dt);
	public DatosTimbrados actualizar(DatosTimbrados dt);
	public DatosTimbrados buscar(int id);
	public List<DatosTimbrados> consultar();

}
