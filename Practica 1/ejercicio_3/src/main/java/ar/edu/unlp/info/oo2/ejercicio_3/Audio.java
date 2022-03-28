package ar.edu.unlp.info.oo2.ejercicio_3;

public class Audio extends Media{
	
	
	public Audio(String name) {
		super(name);
	}

	@Override
	public String play() {
		return "Reproduciendo" + super.getName();
		
	}
	
}
