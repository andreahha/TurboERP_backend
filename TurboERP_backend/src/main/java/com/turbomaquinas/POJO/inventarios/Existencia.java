package com.turbomaquinas.POJO.inventarios;

import java.util.Arrays;

public class Existencia {
	private float fisico;
	private float teorico;
	private int almacen_id;
	private String ubicaciones[];
	
	public Existencia(float fisico, float teorico, int almacen_id, String[] ubicaciones) {
		super();
		this.fisico = fisico;
		this.teorico = teorico;
		this.almacen_id = almacen_id;
		this.ubicaciones = ubicaciones;
	}

	public Existencia() {
		super();
	}

	public float getFisico() {
		return fisico;
	}

	public void setFisico(float fisico) {
		this.fisico = fisico;
	}

	public float getTeorico() {
		return teorico;
	}

	public void setTeorico(float teorico) {
		this.teorico = teorico;
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
		return "Existencia [fisico=" + fisico + ", teorico=" + teorico + ", almacen_id=" + almacen_id + ", ubicaciones="
				+ Arrays.toString(ubicaciones) + "]";
	}



		public static class SubindicesAgrupados{
		int subindices[];

		public SubindicesAgrupados() {
			super();
		}

		public SubindicesAgrupados(int[] subindices) {
			super();
			this.subindices = subindices;
		}

		public int[] getSubindices() {
			return subindices;
		}

		public void setSubindices(int[] subindices) {
			this.subindices = subindices;
		}

		@Override
		public String toString() {
			return "SubindicesAgrupados [subindices=" + Arrays.toString(subindices) + "]";
		}
		
	}
	
}
