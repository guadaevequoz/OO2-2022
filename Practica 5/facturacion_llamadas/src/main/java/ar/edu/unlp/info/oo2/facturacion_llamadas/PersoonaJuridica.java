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
	protected double calcularMontoTotalLlamadas() {
		double c = this.llamadas.stream()
				.mapToDouble(l -> l.getCosto())
				.sum();
		return c - (c * 0.15);
	}
}
