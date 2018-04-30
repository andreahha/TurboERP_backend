package com.turbomaquinas.DAO.comercial;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.DepositoRecibido;
import com.turbomaquinas.POJO.comercial.DepositoRecibidoVista;

@Repository
public class JDBCDepositoRecibido implements DepositoRecibidoDAO{
	
	public class Fechas{
		private Date fecha_deposito;

		public Fechas(Date fecha_deposito) {
			super();
			this.fecha_deposito = fecha_deposito;
		}

		public Date getFecha_deposito() {
			return fecha_deposito;
		}

		public void setFecha_deposito(Date fecha_deposito) {
			this.fecha_deposito = fecha_deposito;
		}
		
		
	}

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(DepositoRecibido deposito) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("comentarios");
		columnas.add("importe_deposito");
		//columnas.add("importe_aplicado");
		columnas.add("fecha_deposito");
		columnas.add("numero_operacion");
		columnas.add("creado_por");
		columnas.add("formas_pago_id");
		columnas.add("bancos_id_emisor");
		columnas.add("cuentas_bancarias_id");
		columnas.add("certificado_pago");
		columnas.add("cadena_pago");
		columnas.add("sello_pago");
		columnas.add("tipos_cadena_pago");
		
		insert.setTableName("DEPOSITOS_RECIBIDOS");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("comentarios", deposito.getComentarios());
		datos.put("importe_deposito", deposito.getImporte_deposito());
		//datos.put("importe_aplicado", deposito.getImporte_aplicado());
		datos.put("fecha_deposito", deposito.getFecha_deposito());
		datos.put("numero_operacion", deposito.getNumero_operacion());
		datos.put("creado_por", deposito.getCreado_por());
		datos.put("formas_pago_id", deposito.getFormas_pago_id());
		datos.put("bancos_id_emisor", deposito.getBancos_id_emisor());
		datos.put("cuentas_bancarias_id", deposito.getCuentas_bancarias_id());
		datos.put("certificado_pago", deposito.getCertificado_pago());
		datos.put("cadena_pago", deposito.getCadena_pago());
		datos.put("sello_pago", deposito.getSello_pago());
		datos.put("tipos_cadena_pago", deposito.getTipos_cadena_pago());
		
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public void actualizar(DepositoRecibido deposito) throws DataAccessException{
		jdbcTemplate.update("UPDATE DEPOSITOS_RECIBIDOS SET comentarios=?, importe_deposito=?, fecha_deposito=?, numero_operacion=?, "
				+ "formas_pago_id=?, bancos_id_emisor=?, cuentas_bancarias_id=?, certificado_pago=?, cadena_pago=?, "
				+ "sello_pago=?, tipos_cadena_pago=?, cuenta_emisor=?, modificado_por=? WHERE id=?",
				deposito.getComentarios(), deposito.getImporte_deposito(), deposito.getFecha_deposito(), deposito.getNumero_operacion(),
				deposito.getFormas_pago_id(), deposito.getBancos_id_emisor(), deposito.getCuentas_bancarias_id(), deposito.getCertificado_pago(),
				deposito.getCadena_pago(), deposito.getSello_pago(), deposito.getTipos_cadena_pago(), deposito.getCuenta_emisor(), 
				deposito.getModificado_por(),deposito.getId());
	}

	@Override
	public DepositoRecibidoVista buscar(int id) throws DataAccessException{
		DepositoRecibidoVista dv = jdbcTemplate.queryForObject("SELECT * FROM DEPOSITOS_RECIBIDOS_V WHERE id=?", new DepositoRecibidoVistaRM(), id);
		return dv;
	}

	@Override
	public List<DepositoRecibidoVista> consultar() throws DataAccessException{
		List<DepositoRecibidoVista> dv = jdbcTemplate.query("SELECT * FROM DEPOSITOS_RECIBIDOS_V", new DepositoRecibidoVistaRM());
		return dv;
	}

	/*@SuppressWarnings("unchecked")
	@Override
	public List<Fechas> consultarFechasDepositosRecibidos() throws DataAccessException{
		String sql ="SELECT dr.fecha_deposito"
				+ " FROM DEPOSITOS_RECIBIDOS dr"
				+ " WHERE fecha_deposito<>''"
				+ " GROUP BY dr.fecha_deposito";
		List<? extends Object> fechas = jdbcTemplate.query(sql, new RowMapper<Object>(){

			@Override
			public Object mapRow(ResultSet rs, int i) throws SQLException {
				
				return new Fechas(
						rs.getDate("fecha_deposito"));
			}
			
		});
		return (List<Fechas>) fechas;
	}*/
	

	@Override
	public List<DepositoRecibidoVista> depositoRecibidoRangoFecha(String fecha_depositoInicio,String fecha_depositoFin,String estado) throws DataAccessException {
		String depositoAplicado = "";		
	   	if(estado.equals("*")){
	   		depositoAplicado = "";
		}
	   	if(estado.equals("NA")){
	   		depositoAplicado = "and PAGOS_id IS NULL";
	   	}
	   	if(estado.equals("A")){
	   		depositoAplicado = "and PAGOS_id IS NOT NULL";
	   	}
		String sql = "select *"
				+ " from DEPOSITOS_RECIBIDOS_V dr"
				+ " where fecha_deposito between ? and ? and activo=1 "+depositoAplicado;
		
		List<DepositoRecibidoVista> dv = jdbcTemplate.query(sql, new DepositoRecibidoVistaRM(),fecha_depositoInicio,fecha_depositoFin);			
		
		return dv;
	}

	@Override
	public void eliminar(int id,int modificado_por) throws DataAccessException{
		String sql = "UPDATE DEPOSITOS_RECIBIDOS SET activo=0, modificado_por=? WHERE id=?";
		jdbcTemplate.update(sql,modificado_por,id);
		
	}

	@Override
	public int monedaDepositoRecibido(int id) throws DataAccessException{
		
		String sql = "select dolares "
				+ "from CUENTAS_BANCARIAS cb "
				+ "where cb.id = (select dr.CUENTAS_BANCARIAS_id from DEPOSITOS_RECIBIDOS dr where id=?)";
		
			int nacional = jdbcTemplate.queryForObject(sql, Integer.class, id);
			//System.out.println(nacional);
		
		return nacional;
	}
	

}
