package ar.edu.unlp.info.oo2.tp2_ej3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Directorio extends FSObject{
	private List<FSObject> contenido;
	
	public Directorio(String nombre, LocalDate fecha) {
		super(nombre,fecha, 32);
		this.contenido = new ArrayList<FSObject>();
	}

	 public Archivo archivoMasGrande() {
		  return this.contenido
				  .stream()
				  .map(fso -> fso.archivoMasGrande())
				  .filter(archivo -> archivo != null)
				  .max(Comparator.comparingInt(a -> a.getTamaño()))
				  .orElse(null);
		 
	 }
	 
	 public Archivo archivoMasNuevo() {
		 
		 return this.contenido
		 	.stream()
		 	.map(fso -> fso.archivoMasNuevo())
		 	.filter(archivo -> archivo != null) //filtro nulos
		 	.max(Comparator.comparing(a -> a.getFecha())) //comparator resumido SIGUE SIENDO UN COMPARATOR 
		 	.orElse(null); //si el dir esta vacio devuelvo null
		 
	 }

	public void agregar(FSObject archivo) {
		this.contenido.add(archivo);
		
	}
	
	public List<FSObject> getArchivos(){
		return this.contenido;
	}

	public int getTamaño() {
		return this.tamaño + (contenido.stream().mapToInt(a -> a.getTamaño()).sum());
	}

	       
}
