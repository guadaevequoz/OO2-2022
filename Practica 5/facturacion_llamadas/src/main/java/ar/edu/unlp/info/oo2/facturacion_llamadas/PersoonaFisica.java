package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersoonaFisica extends Persoona{

	public String dni;
	
	public PersoonaFisica(String nombre, String numeroTelefono, String data) {
		super(nombre, numeroTelefono);
		this.setDoc(data);
	}
	public String getDoc() {
		return dni;
	}
	public void setDoc(String doc) {
		this.dni = doc;
	}
	
	@Override
	public double calcularDescuento(double costo) {
		return 0 * costo;
	}
}
