package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Cubre;

public interface CubreService {
	public Cubre crear (Cubre cubre);
	public Cubre actualizar (Cubre cubre);
	public Cubre buscar (int id);
	public List<Cubre> consultar();
	public Cubre buscarporPersonal(int id);
}
