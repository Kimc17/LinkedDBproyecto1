package org.tec.datastructures;

	class NodosLista{
		Bnodo datos;
		String letra;
		int indice;
		NodosLista siguiente;
		NodosLista(Bnodo valor,int ind){
			datos=valor;
			indice=ind;
			siguiente=null;
		}
		NodosLista (Bnodo valor,NodosLista signodo,int ind){
			datos=valor;
			indice=ind;
			siguiente=signodo; 
		}
		NodosLista(String valor){
			letra=valor;
			siguiente=null;
		}
		NodosLista (String valor,NodosLista signodo){
			letra=valor;
			siguiente=signodo; 
		}

}
