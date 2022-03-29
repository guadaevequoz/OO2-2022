package ar.edu.unlp.info.oo2.tp2_ej2;

public class Tierra extends Topografía{

	public Tierra(int proporcion) {
		super(proporcion);
	}
	
	public double  getProporcion() {
		return super.getProporcion();
	}

	@Override
	protected Object getTopografias() {
		return this;
	}


}
