package tp6.ej2_composicion;

public class Robot {
	private int energy = 200;
	private LocomotionSystem locomotionSys;
	private ArmsSystem armsSystem;
	private EnergySource energySource;
	
	public Robot(LocomotionSystem loc, ArmsSystem arms, EnergySource batt) {
		this.armsSystem = arms;
		this.locomotionSys = loc;
		this.energySource = batt;
	}
	
	public Robot() {
		
	}
	
	public void step() {
		locomotionSys.move(this);
		energySource.consume(this);
		armsSystem.fire(this);
		this.collectArtifacts();
	}
	
	
	private void collectArtifacts() {
		System.out.println(" y colecto artefactos.");
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
}
