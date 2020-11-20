package clase3.constructores;

public class Animal extends Elemento {
	private String especie;
	private String nombre;

	/*
	 * si no hago nada, por defecto
	public Animal() {
		super();
	} 
	*/
	
	
	//pero como es requisito saber que especie es
	public Animal(String especie) {
		//super(); no es necesario lo coloca solo
		System.out.println("Animal: especie "+especie);

	}

	
	
	public String getEspecie() {
		return especie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
