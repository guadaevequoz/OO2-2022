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
		this.setTitulo(titulo);
		this.añoEstreno = añoEstreno;
		this.puntaje = puntaje;
		this.similares = similares;
	}
	
	public Pelicula(String titulo, int añoEstreno, double puntaje) {
		super();
		this.setTitulo(titulo);
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
	
	public void addSimilarMovie(Pelicula m) {
		if(!this.similares.contains(m)) {
			this.similares.add(m);			
			m.addSimilarMovie(this);
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
