public class Capitan extends Soldado{
	protected int cantidadSoldadosBajoSuMando;

	public Capitan(String nombre, String id, int cantidadSoldadosBajoSuMando) {
		super(nombre, id, RangoEnum.Capitan);
		this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
	}

	@Override
	public void realizarAccion() {
		System.out.println("Supervisar tenientes");
	}

	public int getCantidadSoldadosBajoSuMando() {
		return cantidadSoldadosBajoSuMando;
	}

	public void setCantidadSoldadosBajoSuMando(int cantidadSoldadosBajoSuMando) {
		this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
	}
}
