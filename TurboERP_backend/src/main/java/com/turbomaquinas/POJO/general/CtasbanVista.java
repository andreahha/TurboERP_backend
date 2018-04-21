package com.turbomaquinas.POJO.general;

public class CtasbanVista {

	private int id;
	private String numero;
	private int dolares;
	private String descripcion;
	private int activo;
	private int catalogo_cuentas_id;
	private String cuenta_contable;
	private String nombre_cuenta;
	private int bancos_id;
	private String clave_bco;
	private String rfc_bco;
	private String nombre_bco;
	
	public CtasbanVista() {
		super();
	}

	public CtasbanVista(int id, String numero, int dolares, String descripcion, int activo, int catalogo_cuentas_id,
			String cuenta_contable, String nombre_cuenta, int bancos_id, String clave_bco, String rfc_bco,
			String nombre_bco) {
		this.id = id;
		this.numero = numero;
		this.dolares = dolares;
		this.descripcion = descripcion;
		this.activo = activo;
		this.catalogo_cuentas_id = catalogo_cuentas_id;
		this.cuenta_contable = cuenta_contable;
		this.nombre_cuenta = nombre_cuenta;
		this.bancos_id = bancos_id;
		this.clave_bco = clave_bco;
		this.rfc_bco = rfc_bco;
		this.nombre_bco = nombre_bco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getDolares() {
		return dolares;
	}

	public void setDolares(int dolares) {
		this.dolares = dolares;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public int getCatalogo_cuentas_id() {
		return catalogo_cuentas_id;
	}

	public void setCatalogo_cuentas_id(int catalogo_cuentas_id) {
		this.catalogo_cuentas_id = catalogo_cuentas_id;
	}

	public String getCuenta_contable() {
		return cuenta_contable;
	}

	public void setCuenta_contable(String cuenta_contable) {
		this.cuenta_contable = cuenta_contable;
	}

	public String getNombre_cuenta() {
		return nombre_cuenta;
	}

	public void setNombre_cuenta(String nombre_cuenta) {
		this.nombre_cuenta = nombre_cuenta;
	}

	public int getBancos_id() {
		return bancos_id;
	}

	public void setBancos_id(int bancos_id) {
		this.bancos_id = bancos_id;
	}

	public String getClave_bco() {
		return clave_bco;
	}

	public void setClave_bco(String clave_bco) {
		this.clave_bco = clave_bco;
	}

	public String getRfc_bco() {
		return rfc_bco;
	}

	public void setRfc_bco(String rfc_bco) {
		this.rfc_bco = rfc_bco;
	}

	public String getNombre_bco() {
		return nombre_bco;
	}

	public void setNombre_bco(String nombre_bco) {
		this.nombre_bco = nombre_bco;
	}
	
}
