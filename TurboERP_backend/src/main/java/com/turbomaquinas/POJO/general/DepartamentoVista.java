package com.turbomaquinas.POJO.general;

public class DepartamentoVista {
	private int id;
	private String clave;
	private String descripcion;
	private int jefeId;
	private String nombreJefe;
	private String paternoJefe;
	private String maternoJefe;
	
	public DepartamentoVista() {
		super();
	}
	
	public DepartamentoVista(int id, String clave, String descripcion, int jefeId, String nombreJefe,
			String paternoJefe, String maternoJefe) {
		super();
		this.id = id;
		this.clave = clave;
		this.descripcion = descripcion;
		this.jefeId = jefeId;
		this.nombreJefe = nombreJefe;
		this.paternoJefe = paternoJefe;
		this.maternoJefe = maternoJefe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getJefeId() {
		return jefeId;
	}

	public void setJefeId(int jefeId) {
		this.jefeId = jefeId;
	}

	public String getNombreJefe() {
		return nombreJefe;
	}

	public void setNombreJefe(String nombreJefe) {
		this.nombreJefe = nombreJefe;
	}

	public String getPaternoJefe() {
		return paternoJefe;
	}

	public void setPaternoJefe(String paternoJefe) {
		this.paternoJefe = paternoJefe;
	}

	public String getMaternoJefe() {
		return maternoJefe;
	}

	public void setMaternoJefe(String maternoJefe) {
		this.maternoJefe = maternoJefe;
	}
	
	
}
