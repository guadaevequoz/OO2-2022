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
	
	Tierra t;
	Agua a;
	Mixta m1,m2,m3;
	
	@BeforeEach
	void setUp() throws Exception {
		t = new Tierra(0);
		a = new Agua(1);
		m1 = new Mixta();
		m2 = new Mixta();
		m3 = new Mixta();
		
		//topologia compuesta con topologias simples
		m1.agregarTopografia(t);
        m1.agregarTopografia(a);
        m1.agregarTopografia(t);
        m1.agregarTopografia(a);
        
        m3.agregarTopografia(t);
        m3.agregarTopografia(a);
        m3.agregarTopografia(t);
        m3.agregarTopografia(a);
        
      //topologia mixta con 3 simples y una mixta
        m2.agregarTopografia(t);
        m2.agregarTopografia(a);
        m2.agregarTopografia(t);
        m2.agregarTopografia(m1);
	}
    @Test
    public void testProporciones() throws Exception {
        
        assertEquals(1,a.getProporcion());
        assertEquals(0,t.getProporcion());
        assertEquals(0.5,m1.getProporcion());
        assertEquals((0.5+1)/4,m2.getProporcion());
    }
    
    @Test
    public void testIgualdad() {
    	assertFalse(m1.esIgualA(m2));
    	assertTrue(m1.esIgualA(m3));
    }
    
    
}
