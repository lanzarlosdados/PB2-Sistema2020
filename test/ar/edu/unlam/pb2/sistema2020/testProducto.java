package ar.edu.unlam.pb2.sistema2020;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class testProducto {

	
	@Test
	public void testQueSumeLosPuntosDeLosProductos() {
        
		Usuario u = new Usuario(1, "zaratefabian@hotmail.com", "fabi2020");
		Producto p1 = new Producto("cafe",10);
		Producto p2 = new Producto("arroz",40);
		Producto p3 = new Producto("fideo",30);
		Producto p4 = new Producto("queso",20);
		
		Sistema miSistema = new Sistema("crossfit");
		u.agregarProducto(p1);
		u.agregarProducto(p2);
		u.agregarProducto(p3);
		u.agregarProducto(p4);
		
		miSistema.agregarUsuario(u);
		
		Integer actual = miSistema.obtenerPuntoDelUsuario(u);
		Integer esperado =100;
		
		assertEquals(esperado,actual);
		
		
		
	}

}
