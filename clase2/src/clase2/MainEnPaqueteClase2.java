package clase2;

import clase2.escondidas.Variables1;

public class MainEnPaqueteClase2 {
	
	//MainEnPaqueteDefault noVa; porque tiene paquete por defecto
	//Escondida1 escondida1; no se puede utilziar porque tiene visbilidad por defecto
	clase2.escondidas.Variables1 claseVariables; //no apunta a ningun objeto
	final Variables1 claseVariablesFinal = new Variables1(); //se inicializa apuntando a un objeto
	
	public void chequear(){
		clase2.escondidas.Variables1 var;
		final Variables1 var2 = new Variables1();
		int y=0;
		
		if(y>0) {
			
		}
		
		if(claseVariables!=null) { //las variables de instancia
			
		}
		/*
		if(var!=null) { //las variables de bloque
			
		}
		*/
		

		claseVariables.var2Public = "si va a compilar";  //las variables de instancia esta inicializadas
		
		//var.var2Public = "no va a compilar porque no esta inicializada";
		var = new Variables1();  //new keyword, construye una nueva instancia de Variables1
		var.var2Public = "ahora va a compilar";
		
		
		//final
		var = new Variables1(); //no es final
		//var2 = new Variables1(); no se puede volver a inicializar
		

	}

	public static void main(String argumentos[]) {
		clase2.escondidas.Variables1 claseVariables;  //variable de metodo referenciada sin import
		//Variables2 var2; tiene visibilidad por defecto, no se peude ver fuera del paquete
		
		/* no compilara pq claseVariables no esta inicializada;
		if(claseVariables!=null) {
			
		}
		*/
		claseVariables = null;
		if(claseVariables!=null) {
			
		}
	}
	public void ejecutar() {}

}
