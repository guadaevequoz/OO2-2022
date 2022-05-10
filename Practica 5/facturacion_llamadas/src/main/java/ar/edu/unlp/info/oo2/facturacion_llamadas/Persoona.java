package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Persoona {
	public List<Llamada> llamadas = new ArrayList<Llamada>();
	public String nombre;
	public String tel;
	
	protected Persoona(String nombre, String numeroTelefono) {
		this.setNya(nombre);
		this.setTel(numeroTelefono);
	}
	
	public List<Llamada> getLista1() {
		return llamadas;
	}
	public void setLista1(List<Llamada> lista1) {
		this.llamadas = lista1;
	}
	
	public String getNya() {
		return nombre;
	}
	public void setNya(String nya) {
		this.nombre = nya;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	protected void agregarLlamada(Llamada x) {
		this.llamadas.add(x);
	}

	protected double calcularMontoTotalLlamadas() {
		return this.llamadas.stream()
				.mapToDouble(l -> l.getCosto() - calcularDescuento(l.getCosto()))
				.sum();
	};
	
	public abstract double calcularDescuento(double costoBase);
	

	
}
