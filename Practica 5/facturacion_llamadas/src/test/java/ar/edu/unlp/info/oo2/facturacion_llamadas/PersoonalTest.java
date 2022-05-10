package ar.edu.unlp.info.oo2.facturacion_llamadas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersoonalTest {
	
	Persoonal sistema;
	Persoona emisorPersonaFisca, remitentePersonaFisica, emisorPersonaJuridica, remitentePersonaJuridica;
	
	@BeforeEach
	public void setUp() {
		this.sistema = new Persoonal();
		this.sistema.agregarTelefono("2214444554");
		this.sistema.agregarTelefono("2214444555");
		this.sistema.agregarTelefono("2214444556");
		this.sistema.agregarTelefono("2214444557");
		/*
		this.emisorPersonaFisca = sistema.registrarUsuario("11555666", "Marcelo Tinelli" , "fisica");
		this.remitentePersonaFisica = sistema.registrarUsuario("00000001", "Mirtha Legrand" , "fisica");
		this.emisorPersonaJuridica = sistema.registrarUsuario("17555222", "Felfort" , "juridica");
		this.remitentePersonaJuridica = sistema.registrarUsuario("25765432", "Moovistar" , "juridica");
		*/
		this.emisorPersonaFisca = sistema.registrarUsuarioFisico("11555666", "Marcelo Tinelli");
		this.remitentePersonaFisica = sistema.registrarUsuarioFisico("00000001", "Mirtha Legrand");
		this.emisorPersonaJuridica = sistema.registrarUsuarioJuridico("17555222", "Felfort");
		this.remitentePersonaJuridica = sistema.registrarUsuarioJuridico("25765432", "Moovistar");
		
		/*
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaFisica, "nacional", 10);
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaFisica, "internacional", 8);
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaJuridica, "nacional", 5);
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaJuridica, "internacional", 7);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaFisica, "nacional", 15);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaFisica, "internacional", 45);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaJuridica, "nacional", 13);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaJuridica, "internacional", 17);
		*/
		this.sistema.registrarLlamadaNacional(emisorPersonaJuridica.getTel(), remitentePersonaFisica.getTel(), 10);
		this.sistema.registrarLlamadaInternacional(emisorPersonaJuridica.getTel(), remitentePersonaFisica.getTel(), 8);
		this.sistema.registrarLlamadaNacional(emisorPersonaJuridica.getTel(), remitentePersonaJuridica.getTel(), 5);
		this.sistema.registrarLlamadaInternacional(emisorPersonaJuridica.getTel(), remitentePersonaJuridica.getTel(), 7);
		this.sistema.registrarLlamadaNacional(emisorPersonaFisca.getTel(), remitentePersonaFisica.getTel(), 15);
		this.sistema.registrarLlamadaInternacional(emisorPersonaFisca.getTel(), remitentePersonaFisica.getTel(), 45);
		this.sistema.registrarLlamadaNacional(emisorPersonaFisca.getTel(), remitentePersonaJuridica.getTel(), 13);
		this.sistema.registrarLlamadaInternacional(emisorPersonaFisca.getTel(), remitentePersonaJuridica.getTel(), 17);
		
	}

	@Test
	void testcalcularMontoTotalLlamadas() {/*
		assertEquals(this.sistema.calcularMontoTotalLlamadas(emisorPersonaFisca), 15105.64);
		assertEquals(this.sistema.calcularMontoTotalLlamadas(emisorPersonaJuridica), 3131.7825);
		assertEquals(this.sistema.calcularMontoTotalLlamadas(remitentePersonaFisica), 0);
		assertEquals(this.sistema.calcularMontoTotalLlamadas(remitentePersonaJuridica), 0);
		*/
		assertEquals(this.emisorPersonaFisca.calcularMontoTotalLlamadas(), 15105.640000000001, 0.1);
		assertEquals(this.emisorPersonaJuridica.calcularMontoTotalLlamadas(), 3131.7825000000003, 0.1);
		assertEquals(this.remitentePersonaFisica.calcularMontoTotalLlamadas(), 0);
		assertEquals(this.remitentePersonaJuridica.calcularMontoTotalLlamadas(), 0);
	}
	
	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		this.sistema.agregarTelefono("2214444558"); 
		Persoona nuevaPersona = this.sistema.registrarUsuarioFisico("2444555","Chiche Gelblung");
		
		assertEquals(this.sistema.cantidadDeUsuarios(), 5);
		assertTrue(this.sistema.existeUsuario(nuevaPersona));
		
	}
	
	@Test
	void testEliminarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		assertTrue(this.sistema.existeUsuario(emisorPersonaFisca));
		this.sistema.eliminarUsuario(emisorPersonaFisca);
		assertEquals(this.sistema.cantidadDeUsuarios(), 3);
		assertFalse(this.sistema.existeUsuario(emisorPersonaFisca));
	}

}
