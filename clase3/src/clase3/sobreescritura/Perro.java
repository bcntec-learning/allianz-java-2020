package clase3.sobreescritura;

public class Perro extends Animal {

	@Override  //anotacion, no es requisito usarla, pero es una buena practica
	public void correr() {
		//super.correr(); si no lo llamo, estoy anulando la funcionalidad de padre
		//this.correr(); haria un stack overflow
		super.setVelocidad(70);

		System.out.println("a correr perro..");
	}
	
	/* no compila pq es final
	@Override 
	public void parar() {
		
	}
	*/

	/* no compila pq le estoy diciendo que una sobrescritura del padre, esto es scobrecarga
	@Override 
	public void parar(int velocidad) {
		
	}
	*/
	
	//esto es sobrecarga, por eso puedo
	public void parar(int velocidad) {
		super.setVelocidad(velocidad);

		System.out.println("ya paré.. "+velocidad);
	}
	
	public void ejecutrarTarea1() {
		this.parar();
		
		this.correr(); //correr a la velocidad del perrr
		this.parar(12);
		super.correr(); //correr a la velocidad del Animal
		
		
	}
	
	

	//@Override no es valido pq es static
	public static Animal nuevo() {
		return new Perro();
	}
	
	
	public static void main(String... args) {

		System.out.println("========");
		new Perro().ejecutrarTarea1();

		System.out.println("========");

		
		new Perro().parar(); //llamara al del Perro, no puedes decirle que ejecute el del padre fuera de los metodo de la misma clase
		
		System.out.println("========");

		Perro.nuevo().correr();
		Animal.nuevo().correr();
	}

}
