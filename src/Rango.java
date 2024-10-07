public abstract class Rango {
	RangoEnum rango;
	protected int nivel;

	public Rango(RangoEnum rango) {
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

	abstract void realizarAccion();
}