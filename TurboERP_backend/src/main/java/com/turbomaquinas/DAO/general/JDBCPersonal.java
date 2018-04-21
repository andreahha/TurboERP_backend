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

import com.turbomaquinas.POJO.general.Personal;
import com.turbomaquinas.POJO.general.PersonalVista;

@Repository
public class JDBCPersonal implements PersonalDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int crear(Personal p) throws DataAccessException {

		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("nombre");
		columnas.add("paterno");
		columnas.add("materno");
		columnas.add("keycloak_id");
		columnas.add("creado_por");
		columnas.add("departamentos_id");
		columnas.add("iniciales");
		columnas.add("tipo");
		
		insert.setTableName("PERSONAL");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("nombre", p.getNombre());
		datos.put("paterno", p.getPaterno());
		datos.put("materno", p.getMaterno());
		datos.put("keycloak_id", p.getKeycloak_id());
		datos.put("creado_por", p.getCreado_por());
		datos.put("DEPARTAMENTOS_id", p.getDepartamentos_id());
		datos.put("iniciales", p.getIniciales());
		datos.put("tipo", p.getTipo());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public Personal actualizar(Personal p) throws DataAccessException {
		jdbcTemplate.update("UPDATE PERSONAL SET nombre = ?, paterno = ?, materno = ?, keycloak_id = ?,"
				+ "modificado_por = ?, DEPARTAMENTOS_id = ?, iniciales = ?, numero = ?, activo = ? WHERE id = ?", p.getNombre(), p.getPaterno(),
				p.getMaterno(), p.getKeycloak_id(), p.getModificado_por(), p.getDepartamentos_id(), p.getIniciales(), p.getNumero(), p.getActivo(), p.getId());
		return p;
	}

	@Override
	public PersonalVista buscar(int id) throws DataAccessException {
		PersonalVista pv = jdbcTemplate.queryForObject("SELECT * FROM PERSONAL_V WHERE id = ?", 
				new PersonalVistaRM(), id);
		return pv;
	}

	@Override
	public List<PersonalVista> consultar() throws DataAccessException {
		List<PersonalVista> lpv = jdbcTemplate.query("SELECT * FROM PERSONAL_V", new PersonalVistaRM());
		return lpv;
	}

	@Override
	public PersonalVista buscarPorNumero(int numero) throws DataAccessException{
		PersonalVista pv = jdbcTemplate.queryForObject("SELECT * FROM PERSONAL_V WHERE numero=?", 
				new PersonalVistaRM(), numero);
		return pv;
	}

	@Override
	public PersonalVista buscarPersonalAutorizadoRE(int numero) throws DataAccessException {
		PersonalVista pav = jdbcTemplate.queryForObject("SELECT * FROM PERSONAL_V WHERE numero=? "
				+ "AND clave_depto='DE'", new PersonalVistaRM(), numero);
		return pav;
	}

	@Override
	public List<PersonalVista> consultarPersonalAutorizadoRE() throws DataAccessException {
		List<PersonalVista> lpav = jdbcTemplate.query("SELECT * FROM PERSONAL_V WHERE clave_depto='DE'",
				new PersonalVistaRM());
		return lpav;
	}

	@Override
	public PersonalVista buscarPersonalCompras(int numero) throws DataAccessException{
		PersonalVista pcv = jdbcTemplate.queryForObject("SELECT * FROM PERSONAL_V WHERE numero=? "
				+ "AND clave_depto='CA'", new PersonalVistaRM(), numero);
		return pcv;
	}

	@Override
	public List<PersonalVista> consultarPersonalCompras() throws DataAccessException{
		List<PersonalVista> lpcv = jdbcTemplate.query("SELECT * FROM PERSONAL_V WHERE clave_depto='CA'",
				new PersonalVistaRM());
		return lpcv;
	}

}
