package tp7.ej1;

public class LavadoDiario implements LavadoStrategy{
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void lavado(Lavarropas l) {
		l.agregarAgua(50);
		l.lavado1(20);
		l.lavado2(7, 3);
	}
}
