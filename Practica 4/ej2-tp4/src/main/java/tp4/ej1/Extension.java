package tp4.ej1;

public class Extension extends Decorator{
	
	public Extension(File f) {
		super(f);
	}
	
	@Override
	public String prettyPrint() {
		return this.getFile().getExtension() +" - " + this.getFile().prettyPrint();
	}
}
