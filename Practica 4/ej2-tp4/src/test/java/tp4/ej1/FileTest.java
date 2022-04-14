/**
 * 
 */
package tp4.ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileTest {
	
	FileOO2 archivo;
	@BeforeEach
	void setUp() throws Exception {
		archivo = new FileOO2("arch1",".txt",164,LocalDate.of(2022, 2, 22),LocalDate.of(2022, 3, 22),"rwx");
	}
    @Test
    public void testPretty() {
        assertEquals("arch1 - .txt - ", new Nombre(new Extension(archivo)).prettyPrint());
        assertEquals("arch1 - .txt - 2022-02-22 - ", new Nombre(new Extension(new FechaCreacion(archivo))).prettyPrint());
        assertEquals("rwx - arch1 - .txt - 164 - ", new Permisos(new Nombre(new Extension(new Tamaño(archivo)))).prettyPrint());
    }
}
