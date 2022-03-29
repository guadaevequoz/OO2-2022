package ar.edu.unlp.info.oo2.tp2_ej4;

public class Planta extends Empleado{
	public Planta(boolean casado, int cantHijos, int antiguedad) {
		int ad = 0;
		this.setBásico(50000);
		if(casado) ad += 5000;
		this.setAdicional(ad + 2000 * cantHijos + 2000 * antiguedad);
	}
}
