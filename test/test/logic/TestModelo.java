package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(""+i);
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		setUp2();
		assertEquals(CAPACIDAD, modelo.darTamano());
		// TODO
	}

	@Test
	public void testAgregar() {
		setUp2();
		String[] s = new String[100];
		for(int i=0; i<100;i++){
			s[i]= ""+i;
		}
		try{
			for(int i=0; i<100;i++){				
				assertEquals(s[i],modelo.buscar(i+"") );
			}
		}catch (Exception e){
			fail("Este metodo no debe lanzar excepción");
		}
		// TODO Completar la prueba
	}

	@Test
	public void testBuscar() {
		modelo.agregar("obj1");
		assertEquals("obj1",modelo.buscar("obj1") );
		// TODO Completar la prueba
	}

	@Test
	public void testEliminar() {
		setUp2();
		try{
			for(int i =0; i< CAPACIDAD;i++){
				modelo.eliminar(""+i);
			}
			assertEquals(0,modelo.darTamano());
		}catch (Exception e) {
			fail("Este metodo no debe lanzar excepción");
		}
		
		
	}

}
