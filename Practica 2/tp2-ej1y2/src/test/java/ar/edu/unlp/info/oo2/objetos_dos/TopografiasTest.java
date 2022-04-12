/**
 * 
 */
package ar.edu.unlp.info.oo2.objetos_dos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiasTest {
	
	Topografía agua;
	Topografía tierra;
	Topografía mixta;
	Topografía pantano;
	
	@BeforeEach
	void setUp() throws Exception {
		agua = new Agua();
		tierra = new Tierra();
		mixta = new Mixta(new Agua(), new Tierra(), new Agua(), new Tierra());
		pantano = new Pantano();
	}
    
	@Test
    public void testAgua(){
    	assertTrue(agua.equals(new Agua()));
    	assertFalse(agua.equals(tierra));
    	assertFalse(agua.equals(mixta));
    	assertEquals(1, agua.calcularProporcionAgua());
	}
	
	@Test
	public void testPantano() {
		assertTrue(pantano.equals(new Pantano()));
		assertFalse(pantano.equals(agua));
		assertFalse(pantano.equals(tierra));
		assertFalse(pantano.equals(mixta));
		
		assertEquals(0.7, pantano.calcularProporcionAgua());
	}
	
	@Test
    public void testTierra(){
    	assertTrue(tierra.equals(new Tierra()));
    	assertFalse(tierra.equals(agua));
    	assertFalse(tierra.equals(mixta));
    	assertEquals(0, tierra.calcularProporcionAgua());
	}
    
	@Test
	public void testMixta() {
    	assertTrue(mixta.equals(new Mixta(new Agua(), new Tierra(), new Agua(), new Tierra())));
    	assertTrue(mixta.equals(mixta));
    	assertFalse(mixta.equals(new Mixta(new Tierra(), new Tierra(), new Agua(), new Tierra())));
    	Topografía mixta2 = new Mixta(new Agua(), new Agua(), new Tierra(), new Tierra());
    	assertFalse(mixta.equals(new Mixta(mixta2, new Agua(), new Tierra(), new Tierra())));
    	assertFalse(mixta.equals(tierra));
    	assertFalse(mixta.equals(agua));
    	assertEquals( (0.5) , mixta.calcularProporcionAgua());
	}
	
}