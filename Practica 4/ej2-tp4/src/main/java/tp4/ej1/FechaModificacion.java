package tp4.ej1;

public class FechaModificacion extends Decorator{
	public FechaModificacion(File f) {
		super(f);
	}
	
	@Override
	public String prettyPrint() {
		return this.getFile().getFechaModificacion() +" - " + this.getFile().prettyPrint();
	}
}
