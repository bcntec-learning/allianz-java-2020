package clase2.herencia;

public interface SangreCaliente {
	
	/*no se puede
	Float temperatura;  --> static
	
	default void setTemperatura(Float temperatura) {
		this.temperatura = temperatura;
	} 
	*/
	
	public void setTemperatura(Float temperatura); //no existe metodos qu eno sean public en las interfaces, entonces es redundatntes
	Float getTemperatura();
	
	

}
