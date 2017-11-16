package Pruebas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.tec.datastructures.Cola;
import org.tec.datastructures.NodoCola;

public class TestCola<T> {
	
	Cola<T> cola;
	@Before
	public void Before() {
		cola= new Cola<T>();
	}
	

	@Test
	public void testIsEmpty() {
		boolean resultado= cola.is_empty();
		boolean esperado= true;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testDequeue() {
		T resultado= cola.dequeue();
		T esperado= null;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testEnqueue() {
		NodoCola<T> resultado= cola.enqueue((T) "Prueba");
		NodoCola<T> esperado= cola.head;
		assertEquals(resultado, esperado);
	}
	@Test
	public void testPeek() {
		NodoCola<T> resultado= cola.peek();
		NodoCola<T> esperado= cola.head;
		assertEquals(resultado, esperado);
	}

}
