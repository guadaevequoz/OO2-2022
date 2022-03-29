package ar.edu.unlp.info.oo2.objetos_dos;

public class Agua extends Topografía{
	
	public Agua(int proporcion) {
		super(proporcion);
	}
	
	public double getProporcion() {
		return super.getProporcion();
	}

	@Override
	protected Object getTopografias() {
		return this;
	}


}
