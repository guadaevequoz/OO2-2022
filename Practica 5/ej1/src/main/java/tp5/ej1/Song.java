package tp5.ej1;

public class Song {
	private String title;
	
	public Song(String title) {
		this.setTitle(title.toUpperCase());
	}
	
	public String getTitle() {
		return title.toUpperCase();
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
