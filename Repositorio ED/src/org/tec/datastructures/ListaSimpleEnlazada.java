package org.tec.datastructures;



	public class ListaSimpleEnlazada <T>{
		
		private NodoSimple<T> inicio;
		private int size;
		public  T name;
		
		
		
		public ListaSimpleEnlazada () {
			super();
			this.inicio = null;
			this.size = 0;
	
		}
		
	
		public NodoSimple<T> getInicio() {
			return inicio;
		}
		public void setInicio(NodoSimple<T> inicio) {
			this.inicio = inicio;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public T getName() {
			return name;
		}
		public void setName(T name) {
			this.name= name;
		}
		

		
		
		
		public boolean esVacia(){
			return inicio == null;
		}
		
		public NodoSimple<T> agregarAlFinal(T obj){

			NodoSimple<T> nuevo = new NodoSimple<T>(obj);

			nuevo.setValor(obj);

			if (esVacia()) {

				inicio = nuevo;

			} else{
				NodoSimple<T> aux = inicio;

				while(aux.getSiguiente() != null){
					aux = aux.getSiguiente();
				}

				aux.setSiguiente(nuevo);
			}
			size++;
			return nuevo;
		}
		
		
		public boolean buscar(String referencia){
			NodoSimple<T> aux = inicio;
			boolean encontrado = false;
			while(aux != null && encontrado != true){
				if (referencia == aux.getName()){
					encontrado = true;
				}
				else{
					aux = aux.getSiguiente();
				}
			}
			return encontrado;
		}
		
		


	}


