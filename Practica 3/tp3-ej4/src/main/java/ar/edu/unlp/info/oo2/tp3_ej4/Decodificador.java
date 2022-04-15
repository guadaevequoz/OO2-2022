package ar.edu.unlp.info.oo2.tp3_ej4;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	private List<Pelicula> conocidas;
	private List<Pelicula> grillaEmpresa;
	private Sugerencia sugerencia;
	
	public Decodificador(List<Pelicula> grillaEmpresa) {
		this.conocidas = new ArrayList<Pelicula>();
		this.grillaEmpresa = grillaEmpresa;
		setSugerencia(new Novedad());
	}
	
	public Decodificador() {
		this.conocidas = new ArrayList<Pelicula>();
		this.grillaEmpresa = new ArrayList<Pelicula>();
		setSugerencia(new Novedad());
	}
	
	public void comprarPelicula(Pelicula p) {
		this.grillaEmpresa.add(p);
	}
	
	public void agregarConocida(Pelicula p) {
		this.conocidas.add(p);
	}
	
	public List<Pelicula> sugerirPelicula() {
		return this.sugerencia.sugerir(this);
	}

	public void setSugerencia(Sugerencia sugerencia) {
		this.sugerencia = sugerencia;
	}

	public List<Pelicula> getGrillaEmpresa() {
		return grillaEmpresa;
	}
	
	public List<Pelicula> getConocidas() {
		return conocidas;
	}
	
}
