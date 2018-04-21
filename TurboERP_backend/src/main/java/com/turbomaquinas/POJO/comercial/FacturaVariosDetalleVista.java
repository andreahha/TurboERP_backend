package com.turbomaquinas.POJO.comercial;

public class FacturaVariosDetalleVista {
	private int id;
	private String descripcion;
	private Float importe;
	private int activo;
	private int productos_sat_id;
	private String codigo;
	private String productos_descripcion;
	private int factura_varios_id;
	
	public FacturaVariosDetalleVista() {
		super();
	}

	public FacturaVariosDetalleVista(int id, String descripcion, Float importe, int activo, int productos_sat_id,
			String codigo, String productos_descripcion, int factura_varios_id) {
		this.id = id;
		this.descripcion = descripcion;
		this.importe = importe;
		this.activo = activo;
		this.productos_sat_id = productos_sat_id;
		this.codigo = codigo;
		this.productos_descripcion = productos_descripcion;
		this.factura_varios_id = factura_varios_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Float getImporte() {
		return importe;
	}

	public void setImporte(Float importe) {
		this.importe = importe;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public int getProductos_sat_id() {
		return productos_sat_id;
	}

	public void setProductos_sat_id(int productos_sat_id) {
		this.productos_sat_id = productos_sat_id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getProductos_descripcion() {
		return productos_descripcion;
	}

	public void setProductos_descripcion(String productos_descripcion) {
		this.productos_descripcion = productos_descripcion;
	}

	public int getFactura_varios_id() {
		return factura_varios_id;
	}

	public void setFactura_varios_id(int factura_varios_id) {
		this.factura_varios_id = factura_varios_id;
	}

}
