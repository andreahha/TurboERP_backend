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

import com.turbomaquinas.POJO.comercial.PrePedido;

@Repository
public class JDBCPrePedido implements PrePedidoDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(PrePedido pp) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas= new ArrayList<>();
		columnas.add("numero");
		columnas.add("fecha_prepedido");
		columnas.add("comentarios");
		columnas.add("importe");
		columnas.add("revision");
		columnas.add("sustituye_id");
		columnas.add("creado_por");
		columnas.add("alfresco_id");
		columnas.add("clientes_id");
		
		insert.setTableName("PREPEDIDOS");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("numero", pp.getNumero());
		datos.put("fecha_prepedido", pp.getFecha_prepedido());
		datos.put("comentarios", pp.getComentarios());
		datos.put("importe", pp.getImporte());
		datos.put("revision", pp.getRevision());
		datos.put("sustituye_id", pp.getSustituye_id());
		datos.put("creado_por", pp.getCreado_por());
		datos.put("alfresco_id", pp.getAlfresco_id());
		datos.put("clientes_id", pp.getClientes_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);

		return id.intValue();
	}

	@Override
	public void actualizar(PrePedido pp) throws DataAccessException{
		jdbcTemplate.update("UPDATE PREPEDIDOS SET numero=?, comentarios=?, importe=?, revision=?, "
				+ "sustituye_id=?, activo=?, modificado_por=?, alfresco_id=? WHERE id=?", 
				pp.getNumero(), pp.getComentarios(), pp.getImporte(), pp.getRevision(), pp.getSustituye_id(), 
				pp.getActivo(), pp.getModificado_por(), pp.getAlfresco_id(), pp.getId());		
	}

	@Override
	public PrePedido buscar(int id) throws DataAccessException{
		PrePedido pp = jdbcTemplate.queryForObject("SELECT * FROM PREPEDIDOS WHERE id=?", 
				new PrePedidoRM(), id);
		return pp;
	}

	@Override
	public List<PrePedido> consultar() throws DataAccessException{
		List<PrePedido> pp = jdbcTemplate.query("SELECT * FROM PREPEDIDOS", new PrePedidoRM());
		return pp;
	}

	@Override
	public List<Integer> aniosPrepedido(int id) throws DataAccessException{
		List<Integer> i = jdbcTemplate.queryForList("SELECT DISTINCT DATE_FORMAT(fecha_prepedido,'%Y') FROM PREPEDIDOS "
				+ "WHERE CLIENTES_id = ? ORDER BY DATE_FORMAT(fecha_prepedido,'%Y') DESC", Integer.class, id);
		return i;
	}

	@Override
	public List<PrePedido> filtrarAnioCliente(String anio, int id) throws DataAccessException{
		List<PrePedido> p = jdbcTemplate.query("SELECT * FROM PREPEDIDOS WHERE DATE_FORMAT(fecha_prepedido,'%Y') = ? "
				+ "AND CLIENTES_id = ?", new PrePedidoRM(), anio, id);
		return p;
	}

	@Override
	public List<PrePedido> prePedidosAAPorOrden(int id) throws DataAccessException{
		List<PrePedido> p = jdbcTemplate.query("SELECT * FROM PREPEDIDOS P JOIN ACTIVIDADES_AUTORIZADAS AA ON P.id=AA.PRE_PEDIDOS_id "
				+ "JOIN ENCABEZADOS_ACTIVIDADES_AUTORIZADAS EAA ON AA.ENCABEZADOS_ACTIVIDADES_AUTORIZADAS_id=EAA.id AND EAA.ORDENES_id=?", 
				new PrePedidoRM(), id);
		return p;
	}
}
