package clase2.herencia;

public class Perro extends Mamifero implements   Viviparo{
	
	public final static Perro DOGO = new Perro();
	private TipoPelo pelo;

	
	public TipoPelo getPelo() {
		return pelo;
	}



	public void setPelo(TipoPelo pelo) {
		this.pelo = pelo;
	}




	public void romperLaEdad() {
		//this.edad=-1;
		setEdad(-1);
	}

	
	public static void main(String[] args) {
		Perro p1 = new Perro();
		
		p1.tipoAnimal="PERRO"; //mala practica si el Animal es publico

		p1.setTipoAnimal("PERRO"); //mas control dela integridad de los datos
		
		Perro p2 = Perro.DOGO;
		TipoPelo largo =  TipoPelo.CORTO;
	}
	
}
