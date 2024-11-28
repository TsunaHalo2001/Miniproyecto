package miniproyecto.Soldados;

import miniproyecto.Enum.EstadoEnum;
import miniproyecto.Enum.RangoEnum;
import miniproyecto.Interfaces.OperacionesMilitares;

public class Soldado extends Rango implements OperacionesMilitares{
	private static int contadorSoldado = 0 ;
	protected int contSoldado;
	protected String nombre;
	protected String unidad;
	protected final String id;

	public Soldado(String nombre, String id, RangoEnum rango, String unidad) {
		super(rango);
		this.nombre = nombre;
		this.id = id;
		this.unidad = unidad;
		contadorSoldado++;
		this.contSoldado = contadorSoldado;
	}

	public static int getContadorSoldados() {
        return contadorSoldado;
    }
	
	public String[] mostrarInformacion() {
		String[] info = new String[5];
		info[0] = "Nombre: " + nombre;
		info[1] = "ID: " + id;
		info[2] = "Rango: " + rango;
		info[3] = "Nivel: " + nivel;
		info[4] = "Unidad: " + unidad;

		return info;
	}

	public String patrullar() {
		return "El soldado " + nombre + " est? patrullando.";
	}

	public String saludar(Soldado soldado) {
		return "El soldado " + nombre + " saluda al soldado " + soldado.nombre + ".";
	}

	public String reganiado (Soldado soldado) {
		return "El soldado " + nombre + " ha sido reganiado por el soldado " + soldado.nombre + ".";
	}

	@Override
	public String realizarAccion() {
		return "Soldado fuera de jerarqu?a";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public String getRango() {
		return rango.toString();
	}

	public void setRango(RangoEnum rango) {
		this.rango = rango;
		switch (rango) {
			case Soldado_Raso:
				this.nivel = 4;
				break;
			case Teniente:
				this.nivel = 3;
				break;
			case Capitan:
				this.nivel = 2;
				break;
			case Coronel:
				this.nivel = 1;
				break;
			default:
				this.nivel = 0;
				break;
		}
	}

	public int getNivel() {
		return nivel;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public int getContSoldado() {
		return contSoldado;
	}

	public void setContSoldado(int contSoldado) {
		this.contSoldado = contSoldado;
	}

	public static void resetear() {
		contadorSoldado = 0;
	}

	public static void setContSoldiers(int contSoldado) {
		Soldado.contadorSoldado = contSoldado;
	}

	@Override
	public String asignarMision(String mision) {
		
		return this.rango +" "+ this.nombre + " Se le a asignado " + mision;
	}

	@Override
	public String reportarEstadoMision(EstadoEnum estadoMision) {

		switch (estadoMision) {
			case Comenzada:
				return "Mision comenzada.";

			case En_Proceso:
				return "Mision en proceso.";

			case Terminada:
				return "Mision terminada.";

			default:
				return "No hay mision que reportar.";
		}
	}

	@Override
	public String reportarEstado(int nivel) {
		if (nivel < 4) return "dando informacion del soldado.";
		else return "no tienes el nivel suficiente para reportar.";
	}
}