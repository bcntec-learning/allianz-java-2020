package clase3.constructores;

public class Rata extends Animal {
	private String idioma;


	/*
	 * si no hago nada todo default -> sin arg
	public Rata() {
		super(); //constructor de Animal sin args
	} 
	*/
	
	public Rata() {
		super("ratus-ratus"); //lo he elegido, pq no me daba opcion

		System.out.println("Rata: nombre "+getNombre());

		setNombre("desconocido");
	}

	public Rata(String nombre) {
		this(); 
		super.setNombre(nombre);
		this.setNombre(nombre); //es exactamento lo mismo pq no existe en Rta el metodo, 
		
		System.out.println("Rata: nombre "+nombre);
	
		
	}
	
	public Rata(String nombre, String idioma) {
		//si no hago nada ->> super(); al no existe, me obliga elegir uno
		this(nombre); 
		this.idioma = idioma;

		System.out.println("Rata: nombre "+nombre+", idioma "+idioma);
		
	}
	
	//sobrecarga
	public void setNombre(String nombre, String idioma) {
		setNombre(nombre);
		this.idioma=idioma;
		
		
	}
	public String getIdioma() {
		return idioma;
	}

	
	static public void  main(String[] args) {
		System.out.println("1-------- Vacio");
		new Rata();

		System.out.println("2-------- Juanita");
		new Rata("Juanita");

		System.out.println("2-------- Jhon");
		new Rata("jhon", "ingles");
		
	}
	
}
