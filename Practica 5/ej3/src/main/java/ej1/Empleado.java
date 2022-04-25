package ej1;

public abstract class Empleado {
	protected String nombre;
	protected String apellido;
	protected double sueldoBasico = 0;
	
	public double sueldo() {
		return this.sueldoBasico;
	}
	
	public abstract double calcularExtra();
}
