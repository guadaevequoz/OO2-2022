package tp4.ej1;

public class Nombre extends Decorator{
	
	public Nombre(File f) {
		super(f);
	}
	
	@Override
	public String prettyPrint() {
		return this.getFile().getNombre() +" - " + this.getFile().prettyPrint();
	}

}
