package org.tec.datastructures;


	public class NodoCola<T> {

	    private T valor;

	    private NodoCola<T> next;

	    public NodoCola(){
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

	    public NodoCola<T> getNext() {
	        return next;
	    }

	    public void setNext(NodoCola<T> next) {
	        this.next = next;
	    }


	}

