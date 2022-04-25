package ej5;

public class Direccion {
	 //...
	public String getDireccionFormateada() {
		return 
				this.getLocalidad() + ", " +
				this.getCalle() + "," +
				this.getNumero() + "," +
				this.getDepartamento()
		      ;
	}
}
