package tp7.ej3;

public class Cancelado extends Estado{

	public Cancelado(Proyecto p) {
		super(p);
	}

	@Override
	public void cancelar() {
		throw new RuntimeException("No puede cancelar un proyecto cancelado.");
	}

	@Override
	protected void invertir(double monto) {
		throw new RuntimeException("No puede invertir en un proyecto cancelado.");	
	}

}
