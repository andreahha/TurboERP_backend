package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Personal;
import com.turbomaquinas.POJO.general.PersonalVista;

public interface PersonalDAO {
	public int crear(Personal p);
	public Personal actualizar(Personal p);
	public PersonalVista buscar(int id);
	public List<PersonalVista> consultar();
	public PersonalVista buscarPorNumero(int numero);
	public PersonalVista buscarPersonalAutorizadoRE(int numero);
	public List<PersonalVista> consultarPersonalAutorizadoRE();
	public PersonalVista buscarPersonalCompras(int numero);
	public List<PersonalVista> consultarPersonalCompras();
	
}
