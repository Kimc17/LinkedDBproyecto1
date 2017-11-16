package Pruebas;

import static org.junit.Assert.*;





	import static org.junit.Assert.assertEquals;

	import org.junit.Before;
	import org.junit.Test;
import org.tec.datastructures.ListaCircularDoble;
import org.tec.datastructures.NodoCD;


	public class TestListaCircularDoble <T> {

		ListaCircularDoble<T> lista;
		@Before
		public void before() {
			lista= new ListaCircularDoble();
		}
		
			
		
		
		@Test
		public void testAgregarAlFinal() {
			NodoCD<T> resultado= lista.InsertarAlFinal((T)"Hola");
			NodoCD<T> esperado= lista.getInicio();
			assertEquals(resultado, esperado);
			
			
		}
		
		@Test
		public void testBuscar() {
			boolean resultado= lista.buscar((T)"Hola");
			boolean esperado= false;
			assertEquals(resultado, esperado);
			
		}
		
		@Test
		public void testGetFin() {
			NodoCD<T> resultado=lista.getFin();
			NodoCD<T> esperado= null;
			assertEquals(resultado, esperado);
		}
			
			
		@Test
		public void testGetInicio() {
			NodoCD<T> resultado=lista.getInicio();
			NodoCD<T> esperado=null;
			assertEquals(resultado, esperado);
			
		}
	}


