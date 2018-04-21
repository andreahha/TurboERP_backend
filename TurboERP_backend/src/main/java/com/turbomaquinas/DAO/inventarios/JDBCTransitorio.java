package com.turbomaquinas.DAO.inventarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.inventarios.TransitorioVista;

@Repository
public class JDBCTransitorio implements TransitorioDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<TransitorioVista> consultarArticulosTransitorios(int almacen) throws DataAccessException{
		String sql = "SELECT * "
				+ "FROM TRANSITORIOS_V "
				+ "WHERE almacen"+almacen+"=?";
		List<TransitorioVista> ca = jdbcTemplate.query(sql, new TransitorioVistaRM(), almacen);
		return ca;
	}
	
	@Override
	public void actualizarExistenciaFisica(int articulo_id, int almacen_id, float cantidad) {
		String sql="UPDATE TRANSITORIOS  SET existencia=(JSON_REPLACE(existencia,RECUPERAR_PATH_FISICO_ALMACEN(existencia,?), ?)) WHERE id=?";
		jdbcTemplate.update(sql,almacen_id,cantidad,articulo_id);
	}
	
	@Override
	public TransitorioVista buscar(int id) {
		TransitorioVista articulo = jdbcTemplate.queryForObject("SELECT * FROM TRANSITORIOS_V WHERE id = ?",
				new TransitorioVistaRM(), id);
		return articulo;
	}
	
	@Override
	public void actualizarUbicacion(int articulo_id, int almacen_id, String ubicaciones[]) {
		String lista = null;
		for (String ubi: ubicaciones) {
			if(lista == null){
				lista = ubi;
			}else{
				lista = lista+","+ubi;
			}				
		}
		String sql="UPDATE TRANSITORIOS SET existencia=(JSON_REPLACE(existencia,((SELECT CONCAT(SUBSTRING(JSON_SEARCH(existencia,'all',?,NULL,'$[*].almacen_id'),2,5),'ubicaciones'))), JSON_ARRAY("+lista+"))) WHERE id=?";
		jdbcTemplate.update(sql,almacen_id,articulo_id);
	}

}
