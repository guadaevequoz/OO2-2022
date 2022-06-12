package tp7.ej3;

import java.util.ArrayList;
import java.util.List;

public class Emprendedor {
	private String nombre;
	private List<Proyecto> proyectos;
	
	public Emprendedor(String nombre) {
		this.nombre = nombre;
		this.proyectos = new ArrayList<Proyecto>();
	}
	
	public void CrearProyecto(String titulo, double meta) {
		proyectos.add(new Proyecto(titulo, meta, this));
	}
	
	public void Cancelar(Proyecto p) {
		p.cancelar();
	}
	
}
