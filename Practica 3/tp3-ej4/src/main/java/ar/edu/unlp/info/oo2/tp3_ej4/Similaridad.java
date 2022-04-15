package ar.edu.unlp.info.oo2.tp3_ej4;

import java.util.List;
import java.util.stream.Collectors;

public class Similaridad implements Sugerencia{
	
	/* Similud: recorro la lista de películas que el usuario NO vio, 
	 * y me fijo si esa película es parecida a alguna de las películas que el usuario SI vio*/
	@Override
	public List<Pelicula> sugerir(Decodificador d) {
		List<Pelicula> noVistas = d.getGrillaEmpresa()
				.stream()
				.filter(p -> !(d.getConocidas().contains(p)))
				.toList();
		return noVistas
				.stream()
				.filter(p -> p.getSimilares().stream().anyMatch(aux -> aux.getSimilares().contains(p)))
				.limit(3)
				.collect(Collectors.toList());
	}

}
