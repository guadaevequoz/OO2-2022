package tp5.ej1;

import java.util.ArrayList;
import java.util.List;

public class User {
	private List<Song> myList;
	private String name;
	
	public User(String name) {
		this.name = name;
		this.myList = new ArrayList<Song>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Song> getMyList() {
		return myList;
	}
	
	public void addSong(Song song) {
		this.myList.add(song);
	}
	
	public void removeSong(Song song) {
		this.myList.remove(song);
	}
	
}
