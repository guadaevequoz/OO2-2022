package tp7.ej3;

public class Creado extends Estado{

	public Creado(Proyecto p) {
		super(p);
	}

	@Override
	public void cancelar() {
		p.setEstado(new Cancelado(this.p));
	}

	@Override
	protected void invertir(double monto) {
		this.p.setMonto(this.p.getMonto() + monto);
		if(p.getMonto() == p.getMeta()) p.setEstado(new Conformado(this.p));
	}

}
