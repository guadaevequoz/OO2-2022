package tp7.ej3;

public class Conformado extends Estado{

	public Conformado(Proyecto p) {
		super(p);
	}

	@Override
	public void cancelar() {
		throw new RuntimeException("No se puede cancelar un proyecto ya conformado.");
		
	}

	@Override
	protected void invertir(double monto) {
		this.p.setMonto(this.p.getMonto() + monto);	
	}

}
