package com.turbomaquinas.DAO.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.EquipoPorRecibir;
import com.turbomaquinas.POJO.comercial.EquipoPorRecibirVista;

@Repository
public class JDBCEquipoPorRecibir implements EquipoPorRecibirDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void crear(EquipoPorRecibir epr) throws DataAccessException{
		jdbcTemplate.update("INSERT INTO EQUIPO_POR_RECIBIR(descripcion, fecha_estimada_llegada, transporte, comentarios, "
				+ "soportes, soporte_turbomaquinas, peso, flete, creado_por, ORDENES_id, CLIENTES_id, SOLICITUD_FLETES_id, "
				+ "MEDIDAS_EQUIPOS_id) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
				epr.getDescripcion(), epr.getFecha_estimada_llegada(), epr.getTransporte(), epr.getComentarios(), 
				epr.getSoportes(), epr.getSoporte_turbomaquinas(), epr.getPeso(), epr.getFlete(), epr.getCreado_por(), 
				epr.getOrdenes_id(), epr.getClientes_id(), epr.getSolicitud_fletes_id(), epr.getMedidas_equipos_id());
	}

	@Override
	public void actualizar(EquipoPorRecibir epr) throws DataAccessException{
		jdbcTemplate.update("UPDATE EQUIPO_POR_RECIBIR SET descripcion=?, fecha_estimada_llegada=?, transporte=?, "
				+ "comentarios=?, soportes=?, soporte_turbomaquinas=?, peso=?, flete=?, activo=?, modificado_por=?, "
				+ "ORDENES_id=?, CLIENTES_id=?, SOLICITUD_FLETES_id=?, MEDIDAS_EQUIPOS_id=? WHERE id=?",
				epr.getDescripcion(), epr.getFecha_estimada_llegada(), epr.getTransporte(), epr.getComentarios(), epr.getSoportes(), 
				epr.getSoporte_turbomaquinas(), epr.getPeso(), epr.getFlete(), epr.getActivo(), epr.getModificado_por(), 
				epr.getOrdenes_id(), epr.getClientes_id(), epr.getSolicitud_fletes_id(), epr.getMedidas_equipos_id(), epr.getId());
	}
	
	@Override
	public EquipoPorRecibirVista buscar(int id) throws DataAccessException{
		EquipoPorRecibirVista erv = jdbcTemplate.queryForObject("SELECT * FROM EQUIPO_POR_RECIBIR_V WHERE id=?", 
				new EquipoPorRecibirVistaRM(), id);
		return erv;
	}

	@Override
	public List<EquipoPorRecibirVista> consultar() throws DataAccessException{
		List<EquipoPorRecibirVista> erv = jdbcTemplate.query("SELECT * FROM EQUIPO_POR_RECIBIR_V",
				new EquipoPorRecibirVistaRM());
		return erv;
	}

	@Override
	public List<EquipoPorRecibirVista> ConsultarPorCliente(int id) throws DataAccessException{
		List<EquipoPorRecibirVista> erc = jdbcTemplate.query("SELECT * FROM EQUIPO_POR_RECIBIR_V "
				+ "LEFT JOIN ES_RECIBIR_EQUIPO ON EQUIPO_POR_RECIBIR_V.id=ES_RECIBIR_EQUIPO.EQUIPO_POR_RECIBIR_id "
				+ "WHERE ES_RECIBIR_EQUIPO.EQUIPO_POR_RECIBIR_id IS NULL AND EQUIPO_POR_RECIBIR_V.clientes_id=?", 
				new EquipoPorRecibirVistaRM(), id);
		return erc;
	}


}
