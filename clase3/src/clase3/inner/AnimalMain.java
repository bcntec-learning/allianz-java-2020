package clase3.inner;

public class AnimalMain {
	
	public static void main(String args[]) {
		//new Animal(); no se puede instanciar por ser abstracto
		
		
		Animal a = new Animal(){  //class AnimalMain$1 extends Animal
			public void hola() {}
		}; //genera un clase q se ve solo del main que extiende de Animal inner anonymous class, muy utlizado en interfaces
		
		System.out.println(Animal.class);
		System.out.println(a.getClass());
	}

}
