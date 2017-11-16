package org.tec.datastructures;

public class NodoDoble <T> {
	
	private T valor;
	private NodoDoble<T>  siguiente;
	private NodoDoble <T> anterior;
	

	public NodoDoble(T valor) {
		this.valor = valor;
		this.siguiente = null;
		this.anterior = null;
	}
}