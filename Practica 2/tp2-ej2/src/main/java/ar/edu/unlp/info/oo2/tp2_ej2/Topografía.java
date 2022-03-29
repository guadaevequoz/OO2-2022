package ar.edu.unlp.info.oo2.tp2_ej2;

public abstract class Topografía {
	private double proporcion;

	public double getProporcion() {
		return proporcion;
	}

	public Topografía(double proporcion) {
		this.proporcion = proporcion;
	}

	protected abstract Object getTopografias();
	
	
}
