package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class Contacto {
	
	private int id;
	private String nombre_contacto;
	private String telefono_contacto;
	private String extension_contacto;
	private String direccion;
	private String mail;
	private String nombre_asistente;
	private String telefono_asistente;
	private String extension_asistente;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int departamentos_contactos_id;
	private int puestos_contactos_id;
	private int clientes_id;
	
	public Contacto() {
		super();
	}

	public Contacto(int id, String nombre_contacto, String telefono_contacto, String extension_contacto,
			String direccion, String mail, String nombre_asistente, String telefono_asistente,
			String extension_asistente, int activo, int creado_por, Date creado, int modificado_por, Date modificado,
			int departamentos_contactos_id, int puestos_contactos_id, int clientes_id) {
		super();
		this.id = id;
		this.nombre_contacto = nombre_contacto;
		this.telefono_contacto = telefono_contacto;
		this.extension_contacto = extension_contacto;
		this.direccion = direccion;
		this.mail = mail;
		this.nombre_asistente = nombre_asistente;
		this.telefono_asistente = telefono_asistente;
		this.extension_asistente = extension_asistente;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.departamentos_contactos_id = departamentos_contactos_id;
		this.puestos_contactos_id = puestos_contactos_id;
		this.clientes_id = clientes_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_contacto() {
		return nombre_contacto;
	}

	public void setNombre_contacto(String nombre_contacto) {
		this.nombre_contacto = nombre_contacto;
	}

	public String getTelefono_contacto() {
		return telefono_contacto;
	}

	public void setTelefono_contacto(String telefono_contacto) {
		this.telefono_contacto = telefono_contacto;
	}

	public String getExtension_contacto() {
		return extension_contacto;
	}

	public void setExtension_contacto(String extension_contacto) {
		this.extension_contacto = extension_contacto;
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

	public String getNombre_asistente() {
		return nombre_asistente;
	}

	public void setNombre_asistente(String nombre_asistente) {
		this.nombre_asistente = nombre_asistente;
	}

	public String getTelefono_asistente() {
		return telefono_asistente;
	}

	public void setTelefono_asistente(String telefono_asistente) {
		this.telefono_asistente = telefono_asistente;
	}

	public String getExtension_asistente() {
		return extension_asistente;
	}

	public void setExtension_asistente(String extension_asistente) {
		this.extension_asistente = extension_asistente;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public int getCreado_por() {
		return creado_por;
	}

	public void setCreado_por(int creado_por) {
		this.creado_por = creado_por;
	}

	public Date getCreado() {
		return creado;
	}

	public void setCreado(Date creado) {
		this.creado = creado;
	}

	public int getModificado_por() {
		return modificado_por;
	}

	public void setModificado_por(int modificado_por) {
		this.modificado_por = modificado_por;
	}

	public Date getModificado() {
		return modificado;
	}

	public void setModificado(Date modificado) {
		this.modificado = modificado;
	}

	public int getDepartamentos_contactos_id() {
		return departamentos_contactos_id;
	}

	public void setDepartamentos_contactos_id(int departamentos_contactos_id) {
		this.departamentos_contactos_id = departamentos_contactos_id;
	}

	public int getPuestos_contactos_id() {
		return puestos_contactos_id;
	}

	public void setPuestos_contactos_id(int puestos_contactos_id) {
		this.puestos_contactos_id = puestos_contactos_id;
	}

	public int getClientes_id() {
		return clientes_id;
	}

	public void setClientes_id(int clientes_id) {
		this.clientes_id = clientes_id;
	}	
}
