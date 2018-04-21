package com.turbomaquinas.DAO.comercial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.Pagos;
import com.turbomaquinas.POJO.comercial.PagosVista;

@Repository
public class JDBCPagos implements PagosDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int crear(Pagos p) throws DataAccessException {
		
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		
//		columnas.add("folio");
		columnas.add("fecha_pago");
		columnas.add("importe");
		columnas.add("tipo_cambio_cliente");
		columnas.add("observaciones");
		columnas.add("creado_por");
		columnas.add("DEPOSITOS_RECIBIDOS_id");
		
		insert.setTableName("PAGOS");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
//		datos.put("folio", p.getFolio());
		datos.put("fecha_pago", p.getFecha_pago());
		datos.put("importe", p.getImporte());
		datos.put("tipo_cambio_cliente", p.getTipo_cambio_cliente());
		datos.put("observaciones", p.getObservaciones());
		datos.put("creado_por", p.getCreado_por());
		datos.put("DEPOSITOS_RECIBIDOS_id", p.getDepositos_recibidos_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

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

}
