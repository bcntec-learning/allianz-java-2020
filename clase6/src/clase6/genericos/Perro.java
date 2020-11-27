package clase6.genericos;

public class Perro extends Animal<Perro> {

	public Perro(String nombre) {
		super(nombre);
	}
	
	public static void main(String...strings ) {
		System.out.println(new Perro("firulai").emparejar(new Perro("bobby")));
	}
}
