package com.turbomaquinas.DAO.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.FechasEstimadasCobro;

@Repository
public class JDBCFechasEstimadasCobro implements FechasEstimadasCobroDAO{
	

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void crear(FechasEstimadasCobro fec) throws DataAccessException {
		jdbcTemplate.update("INSERT INTO FECHAS_ESTIMADAS_COBRO(fecha_cobro,comentario,indefinida,negociacion,creado_por,FACTURA_FINAL_id) VALUES(?, ?, ?, ?, ?, ?)",
				           fec.getFecha_cobro(), fec.getComentario(), fec.getIndefinida(), fec.getNegociacion(), fec.getCreado_por(), fec.getFactura_final_id());

	}

	@Override
	public List<FechasEstimadasCobro> consultarPorFactura(int id) {
		List<FechasEstimadasCobro> fec= jdbcTemplate.query("SELECT * FROM FECHAS_ESTIMADAS_COBRO fec "
				+ " WHERE FACTURA_FINAL_id = ? ORDER BY fecha_cobro desc", 
				new FechasEstimadasCobroRM(), id);
		return fec;
	}
 
	
}
