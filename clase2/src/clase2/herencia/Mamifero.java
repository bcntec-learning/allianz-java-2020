package clase2.herencia;

public class Mamifero extends Animal implements SangreCaliente {
	private Float temperatura;

	@Override
	public void setTemperatura(Float temperatura) {
		this.temperatura = temperatura;
		
	}

	@Override
	public Float getTemperatura() {
		return temperatura;
	}
	

}
