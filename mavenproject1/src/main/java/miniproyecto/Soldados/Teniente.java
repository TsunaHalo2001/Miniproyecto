package miniproyecto.Soldados;

import miniproyecto.Enum.RangoEnum;
import miniproyecto.Interfaces.Subordinados;

public class Teniente extends Soldado implements Subordinados {

	public Teniente(String nombre, String id, String unidad) {
		super(nombre, id, RangoEnum.Teniente, unidad);
	}

	@Override
	public String realizarAccion() {
		return "El teniente " + nombre + " sigue las ordenes de ";
	}

	@Override
	public String realizarAccion(Soldado superior) {
		return realizarAccion() + superior.getNombre();
	}

	public String darOrden(SoldadoRaso subordinado) {
		if (subordinado.getUnidad().equals(unidad)) return "El teniente " + this.nombre + " da la orden a " + subordinado.getNombre() + subordinado.realizarAccion(this);
		else return "El teniente " + this.nombre + " no tiene autoridad sobre el soldado raso " + subordinado.getNombre();
	}
}
