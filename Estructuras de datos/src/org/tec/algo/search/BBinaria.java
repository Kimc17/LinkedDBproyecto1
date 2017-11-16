package org.tec.algo.search;

public class BBinaria {

		 public static int BBinaria(int  vector[], int dato){
		  int n = vector.length;
		  int centro,inf=0,sup=n-1;
		   while(inf<=sup){
		     centro=(sup+inf)/2;
		     if(vector[centro]==dato) return centro;
		     else if(dato < vector [centro] ){
		        sup=centro-1;
		     }
		     else {
		       inf=centro+1;
		     }
		   }
		   return -1;
		 }

}
