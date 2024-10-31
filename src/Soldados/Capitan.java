package Soldados;

import Enum.RangoEnum;
import Interfaces.Subordinados;

public class Capitan extends Soldado implements Subordinados {
	protected int cantidadSoldadosBajoSuMando;

	public Capitan(String nombre, String id, String unidad, int cantidadSoldadosBajoSuMando) {
		super(nombre, id, RangoEnum.Capitan, unidad);
		this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
	}

	@Override
	public void realizarAccion() {
		System.out.print("El capitan " + nombre + " sigue las ordenes de ");
	}

	@Override
	public void realizarAccion(Soldado superior) {
		realizarAccion();
		System.out.println(superior.getNombre());
	}

	public void darOrden(SoldadoRaso subordinado) {
		if (subordinado.getUnidad().equals(unidad)) {
			System.out.print("El capitan " + nombre + " da la orden a ");
			subordinado.realizarAccion(this);
		}
		else System.out.println("El capitan " + nombre + " no tiene autoridad sobre el soldado raso " + subordinado.getNombre());
	}

	public void darOrden(Teniente subordinado) {
		if (subordinado.getUnidad().equals(unidad)) {
			System.out.print("El capitan " + nombre + " da la orden a ");
			subordinado.realizarAccion(this);
		}
		else System.out.println("El capitan " + nombre + " no tiene autoridad sobre el teniente " + subordinado.getNombre());
	}

	public int getCantidadSoldadosBajoSuMando() {
		return cantidadSoldadosBajoSuMando;
	}

	public void setCantidadSoldadosBajoSuMando(int cantidadSoldadosBajoSuMando) {
		this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
	}

}
