package clase3.abstracto;

public class Perro extends Animal implements Correredor{ // no es abtracto
	
	
	
	@Override
	public void correr() {
		
		
	}
	
	

	public static void main(String args[]) {
		new Perro(); // es instanciable porque no es abstacta
	}



}
