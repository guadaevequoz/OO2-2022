package tp5.ej1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpOOtifyTest {
	
	SpOOtify sys;
	List<Song> containsTitle;
	List<Song> containsAuthor;
	List<Song> containsAlbum;
	User u;
	Song s1;
	Song s2;
	Song s3;
	Song s4;
	Song s5;
	Author taylor1; Author taylor2; Author id;
	Album a1; Album a2; Album a3;
	
	@BeforeEach
	void setUp() {
		sys = new SpOOtify();
		u = new User("Guada");
		containsTitle = new ArrayList<Song>();
		containsAuthor = new ArrayList<Song>();
		containsAlbum = new ArrayList<Song>();
		
		s1 = new Song("Wildest Dreams");
		s2 = new Song("Daydreaming");
		s3 = new Song("Dream");
		s4 = new Song("All too well");
		s5 = new Song("Part II");
		
		a1 = new Album("Lover");
		a2 = new Album("Paramore");
		a3 = new Album("Smoke+Love");
		
		taylor1 = new Author("Taylor Swift");
		taylor2 = new Author("taylor york");
		id = new Author("Imagine Dragons");
		
		a1.addSong(s1); a1.addSong(s4);
		a2.addSong(s2); a2.addSong(s5);
		a3.addSong(s3);
		
		taylor1.addAlbum(a1);
		taylor2.addAlbum(a2);
		id.addAlbum(a3);
		
		sys.addAuthor(taylor1); sys.addAuthor(taylor2); sys.addAuthor(id);
		sys.addUser(u);
	}
	
	@Test
	void testSearchByTitle() {
		assertTrue(sys.searchByTitle("dream").contains(s1));
		assertTrue(sys.searchByTitle("drEam").contains(s2));
		assertTrue(sys.searchByTitle("Dream").contains(s3));
	}
	
	@Test
	void testSearchByAuthor() {
		assertTrue(sys.searchByAuthor("tayLor").contains(s5));
	}
	
	@Test
	void testSearchByAlbum() {
		assertTrue(sys.searchByAlbum("Love").contains(s3));
	}
	
	@Test
	void testMyList() {
		u.addSong(s1);
		assertTrue(u.getMyList().contains(s1));
		u.removeSong(s1);
		assertFalse(u.getMyList().contains(s1));
	}

}
