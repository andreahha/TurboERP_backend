package com.turbomaquinas.DAO.comercial;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.Pagos;
import com.turbomaquinas.POJO.comercial.PagosVista;

@Repository
public class JDBCPagos implements PagosDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;


	@Override
	public Pagos actualizar(Pagos p) throws DataAccessException {
		jdbcTemplate.update("UPDATE PAGOS SET fecha_baja = ?, mes_baja = ?, anio_baja = ?, activo = ?,"
				+ "modificado_por = ?, depositos_recibidos_id = ? WHERE id = ? ", p.getFecha_baja(), p.getMes_baja(),
				p.getAnio_baja(), p.getActivo(), p.getModificado_por(), p.getDepositos_recibidos_id(), p.getId());
		return p;
	}

	@Override
	public PagosVista buscar(int id) throws DataAccessException {
		PagosVista pvb = jdbcTemplate.queryForObject("SELECT * FROM PAGOS_V WHERE id = ?", new PagosVistaRM(), id);
		return pvb;
	}

	@Override
	public List<PagosVista> consultar() throws DataAccessException {
		List<PagosVista> pvl = jdbcTemplate.query("SELECT * FROM PAGOS_V ", new PagosVistaRM());
		return pvl;
	}

	@Override
	public void AplicarPagos(String doc) throws DataAccessException{
		
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("APLICAR_PAGO");
		
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		
		inParamMap.put("doc", doc);
		SqlParameterSource in = new MapSqlParameterSource(inParamMap);
		simpleJdbcCall.execute(in);
		
	}

	@Override
	public List<Pagos> pagoRangoFecha(String fecha_pagoInicio, String fecha_pagoFin) throws DataAccessException{
			
		String sql = "select *"
				+ " from PAGOS p"
				+ " where fecha_pago between ? and ? and activo=1 ";
		
		List<Pagos> dv = jdbcTemplate.query(sql, new PagosRM(),fecha_pagoInicio,fecha_pagoFin);			
		
		return dv;
	}

}
