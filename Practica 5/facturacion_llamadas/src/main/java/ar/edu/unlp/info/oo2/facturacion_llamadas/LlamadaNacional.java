package ar.edu.unlp.info.oo2.facturacion_llamadas;


public class LlamadaNacional extends Llamada{
	static final double COSTO_SEGUNDO_NACIONAL = 3;
	public LlamadaNacional(String tel, String tel2, int d) {
		super(tel, tel2, d);
	}

	@Override
	public double base() {
		return  this.dur * COSTO_SEGUNDO_NACIONAL;
	}
	
	
}
