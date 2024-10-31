package Soldados;

import Enum.RangoEnum;
import Interfaces.Subordinados;

public class Teniente extends Soldado implements Subordinados {

	public Teniente(String nombre, String id, String unidad) {
		super(nombre, id, RangoEnum.Teniente, unidad);
	}

	@Override
	public void realizarAccion() {
		System.out.print("El teniente " + nombre + " sigue las ordenes de ");
	}

	@Override
	public void realizarAccion(Soldado superior) {
		realizarAccion();
		System.out.println(superior.getNombre());
	}

	public void darOrden(SoldadoRaso subordinado) {
		if (subordinado.getUnidad().equals(unidad)) {
			System.out.print("El teniente " + nombre + " da la orden a ");
			subordinado.realizarAccion(this);
		}
		else System.out.println("El teniente " + nombre + " no tiene autoridad sobre el soldado raso " + subordinado.getNombre());
	}
}
