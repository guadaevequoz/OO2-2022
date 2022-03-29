package ar.edu.unlp.info.oo2.objetos_dos;

public abstract class Topografía {
	private int proporcion;

	public double getProporcion() {
		return proporcion;
	}

	public Topografía(int proporcion) {
		this.proporcion = proporcion;
	}

	protected abstract Object getTopografias();
	
	
}
