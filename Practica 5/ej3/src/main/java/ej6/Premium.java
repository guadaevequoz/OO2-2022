package ej6;

public class Premium extends Usuario{

	@Override
	public double calcularCostoPelicula(Pelicula pelicula) {
		return pelicula.getCosto() * 0.75;
	}

}
