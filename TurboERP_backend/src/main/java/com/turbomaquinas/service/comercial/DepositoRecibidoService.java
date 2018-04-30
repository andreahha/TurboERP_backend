package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DepositoRecibido;
import com.turbomaquinas.POJO.comercial.DepositoRecibidoVista;

public interface DepositoRecibidoService {
	public DepositoRecibidoVista crear(DepositoRecibido deposito);
	public void actualizar(DepositoRecibido deposito);
	public DepositoRecibidoVista buscar(int id);
	public List<DepositoRecibidoVista> consultar();
	
	public List<DepositoRecibidoVista> depositosRecibidosFecha(String fechainicio,String fechafin,String estado);
	public void borrarDR(int id,int modificado_por);
	public boolean consultarMonedaDepositoRecibido(int id);
}
