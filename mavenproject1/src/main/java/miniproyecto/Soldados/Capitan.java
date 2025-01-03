package miniproyecto.Soldados;

import miniproyecto.Enum.RangoEnum;
import miniproyecto.Interfaces.Subordinados;

public class Capitan extends Soldado implements Subordinados {
	protected int cantidadSoldadosBajoSuMando;

	public Capitan(String nombre, String id, String unidad, int cantidadSoldadosBajoSuMando) {
		super(nombre, id, RangoEnum.Capitan, unidad);
		this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
	}

	@Override
	public String realizarAccion() {
		return "<br>El capitan " + nombre + " sigue las ordenes de ";
	}

	@Override
	public String realizarAccion(Soldado superior) {
		return realizarAccion() + superior.getNombre();
	}

	@Override
	public String patrullar() {
		return "El capitan " + nombre + " est? liderando la patrulla.";
	}

	public String darOrden(SoldadoRaso subordinado) {
		if (subordinado.getUnidad().equals(unidad)) return "<html>El capitan " + nombre + " da la orden a " + subordinado.getNombre() + subordinado.realizarAccion(this) + "</html>";
		else return "El capitan " + nombre + " no tiene autoridad sobre el soldado raso " + subordinado.getNombre();
	}

	public String darOrden(Teniente subordinado) {
		if (subordinado.getUnidad().equals(unidad)) return "<html>El capitan " + nombre + " da la orden a " + subordinado.getNombre() + subordinado.realizarAccion(this) + "</html>";
		else return "El capitan " + nombre + " no tiene autoridad sobre el teniente " + subordinado.getNombre(); 
	}

	public int getCantidadSoldadosBajoSuMando() {
		return cantidadSoldadosBajoSuMando;
	}

	public void setCantidadSoldadosBajoSuMando(int cantidadSoldadosBajoSuMando) {
		this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
	}

}
