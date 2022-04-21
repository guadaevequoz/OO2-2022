package tp5.ej1;

import java.util.ArrayList;
import java.util.List;

public class Author {
	private List<Album> albums;
	private String name;
	
	public Author(String name) {
		this.name = name.toUpperCase();
		this.albums = new ArrayList<Album>();
	}
	
	public String getName() {
		return name.toUpperCase();
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Album> getAlbums() {
		return albums;
	}
	
	public List<Song> getSongs(){
		List<Song> songs = new ArrayList<Song>();
		
		this.getAlbums().stream().forEach(a -> songs.addAll(a.getSongs()));
		return songs;
	}
	
	public void addAlbum(Album album) {
		this.albums.add(album);
	}
}
