package clase2.herencia;

public class JugandConAnimales {
	
	public static void main(String args[]) {
		Bulldog thomas = new Bulldog();
		Perro firulai = new Perro();
		
		System.out.println("Thomas es un "+thomas.getRaza());
		
		if(thomas instanceof Mamifero) {
			System.out.println("Thomas es un mamifero" );
		}

		if(firulai instanceof Raza) {
			System.out.println("firulai es de raza");
		} else {

			System.out.println("firulai no es de raza");
		}
		
		evaluar(thomas);

		evaluar(firulai);
	}
	
	public static void evaluar(Animal animal) {
		System.out.println("Evaluando "+animal.tipoAnimal );
		
		if(animal instanceof Mamifero) {
			System.out.println(" es un mamifero " +((Mamifero)animal).getTemperatura()+" grados");
			
		}

		if(animal instanceof Raza) {
			System.out.println(" es de raza "+((Raza) animal).getRaza());
		} else {

			System.out.println(" no es de raza");
		}
		
	}

}
