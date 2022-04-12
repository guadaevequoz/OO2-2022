package ar.edu.unlp.info.oo2.tp2_ej3;

import java.time.LocalDate;

public class Archivo extends FSObject{
	
	public Archivo (String nombre, LocalDate fecha, int tamaño) {
		super(nombre,fecha, tamaño);
	}
	

	public int getTamaño() {
		return tamaño;
	}

	public String getNombre() {
		return this.nombre;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}
	public Archivo archivoMasGrande() {
		return this;
	}
}
