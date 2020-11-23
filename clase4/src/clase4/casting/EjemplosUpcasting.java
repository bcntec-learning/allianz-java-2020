package clase4.casting;

public class EjemplosUpcasting {
	

	public static void main(String args[]){
		Padre p = new Padre(); //upcasting
		Padre o = new Hijo(); //upcasting
		
		Padre x = (Padre)p;
		Padre y = (Padre)o;
		
		
		Hijo z = (Hijo)o;

		if(p instanceof Hijo) {
			Hijo zzzz = (Hijo)p;
		} else {
			System.out.println("No es un hijo");
		}
		
		
		x.test(); //La referencia de X es un Padre apuntando a un objecto Padre
		y.test(); //La referencia de Y es un Padre apuntando a un objecto Hijo
		//y.test2(); no es valido, mi referencia garantiza que lo que yo apunto cumple con la clase Padre
		

		Object h = new Hijo();
		test(x);
		test(y);
		test(h);

		testCompleto(h);
	}
	

	static class Padre  {
		public void test() {
			System.out.println("Hola, soy el padre");
		}
		
	}
	
	static class Hijo extends Padre {
		
		@Override //-- anulo al padre y coloco su funcionalida
		public void test() {
			System.out.println("Hola, soy el hijo");
		}
		
		public void testDelHijo() { //sumo funcionaldad nueva
			
		}
	}
	

	
	static public void  test(Padre p) {
		p.test();
		//p.testDelHijo(); no va pq Padre no tiene el metodo

		p.hashCode();
	}
	
	static public void  test(Hijo p) {
		p.test();
		p.testDelHijo();
		p.hashCode();
		
	}
	static public void  test(Object p) {
		//p.test2(); no va pq Object no tiene el metodo
		p.hashCode();
		
	}

	static public void  testCompleto(Object p) { //hacemos lo mismo que el test del hijo pero mediante downcasting
		if(p instanceof Padre) { //IS-A
			((Padre) p).test();
		}

		if(p instanceof Hijo) {  //IS-A
			//((Hijo) p).test();	no es necesario 
			((Hijo) p).testDelHijo();	
		}
		p.hashCode();
	}
}
