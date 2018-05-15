package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.Cliente;
import com.turbomaquinas.POJO.comercial.ClienteVista;

public interface ClienteService {
	
	public ClienteVista buscar(int id);
	public List<ClienteVista> consultar();
	public ClienteVista crear(Cliente c);
	public Cliente actualizar(Cliente c);
	public ClienteVista buscar(int numero_giro, int numero);
	public ClienteVista buscarClientePorPrecotizacion(int id);
	public ClienteVista buscarClientePorOrden(int id);
	public String buscarTipoCliente(int id);
}
