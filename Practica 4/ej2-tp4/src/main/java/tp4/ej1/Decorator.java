package tp4.ej1;

import java.time.LocalDate;

public abstract class Decorator implements File{
	protected File file;
	
	public File getFile() {
		return file;
	}

	public Decorator(File file) {
		this.file = file;
	}
	
	@Override
	public String getNombre() {
		return file.getNombre();
	}

	@Override
	public String getExtension() {
		return file.getExtension();
	}

	@Override
	public int getTamaño() {
		return file.getTamaño();
	}

	@Override
	public LocalDate getFechaCreacion() {
		return file.getFechaCreacion();
	}

	@Override
	public LocalDate getFechaModificacion() {
		return file.getFechaModificacion();
	}

	@Override
	public String getPermisos() {
		return file.getPermisos();
	}

	@Override
	public abstract String prettyPrint();

}
