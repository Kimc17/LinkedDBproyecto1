package Pruebas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.tec.datastructures.Nodo;
import org.tec.datastructures.Pila;


public class TestPila<T> {
	
	Pila<T> pila;
	@Before
	public void Before() {
		pila= new Pila<T>();
	}
	

	@Test
	public void testIsEmpty() {
		boolean resultado= pila.is_empty();
		boolean esperado= true;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testPop() {
		T resultado= pila.pop();
		T esperado= null;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testPush() {
	
		Nodo<T> resultado= pila.push((T) "Prueba");
		Nodo<T> esperado= pila.head;
		assertEquals(resultado, esperado);
	}
	@Test
	public void testPeek() {
		Nodo<T> resultado= pila.peek();
		Nodo<T> esperado= pila.head;
		assertEquals(resultado, esperado);
	}

}
