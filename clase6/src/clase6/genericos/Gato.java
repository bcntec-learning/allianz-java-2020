package clase6.genericos;

public class Gato extends Animal<Gato> {

	
	public Gato(String nombre) {
		super(nombre);
	}

	public  void miau() {}
	
	public static void main(String...strings ) {
		System.out.println(new Gato("gato guapo").emparejar(new Gato("gato feo")));
		//new Gato("gato2").emparejar(new Perro("feo"));
		///new Gato("gato2").emparejar(new Animal() {});
		new Gato("gato1").miau();
		new Gato("gato1").getPareja().miau();
	}
}
