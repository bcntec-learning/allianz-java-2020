package clase5;

public class SumandoYConcatenando {
	int i;

	public static void main(String [] args) {
		Integer y = 6;
		short u = 7;
		SumandoYConcatenando s = new SumandoYConcatenando();
		System.out.println(y+u);
		
		//short r1 = y+u; no compila pq hay perdida
		int r1 = y+u; 
		
		String a = "A", b="B";

		System.out.println(a+b); //concatenacion
		
		System.out.println(y+u +a+b);  //deja ser operacion aritmetica   
		System.out.println(""+y+u+a+b);
		                        //se transformo a string  y ejecuto el toString() de SumandoYConcatenando para concatenarlo
		System.out.println(y+u +""+ new SumandoYConcatenando());  

		System.out.println(y+u +""+ s);  
		
		
		String v = "hola " + new SumandoYConcatenando(); //si se puede  concatenar un String con un objeto
		//int i = i + new SumandoYConcatenando(); //no se pyede concatenar un primitivo con un objeto
		//String t = new Integer(7)+ new SumandoYConcatenando(); //no se pyede concatenar un wrapper con un objeto
		
		System.out.println(y+u +""+ new SumandoYConcatenando().toString()); 
		
	}
	
	@Override
	public String toString() {
		//int u = 1/0;
		return "SumandoYConcatenando [i=" + i + "]";
	}

}
