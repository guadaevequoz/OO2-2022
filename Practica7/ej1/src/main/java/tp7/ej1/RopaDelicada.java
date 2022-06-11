package tp7.ej1;

public class RopaDelicada implements LavadoStrategy{
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void lavado(Lavarropas l) {
		l.agregarAgua(100);
		l.lavado1(40);
		l.lavado2(15, 0);
	}
}
