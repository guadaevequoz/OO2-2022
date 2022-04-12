package ar.edu.unlp.info.oo2.tp3_ej4;

import java.util.Comparator;

public class PuntajeComparable implements Comparator<Pelicula>{
	 @Override
	    public int compare(Pelicula o1, Pelicula o2) {
	        if (o1.getPuntaje() > o2.getPuntaje()) return 1;
	        if (o1.getPuntaje() == o2.getPuntaje()) return 0;
	        return -1;
	    }
}
