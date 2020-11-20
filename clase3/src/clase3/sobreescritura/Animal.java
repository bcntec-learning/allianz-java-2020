package clase3.sobreescritura;

public class Animal {
	private int velocidad = 0;

	public void correr() {
		velocidad =10;
		System.out.println("a correr animal..");
	}
	
	
	public final void parar() {
		velocidad =0;
		System.out.println("ya paré..");
	}
	
	
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	
	public static Animal nuevo() {
		return new Animal();
	}
	
}
