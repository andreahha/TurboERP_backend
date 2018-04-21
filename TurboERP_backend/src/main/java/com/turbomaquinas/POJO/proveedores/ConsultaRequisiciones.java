package com.turbomaquinas.POJO.proveedores;

import java.util.Date;

public class ConsultaRequisiciones {

	private int id;
	private String departamento;
	private int numero_requisicion;
	private String descripcion;
	private Date fecha_requisicion;
	private Date fecha_cotizacion;
	private int dias_fecha_cot;
	private int alerta_fecha_cot;
	private Date fecha_orden_compra;
	private int ordenes_requisiciones_id;
	private int dias_fecha_ordenc;
	private int alerta_fecha_ordenc;
	private Date fecha_requiere_prod;
	private int dias_fecha_reqprod;
	private int alerta_fecha_reqprod;
	private Date fecha_estimada_entrega;
	private int dias_fecha_estent;
	private int alerta_fecha_estent;
	private Date fecha_recepcion;
	private int estado_recepcion_stock;
	private int dias_fecha_recepcion;
	private int alerta_fecha_recepcion;
	private Date fecha_lib_cuarentena;
	private int estado_liberacion_cuarentena;
	private int dias_fecha_libcuarentena;
	private int alerta_fecha_libcuarentena;
	private Date fecha_entrada_almacen;
	private int dias_fecha_entradalm;
	private int alerta_fecha_entradalm;
	private Date fecha_salida_almacen;
	private int dias_fecha_salidalm;
	private int alerta_fecha_salidalm;
	private String parcial_ordenc;
	private String parcial_recepcion;
	private String parcial_libcuarentena;
	private String parcial_entradalm;
	private String parcial_salidalm;

	public ConsultaRequisiciones() {
		super();
	}

	public ConsultaRequisiciones(int id, String departamento, int numero_requisicion, String descripcion,
			Date fecha_requisicion, Date fecha_cotizacion, int dias_fecha_cot, int alerta_fecha_cot,
			Date fecha_orden_compra, int ordenes_requisiciones_id, int dias_fecha_ordenc, int alerta_fecha_ordenc,
			Date fecha_requiere_prod, int dias_fecha_reqprod, int alerta_fecha_reqprod, Date fecha_estimada_entrega,
			int dias_fecha_estent, int alerta_fecha_estent, Date fecha_recepcion, int estado_recepcion_stock,
			int dias_fecha_recepcion, int alerta_fecha_recepcion, Date fecha_lib_cuarentena,
			int estado_liberacion_cuarentena, int dias_fecha_libcuarentena, int alerta_fecha_libcuarentena,
			Date fecha_entrada_almacen, int dias_fecha_entradalm, int alerta_fecha_entradalm, Date fecha_salida_almacen,
			int dias_fecha_salidalm, int alerta_fecha_salidalm, String parcial_ordenc, String parcial_recepcion,
			String parcial_libcuarentena, String parcial_entradalm, String parcial_salidalm) {
		super();
		this.id = id;
		this.departamento = departamento;
		this.numero_requisicion = numero_requisicion;
		this.descripcion = descripcion;
		this.fecha_requisicion = fecha_requisicion;
		this.fecha_cotizacion = fecha_cotizacion;
		this.dias_fecha_cot = dias_fecha_cot;
		this.alerta_fecha_cot = alerta_fecha_cot;
		this.fecha_orden_compra = fecha_orden_compra;
		this.ordenes_requisiciones_id = ordenes_requisiciones_id;
		this.dias_fecha_ordenc = dias_fecha_ordenc;
		this.alerta_fecha_ordenc = alerta_fecha_ordenc;
		this.fecha_requiere_prod = fecha_requiere_prod;
		this.dias_fecha_reqprod = dias_fecha_reqprod;
		this.alerta_fecha_reqprod = alerta_fecha_reqprod;
		this.fecha_estimada_entrega = fecha_estimada_entrega;
		this.dias_fecha_estent = dias_fecha_estent;
		this.alerta_fecha_estent = alerta_fecha_estent;
		this.fecha_recepcion = fecha_recepcion;
		this.estado_recepcion_stock = estado_recepcion_stock;
		this.dias_fecha_recepcion = dias_fecha_recepcion;
		this.alerta_fecha_recepcion = alerta_fecha_recepcion;
		this.fecha_lib_cuarentena = fecha_lib_cuarentena;
		this.estado_liberacion_cuarentena = estado_liberacion_cuarentena;
		this.dias_fecha_libcuarentena = dias_fecha_libcuarentena;
		this.alerta_fecha_libcuarentena = alerta_fecha_libcuarentena;
		this.fecha_entrada_almacen = fecha_entrada_almacen;
		this.dias_fecha_entradalm = dias_fecha_entradalm;
		this.alerta_fecha_entradalm = alerta_fecha_entradalm;
		this.fecha_salida_almacen = fecha_salida_almacen;
		this.dias_fecha_salidalm = dias_fecha_salidalm;
		this.alerta_fecha_salidalm = alerta_fecha_salidalm;
		this.parcial_ordenc = parcial_ordenc;
		this.parcial_recepcion = parcial_recepcion;
		this.parcial_libcuarentena = parcial_libcuarentena;
		this.parcial_entradalm = parcial_entradalm;
		this.parcial_salidalm = parcial_salidalm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getNumero_requisicion() {
		return numero_requisicion;
	}

	public void setNumero_requisicion(int numero_requisicion) {
		this.numero_requisicion = numero_requisicion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha_requisicion() {
		return fecha_requisicion;
	}

	public void setFecha_requisicion(Date fecha_requisicion) {
		this.fecha_requisicion = fecha_requisicion;
	}

	public Date getFecha_cotizacion() {
		return fecha_cotizacion;
	}

	public void setFecha_cotizacion(Date fecha_cotizacion) {
		this.fecha_cotizacion = fecha_cotizacion;
	}

	public int getDias_fecha_cot() {
		return dias_fecha_cot;
	}

	public void setDias_fecha_cot(int dias_fecha_cot) {
		this.dias_fecha_cot = dias_fecha_cot;
	}

	public int getAlerta_fecha_cot() {
		return alerta_fecha_cot;
	}

	public void setAlerta_fecha_cot(int alerta_fecha_cot) {
		this.alerta_fecha_cot = alerta_fecha_cot;
	}

	public Date getFecha_orden_compra() {
		return fecha_orden_compra;
	}

	public void setFecha_orden_compra(Date fecha_orden_compra) {
		this.fecha_orden_compra = fecha_orden_compra;
	}

	public int getOrdenes_requisiciones_id() {
		return ordenes_requisiciones_id;
	}

	public void setOrdenes_requisiciones_id(int ordenes_requisiciones_id) {
		this.ordenes_requisiciones_id = ordenes_requisiciones_id;
	}

	public int getDias_fecha_ordenc() {
		return dias_fecha_ordenc;
	}

	public void setDias_fecha_ordenc(int dias_fecha_ordenc) {
		this.dias_fecha_ordenc = dias_fecha_ordenc;
	}

	public int getAlerta_fecha_ordenc() {
		return alerta_fecha_ordenc;
	}

	public void setAlerta_fecha_ordenc(int alerta_fecha_ordenc) {
		this.alerta_fecha_ordenc = alerta_fecha_ordenc;
	}

	public Date getFecha_requiere_prod() {
		return fecha_requiere_prod;
	}

	public void setFecha_requiere_prod(Date fecha_requiere_prod) {
		this.fecha_requiere_prod = fecha_requiere_prod;
	}

	public int getDias_fecha_reqprod() {
		return dias_fecha_reqprod;
	}

	public void setDias_fecha_reqprod(int dias_fecha_reqprod) {
		this.dias_fecha_reqprod = dias_fecha_reqprod;
	}

	public int getAlerta_fecha_reqprod() {
		return alerta_fecha_reqprod;
	}

	public void setAlerta_fecha_reqprod(int alerta_fecha_reqprod) {
		this.alerta_fecha_reqprod = alerta_fecha_reqprod;
	}

	public Date getFecha_estimada_entrega() {
		return fecha_estimada_entrega;
	}

	public void setFecha_estimada_entrega(Date fecha_estimada_entrega) {
		this.fecha_estimada_entrega = fecha_estimada_entrega;
	}

	public int getDias_fecha_estent() {
		return dias_fecha_estent;
	}

	public void setDias_fecha_estent(int dias_fecha_estent) {
		this.dias_fecha_estent = dias_fecha_estent;
	}

	public int getAlerta_fecha_estent() {
		return alerta_fecha_estent;
	}

	public void setAlerta_fecha_estent(int alerta_fecha_estent) {
		this.alerta_fecha_estent = alerta_fecha_estent;
	}

	public Date getFecha_recepcion() {
		return fecha_recepcion;
	}

	public void setFecha_recepcion(Date fecha_recepcion) {
		this.fecha_recepcion = fecha_recepcion;
	}

	public int getDias_fecha_recepcion() {
		return dias_fecha_recepcion;
	}

	public void setDias_fecha_recepcion(int dias_fecha_recepcion) {
		this.dias_fecha_recepcion = dias_fecha_recepcion;
	}

	public int getAlerta_fecha_recepcion() {
		return alerta_fecha_recepcion;
	}

	public void setAlerta_fecha_recepcion(int alerta_fecha_recepcion) {
		this.alerta_fecha_recepcion = alerta_fecha_recepcion;
	}

	public Date getFecha_lib_cuarentena() {
		return fecha_lib_cuarentena;
	}

	public void setFecha_lib_cuarentena(Date fecha_lib_cuarentena) {
		this.fecha_lib_cuarentena = fecha_lib_cuarentena;
	}

	public int getEstado_liberacion_cuarentena() {
		return estado_liberacion_cuarentena;
	}

	public void setEstado_liberacion_cuarentena(int estado_liberacion_cuarentena) {
		this.estado_liberacion_cuarentena = estado_liberacion_cuarentena;
	}

	public int getDias_fecha_libcuarentena() {
		return dias_fecha_libcuarentena;
	}

	public void setDias_fecha_libcuarentena(int dias_fecha_libcuarentena) {
		this.dias_fecha_libcuarentena = dias_fecha_libcuarentena;
	}

	public int getAlerta_fecha_libcuarentena() {
		return alerta_fecha_libcuarentena;
	}

	public void setAlerta_fecha_libcuarentena(int alerta_fecha_libcuarentena) {
		this.alerta_fecha_libcuarentena = alerta_fecha_libcuarentena;
	}

	public Date getFecha_entrada_almacen() {
		return fecha_entrada_almacen;
	}

	public void setFecha_entrada_almacen(Date fecha_entrada_almacen) {
		this.fecha_entrada_almacen = fecha_entrada_almacen;
	}

	public int getDias_fecha_entradalm() {
		return dias_fecha_entradalm;
	}

	public void setDias_fecha_entradalm(int dias_fecha_entradalm) {
		this.dias_fecha_entradalm = dias_fecha_entradalm;
	}

	public int getAlerta_fecha_entradalm() {
		return alerta_fecha_entradalm;
	}

	public void setAlerta_fecha_entradalm(int alerta_fecha_entradalm) {
		this.alerta_fecha_entradalm = alerta_fecha_entradalm;
	}

	public Date getFecha_salida_almacen() {
		return fecha_salida_almacen;
	}

	public void setFecha_salida_almacen(Date fecha_salida_almacen) {
		this.fecha_salida_almacen = fecha_salida_almacen;
	}

	public int getDias_fecha_salidalm() {
		return dias_fecha_salidalm;
	}

	public void setDias_fecha_salidalm(int dias_fecha_salidalm) {
		this.dias_fecha_salidalm = dias_fecha_salidalm;
	}

	public int getAlerta_fecha_salidalm() {
		return alerta_fecha_salidalm;
	}

	public void setAlerta_fecha_salidalm(int alerta_fecha_salidalm) {
		this.alerta_fecha_salidalm = alerta_fecha_salidalm;
	}

	public int getEstado_recepcion_stock() {
		return estado_recepcion_stock;
	}

	public void setEstado_recepcion_stock(int estado_recepcion_stock) {
		this.estado_recepcion_stock = estado_recepcion_stock;
	}

	public String getParcial_ordenc() {
		return parcial_ordenc;
	}

	public void setParcial_ordenc(String parcial_ordenc) {
		this.parcial_ordenc = parcial_ordenc;
	}

	public String getParcial_recepcion() {
		return parcial_recepcion;
	}

	public void setParcial_recepcion(String parcial_recepcion) {
		this.parcial_recepcion = parcial_recepcion;
	}

	public String getParcial_libcuarentena() {
		return parcial_libcuarentena;
	}

	public void setParcial_libcuarentena(String parcial_libcuarentena) {
		this.parcial_libcuarentena = parcial_libcuarentena;
	}

	public String getParcial_entradalm() {
		return parcial_entradalm;
	}

	public void setParcial_entradalm(String parcial_entradalm) {
		this.parcial_entradalm = parcial_entradalm;
	}

	public String getParcial_salidalm() {
		return parcial_salidalm;
	}

	public void setParcial_salidalm(String parcial_salidalm) {
		this.parcial_salidalm = parcial_salidalm;
	}

}
