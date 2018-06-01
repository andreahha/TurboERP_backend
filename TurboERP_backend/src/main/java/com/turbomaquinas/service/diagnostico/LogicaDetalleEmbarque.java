package com.turbomaquinas.service.diagnostico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.diagnostico.DetalleEmbarqueDAO;
import com.turbomaquinas.POJO.diagnostico.DetalleRemisionEmbarqueVista;

@Service
public class LogicaDetalleEmbarque implements DetalleEmbarqueService{
	
	@Autowired
	DetalleEmbarqueDAO resDetalle;

	@Override
	public List<DetalleRemisionEmbarqueVista> consultarDetallesPorRemision(int id) {
		
		return resDetalle.detallesPorRemision(id);
	}
	
	

}
