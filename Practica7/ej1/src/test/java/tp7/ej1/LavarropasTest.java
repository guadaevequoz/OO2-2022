/**
 * 
 */
package tp7.ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LavarropasTest {
	
	Lavarropas lavarropas;
	
	@BeforeEach
	void setUp() throws Exception {
		lavarropas = new Lavarropas();
	}
    @Test
    public void testLavadoDiario() {
    	lavarropas.setTipoLavado(new LavadoDiario());
    	assertTrue(lavarropas.lavado().contains("20"));
    }
}
