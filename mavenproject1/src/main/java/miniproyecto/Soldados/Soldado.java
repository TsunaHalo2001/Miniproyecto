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
	
	public String mostrarInformacion() {
		String info = "<html>" 
					+ "Nombre: " + this.nombre + "<br>"
					+ "ID: " 	 + this.id	  + "<br>"
					+ "Rango: "  + this.rango  + "<br>"
					+ "Nivel: "  + this.nivel  + "<br>"
					+ "Unidad: " + this.unidad + "<br>"
					+ "</html>";

		return info;
	}

	public String patrullar() {
		return "El soldado " + this.nombre + " est? patrullando.";
	}

	public String saludar(Soldado soldado) {
		if(soldado.getNombre().charAt(0) == this.nombre.charAt(0)) {
			if(soldado.getNombre().charAt(soldado.getNombre().length()-1) == this.nombre.charAt(this.nombre.length()-1)) {
				return "Hola " + soldado.getNombre() + ", nuestros nombres son mellizos porque no alcanzaron a ser gemelos.";
			}
		}
		return "Hola " + soldado.getNombre() + ", soy " + this.nombre + ".";
	}

	public String reganiado (Soldado soldado) {
		if (this.nivel < soldado.getNivel()) return "El soldado " + this.nombre + " no puede ser reganiado por " + soldado.getNombre();
		else {
			this.nivel = this.nivel + 1;

			switch (this.nivel) {
				case 1:
					this.rango = RangoEnum.Coronel;
					break;
				case 2:
					this.rango = RangoEnum.Capitan;
					break;
				case 3:
					this.rango = RangoEnum.Teniente;
					break;
				case 4:
					this.rango = RangoEnum.Soldado_Raso;
					break;
				default:
					this.rango = RangoEnum.Soldado_Raso;
					break;
			}
			return "El soldado " + this.nombre + " ha sido reganiado por " + soldado.getNombre() + " y ahora es " + this.rango;
		}
	}

	@Override
	public String realizarAccion() {
		return "Soldado fuera de jerarqu?a";
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return this.id;
	}

	public String getRango() {
		return this.rango.toString();
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
		return this.nivel;
	}

	public String getUnidad() {
		return this.unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public int getContSoldado() {
		return this.contSoldado;
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