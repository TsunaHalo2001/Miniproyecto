package miniproyecto.Soldados;

import miniproyecto.Enum.RangoEnum;

public class Coronel extends Soldado {
	protected String estrategia;

	public Coronel(String nombre, String id, String unidad, String estrategia) {
		super(nombre, id, RangoEnum.Coronel, unidad);
		this.estrategia = estrategia;
	}
	
	@Override
	public String realizarAccion() {
		return "El coronel " + nombre + " implementa la estrategia " + estrategia;
	}

	@Override
	public String patrullar() {
		return "El coronel " + nombre + " est? asegurando la zona.";
	}

	public String darOrden(Capitan subordinado) {
		if (subordinado.getUnidad().equals(unidad)) return "<html>El coronel " + this.nombre + " da la orden a " + subordinado.getNombre() + subordinado.realizarAccion(this) + "</html>";
		else return "El coronel " + this.nombre + " no tiene autoridad sobre el capitan " + subordinado.getNombre();
	}

	public String darOrden(Teniente subordinado) {
		if (subordinado.getUnidad().equals(unidad)) return "<html>El coronel " + this.nombre + " da la orden a " + subordinado.getNombre() + subordinado.realizarAccion(this) + "</html>";
		else return "El coronel " + this.nombre + " no tiene autoridad sobre el teniente " + subordinado.getNombre();
	}

	public String darOrden(SoldadoRaso subordinado) {
		if (subordinado.getUnidad().equals(unidad)) return "<html>El coronel " + this.nombre + " da la orden a " + subordinado.getNombre() + subordinado.realizarAccion(this) + "</html>";
		else return "El coronel " + this.nombre + " no tiene autoridad sobre el soldado raso " + subordinado.getNombre();
	}

	public String getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(String estrategia) {
		this.estrategia = estrategia;
	}
}
