package ar.edu.unlp.info.oo2.tp3_ej4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje implements Sugerencia{

	@Override
	public ArrayList<Pelicula> sugerir(List<Pelicula> grilla) {
		Collections.sort(grilla, new PuntajeComparable());
        Collections.reverse(grilla);
        return (ArrayList<Pelicula>) grilla
        		.stream()
        		.limit(3)
        		.collect(Collectors.toList());
        }

}
