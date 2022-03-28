package ar.edu.unlp.info.oo2.ejercicio_3;

public abstract class Media {
	private String name;
	
	public Media(String name) {
		this.name = name;
	}
	
	public abstract String play();
	
	public String getName() {
		return this.name;
	}
}
