package com.turbomaquinas.POJO.timbrado;

public class Pagare{
	private String fecha;
	private float tasaInteresMoratorio;
	
	public Pagare() {
		super();
	}

	public Pagare(String fecha, float tasaInteresMoratorio) {
		super();
		this.fecha = fecha;
		this.tasaInteresMoratorio = tasaInteresMoratorio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public float getTasaInteresMoratorio() {
		return tasaInteresMoratorio;
	}

	public void setTasaInteresMoratorio(float tasaInteresMoratorio) {
		this.tasaInteresMoratorio = tasaInteresMoratorio;
	}
}
