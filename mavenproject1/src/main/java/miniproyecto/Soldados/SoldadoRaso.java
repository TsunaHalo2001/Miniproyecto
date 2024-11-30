package miniproyecto.Soldados;

import miniproyecto.Enum.RangoEnum;
import miniproyecto.Interfaces.Subordinados;

public class SoldadoRaso extends Soldado implements Subordinados {

	public SoldadoRaso(String nombre, String id, String unidad) {
		super(nombre, id, RangoEnum.Soldado_Raso, unidad);
	}

	@Override
	public String realizarAccion() {
		return "<br>El soldado raso " + this.nombre + " sigue las ordenes de ";
	}
	
	@Override
	public String realizarAccion(Soldado superior) {
		return realizarAccion() + superior.getNombre();
	}

	@Override
	public String patrullar() {
		return "El soldado raso " + this.nombre + " est? patrullando.";
	}
}