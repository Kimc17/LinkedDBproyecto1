package org.tec.datastructures;

class Btree{
	Bnodo p=new Bnodo();
	Bnodo Xder = new Bnodo();
	Bnodo Xizq = new Bnodo();
	NodoPr X;
	Bnodo Xr;
	String salida="",imps="";
	boolean EmpA = false,Esta=false;
	//***************************************
	//*****Inserta un nodo en un arbol b*****
	//***************************************
	void Inserta(NodoPr clave){
		Insertaa(clave,p);
	}
	//auxiliar de inserta nodo
	public void Insertaa(NodoPr clave, Bnodo raiz){
		Empujar(clave,raiz);
		if(EmpA){
			p=new Bnodo();
			p.Cuentas= 1;
			p.Claves[0]=X;
			p.Ramas[0]=raiz;
			p.Ramas[1]=Xr;
		}

	}
	//Empuja los elementos del arbol
	public void Empujar(NodoPr clave, Bnodo raiz){
		int k=0;
		Esta=false;
		if(Vacio(raiz)){
			EmpA=true;
			X=clave;
			Xr=null;
		}
		else{
			k=BuscarNodo(clave, raiz);
			if(Esta){

				EmpA=false;
			}
			else{
				Empujar(clave, raiz.Ramas[k]);
				if(EmpA){
					if(raiz.Cuentas < 4){
						EmpA = false;
						MeterHoja(X, raiz, k);
					}
					else{
						EmpA = true;
						DividirN(X, raiz, k);
					}
				}
		    }
		}	
	}
	//Meter hoja
	public void MeterHoja(NodoPr clave, Bnodo raiz, int k){	
		int i = raiz.Cuentas;
		while (i != k){
			raiz.Claves[i] = raiz.Claves[i-1];
			raiz.Ramas[i+1] = raiz.Ramas[i];
			--i;
		}
		raiz.Claves[k] = clave;
		raiz.Ramas[k+1] = Xr;
		raiz.Cuentas = ++raiz.Cuentas;
	}
	//Dividir nodo
	public void DividirN(NodoPr Clave, Bnodo Raiz, int k){ 
		int pos=0;
		int Posmda=0;	
		if (k <= 2)
			Posmda = 2;
		else{
			Posmda = 3;
		}
		Bnodo Mder = new Bnodo();
		pos = Posmda+1;
		while (pos != 5){
			 Mder.Claves [(pos - Posmda)-1] = Raiz.Claves[pos-1];
			 Mder.Ramas [pos - Posmda] = Raiz.Ramas[pos];
			 ++pos;
		}
		Mder.Cuentas = 4 - Posmda;
		Raiz.Cuentas = Posmda;
		if (k <= 2)
			MeterHoja(Clave, Raiz, k);
		else{
			MeterHoja(Clave, Mder, (k - Posmda));
		}
		X = Raiz.Claves[Raiz.Cuentas-1];
		Mder.Ramas[0] = Raiz.Ramas[Raiz.Cuentas];
		Raiz.Cuentas = --Raiz.Cuentas;
		Xr=Mder;
	}
	//****************************************
	//*****Borrar un elemento del arbol b*****
	//****************************************
	void Eliminar(NodoPr clave){
		if(Vacio(p)){
			System.out.println("No hay lemntos");
		}
		else
			Eliminara(p,clave);
	}
	public void Eliminara(Bnodo Raiz, NodoPr clave){
		try{
			EliminarRegistro(Raiz, clave);
		}
		catch(Exception e){
			Esta=false;
		}
		if (!Esta)
			System.out.println("No se encontro el elemento");
		else{
			if (Raiz.Cuentas == 0)
				Raiz = Raiz.Ramas[0];
			p=Raiz;
			System.out.println("Eliminacion completa");
		}
	}
	//Elimina el registro
	public void EliminarRegistro(Bnodo raiz, NodoPr c){
		int pos = 0;
		NodoPr sucesor;
		if (Vacio(raiz))
			Esta = false;
		else{
			pos = BuscarNodo(c, raiz);
			if (Esta){
				if (Vacio(raiz.Ramas[pos-1]))
					Quitar(raiz, pos);
				else{
					Sucesor(raiz, pos);
					EliminarRegistro (raiz.Ramas[pos], raiz.Claves[pos-1]);
				}
			}
			else{
				EliminarRegistro(raiz.Ramas[pos], c);
				if ((raiz.Ramas[pos] != null) && (raiz.Ramas[pos].Cuentas < 2));
				
			}
		}
	}
	//Busca el sucesor
	public void Sucesor (Bnodo raiz, int k){
		Bnodo q=raiz.Ramas[k];
		while(!Vacio(q.Ramas[0]))
			q=q.Ramas[0];
		raiz.Claves[k-1]=q.Claves[0];
	}

	public void Quitar (Bnodo raiz, int pos){
		int j = pos + 1;
		while (j != raiz.Cuentas+1){
			raiz.Claves [j-2] = raiz.Claves[j-1];
			raiz.Ramas [j-1] = raiz.Ramas[j];
			j++;
		}
		raiz.Cuentas--;
	}
	
	//Retorna true si el arbol esta vacio
	public boolean Vacio(Bnodo raiz){
		return (raiz==null || raiz.Cuentas==0);
	}
	//Buscar retorna true si lo encuentra y la posicion
	public int BuscarNodo(NodoPr clave, Bnodo raiz){
		int j=0;
		if(clave.nump < raiz.Claves[0].nump){
			Esta = false;
			j=0;
		}
		else{
			j = raiz.Cuentas;
			while (clave.nump < raiz.Claves[j-1].nump && j>1)
				--j;
			Esta = (clave.nump == raiz.Claves[j-1].nump);
		}
		return j;
	}
	//miembro
	public boolean Miembro(NodoPr clave, Bnodo raiz){
		boolean si=false;
		int j=0;
		if(!Vacio(p)){
			if(clave.nump < raiz.Claves[0].nump){
				si = false;
				j=0;
			}
			else{
				j = raiz.Cuentas;
				while (clave.nump < raiz.Claves[j-1].nump && j>1)
					--j;
				si = (clave.nump == raiz.Claves[j-1].nump);
			}
		}
		return si;
	}
	//Recorrido InOrden Iterativo
	void InordenIT(){
		int i=0;
		Bnodo nodo=p;
		ListaSimpleB Pila = new ListaSimpleB();
		do{
			i=0;
			while (!Vacio(nodo)){
				Pila.InsertaFinal(nodo, i);
				nodo=nodo.Ramas[i];
		    }
			if (!Pila.VaciaLista()){
				i=Pila.UltimoNodo.indice;
				nodo=Pila.UltimoNodo.datos;
				Pila.EliminaFinal();
				i++;
				if (i <= nodo.Cuentas){
					salida=salida+"Num Prestamo: "+nodo.Claves[i-1].nump+"\n             -Id: "+nodo.Claves[i-1].ident;
					salida=salida+"\n             -Cod Tema: "+nodo.Claves[i-1].codtem+"\n             -Cod Libro: "+nodo.Claves[i-1].codlib+"\n             -Cod Autor: "+nodo.Claves[i-1].codaut+"\n             -Fecha/hora: "+nodo.Claves[i-1].fecha+"\n";
					salida=salida+"-------------------------------\n";
					if (i < nodo.Cuentas)
						Pila.InsertaFinal(nodo, i);
					nodo=nodo.Ramas[i];	
				}
			}
		}
		while (!Pila.VaciaLista() || !Vacio(nodo)); 	
	}
}
