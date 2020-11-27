package clase6.genericos;

public abstract class Animal<A extends Animal> {
	protected A pareja;
	private String nombre;
	
	public Animal(String nombre) {
		this.nombre=nombre;
		
	}
	
	public Animal<A> emparejar(A pareja) {
		this.pareja=pareja;
		pareja.pareja=this;
		return this;
	}

	
	public A getPareja() {
		return this.pareja;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName()+" [ nombre=" + nombre + " pareja ["+getPareja().getClass().getSimpleName()+"] =" + getPareja().getNombre() + "]";
	}
	
	
	class MiAnimal extends Animal { //si no lo usuoa

		public MiAnimal(String nombre) {
			super(nombre);
			getPareja(); //-->> Animal, no MiAnimal
			//getPareja().miMetodo(); 
			if(getPareja() instanceof MiAnimal) {
				((MiAnimal)getPareja()).miMetodo();
			}
		}
		
		public void miMetodo() {
			
		}
	}
	
}
