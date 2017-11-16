package org.tec.datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ListaSimpleTest {

ListaSimpleEnlazada lista;
	@Before
	public void before() {
		lista= new ListaSimpleEnlazada<String>();
	}
	
	@Test
	public void testesVacia() {
		boolean resultado = lista.esVacia();
		boolean esperado = true;  

		
	}
	
	@Test
	public void testAgregarAlFinal() {
		NodoSimple<String> resultado= lista.agregarAlFinal("Hola");
		NodoSimple<String> esperado= lista.getInicio();
		assertEquals(resultado, esperado);
		
		
	}
	
	@Test
	public void testBuscar() {
		boolean resultado= lista.buscar("Hola");
		boolean esperado= false;
		assertEquals(resultado, esperado);
		
	}
	
	@Test
	public void testGetSize() {
		int resultado=lista.getSize();
		int esperado=0;
		assertEquals(resultado, esperado);
		
		
	}

}
