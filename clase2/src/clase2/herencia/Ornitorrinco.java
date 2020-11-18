package clase2.herencia;

public class Ornitorrinco extends Mamifero implements Oviparo{

	@Override
	public String getColorHuevo() {
		return "MARRON";
	}
	
	
	public static void main(String... args) {
		Huevo huevo = new Ornitorrinco().ponerHuevos();
		System.out.println(huevo.getColor());
	}

}
