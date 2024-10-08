public class Soldado extends Rango{
	protected String nombre;
	protected String id;

	public Soldado(String nombre, String id, RangoEnum rango) {
		super(rango);
		this.nombre = nombre;
		this.id = id;
	}

	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("ID: " + id);
		System.out.println("Rango: " + rango);
		System.out.println("Nivel: " + nivel);
	}

	@Override
	public void realizarAccion() {
		System.out.println("Soldado fuera de jerarqu?a");
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
}