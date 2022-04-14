package tp4.ej1;

public class Permisos extends Decorator{
	public Permisos(File f) {
		super(f);
	}
	
	@Override
	public String prettyPrint() {
		return this.getFile().getPermisos() + " - " + this.getFile().prettyPrint();
	}
}
