package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada{

	public LlamadaInternacional(String tel, String tel2, int d) {
		super(tel, tel2, d);
	}

	@Override
	public double getCosto() {
		return this.dur *200 + (this.dur*200*0.21);
	}
}
