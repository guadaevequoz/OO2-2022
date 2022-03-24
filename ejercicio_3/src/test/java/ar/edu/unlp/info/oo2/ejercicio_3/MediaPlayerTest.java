/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MediaPlayerTest {
	
	MediaPlayer player;
	Audio audio;
	VideoFile video;
	VideoStreamAdapter videoStream;
	
	@BeforeEach
	void setUp() throws Exception {
		player = new MediaPlayer();
		audio = new Audio("Track 1");
		videoStream = new VideoStreamAdapter("Track VS");
	}
    @Test
    public void testMedia(){
    	player.agregarMedia(audio);
		
		// Verifico que carguen
		assertTrue(player.getMedias().contains(audio));
		
		// Verifico que se borren tras reproducirse
		assertFalse(player.getMedias().isEmpty());
    }
    
    @Test
	void testAdapter() {
		player.agregarMedia(videoStream);
		
		assertEquals("Reproduciendo VideoStream", player.playFirst());
	}
}
