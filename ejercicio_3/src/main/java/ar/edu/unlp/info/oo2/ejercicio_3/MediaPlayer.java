package ar.edu.unlp.info.oo2.ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

	private List<Media> medias;
	

	public MediaPlayer() {
		this.medias = new ArrayList<Media>();
	}
	
	public void agregarMedia(Media media) {
		medias.add(media);
	}
	
	public List<Media> getMedias() {
		return this.medias;
	}
	
	public String playFirst() {
		String play = medias.get(0).play();
		medias.remove(0);
		return play;
	}

}
