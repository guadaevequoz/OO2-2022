package ar.edu.unlp.info.oo2.tp2_ej3;

import java.time.LocalDate;

public abstract class FSObject {
	protected LocalDate fecha;
	protected String nombre;
	protected int tamaño;
	
	public FSObject(String nombre, LocalDate fecha, int tamaño) {
		super();
		this.fecha = fecha;
		this.nombre = nombre;
		this.tamaño = tamaño;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public abstract Archivo archivoMasNuevo();
	public abstract Archivo archivoMasGrande();

	public int getTamaño() {
		return this.tamaño;
	};
}
