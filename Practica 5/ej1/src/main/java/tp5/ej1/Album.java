package tp5.ej1;

import java.util.ArrayList;
import java.util.List;

public class Album {
	private List<Song> songs;
	private String title;
	
	public Album(String title) {
		this.title = title;
		songs = new ArrayList<Song>();
	}
	
	public String getTitle() {
		return title.toUpperCase();
	}
	
	public void setTitle(String title) {
		this.title = title.toUpperCase();
	}
	
	public List<Song> getSongs() {
		return songs;
	}
	
	public void addSong(Song song) {
		this.songs.add(song);
	}
	
	
}
