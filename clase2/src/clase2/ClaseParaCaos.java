package clase2;

import clase2.escondidas.Variables1;

public class ClaseParaCaos {
	MainEnPaqueteClase2 main = new MainEnPaqueteClase2(); //no es una palabra resverda
	
	public void caos1() {
		main.claseVariables = new Variables1();
		//no compila main.claseVariablesFinal = new Variables1(); pq no podemos volver a inicializar la variable
		
		main.ejecutar();
	}

	public void noCaos1() {
		
		main.ejecutar();
	}
	
}
