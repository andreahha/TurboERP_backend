package com.turbomaquinas.service.comercial;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.turbomaquinas.POJO.comercial.DocumentoFacturaVarios;
import com.turbomaquinas.POJO.comercial.FacturaVarios;
import com.turbomaquinas.POJO.comercial.FacturaVariosDetalle;

@Service
public class LogicaDocFacturaVarios implements DocFacturaVariosService {
	
	@Autowired
	FacturaVariosService fs;
	@Autowired
	FacturaVariosDetalleService ds;

	@Override
	@Transactional
	public DocumentoFacturaVarios crear(DocumentoFacturaVarios dfv) throws DataAccessException {
		FacturaVarios factura = fs.crear(dfv.getFactura());
		List<FacturaVariosDetalle> detalles = new ArrayList<>();
		for (FacturaVariosDetalle detalle : dfv.getDetalles()){
			detalle.setFactura_varios_id(factura.getId());
			detalles.add(ds.crear(detalle));
		}
		factura = fs.buscar(factura.getId());
		return new DocumentoFacturaVarios(factura, detalles);
	}

	@Override
	public void cancelar(DocumentoFacturaVarios dfv) throws DataAccessException {
		
	}

}
