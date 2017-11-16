package org.tec.datastructures;

public class NodoCir <T>{
	

	NodoCir <T> siguiente;
	T valor;

	
	public NodoCir( T valor) {
		this.siguiente = null;
		this.valor = valor;
	}
	


	public NodoCir <T> getSiguiente() {
		return siguiente;
	}
	
	
	public void setSiguiente(NodoCir <T> siguiente) {
		this.siguiente = siguiente;
	}
	
	
	
	public T getValor() {
		return valor;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}
	
	


}
