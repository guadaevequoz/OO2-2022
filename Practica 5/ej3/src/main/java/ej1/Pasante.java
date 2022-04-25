package ej1;

public class Pasante extends Empleado{

	@Override
	public double calcularExtra() {
		return super.sueldo() - (this.sueldoBasico * 0.13);
	}

}
