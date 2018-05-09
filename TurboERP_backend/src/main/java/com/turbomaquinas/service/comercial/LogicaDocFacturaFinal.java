package com.turbomaquinas.service.comercial;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.turbomaquinas.POJO.comercial.ActividadesFF;
import com.turbomaquinas.POJO.comercial.DocumentoFacturaFinal;
import com.turbomaquinas.POJO.comercial.FacturaFinalVista;

@Service
public class LogicaDocFacturaFinal implements DocFacturaFinalService {
	@Autowired
	FacturaFinalService fs;
	@Autowired
	ActividadesFFService as;

	@Override
	@Transactional
	public FacturaFinalVista crear(DocumentoFacturaFinal dff) throws DataAccessException{
		/*System.out.println("dff");
		
		int creado_por = dff.getCreado_por();
		dff.getFactura().setCreado_por(creado_por);
		FacturaFinalVista factura = fs.crear(dff.getFactura());
		
		List<ActividadesFF> actividades = new ArrayList<>();
		
		for (ActividadesFF actividad : dff.getActividades()) {
			actividad.setFactura_final_id(factura.getId());
			actividad.setCreado_por(creado_por);;
			actividades.add(as.crear(actividad));
		}
		return factura;*/
		return null;
	}

	@Override
	public void cancelar(DocumentoFacturaFinal dff) {
	}

}
