package ar.edu.unlp.info.oo2.tp2_ej3;

import java.time.LocalDate;

public class Archivo {
	private String nombre;
	private LocalDate fecha;
	private int tamaño; //en bytes
	
	public Archivo (String nombre, LocalDate fecha, int tamaño) {
		this.nombre = nombre;
		this.setFecha(fecha);
		this.setTamaño(tamaño);
	}
	
	public Archivo (String nombre, LocalDate fechao) {
		this.nombre = nombre;
		this.setFecha(fecha);
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return this.nombre;
	}
}
