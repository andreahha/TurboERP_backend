package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.Cliente;
import com.turbomaquinas.POJO.comercial.ClienteVista;

public interface ClienteDAO {

	public int crear(Cliente c);
	public Cliente actualizar(Cliente c);
	public ClienteVista buscar(int id);
	public List<ClienteVista> consultar();
	public ClienteVista buscar(int numero_giro, int numero);
	public ClienteVista buscarClientePorPrecotizacion(int id);
	public ClienteVista buscarClientePorOrden(int id);
}
