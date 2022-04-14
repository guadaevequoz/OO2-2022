package tp4.ej1;

public class Tamaño extends Decorator{
	public Tamaño(File f) {
		super(f);
	}
	
	@Override
	public String prettyPrint() {
		return this.getFile().getTamaño() + " - " + this.getFile().prettyPrint();
	}
}
