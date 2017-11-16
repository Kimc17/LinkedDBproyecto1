package org.tec.datastructures;

public class Pila<T> {


	    public Nodo<T> head;
	    private int size;

	    
	   
	    
	    public Nodo<T> push(T element){

	        if (is_empty()){
	            head = new Nodo<T>();
	            head.setValor(element);
	        }else {
	        	Nodo<T> new_node = new Nodo<T>();
	        	new_node.setValor(element);

	            new_node.setNext(head);
	            head = new_node;
	        }
	        size++;
			return head;
	    }

	    public T pop(){

	        

	        if (!is_empty()){
	        	T temp = (T)head.getValor();
	            head = head.getNext();
	        }else {
	        	return null;
	        	
	        }
	        size--;
			return head.getValor();
			
	        
	    }

	    public boolean is_empty(){
	        return head == null;
	    }

	    public Nodo<T> peek(){
	        return head;
	    }

	    public int size(){
	        return size;
	    }

	

		

	}



