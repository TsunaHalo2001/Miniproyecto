public class Soldado {
	protected String nombre;
	protected String id;
	protected String rango;

	public Soldado(String nombre, String id, String rango) {
		this.nombre = nombre;
		this.id = id;
		this.rango = rango;
	}

	void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("ID: " + id);
		System.out.println("Rango: " + rango);
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

	public void setId(String id) {
		this.id = id;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}
}