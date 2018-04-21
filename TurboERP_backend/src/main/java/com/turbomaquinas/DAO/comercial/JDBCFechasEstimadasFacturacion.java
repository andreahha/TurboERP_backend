package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.FechasEstimadasFacturacion;

@Repository
public class JDBCFechasEstimadasFacturacion implements  FechasEstimadasFacturacionDAO{
	
	public class DatosFechas{
		
		private int id;
		private Date fecha_estimada;
		private String comentario;
		
		public DatosFechas() {
			super();
		}

		public DatosFechas(int id, Date fecha_estimada, String comentario) {
			super();
			this.id = id;
			this.fecha_estimada = fecha_estimada;
			this.comentario = comentario;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Date getFecha_estimada() {
			return fecha_estimada;
		}

		public void setFecha_estimada(Date fecha_estimada) {
			this.fecha_estimada = fecha_estimada;
		}

		public String getComentario() {
			return comentario;
		}

		public void setComentario(String comentario) {
			this.comentario = comentario;
		}

		@Override
		public String toString() {
			return "DatosFechas [id=" + id + ", fecha_estimada=" + fecha_estimada + ", comentario=" + comentario + "]";
		}
		
		
	}
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	@Override
	public void crear(FechasEstimadasFacturacion fef) throws DataAccessException {
		jdbcTemplate.update("INSERT INTO FECHAS_ESTIMADAS_FACTURACION(fecha_estimada,comentario,indefinida,creado_por,ORDENES_id) VALUES(?, ?, ?, ?, ?)",
				           fef.getFecha_estimada(),fef.getComentario(), fef.getIndefinida(), fef.getCreado_por(), fef.getOrdenes_id());

	}

	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DatosFechas> consultarPorOrden(int idOrden) {
		String sql ="SELECT fef.id, fef.fecha_estimada, fef.comentario"
				+ " FROM FECHAS_ESTIMADAS_FACTURACION fef"
				+ " WHERE ORDENES_id = ?"
				+ " ORDER BY fecha_estimada desc";
		
		List<? extends Object> fechas = jdbcTemplate.query(sql, new RowMapper<Object>() {

			@Override
			public Object mapRow(ResultSet rs, int i) throws SQLException {
				return new DatosFechas(
						rs.getInt("id"),
						rs.getDate("fecha_estimada"),
						rs.getString("comentario"));
			}
		}, idOrden);
		
		return (List<DatosFechas>) fechas;
		
	}
	


}
