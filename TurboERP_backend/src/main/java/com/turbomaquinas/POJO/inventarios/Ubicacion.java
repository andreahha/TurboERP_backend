package com.turbomaquinas.POJO.inventarios;

import java.util.Arrays;

public class Ubicacion {
	
	private int almacen_id;
	private String ubicaciones[];
	
	public Ubicacion() {
		super();
	}

	public Ubicacion(int almacen_id, String[] ubicaciones) {
		super();
		this.almacen_id = almacen_id;
		this.ubicaciones = ubicaciones;
	}

	public int getAlmacen_id() {
		return almacen_id;
	}

	public void setAlmacen_id(int almacen_id) {
		this.almacen_id = almacen_id;
	}

	public String[] getUbicaciones() {
		return ubicaciones;
	}

	public void setUbicaciones(String[] ubicaciones) {
		this.ubicaciones = ubicaciones;
	}

	@Override
	public String toString() {
		return "Ubicacion [almacen_id=" + almacen_id + ", ubicaciones=" + Arrays.toString(ubicaciones) + "]";
	}
	
	

}
