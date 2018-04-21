package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class FacturaFinalVista {
	
	public int id;
	public String tipo;
	public int numero;
	public Date fecha_factura;
	public Date fecha_vencimiento;
	public float subtotal;
	public float descuento;
	public float iva;
	public float iva_retenido;
	public float total;
	public String moneda;
	public float tipo_cambio;
	public String condiciones_pago;
	public float saldo;
	public String folio_fiscal;
	public String estado_factura;
	public String cve_formap;
	public String des_formap;
	public String cve_metodop;
	public String des_metodop;
	public String cve_uso;
	public String des_uso;
	public int numero_cliente;
	public String nombre;
	public String direccion;
	public String colonia;
	public String codigo_postal;
	public String ciudad;
	public String estado;
	public String pais;
	public int activo;
	public int factura_final_id_sust;
	public String folio_fiscal_sust;
	private int CLIENTES_id;
	

	public FacturaFinalVista() {
		super();
	}	

	public FacturaFinalVista(int id, String tipo, int numero, Date fecha_factura, Date fecha_vencimiento,
			float subtotal, float descuento, float iva, float iva_retenido, float total, String moneda,
			float tipo_cambio, String condiciones_pago, float saldo, String folio_fiscal, String estado_factura,
			String cve_formap, String des_formap, String cve_metodop, String des_metodop, String cve_uso,
			String des_uso, int numero_cliente, String nombre, String direccion, String colonia, String codigo_postal,
			String ciudad, String estado, String pais, int activo, int factura_final_id_sust, String folio_fiscal_sust,
			int cLIENTES_id) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.numero = numero;
		this.fecha_factura = fecha_factura;
		this.fecha_vencimiento = fecha_vencimiento;
		this.subtotal = subtotal;
		this.descuento = descuento;
		this.iva = iva;
		this.iva_retenido = iva_retenido;
		this.total = total;
		this.moneda = moneda;
		this.tipo_cambio = tipo_cambio;
		this.condiciones_pago = condiciones_pago;
		this.saldo = saldo;
		this.folio_fiscal = folio_fiscal;
		this.estado_factura = estado_factura;
		this.cve_formap = cve_formap;
		this.des_formap = des_formap;
		this.cve_metodop = cve_metodop;
		this.des_metodop = des_metodop;
		this.cve_uso = cve_uso;
		this.des_uso = des_uso;
		this.numero_cliente = numero_cliente;
		this.nombre = nombre;
		this.direccion = direccion;
		this.colonia = colonia;
		this.codigo_postal = codigo_postal;
		this.ciudad = ciudad;
		this.estado = estado;
		this.pais = pais;
		this.activo = activo;
		this.factura_final_id_sust = factura_final_id_sust;
		this.folio_fiscal_sust = folio_fiscal_sust;
		CLIENTES_id = cLIENTES_id;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getFecha_factura() {
		return fecha_factura;
	}

	public void setFecha_factura(Date fecha_factura) {
		this.fecha_factura = fecha_factura;
	}

	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public float getIva_retenido() {
		return iva_retenido;
	}

	public void setIva_retenido(float iva_retenido) {
		this.iva_retenido = iva_retenido;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public float getTipo_cambio() {
		return tipo_cambio;
	}

	public void setTipo_cambio(float tipo_cambio) {
		this.tipo_cambio = tipo_cambio;
	}

	public String getCondiciones_pago() {
		return condiciones_pago;
	}

	public void setCondiciones_pago(String condiciones_pago) {
		this.condiciones_pago = condiciones_pago;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getFolio_fiscal() {
		return folio_fiscal;
	}

	public void setFolio_fiscal(String folio_fiscal) {
		this.folio_fiscal = folio_fiscal;
	}

	public String getCve_formap() {
		return cve_formap;
	}

	public void setCve_formap(String cve_formap) {
		this.cve_formap = cve_formap;
	}

	public String getDes_formap() {
		return des_formap;
	}

	public void setDes_formap(String des_formap) {
		this.des_formap = des_formap;
	}

	public String getCve_metodop() {
		return cve_metodop;
	}

	public void setCve_metodop(String cve_metodop) {
		this.cve_metodop = cve_metodop;
	}

	public String getDes_metodop() {
		return des_metodop;
	}

	public void setDes_metodop(String des_metodop) {
		this.des_metodop = des_metodop;
	}

	public String getCve_uso() {
		return cve_uso;
	}

	public void setCve_uso(String cve_uso) {
		this.cve_uso = cve_uso;
	}

	public String getDes_uso() {
		return des_uso;
	}

	public void setDes_uso(String des_uso) {
		this.des_uso = des_uso;
	}

	public int getNumero_cliente() {
		return numero_cliente;
	}

	public void setNumero_cliente(int numero_cliente) {
		this.numero_cliente = numero_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public int getFactura_final_id_sust() {
		return factura_final_id_sust;
	}

	public void setFactura_final_id_sust(int factura_final_id_sust) {
		this.factura_final_id_sust = factura_final_id_sust;
	}

	public String getFolio_fiscal_sust() {
		return folio_fiscal_sust;
	}

	public void setFolio_fiscal_sust(String folio_fiscal_sust) {
		this.folio_fiscal_sust = folio_fiscal_sust;
	}

	public String getEstado_factura() {
		return estado_factura;
	}

	public void setEstado_factura(String estado_factura) {
		this.estado_factura = estado_factura;
	}

	public int getCLIENTES_id() {
		return CLIENTES_id;
	}

	public void setCLIENTES_id(int cLIENTES_id) {
		CLIENTES_id = cLIENTES_id;
	}
		
	
}
