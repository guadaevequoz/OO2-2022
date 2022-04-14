package tp4.ej1;

public class FechaCreacion extends Decorator{
	
	public FechaCreacion(File f) {
		super(f);
	}
	
	@Override
	public String prettyPrint() {
		return this.getFile().getFechaCreacion() +" - " + this.getFile().prettyPrint();
	}
}
