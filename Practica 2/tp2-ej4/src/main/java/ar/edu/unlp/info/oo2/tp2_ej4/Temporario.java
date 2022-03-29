package ar.edu.unlp.info.oo2.tp2_ej4;

public class Temporario extends Empleado{
	
	public Temporario(int cantHorasTrabajadas, boolean casado, int cantHijos) {
		int ad = 0;
		this.setBásico(20000 + cantHorasTrabajadas * 300);
		if(casado) ad += 5000;
		this.setAdicional(ad + cantHijos*2000);
		//this.setDescuento(this.getBásico()*0.13 + this.getAdicional()*0.05);
	}
	
}
