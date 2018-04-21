package com.turbomaquinas.POJO.comercial;

public class ContactoVista {
	private int id;
	private String nombreContacto;
	private String telefonoContacto;
	private String extensionContacto;
	private String direccion;
	private String mail;
	private String nombreAsistente;
	private String telefonoAsistente;
	private String extensionAsistente;
	private int departamentos_contactos_id;
	private String departamento_contacto;
	private int puestos_contactos_id;
	private String puesto_contacto;
	private int clientes_id;
	private int numero_cliente;
	private String nombre_fiscal;
	private String nombre_comercial;
	private int giro;
	
	public ContactoVista() {
		super();
	}

	public ContactoVista(int id, String nombreContacto, String telefonoContacto, String extensionContacto,
			String direccion, String mail, String nombreAsistente, String telefonoAsistente, String extensionAsistente,
			int departamentos_contactos_id, String departamento_contacto, int puestos_contactos_id,
			String puesto_contacto, int clientes_id, int numero_cliente, String nombre_fiscal, String nombre_comercial,
			int giro) {
		super();
		this.id = id;
		this.nombreContacto = nombreContacto;
		this.telefonoContacto = telefonoContacto;
		this.extensionContacto = extensionContacto;
		this.direccion = direccion;
		this.mail = mail;
		this.nombreAsistente = nombreAsistente;
		this.telefonoAsistente = telefonoAsistente;
		this.extensionAsistente = extensionAsistente;
		this.departamentos_contactos_id = departamentos_contactos_id;
		this.departamento_contacto = departamento_contacto;
		this.puestos_contactos_id = puestos_contactos_id;
		this.puesto_contacto = puesto_contacto;
		this.clientes_id = clientes_id;
		this.numero_cliente = numero_cliente;
		this.nombre_fiscal = nombre_fiscal;
		this.nombre_comercial = nombre_comercial;
		this.giro = giro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public String getExtensionContacto() {
		return extensionContacto;
	}

	public void setExtensionContacto(String extensionContacto) {
		this.extensionContacto = extensionContacto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNombreAsistente() {
		return nombreAsistente;
	}

	public void setNombreAsistente(String nombreAsistente) {
		this.nombreAsistente = nombreAsistente;
	}

	public String getTelefonoAsistente() {
		return telefonoAsistente;
	}

	public void setTelefonoAsistente(String telefonoAsistente) {
		this.telefonoAsistente = telefonoAsistente;
	}

	public String getExtensionAsistente() {
		return extensionAsistente;
	}

	public void setExtensionAsistente(String extensionAsistente) {
		this.extensionAsistente = extensionAsistente;
	}

	public int getDepartamentos_contactos_id() {
		return departamentos_contactos_id;
	}

	public void setDepartamentos_contactos_id(int departamentos_contactos_id) {
		this.departamentos_contactos_id = departamentos_contactos_id;
	}

	public String getDepartamento_contacto() {
		return departamento_contacto;
	}

	public void setDepartamento_contacto(String departamento_contacto) {
		this.departamento_contacto = departamento_contacto;
	}

	public int getPuestos_contactos_id() {
		return puestos_contactos_id;
	}

	public void setPuestos_contactos_id(int puestos_contactos_id) {
		this.puestos_contactos_id = puestos_contactos_id;
	}

	public String getPuesto_contacto() {
		return puesto_contacto;
	}

	public void setPuesto_contacto(String puesto_contacto) {
		this.puesto_contacto = puesto_contacto;
	}

	public int getClientes_id() {
		return clientes_id;
	}

	public void setClientes_id(int clientes_id) {
		this.clientes_id = clientes_id;
	}

	public int getNumero_cliente() {
		return numero_cliente;
	}

	public void setNumero_cliente(int numero_cliente) {
		this.numero_cliente = numero_cliente;
	}

	public String getNombre_fiscal() {
		return nombre_fiscal;
	}

	public void setNombre_fiscal(String nombre_fiscal) {
		this.nombre_fiscal = nombre_fiscal;
	}

	public String getNombre_comercial() {
		return nombre_comercial;
	}

	public void setNombre_comercial(String nombre_comercial) {
		this.nombre_comercial = nombre_comercial;
	}

	public int getGiro() {
		return giro;
	}

	public void setGiro(int giro) {
		this.giro = giro;
	}
}
