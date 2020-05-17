package ar.edu.unlam.pb2.sistema2020;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class testSistema {

	

	@Test
	public void testQueSeDeDeAltaUnUsuario() {
        
		Usuario u = new Usuario(1, "zaratefabian@hotmail.com", "fabi2020");
		
		Sistema miSistema = new Sistema("crossfit");
		Boolean actual =  miSistema.agregarUsuario(u);
		
		
		assertTrue(actual);
		
	}
	@Test
	public void testQueAlIngresarUnUsuarioYContraseniaIncorrectaNoIngreseAlSistema() {
        
		Usuario u = new Usuario(1, "zaratefabian@hotmail.com", "fabi2020");
		
		Sistema miSistema = new Sistema("crossfit");
		miSistema.agregarUsuario(u);
		Boolean actual =  miSistema.ingresarAlSistema("zaratefabian@hotmail.com", "fabi");
		
		
		assertFalse(actual);
		
	}
	@Test
	public void darDeBajaUnUsuario(){
		
        Usuario u = new Usuario(1, "zaratefabian@hotmail.com", "fabi2020");
		
		Sistema miSistema = new Sistema("crossfit");
		miSistema.agregarUsuario(u);
		Boolean actual =miSistema.darDeBajaUsuario(1);
		
		assertTrue(actual);
	}

}
