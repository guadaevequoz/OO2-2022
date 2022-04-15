package ar.edu.unlp.info.oo2.tp3_ej4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPelicula {
	
	Decodificador deco;
	Pelicula thor = new Pelicula("Thor",2007,7.9);
	Pelicula capA = new Pelicula("Capitan America",2016,7.8);
	Pelicula ironM = new Pelicula("Iron Man",2010,7.9);
	Pelicula rocky = new Pelicula("Rocky",1976,8.1);
	Pelicula rambo = new Pelicula("Rambo", 1979, 7.8);
	Pelicula dunkirk = new Pelicula("Dunkirk",2017,7.9);
	
	@BeforeEach
	void setUp() {
		deco = new Decodificador();
		
		thor.addSimilarMovie(ironM); thor.addSimilarMovie(capA);
		capA.addSimilarMovie(ironM);
		rocky.addSimilarMovie(rambo);
		
		deco.agregarConocida(thor); deco.agregarConocida(rocky);
		
		deco.comprarPelicula(capA); deco.comprarPelicula(dunkirk);
		deco.comprarPelicula(ironM); deco.comprarPelicula(rambo);
		deco.comprarPelicula(rocky); deco.comprarPelicula(thor);
	}
	
	@Test
	void testNovedad() {
		deco.setSugerencia(new Novedad());
		assertEquals("Dunkirk",deco.sugerirPelicula().get(0).getTitulo());
		assertEquals("Capitan America",deco.sugerirPelicula().get(1).getTitulo());
		assertEquals("Iron Man",deco.sugerirPelicula().get(2).getTitulo());
	}
	
	@Test
	void testSimilaridad() {
		deco.setSugerencia(new Similaridad());
		assertEquals("Capitan America",deco.sugerirPelicula().get(0).getTitulo());
		assertEquals("Iron Man",deco.sugerirPelicula().get(1).getTitulo());
		assertEquals("Rambo",deco.sugerirPelicula().get(2).getTitulo());
	}
	
	@Test
	void testPuntaje() {
		deco.setSugerencia(new Puntaje());
		assertEquals("Dunkirk",deco.sugerirPelicula().get(0).getTitulo());
		assertEquals("Iron Man",deco.sugerirPelicula().get(1).getTitulo());
		assertEquals("Capitan America",deco.sugerirPelicula().get(2).getTitulo());
	}

}
