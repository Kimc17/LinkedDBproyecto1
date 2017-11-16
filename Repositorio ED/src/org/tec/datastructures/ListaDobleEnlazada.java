package org.tec.datastructures;

public class ListaDobleEnlazada <T> {

    private NodoDoble <T> Head;
    private NodoDoble <T>Last;
    private int Size;

    public ListaDobleEnlazada() {
        this.Head = null;
        this.Last = null;
        this.Size = 0;
    }
    
    
    public NodoDoble<T> getHead() {
		return Head;
	}


	public void setHead(NodoDoble<T> head) {
		Head = head;
	}


	public NodoDoble<T> getLast() {
		return Last;
	}


	public void setLast(NodoDoble<T> last) {
		Last = last;
	}


	public boolean isEmpty(){
        return Head==Last ;
    }
    
    public int getSize() {
        return Size;
    }

}
