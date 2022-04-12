package ar.edu.unlp.info.oo2.tp3_ej4;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Pelicula> grillaEmpresa;
	private List<Decodificador> decodificadores;
	
	public Empresa() {
		this.grillaEmpresa = new ArrayList<Pelicula>();
		this.decodificadores = new ArrayList<Decodificador>();
	}

	public void agregarPelicula(Pelicula p) {
		this.grillaEmpresa.add(p);
	}
	
	public void agregarDeco(Decodificador d) {
		this.decodificadores.add(d);
	}
}
