package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Personal;
import com.turbomaquinas.POJO.general.PersonalVista;

public interface PersonalService {
	
	public PersonalVista crear(Personal p);
	public PersonalVista actualizar(Personal p);
	public PersonalVista buscar(int id);
	public List<PersonalVista> consultar();
	public PersonalVista buscarPorNumero(int numero);
	public PersonalVista buscarPersonalAutorizadoRE(int numero);
	public List<PersonalVista> consultarPersonalAutorizadoRE();
	public PersonalVista buscarPersonalCompras(int numero);
	public List<PersonalVista> consultarPersonalCompras();
}
