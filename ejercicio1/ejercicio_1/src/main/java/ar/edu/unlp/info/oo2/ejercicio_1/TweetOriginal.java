package ar.edu.unlp.info.oo2.ejercicio_1;

public class TweetOriginal extends Tweet{
	
	private String screenName;
	private String texto;
	
	public TweetOriginal(String screenName, String texto) throws Exception {
		super();
		
		if (texto == null || texto.isEmpty() || texto.length() > 140) {
			throw new Exception("Texto incorrecto");
		}

		this.texto = texto;
	}
	

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
}
