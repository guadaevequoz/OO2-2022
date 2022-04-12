package ar.edu.unlp.info.oo2.tp3_ej3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DispositivoTest {
	
	Dispositivo d;
	
	@BeforeEach
	void setUp() {
		this.d = new Dispositivo();
	}
	
	@Test
	void testSend() {
		assertEquals("test8134", d.send("test"));
	}
	
	@Test
	void testConectarCon() {
		assertEquals("4G",d.conectarCon(new Adapter4G()));
		assertEquals("Wifi",d.conectarCon(new WifiConn()));
	}
	
	@Test
	void testConfigurarCRC() {
		assertEquals("test8134",d.send("test")); // Mensaje usando CRC16
        d.configurarCRC(new CRC32_Calculator());
        assertEquals("test-1741497163",d.send("test")); // Mensaje usando CRC32
	}
	
}
