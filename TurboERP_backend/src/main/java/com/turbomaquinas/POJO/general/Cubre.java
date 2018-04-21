package com.turbomaquinas.POJO.general;

public class Cubre {
	private int id;
	private int activo;
	private int personal_id;
	private int puestos_id;
	
	public Cubre() {
		super();
	}

	public Cubre(int id, int activo, int personal_id, int puestos_id) {
		super();
		this.id = id;
		this.activo = activo;
		this.personal_id = personal_id;
		this.puestos_id = puestos_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public int getPersonal_id() {
		return personal_id;
	}

	public void setPersonal_id(int personal_id) {
		this.personal_id = personal_id;
	}

	public int getPuestos_id() {
		return puestos_id;
	}

	public void setPuestos_id(int puestos_id) {
		this.puestos_id = puestos_id;
	}
}
