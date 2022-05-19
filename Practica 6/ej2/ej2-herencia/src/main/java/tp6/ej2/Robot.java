package tp6.ej2;

public abstract class Robot {
	private int energy = 200;
	
	public Robot() {
	}
	
	public void step() {
		this.move();
		this.consumeBattery();
		this.fireArms();
		this.collectArtifacts();
	}
	
	abstract void move();
	abstract void consumeBattery();
	abstract void fireArms();
	
	private void collectArtifacts() {
		
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
}
