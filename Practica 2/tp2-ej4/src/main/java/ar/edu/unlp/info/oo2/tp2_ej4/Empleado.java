package ar.edu.unlp.info.oo2.tp2_ej4;

public abstract class Empleado {
	private int básico;
	private int adicional;
	//private double descuento = ;
	

	public double sueldo() {
		return básico + adicional - (this.getBásico()*0.13 + this.getAdicional()*0.05);
	}


	public int getBásico() {
		return básico;
	}


	public void setBásico(int básico) {
		this.básico = básico;
	}


	public int getAdicional() {
		return adicional;
	}


	public void setAdicional(int adicional) {
		this.adicional = adicional;
	}

	/*
	public double getDescuento() {
		return descuento;
	}


	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	*/
	
	
}
