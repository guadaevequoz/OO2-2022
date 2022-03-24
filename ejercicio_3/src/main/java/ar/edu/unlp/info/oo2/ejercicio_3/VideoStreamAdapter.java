package ar.edu.unlp.info.oo2.ejercicio_3;

public class VideoStreamAdapter extends Media{
	private VideoStream adaptee = new VideoStream();
	
	public VideoStreamAdapter(String name) {
		super(name);
	}

	public String play() {
		return (adaptee.reproduce());
	}
}
