public class Soldado extends Rango implements OperacionesMilitares{
	private static int contadorSoldado = 0 ; 
	protected String nombre;
	protected final String id;

	public Soldado(String nombre, String id, RangoEnum rango) {
		super(rango);
		this.nombre = nombre;
		this.id = id;
		contadorSoldado++;
	}

	public static int getContadorSoldados() {
        return contadorSoldado;
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

	@Override
	public void asignarMision(String mision) {
		
		String nombre = getNombre();
		String rango = getRango();
		System.out.println(rango +" "+ nombre + " Se le a asignado " + mision);	
	}

	@Override
	public void reportarEstadoMision(EstadoEnum estadoMision) {

		switch (estadoMision) {
			case Comenzada:
			System.out.println("Mision comenzada.");
				break;

			case En_Proceso:
			System.out.println("Mision en proceso.");
				break;

			case Terminada:
				System.out.println("la mision a sido finalizada.");
				break;

			default:
				System.out.println("No hay mision que reportar");
				break;
		}


	}

	@Override
	public void reportarEstado(int nivel) {
		nivel = getNivel();
		if (nivel < 4){
			System.out.println("dando informacion del soldado.");
		}
		else{
			System.out.println("no tienes el nivel suficiente para reportar.");
		}



	}
	

}