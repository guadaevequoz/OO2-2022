package ar.edu.unlp.info.oo2.tp3_ej4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Novedad implements Sugerencia{

	@Override
	public List<Pelicula> sugerir(Decodificador d) {
		List<Pelicula> noVistas = d.getGrillaEmpresa()
				.stream()
				.filter(p -> !(d.getConocidas().contains(p)))
				.toList();
		
		return noVistas
				.stream()
				.sorted(Comparator.comparing(Pelicula::getAñoEstreno)
				.reversed())
				.limit(3)
				.collect(Collectors.toList());
        }
}
