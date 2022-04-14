package tp4.ej1;

import java.time.LocalDate;

public interface File {
	public String getNombre();
	public String getExtension();
	public int getTamaño();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
	public String getPermisos();
	public String prettyPrint();
}
