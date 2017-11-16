package org.tec.datastructures;

class Bnodo{
	Bnodo[]Ramas = new Bnodo[5];
	NodoPr[]Claves = new NodoPr[4];
	int Cuentas = 0;
	Bnodo(NodoPr clave){
		Claves[0] = clave;	
	}
	Bnodo(){
	}
}
