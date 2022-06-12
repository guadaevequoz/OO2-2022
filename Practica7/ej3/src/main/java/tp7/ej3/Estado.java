package tp7.ej3;

public abstract class Estado {
	protected Proyecto p;
	public Estado(Proyecto p) {
		this.p = p;
	}
	
	public abstract void cancelar();

	protected abstract void invertir(double monto);
}
