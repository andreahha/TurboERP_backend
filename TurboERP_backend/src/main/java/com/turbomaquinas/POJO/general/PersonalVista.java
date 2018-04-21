package com.turbomaquinas.POJO.general;

public class PersonalVista {
	
	private int id;
	private int numero;
	private String nombre;
	private String paterno;
	private String materno;
	private String keycloak_id;
	private int activo;
	private int departamentos_id;
	private String clave_depto;
	private String desc_depto;
	private int puestos_id;
	private String clave_puesto;
	private String desc_puesto;
	private String nivel;
	private String iniciales;
	private String tipo;
	
	public PersonalVista() {
		super();
	}

	public PersonalVista(int id, int numero, String nombre, String paterno, String materno, String keycloak_id,
			int activo, int departamentos_id, String clave_depto, String desc_depto, int puestos_id,
			String clave_puesto, String desc_puesto, String nivel, String iniciales, String tipo) {
		this.id = id;
		this.numero = numero;
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.keycloak_id = keycloak_id;
		this.activo = activo;
		this.departamentos_id = departamentos_id;
		this.clave_depto = clave_depto;
		this.desc_depto = desc_depto;
		this.puestos_id = puestos_id;
		this.clave_puesto = clave_puesto;
		this.desc_puesto = desc_puesto;
		this.nivel = nivel;
		this.iniciales = iniciales;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getKeycloak_id() {
		return keycloak_id;
	}

	public void setKeycloak_id(String keycloak_id) {
		this.keycloak_id = keycloak_id;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public int getDepartamentos_id() {
		return departamentos_id;
	}

	public void setDepartamentos_id(int departamentos_id) {
		this.departamentos_id = departamentos_id;
	}

	public String getClave_depto() {
		return clave_depto;
	}

	public void setClave_depto(String clave_depto) {
		this.clave_depto = clave_depto;
	}

	public String getDesc_depto() {
		return desc_depto;
	}

	public void setDesc_depto(String desc_depto) {
		this.desc_depto = desc_depto;
	}

	public int getPuestos_id() {
		return puestos_id;
	}

	public void setPuestos_id(int puestos_id) {
		this.puestos_id = puestos_id;
	}

	public String getClave_puesto() {
		return clave_puesto;
	}

	public void setClave_puesto(String clave_puesto) {
		this.clave_puesto = clave_puesto;
	}

	public String getDesc_puesto() {
		return desc_puesto;
	}

	public void setDesc_puesto(String desc_puesto) {
		this.desc_puesto = desc_puesto;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getIniciales() {
		return iniciales;
	}

	public void setIniciales(String iniciales) {
		this.iniciales = iniciales;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
