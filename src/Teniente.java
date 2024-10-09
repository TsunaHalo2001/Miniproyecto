public class Teniente extends Soldado{
	protected String unidad;

	public Teniente(String nombre, String id, String unidad) {
		super(nombre, id, RangoEnum.Teniente);
		this.unidad = unidad;
	}

	@Override
	public void realizarAccion() {
		System.out.println("Supervisar soldados rasos");
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}


}
