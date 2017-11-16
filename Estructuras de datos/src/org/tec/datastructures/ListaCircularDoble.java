package org.tec.datastructures;

public class ListaCircularDoble <T> {
	NodoCD<T> inicio;
	NodoCD<T> fin;
	int size;

	

	public ListaCircularDoble() {
		this.inicio = null;
		this.fin = null;
		this.size = 0;
	}
	
	
	public NodoCD<T> getInicio() {
		return inicio;
	}
	public void setInicio(NodoCD<T> inicio) {
		this.inicio = inicio;
	}
	public NodoCD<T> getFin() {
		return fin;
	}
	public void setFin(NodoCD<T> fin) {
		this.fin = fin;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	

	public NodoCD<T> InsertarAlFinal(T obj) {
		NodoCD<T> nuevo= new NodoCD<T>(obj);
		nuevo.setValor(obj);
		if (inicio==null) {
			inicio=nuevo;
			inicio.setSiguiente(inicio);
			nuevo.setAnterior(fin);
			fin=nuevo;	
		}else {
			fin.siguiente=nuevo;
			nuevo.siguiente=inicio;
			nuevo.setAnterior(fin);
			fin=nuevo;
			inicio.setAnterior(fin);
				
		}
		return nuevo;	
	}
	
	

	public boolean buscar(T referencia){
		NodoCD<T> aux = inicio;
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

