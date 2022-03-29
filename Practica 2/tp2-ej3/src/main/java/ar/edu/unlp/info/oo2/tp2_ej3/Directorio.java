package ar.edu.unlp.info.oo2.tp2_ej3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio extends Archivo{
	private String nombre;
	private LocalDate fecha;
	private int tamaño = 32; //en kb
	private ArrayList<Archivo> archivos;
	
	public Directorio(String nombre, LocalDate fecha) {
		super(nombre,fecha);
		this.archivos = new ArrayList<Archivo>();
	}

	 public double tamanoTotalOcupado() {
		 return this.tamaño + (archivos.stream().mapToInt(a -> a.getTamaño()).sum());
	 }

	 //si tiene directorios cómo buscar dentro de esos directorios??
	 public Archivo archivoMasGrande() {
		 int max = -9999;
		 Archivo aMax = null;
		 for(Archivo a: this.archivos) {
			 if(a.getTamaño() > max) {
				 max = a.getTamaño();
				 aMax = a;
			 }
		 }
		 return aMax;
	 }
	 
	 public Archivo archivoMasNuevo() {
		 LocalDate max = LocalDate.of(1977,01,01);
		 Archivo aMax = null;
		 for(Archivo a: this.archivos) {
			 if(a.getFecha().isAfter(max)) {
				 max = a.getFecha();
				 aMax = a;
			 }
		 }
		 return aMax;
	 }

	public void agregar(Archivo archivo) {
		this.archivos.add(archivo);
		
	}
	
	public ArrayList<Archivo> getArchivos(){
		return this.archivos;
	}

	       
}
