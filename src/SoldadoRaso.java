public class SoldadoRaso extends Soldado {
	public SoldadoRaso(String nombre, String id) {
		super(nombre, id, RangoEnum.Soldado_Raso);
	}

	@Override
	public void realizarAccion() {
		System.out.println("Seguir ordenes de sus superiores");
	}
	

}