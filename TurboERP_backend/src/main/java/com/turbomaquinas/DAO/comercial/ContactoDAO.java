package com.turbomaquinas.DAO.comercial;


import java.util.List;

import com.turbomaquinas.POJO.comercial.Contacto;
import com.turbomaquinas.POJO.comercial.ContactoVista;

public interface ContactoDAO {
	public void crear(Contacto c);
	public void actualizar(Contacto c);
	public ContactoVista buscar(int id);
	public List<ContactoVista> consultar();
	public List<ContactoVista> consultarContactos(int clienteID);
	public ContactoVista buscarPorPrecotizacion(int id);
}
