package tp6.ej2;

public abstract class SolarEnergyRobot extends Robot{
	public void consumeBattery() {
		this.setEnergy(getEnergy()-10);
	}
}
