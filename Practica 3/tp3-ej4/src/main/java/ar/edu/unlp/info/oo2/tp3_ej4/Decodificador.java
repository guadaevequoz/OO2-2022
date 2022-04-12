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
	
	public void comprarPelicula(Pelicula p) {
		this.conocidas.add(p);
	}
	
	public ArrayList<Pelicula> sugerirPelicula(Pelicula p) {
		return this.sugerencia.sugerir(grillaEmpresa);
	}

	public void setSugerencia(Sugerencia sugerencia) {
		this.sugerencia = sugerencia;
	}
	
}
