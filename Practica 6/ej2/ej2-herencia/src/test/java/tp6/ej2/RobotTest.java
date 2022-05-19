package tp6.ej2;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RobotTest {
	
	Robot r1;
	Robot r2;
	
	@BeforeEach
	void setUp() throws Exception {
		r1 = new SolarEnergyOvercraftRobotWithBombs();
		r2 = new SolarEnergyCaterpilarRobotWithBombs();
	}

	@Test
	void test() {
		r1.step();
		r2.step();
	}
	

}
