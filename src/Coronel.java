public class Coronel extends Soldado {
	protected String estrategia;

	public Coronel(String nombre, String id, String estrategia) {
		super(nombre, id, RangoEnum.Coronel);

		this.estrategia = estrategia;
	}
	
	@Override
	public void realizarAccion() {
		System.out.println("Planificar estrategias");
	}

}
