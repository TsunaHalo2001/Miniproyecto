public class Soldado {
	private String nombre;
	private String id;
	private String rango;

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
}