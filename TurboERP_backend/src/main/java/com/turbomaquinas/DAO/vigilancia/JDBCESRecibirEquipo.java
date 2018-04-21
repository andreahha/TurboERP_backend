package com.turbomaquinas.DAO.vigilancia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.vigilancia.ESRecibirEquipo;
import com.turbomaquinas.POJO.vigilancia.ESRecibirEquipoVista;

@Repository
public class JDBCESRecibirEquipo implements ESRecibirEquipoDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int crear(ESRecibirEquipo esr) throws DataAccessException {

		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("vehiculo");
		columnas.add("placas");
		columnas.add("tcir_alfresco_id");
		columnas.add("totalmente_recibido");
		columnas.add("creado_por");
		columnas.add("EQUIPO_POR_RECIBIR_id");
		columnas.add("CLIENTES_id");
		columnas.add("ENTRADAS_SALIDAS_EXTERNOS_id");
		
		insert.setTableName("ES_RECIBIR_EQUIPO");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("vehiculo", esr.getVehiculo());
		datos.put("placas", esr.getPlacas());
		datos.put("tcir_alfresco_id", esr.getTcir_alfresco_id());
		datos.put("totalmente_recibido", esr.getTotalmente_recibido());
		datos.put("creado_por", esr.getCreado_por());
		datos.put("equipo_por_recibir_id", esr.getEquipo_por_recibir_id());
		datos.put("clientes_id", esr.getClientes_id());
		datos.put("entradas_salidas_externos_id", esr.getEntradas_salidas_externos_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public ESRecibirEquipo actualizar(ESRecibirEquipo esr) throws DataAccessException {

		jdbcTemplate.update("UPDATE ES_RECIBIR_EQUIPO SET vehiculo=?, placas=?, tcir_alfresco_id=?, totalmente_recibido=?, modificado_por=?, "
				+ "EQUIPO_POR_RECIBIR_id=?, CLIENTES_id=? WHERE id = ?", 
				esr.getVehiculo(), esr.getPlacas(), esr.getTcir_alfresco_id(), esr.getTotalmente_recibido(), esr.getModificado_por(),
				esr.getEquipo_por_recibir_id(), esr.getClientes_id(), esr.getId());
		return esr;
	}
	
	@Override
	public ESRecibirEquipoVista buscar(int id) throws DataAccessException {
		ESRecibirEquipoVista esrb = jdbcTemplate.queryForObject("SELECT * FROM ES_RECIBIR_EQUIPO_V "
				+ "WHERE id = ?", new ESRecibirEquipoVistaRM(), id);
		return esrb;
	}

	@Override
	public List<ESRecibirEquipoVista> consultar() throws DataAccessException {
		List<ESRecibirEquipoVista> esrv = jdbcTemplate.query("SELECT *  FROM ES_RECIBIR_EQUIPO_V ",
				new ESRecibirEquipoVistaRM());
		return esrv;
	}

	@Override
	public List<ESRecibirEquipoVista> PendientePorRecibir(int id) throws DataAccessException{
		List<ESRecibirEquipoVista> v = jdbcTemplate.query("SELECT * FROM ES_RECIBIR_EQUIPO_V WHERE clientes_id = ? AND totalmente_recibido=0",
				new ESRecibirEquipoVistaRM(), id);
		return v;
	}

	@Override
	public List<ESRecibirEquipoVista> recibidosPorOrden(int id) throws DataAccessException{
		List<ESRecibirEquipoVista> v = jdbcTemplate.query("SELECT * FROM ES_RECIBIR_EQUIPO_V ESREV WHERE EXISTS"
				+ "(SELECT * FROM EQUIPO_RECIBIDO ER WHERE ER.ES_RECIBIR_EQUIPO = ESREV.id "
				+ "AND ER.ORDENES_id=? AND activo=1) ",
				new ESRecibirEquipoVistaRM(), id);
		return v;
	}

	@Override
	public List<ESRecibirEquipoVista> noRecibidosPorCliente(int id) throws DataAccessException{
		List<ESRecibirEquipoVista> v = jdbcTemplate.query("SELECT * FROM ES_RECIBIR_EQUIPO_V ESREV WHERE NOT EXISTS"
				+ "(SELECT * FROM EQUIPO_RECIBIDO ER WHERE ER.ES_RECIBIR_EQUIPO = ESREV.id "
				+ "AND activo=1) AND clientes_id=? and totalmente_recibido=0",
				new ESRecibirEquipoVistaRM(), id);
		return v;
	}

	@Override
	public List<ESRecibirEquipoVista> PendienteRegularizar() throws DataAccessException{
		List<ESRecibirEquipoVista> v = jdbcTemplate.query("SELECT * FROM ES_RECIBIR_EQUIPO_V WHERE equipo_por_recibir_id IS NULL",
				new ESRecibirEquipoVistaRM());
		return v;
	}
}
