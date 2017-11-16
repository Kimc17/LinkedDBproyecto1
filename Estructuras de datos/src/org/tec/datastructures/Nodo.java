package org.tec.datastructures;


	public class Nodo<T> {

	    private T valor;

	    private Nodo<T> next;

	    public Nodo(){
	        this.valor = null;
	        this.next = null;
	    }

	    public boolean hasNext(){
	        return this.getNext() == null;
	    }

	    public T getValor() {
	        return valor;
	    }

	    public void setValor(T valor) {
	        this.valor = valor;
	    }

	    public Nodo<T> getNext() {
	        return next;
	    }

	    public void setNext(Nodo<T> next) {
	        this.next = next;
	    }


	}

