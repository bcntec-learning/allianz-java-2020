package clase4.casting;

public class EjemplosDowncasting {
	
	
	public static void main(String args[]){
		Object o = "String"; //el valor referenciado por 'o' is-a string
		
		
		String downcasting1 = (String) o; //funciona ok, 'o' apunta a un objeto String
		
		
		o = new String("String"); //el valor referenciado por o is-a string
		o = new EjemplosDowncasting();  //el valor referenciado por o is-a Ejemplos1

		
		//instanceof == IS-A?
		if(o instanceof String) { // le preguntamos si es un String antes de asignaar a una varaible referencia del tipo String
			String downcasting2 = (String) o;  //esto esta ok pq se lo preguntamos
		}
		String downcasting2 = (String) o;  //funciona mal, 'o' no apunta a un objeto String, apunta a un Ejemplos1
		
		
	}

}
