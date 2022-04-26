package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	//protected String tipoDeLlamada;
	private String emisor;
	private String remitente;
	public int dur;
	
	public Llamada() {
		
	}
	public Llamada(/*String s,*/ String emisor, String remitente, int dur) {
		//this.tipoDeLlamada = s;
		this.emisor= emisor;
		this.remitente= remitente;
		this.dur = dur;
	}

	/*public String getTipoDeLlamada() {
		return tipoDeLlamada;
	}

	public void setTipoDeLlamada(String tipoDeLlamada) {
		this.tipoDeLlamada = tipoDeLlamada;
	}*/
	
	public String getEmisor() {
		return emisor;
	}
	
	public void setEmisor(String q) {
		emisor = q;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	
	public abstract double getCosto();
	
	
}
