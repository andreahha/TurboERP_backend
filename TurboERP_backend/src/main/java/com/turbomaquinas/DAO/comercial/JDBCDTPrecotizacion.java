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

import com.turbomaquinas.POJO.comercial.DTPrecotizacion;

@Repository
public class JDBCDTPrecotizacion implements DTPrecotizacionDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(DTPrecotizacion dtp) throws DataAccessException  {
		
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
		columnas.add("PRECOTIZACIONES_id");
		
		insert.setTableName("DATOS_TECNICOS_PRECOTIZACIONES");
		insert.setColumnNames(columnas);
		Map<String, Object> datos = new HashMap<>();
		datos.put("presion_de_entrada", dtp.getPresion_de_entrada());
		datos.put("presion_de_salida", dtp.getPresion_de_salida());
		datos.put("creado_por", dtp.getCreado_por());
		datos.put("temperatura_salida", dtp.getTemperatura_salida());
		datos.put("temperatura_entrada", dtp.getTemperatura_entrada());
		datos.put("capacidad_hp", dtp.getCapacidad_hp());
		datos.put("capacida_mw", dtp.getCapacida_mw());
		datos.put("velocidad_critica", dtp.getVelocidad_critica());
		datos.put("velocidad_operacion", dtp.getVelocidad_operacion());
		datos.put("velocidad_disparo", dtp.getVelocidad_disparo());
		datos.put("capacidad_flujo", dtp.getCapacidad_flujo());
		datos.put("serie", dtp.getSerie());
		datos.put("peso_rotor", dtp.getPeso_rotor());
		datos.put("fluido", dtp.getFluido());
		datos.put("PRECOTIZACIONES_id", dtp.getPrecotizaciones_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);

		return id.intValue();
	}

	@Override
	public DTPrecotizacion actualizar(DTPrecotizacion dtp) throws DataAccessException  {
		jdbcTemplate.update("UPDATE DATOS_TECNICOS_PRECOTIZACIONES SET presion_de_entrada = ?, presion_de_salida = ?,  "
				+ "modificado_por = ?, temperatura_salida = ?, temperatura_entrada = ?, capacidad_hp = ?, "
				+ "capacida_mw = ?, velocidad_critica = ?, velocidad_operacion = ?, velocidad_disparo = ?, "
				+ "capacidad_flujo = ?, serie = ?, peso_rotor = ?, fluido = ?, PRECOTIZACIONES_id = ? "
				+ "WHERE id = ?", dtp.getPresion_de_entrada(), dtp.getPresion_de_salida(), dtp.getModificado_por(),
				dtp.getTemperatura_salida(), dtp.getTemperatura_entrada(), dtp.getCapacidad_hp(), dtp.getCapacida_mw(),
				dtp.getVelocidad_critica(), dtp.getVelocidad_operacion(), dtp.getVelocidad_disparo(),
				dtp.getCapacidad_flujo(), dtp.getSerie(), dtp.getPeso_rotor(), dtp.getFluido(), 
				dtp.getPrecotizaciones_id(), dtp.getId());
		return dtp;
	}

	@Override
	public DTPrecotizacion buscar(int id) throws DataAccessException  {
		DTPrecotizacion dtpv = jdbcTemplate.queryForObject("SELECT * FROM DATOS_TECNICOS_PRECOTIZACIONES "
				+ "WHERE id = ? ",new DTPrecotizacionRM(), id);
		return dtpv;
	}

	@Override
	public List<DTPrecotizacion> consultar() throws DataAccessException  {
		List<DTPrecotizacion> dtpre = jdbcTemplate.query("SELECT * FROM DATOS_TECNICOS_PRECOTIZACIONES", 
				new DTPrecotizacionRM());
		return dtpre;
	}

	@Override
	public DTPrecotizacion buscarPorPrecotizacion(int id) throws DataAccessException {
		DTPrecotizacion dtpv = jdbcTemplate.queryForObject("SELECT * FROM DATOS_TECNICOS_PRECOTIZACIONES "
				+ "WHERE PRECOTIZACIONES_id = ? ",new DTPrecotizacionRM(), id);
		return dtpv;
	}
	
	

}
