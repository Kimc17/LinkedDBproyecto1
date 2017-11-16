package Pruebas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.tec.datastructures.ListaDobleEnlazada;
import org.tec.datastructures.NodoDoble;


public class testListaDoble {
	ListaDobleEnlazada lista;
	@Before
	public void before() {
		lista= new ListaDobleEnlazada<String>();
	}
	
	@Test
	public void testIsEmpty() {
		boolean resultado = lista.isEmpty();
		boolean esperado = true;  

		
	}
	
	@Test
	public void testGetHead() {
		NodoDoble resultado= lista.getHead();
		NodoDoble esperado= null;

		assertEquals(resultado, esperado);
		
		
	}
	
	@Test
	public void testGetLast() {
		NodoDoble resultado= lista.getLast();
		NodoDoble esperado= null;
		assertEquals(resultado, esperado);
		
	}
	
	@Test
	public void testGetSize() {
		int resultado=lista.getSize();
		int esperado=0;
		assertEquals(resultado, esperado);
		
		
	}

}


