package tp6.ej2_composicion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestComposicion {
	
	Robot r;
	Overcraft ov;
	Traction4x4 t4;
	BombSystem bomb;
	NuclearReactor nr;
	SolarWithBattery sb;
	@BeforeEach
	void setUp() throws Exception {
		 ov = new Overcraft();
		 t4 = new Traction4x4();
		 bomb = new BombSystem();
		 nr = new NuclearReactor();
		 sb = new SolarWithBattery();
	}

	@Test
	void test4x4() {
		r = new Robot(t4,bomb,sb);
		r.step();
		assertTrue(r.getEnergy() == 190);
	}
	
	@Test
	void testOvercraft() {
		r = new Robot(ov,bomb,nr);
		r.step();
		assertTrue(r.getEnergy() == 180);
	}

}
