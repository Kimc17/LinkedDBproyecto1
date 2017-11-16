package org.tec.algo.search;

public class Secuencial {
	public static int busquedaSecuencial(int []arreglo,int dato){ 
		 int posicion = -1; 
		 for(int i = 0; i < arreglo.length; i++){
		  if(arreglo[i] == dato){
		   posicion = i;
		   break;
		   } 
		  } 
		 return posicion;
		 }

}
