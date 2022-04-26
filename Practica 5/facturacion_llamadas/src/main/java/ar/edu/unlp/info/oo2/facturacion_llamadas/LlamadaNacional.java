package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada{

	public LlamadaNacional(String tel, String tel2, int d) {
		super(tel, tel2, d);
	}

	@Override
	public double getCosto() {
		return  this.dur *3 + (this.dur*3*0.21);
	}
	
	
}
