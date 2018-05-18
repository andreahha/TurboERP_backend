package com.turbomaquinas.DAO.comercial;


import java.util.List;

import com.turbomaquinas.POJO.comercial.Giro;

public interface GiroDAO {
	public void Crear(Giro giro);
	public Giro Buscar(int id);
	public List<Giro> Consultar();
	public void actualizar(Giro giro);
}
