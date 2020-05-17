package ar.edu.unlam.pb2.sistema2020;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class testDireccion {

	

	@Test
	public void testQueUnaDireccionSeaCorrecta() {
		
		Usuario u = new Usuario(1, "zaratefabian@hotmail.com", "fabi2020");
	    Direccion casa = new Direccion("Roque Perez",4495,"San Justo");	
	    
	    u.ingresarDireccion(casa);
	    Boolean actual = u.getDireccion().contains(new Direccion("Roque Perez",4495,"San Justo"));
	    
	    assertTrue(actual);
		
		
	}

}
