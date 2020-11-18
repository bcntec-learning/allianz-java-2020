package clase2.herencia;

public interface Oviparo {
	
	public String getColorHuevo(); //metodo abstracto
	
	default Huevo ponerHuevos() { //metodo por defecto
		Huevo huevo =  new Huevo();
		huevo.setColor(getColorHuevo());
	}

}
