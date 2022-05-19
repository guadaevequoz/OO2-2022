package tp6.ej2_composicion;

public class SolarWithBattery extends EnergySource{
	

	@Override
	void consume(Robot r) {
		r.setEnergy(r.getEnergy() - 10);
	}

}
