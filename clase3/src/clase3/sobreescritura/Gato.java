package clase3.sobreescritura;

public class Gato extends Animal {
	
	

	@Override  //anotacion, no es requisito usarla, pero es una buena practica
	public void correr() {
		//super.correr(); si no lo llamo, estoy anulando la funcionalidad de padre
		//this.correr(); haria un stack overflow
		super.setVelocidad(40);

		System.out.println("a correr gato..");
	}
	

}
