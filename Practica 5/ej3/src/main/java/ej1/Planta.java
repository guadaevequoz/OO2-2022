package ej1;

public class Planta extends Empleado{
    private int cantidadHijos = 0;

	@Override
	public double calcularExtra() {
		return super.sueldo() + (this.cantidadHijos * 2000) - (this.sueldoBasico * 0.13);
	}

}
