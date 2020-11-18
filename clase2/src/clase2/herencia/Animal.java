package clase2.herencia;

public class Animal {
	private int peso;
	private int edad;
	protected String tipoAnimal; //vibile solo para los que me heredan o estan en el mismo paquete

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	protected void setTipoAnimal(String tipo) {
		
	}
	

}
