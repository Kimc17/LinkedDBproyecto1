package org.tec.datastructures;

public class NodoCD <T>{
	

	NodoCD <T> siguiente;
	NodoCD <T>anterior;
	T valor;

	
	public NodoCD( T valor) {
		this.siguiente = null;
		this.anterior = null;
		this.valor = valor;
	}
	


	public NodoCD <T> getSiguiente() {
		return siguiente;
	}
	
	
	public void setSiguiente(NodoCD <T> siguiente) {
		this.siguiente = siguiente;
	}
	
	
	public NodoCD <T> getAnterior() {
		return anterior;
	}
	
	
	public void setAnterior(NodoCD <T> anterior) {
		this.anterior = anterior;
	}
	
	
	public T getValor() {
		return valor;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}
	
	


}
