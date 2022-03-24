/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	
	Usuario james;
	Usuario guido;
	Twitter twitter;
	Tweet tj1;
	Tweet tj2;
	Tweet tg1;
	Tweet tg2;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Usuario("jxmes", "James","james@mail.com");
		guido = new Usuario("guido.van","Guido", "guido@gmail.com");
		twitter = new Twitter();
		twitter.agregarUsuario(guido);
		twitter.agregarUsuario(james);
		tj1 = james.postear("Este tweet es de James");
		tj2 = james.postear(""); //esto no va a twittear nada
		tg1 = guido.postear("Este tweet es de Guido");
		tg2 = guido.postear("Este tweet también es de Guido");
	}
	
    @Test
    public void testUsuarios() {
        assertTrue(twitter.getUsuarios().contains(guido));
        assertTrue(twitter.getUsuarios().contains(james));
    }
    

    public void testTwittear() {
    	assertFalse(james.getTweets().contains(tj2));
    	assertTrue(james.getTweets().contains(tj1));
    	
    	assertTrue(guido.getTweets().contains(tg1));
    	assertTrue(guido.getTweets().contains(tg2));
    }
    
    
    public void testEliminarUsuario() {
    	twitter.eliminarUsuario(james);
    	assertFalse(twitter.getUsuarios().contains(james));
    	assertEquals(james.getTweets(), null);
    }
    
    public void testTweets() {
    	assertEquals(tj1.getScreenName(),james.getScreenName());
    	assertEquals(tg1.getScreenName(),guido.getScreenName());
    }
    
    public void testRetweet() {
    	assertEquals(james.retweet(tg1), tg1);
    }
    
}
