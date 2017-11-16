package org.tec.datastructures;

public class ListaCircular <T> {

	NodoCir <T> inicio;

	int size;


	public ListaCircular() {
		this.inicio = null;
		this.size = 0;
	}
	
	
	
	public NodoCir <T> getInicio() {
		return inicio;
	}
	public void setInicio(NodoCir <T> inicio) {
		this.inicio = inicio;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	

	public NodoCir<String> InsertarAlFinal(T valor) {
		NodoCir<T> nuevo= new NodoCir(valor);
		nuevo.setValor(valor);
		if (inicio==null) {
			inicio=nuevo;
			inicio.setSiguiente(inicio);
		
		}
		else {

			nuevo.siguiente=inicio;

				
		}
		return (NodoCir<String>) nuevo;	
	}
	

	public boolean buscar(T referencia){
		NodoCir <T> aux = inicio;
		boolean encontrado = false;
		while(aux != null && encontrado != true){
			if (referencia == aux.getValor()){
				encontrado = true;
			}
			else{
				aux = aux.getSiguiente();
			}
		}
		return encontrado;
	}
	
	
	

	}

