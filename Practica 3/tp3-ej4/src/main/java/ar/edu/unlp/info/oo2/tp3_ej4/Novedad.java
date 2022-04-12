package ar.edu.unlp.info.oo2.tp3_ej4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Novedad implements Sugerencia{

	@Override
	public ArrayList<Pelicula> sugerir(List<Pelicula> grilla) {
		/*//evaluar poner todo el comparator en el sort
		Collections.sort(grilla, new AñoComparable());
        Collections.reverse(grilla);
        return (ArrayList<Pelicula>) grilla
        		.stream()
        		.limit(3)
        		.collect(Collectors.toList());*/
		return (ArrayList<Pelicula>) grilla
				.stream()
				.sorted(Comparator.comparing(Pelicula::getAñoEstreno)
				.reversed())
				.limit(3)
				.collect(Collectors.toList());
        }
	/*cuando hago el de similitud, puede quedar duplicado entonces
	 * hago el set asi aparece una unica vez*/
}
