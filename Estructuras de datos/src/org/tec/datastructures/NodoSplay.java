package org.tec.datastructures;

public class NodoSplay {

		  int codl;
		  int ano;
		  int codtema;
		  String nombre;
		  int codau;
		  long isbn;
		  NodoSplay Hiz;
		  NodoSplay Hde;

		  public NodoSplay (int dat, int tien, int prec, String descrip, int cant,long IS){
		    codl = dat;
		    codtema = prec;
		    ano = tien;
		    nombre = descrip;
		    codau = cant;
		    isbn=IS;
		    Hiz = null;
		    Hde = null;
		  }
		}


