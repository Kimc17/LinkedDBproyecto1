package org.tec.datastructures;



public class Cola<T> {

    public NodoCola<T> head;
    int size;

    public NodoCola enqueue(T element){

    	NodoCola<T> current_node = head;

        if (is_empty()){
            head = new NodoCola<T>();
            head.setValor(element);
        }else {

            while (current_node.getNext() != null){
                current_node = current_node.getNext();
            }

            current_node.setNext(new NodoCola<T>());
            current_node.getNext().setValor(element);
        }
        size++;
		return head;
    }

    public T dequeue(){
    	if (head != null) {
    	NodoCola<T> temp = head;

        head = head.getNext();
        size--;

        return (T)temp.getValor();}
    	else {
    		return null;
    	}
    }

    public NodoCola<T> peek(){
        return head;
    }

    public boolean is_empty(){
        return head == null;
    }

    public int size(){
        return size;
    }

}


