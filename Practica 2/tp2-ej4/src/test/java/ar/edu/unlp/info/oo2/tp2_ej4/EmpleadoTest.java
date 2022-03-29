package ar.edu.unlp.info.oo2.tp2_ej4;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	
	Temporario t1; //temporal casado con hijos
	Temporario t2; //temporal soltero con hijos
	Temporario t3; //temporal casado sin hijos
	Temporario t4; //temporal soltero sin hijos
	Pasante pa;
	Planta pl1; //planta casado con hijos
	Planta pl2; //planta soltero con hijos
	Planta pl3; //planta casado sin hijos
	Planta pl4; //planta soltero sin hijos
	
	@BeforeEach
	void setUp() throws Exception {
		//temporarios
		t1 = new Temporario(100,true,2);
		t2 = new Temporario(100,false,2);
		t3 = new Temporario(100,true,0);
		t4 = new Temporario(100,false,0);
		
		//pasante
		pa = new Pasante();
		
		//plantas
		pl1 = new Planta(true, 2, 5);
		pl2 = new Planta(false, 2, 5);
		pl3 = new Planta(true, 0, 5);
		pl4 = new Planta(false, 0, 5);
	}
	
    @Test
    public void testSueldos() throws Exception {
        assertEquals(52050, t1.sueldo()); 
        assertEquals(43500, t4.sueldo()); 
        
        assertEquals(19300, pa.sueldo()); 
        
        assertEquals(61550, pl1.sueldo()); 
        assertEquals(53000, pl4.sueldo()); 
    }
}
