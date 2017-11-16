package org.tec.datastructures;



class nodoArbol {
	public class ArbolBin{
		NodoB Padre;
		NodoB Raiz;
	 
		//Constructor
		public ArbolBin(){
			Raiz = null;
		}
	 
		//Insercion de un elemento en el arbol
		public void insertaNodo(int Elem){
			if(Raiz == null)
				Raiz = new NodoB(Elem);
			else
				Raiz.insertar(Elem);
		}
	 
		//Preorden Recursivo del arbol
		public void preorden (NodoB Nodo){
			if(Nodo == null)
				return;
			else{
				System.out.print (Nodo.dato + " ");
				preorden (Nodo.Hizq);
				preorden (Nodo.Hder);
			}
		}
	 
		//PostOrden recursivo del arbol
		public void postOrden (NodoB Nodo){
			if(Nodo == null)
				return;
			else{
				postOrden (Nodo.Hizq);
				postOrden (Nodo.Hder);
				System.out.print (Nodo.dato + " ");
			}
		}
	 
		//Inorden Recursivo del arbol
		public void inorden (NodoB Nodo){	
			if(Nodo == null)
				return;
			else{
				inorden (Nodo.Hizq);
				System.out.print(Nodo.dato + " ");
				inorden (Nodo.Hder);
			}
		}
	 
	//cantidad de niveles q	ue posee el arbol
	   public int altura (NodoB Nodo){ 
		if (Nodo==null)
	         return -1;
	    else
	         return 1+Math.max(altura(Nodo.Hizq),altura(Nodo.Hder));
		}
	//cantidad de elementos que posee el arbol	
	public int tamaño (NodoB Nodo){
	    if (Nodo==null)
	       return 0;
	    else
	      return 1+tamaño(Nodo.Hizq)+tamaño(Nodo.Hder);
	}
		//Busca un elemento en el arbol
	public void buscar (int Elem, NodoB A){
			if(A == null | A.dato == Elem){
				System.out.print(A.dato + " ");
				return;
			}
			else{
				if(Elem>A.dato)
					buscar(Elem, A.Hder);
				else
					buscar( Elem, A.Hizq);
			}
		}
	}
}
	 
	 
