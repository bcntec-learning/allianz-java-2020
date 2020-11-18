package clase2.herencia;

public class Gato extends Mamifero implements  Viviparo {
	private TipoPelo pelo;

	
	public TipoPelo getPelo() {
		return pelo;
	}
	public void setPelo(TipoPelo pelo) {
		if(pelo!=null) {
			this.pelo = pelo;
		}
		
	}
	

}
