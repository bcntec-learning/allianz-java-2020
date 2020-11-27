package clase6.genericos;

public class Conejo extends Animal<Conejo> {

	
	public Conejo(String nombre) {
		super(nombre);
	}

	public static void main(String...strings ) {
		System.out.println(new Conejo("A").emparejar(new Conejo("B")));
	}
}
