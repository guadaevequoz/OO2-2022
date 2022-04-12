package ar.edu.unlp.info.oo2.tp3_ej4;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private int añoEstreno;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula(String titulo, int añoEstreno, double puntaje, List<Pelicula> similares) {
		super();
		this.titulo = titulo;
		this.añoEstreno = añoEstreno;
		this.puntaje = puntaje;
		this.similares = new ArrayList<Pelicula>();
	}

	public double getPuntaje() {
		return puntaje;
	}

	public int getAñoEstreno() {
		return añoEstreno;
	}

	public List<Pelicula> getSimilares() {
		return similares;
	}
	
	
}
