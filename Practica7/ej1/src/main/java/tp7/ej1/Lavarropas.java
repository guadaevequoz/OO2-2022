package tp7.ej1;

public class Lavarropas {
	private LavadoStrategy tipoLavado;

	public LavadoStrategy getTipoLavado() {
		return tipoLavado;
	}

	public void setTipoLavado(LavadoStrategy tipoLavado) {
		this.tipoLavado = tipoLavado;
	}
	
	public void agregarAgua(int porcentaje) {}
	public void agregarJabonEnPolvo() {}
	public void lavar(int minutos) {}
	public void vaciarAgua() {}
	public void agregarEnjuague() {}
	public void enjuaga(int minutos) {}
	public void centrifugar(int minutos) {}
	
	public void lavado1(int minutos) {
		this.agregarJabonEnPolvo();
		this.lavar(minutos);
		this.vaciarAgua();
	}
	
	public void lavado2(int minutosE,int minutosC) {
		this.agregarEnjuague();
		this.enjuaga(minutosE);
		this.centrifugar(minutosC);
	}
	
	public void lavado() {
		this.tipoLavado.lavado(this);
	}
	

	
}
