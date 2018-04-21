package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DTPrecotizacion;

public interface DTPrecotizacionService {
	
	public DTPrecotizacion crear(DTPrecotizacion dtp);
	public DTPrecotizacion actualizar(DTPrecotizacion dtp);
	public DTPrecotizacion buscar(int id);
	public List<DTPrecotizacion> consultar();}
