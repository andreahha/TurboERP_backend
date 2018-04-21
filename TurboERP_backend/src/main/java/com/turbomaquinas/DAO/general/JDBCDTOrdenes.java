package com.turbomaquinas.DAO.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.DTOrdenes;

@Repository
public class JDBCDTOrdenes implements DTOrdenesDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(DTOrdenes dto) throws DataAccessException {
		
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("presion_de_entrada");
		columnas.add("presion_de_salida");
		columnas.add("creado_por");
		columnas.add("temperatura_salida");
		columnas.add("temperatura_entrada");
		columnas.add("capacidad_hp");
		columnas.add("capacida_mw");
		columnas.add("velocidad_critica");
		columnas.add("velocidad_operacion");
		columnas.add("velocidad_disparo");
		columnas.add("capacidad_flujo");
		columnas.add("serie");
		columnas.add("peso_rotor");
		columnas.add("fluido");
		columnas.add("ORDENES_id");

		insert.setTableName("DATOS_TECNICOS_ORDENES");
		insert.setColumnNames(columnas);
		Map<String, Object> datos = new HashMap<>();
		
		datos.put("presion_de_entrada", dto.getPresion_de_entrada());
		datos.put("presion_de_salida", dto.getPresion_de_salida());
		datos.put("creado_por", dto.getCreado_por());
		datos.put("temperatura_salida", dto.getTemperatura_salida());
		datos.put("temperatura_entrada", dto.getTemperatura_entrada());
		datos.put("capacidad_hp", dto.getCapacidad_hp());
		datos.put("capacida_mw", dto.getCapacida_mw());
		datos.put("velocidad_critica", dto.getVelocidad_critica());
		datos.put("velocidad_operacion", dto.getVelocidad_operacion());
		datos.put("velocidad_disparo", dto.getVelocidad_disparo());
		datos.put("capacidad_flujo", dto.getCapacidad_flujo());
		datos.put("serie", dto.getSerie());
		datos.put("peso_rotor", dto.getPeso_rotor());
		datos.put("fluido", dto.getFluido());
		datos.put("ORDENES_id", dto.getOrdenes_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);

		return id.intValue();
	}

	@Override
	public DTOrdenes actualizar(DTOrdenes dto) throws DataAccessException {
		jdbcTemplate.update("UPDATE DATOS_TECNICOS_ORDENES SET presion_de_entrada = ?, presion_de_salida = ?,  "
				+ "modificado_por = ?, temperatura_salida = ?, temperatura_entrada = ?, capacidad_hp = ?, "
				+ "capacida_mw = ?, velocidad_critica = ?, velocidad_operacion = ?, velocidad_disparo = ?, "
				+ "capacidad_flujo = ?, serie = ?, peso_rotor = ?, fluido = ?, ORDENES_id = ? "
				+ "WHERE id = ?", dto.getPresion_de_entrada(), dto.getPresion_de_salida(), dto.getModificado_por(),
				dto.getTemperatura_salida(), dto.getTemperatura_entrada(), dto.getCapacidad_hp(), dto.getCapacida_mw(),
				dto.getVelocidad_critica(), dto.getVelocidad_operacion(), dto.getVelocidad_disparo(),
				dto.getCapacidad_flujo(), dto.getSerie(), dto.getPeso_rotor(), dto.getFluido(), 
				dto.getOrdenes_id(), dto.getId());
		return dto;
	}

	@Override
	public DTOrdenes buscar(int id) throws DataAccessException {
		DTOrdenes dtov = jdbcTemplate.queryForObject("SELECT * FROM DATOS_TECNICOS_ORDENES "
				+ "WHERE id = ? ", new DTOrdenesRM(), id);
		return dtov;
	}

	@Override
	public List<DTOrdenes> consultar() throws DataAccessException {
			List<DTOrdenes> dtord = jdbcTemplate.query("SELECT * FROM DATOS_TECNICOS_ORDENES", 
					new DTOrdenesRM());
			return dtord;
	}

	@Override
	public DTOrdenes buscarPorOrden(int id) {
		DTOrdenes dtpo = jdbcTemplate.queryForObject("SELECT * FROM DATOS_TECNICOS_ORDENES "
				+ "WHERE ORDENES_id = ? ",new DTOrdenesRM(), id);
		return dtpo;
	}

}
