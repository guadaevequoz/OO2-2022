package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersoonaJuridica extends Persoona{
	public String cuit;
	
	public PersoonaJuridica(String nombre, String numeroTelefono, String data) {
		super(nombre, numeroTelefono);
		this.setCuit(data);
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	@Override
	public double calcularDescuento(double costo) {
		return 0.15 * costo;
	}
}
