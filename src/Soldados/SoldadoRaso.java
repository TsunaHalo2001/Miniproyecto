package Soldados;

import Enum.RangoEnum;
import Interfaces.Subordinados;

public class SoldadoRaso extends Soldado implements Subordinados {

	public SoldadoRaso(String nombre, String id, String unidad) {
		super(nombre, id, RangoEnum.Soldado_Raso, unidad);
	}

	@Override
	public void realizarAccion() {
		System.out.print("El soldado raso " + nombre + " sigue las ordenes de ");
	}
	
	public void realizarAccion(Soldado superior) {
		realizarAccion();
		System.out.println(superior.getNombre());
	}
	
}