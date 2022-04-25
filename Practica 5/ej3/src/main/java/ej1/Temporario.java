package ej1;

public class Temporario extends Empleado{
	private double horasTrabajadas = 0;
	private int cantidadHijos = 0;
	
	@Override
	public double calcularExtra() {
		return super.sueldo() + (this.horasTrabajadas * 500) + (this.cantidadHijos * 1000) - (this.sueldoBasico * 0.13);
	}
}
