package Pruebas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.tec.datastructures.ListaCircular;
import org.tec.datastructures.NodoCir;



public class TestListaCircular<T> {
	ListaCircular<T> lista;
	@Before
	public void before() {
		lista= new ListaCircular<T>();
	}
	
		
	
	
	@Test
	public void testAgregarAlFinal() {
		NodoCir<String> resultado= lista.InsertarAlFinal((T) "Hola");
		NodoCir<String> esperado= (NodoCir<String>) lista.getInicio();
		assertEquals(resultado, esperado);
		
		
	}
	
	@Test
	public void testBuscar() {
		boolean resultado= lista.buscar((T)"Hola");
		boolean esperado= false;
		assertEquals(resultado, esperado);
		
	}
	
	@Test
	public void testGetSize() {
		int resultado=lista.getSize();
		int esperado= 0;
		assertEquals(resultado, esperado);
	}
		
		
	@Test
	public void testGetInicio() {
		NodoCir<T> resultado=lista.getInicio();
		NodoCir<T> esperado=null;
		assertEquals(resultado, esperado);
		
	}
	

}
