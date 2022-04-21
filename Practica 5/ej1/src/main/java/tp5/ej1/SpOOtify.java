package tp5.ej1;

import java.util.ArrayList;
import java.util.List;

public class SpOOtify {
	private List<Author> authors;
	private List<User> users;
	
	public SpOOtify() {
		this.authors = new ArrayList<Author>();
		this.users = new ArrayList<User>();
	}

	public List<Author> getAuthors() {
		return authors;
	}
	
	public List<User> getUsers() {
		return users;
	}
	
	public void addUser(User u) {
		this.users.add(u);
	}
	
	public void addAuthor(Author a) {
		this.authors.add(a);
	}
	
	public List<Song> searchByTitle(String title){
		String search = title.toUpperCase();
		List<Song> songs = new ArrayList<Song>();
		
		this.authors.stream().forEach(a -> songs.addAll(a.getSongs()));
		
		return songs.stream()
				.filter(a -> a.getTitle().contains(search))
				.toList();
	}
	
	public List<Song> searchByAuthor(String name){
		String search = name.toUpperCase();
		List<Song> songs = new ArrayList<Song>();
		
		this.getAuthors()
			.stream()
			.filter(a -> a.getName().contains(search))
			.forEach(a -> songs.addAll(a.getSongs()));
		
		return songs;
	}
	
	public List<Song> searchByAlbum(String title){
		String search = title.toUpperCase();
		List<Song> songs = new ArrayList<Song>();
		List<Album> albums = new ArrayList<Album>();
		
		this.authors.stream()
			.forEach(a -> albums.addAll(a.getAlbums()));
		
		albums.stream()
			.filter(a -> a.getTitle().contains(search))
			.forEach(a -> songs.addAll(a.getSongs()));
		
		return songs;
	}

	
}
