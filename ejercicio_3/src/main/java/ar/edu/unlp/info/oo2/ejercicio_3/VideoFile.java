package ar.edu.unlp.info.oo2.ejercicio_3;

public class VideoFile extends Media{

	public VideoFile(String name) {
		super(name);
	}

	@Override
	public String play() {
		return "Reproduciendo" + super.getName();
	}

}
