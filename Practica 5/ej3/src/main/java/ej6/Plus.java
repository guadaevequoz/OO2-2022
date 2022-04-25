package ej6;

public class Plus extends Usuario{

	@Override
	public double calcularCostoPelicula(Pelicula pelicula) {
		return pelicula.getCosto();
	}

}
