package Soldados;

import Enum.RangoEnum;

public class Coronel extends Soldado {
	protected String estrategia;

	public Coronel(String nombre, String id, String unidad, String estrategia) {
		super(nombre, id, RangoEnum.Coronel, unidad);
		this.estrategia = estrategia;
	}
	
	@Override
	public void realizarAccion() {
		System.out.println("El coronel " + nombre + " implementa la estrategia " + estrategia);
	}

	public void darOrden(Capitan subordinado) {
		if (subordinado.getUnidad().equals(unidad)) {
			System.out.print("El coronel " + nombre + " da la orden a ");
			subordinado.realizarAccion(this);
		}
		else System.out.println("El coronel " + nombre + " no tiene autoridad sobre el capitan " + subordinado.getNombre());
	}

	public void darOrden(Teniente subordinado) {
		if (subordinado.getUnidad().equals(unidad)) {
			System.out.print("El coronel " + nombre + " da la orden a ");
			subordinado.realizarAccion(this);
		}
		else System.out.println("El coronel " + nombre + " no tiene autoridad sobre el teniente " + subordinado.getNombre());
	}

	public void darOrden(SoldadoRaso subordinado) {
		if (subordinado.getUnidad().equals(unidad)) {
			System.out.print("El coronel " + nombre + " da la orden a ");
			subordinado.realizarAccion(this);
		}
		else System.out.println("El coronel " + nombre + " no tiene autoridad sobre el soldado raso " + subordinado.getNombre());
	}

	public String getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(String estrategia) {
		this.estrategia = estrategia;
	}
}
