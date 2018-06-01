package com.turbomaquinas.service.diagnostico;

import java.util.List;

import com.turbomaquinas.POJO.diagnostico.DetalleRemisionEmbarqueVista;

public interface DetalleEmbarqueService {

	public List<DetalleRemisionEmbarqueVista> consultarDetallesPorRemision(int id);

}
