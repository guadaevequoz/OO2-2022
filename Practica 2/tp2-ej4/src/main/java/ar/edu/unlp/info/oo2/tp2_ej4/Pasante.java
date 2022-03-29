package ar.edu.unlp.info.oo2.tp2_ej4;

public class Pasante extends Empleado{
	
	public Pasante() {
		this.setBásico(20000);
		this.setAdicional(2000);
		//this.setDescuento(this.getBásico()*0.13 + this.getAdicional()*0.05);
	}
}
