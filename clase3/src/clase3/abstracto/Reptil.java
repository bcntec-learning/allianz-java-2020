package clase3.abstracto;

public abstract class Reptil extends Animal { //al tener un metodo abstracto, es abstracta
	private String tipo; //valor
	
	public abstract boolean seArrstra(); // hay que implementarlo en el primer hijo que no sea asbtracto
	
	
	public void pararse() {
		if(seArrstra()) {
			System.out.println("no me puedo parar, me arrastro");
		} else {

			System.out.println("arriba!!!!");
		}
	}
	
}
